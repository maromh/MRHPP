using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

namespace Hilos1
{
    class Program
    {
        static void Main(string[] args)

        {
            ImpresoraMensaje impresora1 = new ImpresoraMensaje();
            Thread subproceso1 = new Thread(new ThreadStart(impresora1.Imprimir));
            subproceso1.Name = "subpreceso1";


            ImpresoraMensaje impresora2 = new ImpresoraMensaje();
            Thread subproceso2 = new Thread(new ThreadStart(impresora1.Imprimir));
            subproceso2.Name = "subpreceso2";

            ImpresoraMensaje impresora3 = new ImpresoraMensaje();
            Thread subproceso3 = new Thread(new ThreadStart(impresora1.Imprimir));
            subproceso3.Name = "subpreceso3";

            Console.WriteLine("Iniciando procesos");

            subproceso1.Start();
            subproceso2.Start();
            subproceso3.Start();

            Console.WriteLine("Subprocesos iniciados \n");
            Console.ReadKey();
        }
        class ImpresoraMensaje

        {
            private int tiempoInactividad;
            private static Random aleatorio = new Random();

            public ImpresoraMensaje()
            {
                tiempoInactividad = aleatorio.Next(5001);

            }
            public void Imprimir()
            {
                Thread actual = Thread.CurrentThread;
                Console.WriteLine("{0} va a estar inactivo durante {1} milisegundo",
                actual.Name, tiempoInactividad);
                Thread.Sleep(tiempoInactividad);
                Console.WriteLine("{0}, dejo de estar inactivo", actual.Name);
            }
        }
    }
}