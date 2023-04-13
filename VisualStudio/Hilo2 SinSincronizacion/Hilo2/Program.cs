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
namespace hilo2
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

            public class BuferSinSincronizacion : Bufer

            {
                private int bufer = -1;
                public int Bufer
                {
                    get
                    {
                        Console.WriteLine("{0} lee {1}", Thread.CurrentThread.Name, bufer);
                        return bufer;
                    }
                    set
                    {
                        Console.WriteLine("{0} escribe {1}",
                          Thread.CurrentThread.Name, value);
                        bufer = value;
                    }
                }
            }
            class PruebaBuferSinSincronizacion
            {

                static void Main(string[] args)
                {
                    BuferSinSincronizacion compartido = new BuferSinSincronizacion();
                    Random aleatorio = new Random();
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


