using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HilosP4
{
    public partial class SubprocesosGUIForm : Form
    {
        public SubprocesosGUIForm()
        {
            InitializeComponent();
        }

        private LetrasAleatorias letra1;
        private LetrasAleatorias letra2;
        private LetrasAleatorias letra3;

        private void SubprocesosGUIForm_Load(object sender, EventArgs e)
        {
            letra1 = new LetrasAleatorias(subproceso1Label);
            Thread primerSubproceso = new Thread(new ThreadStart(letra1.GenerarCaracteresAleatorios));
            primerSubproceso.Name = "Subproceso 1";
            primerSubproceso.Start();
            letra2 = new LetrasAleatorias(subproceso2Label);
            Thread segundoSubproceso = new Thread(new ThreadStart(letra2.GenerarCaracteresAleatorios));
            segundoSubproceso.Name = "Subproceso 2";
            segundoSubproceso.Start();
            letra3 = new LetrasAleatorias(subproceso3Label);
            Thread tercerSubproceso = new Thread(new ThreadStart(letra3.GenerarCaracteresAleatorios));
            tercerSubproceso.Name = "Subproceso 3";
            tercerSubproceso.Start();
        }

        private void SubprocesosGUIForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            System.Environment.Exit(System.Environment.ExitCode);
        }

        private void subprocesoCheckBox_Checked(object sender, RoutedEventArgs e)
        {
            if (sender == subprocesoCheckBox)
                letra1.Alterna();
            else if (sender == subproceso2CheckBox)
                letra2.Alterna();
            else if (sender == subproceso3CheckBox)
                letra3.Alterna();
        }
    }
}
