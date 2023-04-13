using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

public interface Bufer
{
    int Bufer
    {
        get;
        set;
    }

}
namespace hilo3
{
    class Program
    {
        private Bufer ubicacionCompartida;
        private Random tiempoInactividadAleatorio;

        public Program(Bufer Compartido, Random Aleatorio)
        {
            ubicacionCompartida = Compartido;
            tiempoInactividadAleatorio = Aleatorio;
        }
        public void producir()
        {
            for (int cuenta = 1; cuenta <= 10; cuenta++)
            {
                Thread.Sleep(tiempoInactividadAleatorio.Next(1, 3001));
                ubicacionCompartida.Bufer = cuenta;
            }

            Console.WriteLine("{0} Termino de producir. \nTerminado {0}", Thread.CurrentThread.Name);
        }
        public class Consumidor
        {
            private Bufer ubicacionCompartida;
            private Random tiempoInactividadAleatorio;

            public Consumidor(Bufer Compartido, Random Aleatorio)
            {
                ubicacionCompartida = Compartido;
                tiempoInactividadAleatorio = Aleatorio;
            }

            public void Consumir()
            {
                int suma = 0;

                for (int cuenta = 1; cuenta <= 10; cuenta++)
                {
                    Thread.Sleep(tiempoInactividadAleatorio.Next(1, 3001));
                    suma += ubicacionCompartida.Bufer;
                }
                Console.WriteLine("{0} Leyo valores para un total de: {1}.\nTerminado{0}. ", Thread.CurrentThread.Name, suma);
            }


            public class BuferSincronizado : Bufer
            {

                private int bufer = -1;

                private int cuentaBuferOcupado = 0;

                public int Bufer
                {
                    get
                    {
                        Monitor.Enter(this);
                        if (cuentaBuferOcupado == 0)
                        {
                            Console.WriteLine(Thread.CurrentThread.Name + " trata de leer.");
                            MostrarEstado("Búfer vacío. " + Thread.CurrentThread.Name + " espera.");
                            Monitor.Wait(this);
                        }
                        --cuentaBuferOcupado;
                        MostrarEstado(Thread.CurrentThread.Name + " lee " + bufer);
                        Monitor.Pulse(this);
                        int copiaBufer = bufer;
                        Monitor.Exit(this);
                        return copiaBufer;
                    }
                    set
                    {
                        Monitor.Enter(this);
                        if (cuentaBuferOcupado == 1)
                        {
                            Console.WriteLine(Thread.CurrentThread.Name + " trata de escribir.");
                            MostrarEstado("Búfer lleno. " + Thread.CurrentThread.Name + " espera.");
                            Monitor.Wait(this);
                        }
                        bufer = value;
                        ++cuentaBuferOcupado;
                        MostrarEstado(Thread.CurrentThread.Name + " escribe " + bufer);
                        Monitor.Pulse(this);
                        Monitor.Exit(this);
                    }
                }
                public void MostrarEstado(string operacion)
                {
                    Console.WriteLine("{0,-35}{1,-9}{2}\n", operacion, bufer, cuentaBuferOcupado);
                }
            


                class PruebaBuferSincronizado
                {
                    static void Main(string[] args)
                    {

                        BuferSincronizado compartido = new BuferSincronizado();
                        Random aleatorio = new Random();
                        Console.WriteLine("{0,-35}{1,-9}{2}\n",
                         "Operación", "Búfer", "Cuenta ocupado");
                        compartido.MostrarEstado("Estado inicial");

                        Program productor = new Program(compartido, aleatorio);
                        Consumidor consumidor = new Consumidor(compartido, aleatorio);


                        Thread subprocesoProductor =
                         new Thread(new ThreadStart(productor.producir));
                        subprocesoProductor.Name = "Productor";

                        Thread subprocesoConsumidor =
                         new Thread(new ThreadStart(consumidor.Consumir));
                        subprocesoConsumidor.Name = "Consumidor";


                        subprocesoProductor.Start();
                        subprocesoConsumidor.Start();
                    }
                }

            }
        }
    }
}



   







