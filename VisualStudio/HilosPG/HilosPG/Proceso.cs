using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;
namespace HilosPG
{
    class Proceso
    {
        private int _n;
        private int _f;
        private ManualResetEvent _evento;
        public int N { get { return _n; } }
        public int Fib { get { return _f; } }

        public Proceso(int n, ManualResetEvent evento)
        {
            _n = n;
            _evento = evento;
        }

        // Wrapper method for use with thread pool.
        public void ThreadPoolCallback(Object hilo)
        {
            int _hilo = (int)hilo;
            Console.WriteLine("Hilo {0} iniciado...", _hilo);
            _f = Calcula(_n);
            Console.WriteLine("Hilo {0} Cálculo finalizado...", hilo);
            _evento.Set();
        }

        // Método recursivo que calcula el número de Fibonacci.
        public int Calcula(int n)
        {
            if (n <= 1)
            {
                return n;
            }

            return Calcula(n - 1) + Calcula(n - 2);
        }
    }
}
