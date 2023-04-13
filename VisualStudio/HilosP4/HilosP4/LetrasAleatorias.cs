using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;
namespace HilosP4
{
    public class LetrasAleatorias
    {
        private static Random generador = new Random();
        private bool suspendido = false;
        private Label salida;
        private string nombreSubproceso;
        public LetrasAleatorias(Label etiqueta)
        {
            salida = etiqueta;
        }
        private delegate void DisplayDelegate(char mostrarChar);
        private void MostrarCaracter(char mostrarChar)
        {
            salida.Text = nombreSubproceso + ": " + mostrarChar;
        }

        private void GenerarCaracteresAleatorios()
        {
            while (true)
            {
                Thread.Sleep(generador.Next(1001));
                lock (this)
                {
                    while (suspendido)
                    {
                        Monitor.Wait(this);
                    }
                }
                char mostrarChar = (char)(generador.Next(26) + 65);
                salida.Invoke(new DisplayDelegate(MostrarCaracter), new object[] { mostrarChar });
            }
        }

        public void Alterna()
        {
            suspendido = !suspendido;
            salida.BackColor = suspendido ? Color.Red : Color.LightGreen;
            lock (this)
            {
                if (!suspendido)
                    Monitor.Pulse(this);
            }
        }
    }
}
