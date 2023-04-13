namespace HilosP4
{
    partial class Form
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.subprocesoCheckBox = new System.Windows.Forms.CheckBox();
            this.subproceso2CheckBox = new System.Windows.Forms.CheckBox();
            this.subproceso3CheckBox = new System.Windows.Forms.CheckBox();
            this.subproceso1Label = new System.Windows.Forms.Label();
            this.subproceso2Label = new System.Windows.Forms.Label();
            this.subproceso3Label = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // subprocesoCheckBox
            // 
            this.subprocesoCheckBox.AutoSize = true;
            this.subprocesoCheckBox.Location = new System.Drawing.Point(194, 25);
            this.subprocesoCheckBox.Name = "subprocesoCheckBox";
            this.subprocesoCheckBox.Size = new System.Drawing.Size(82, 17);
            this.subprocesoCheckBox.TabIndex = 0;
            this.subprocesoCheckBox.Text = "Suspendido";
            this.subprocesoCheckBox.UseVisualStyleBackColor = true;
            // 
            // subproceso2CheckBox
            // 
            this.subproceso2CheckBox.AutoSize = true;
            this.subproceso2CheckBox.Location = new System.Drawing.Point(194, 63);
            this.subproceso2CheckBox.Name = "subproceso2CheckBox";
            this.subproceso2CheckBox.Size = new System.Drawing.Size(82, 17);
            this.subproceso2CheckBox.TabIndex = 1;
            this.subproceso2CheckBox.Text = "Suspendido";
            this.subproceso2CheckBox.UseVisualStyleBackColor = true;
            // 
            // subproceso3CheckBox
            // 
            this.subproceso3CheckBox.AutoSize = true;
            this.subproceso3CheckBox.Location = new System.Drawing.Point(194, 102);
            this.subproceso3CheckBox.Name = "subproceso3CheckBox";
            this.subproceso3CheckBox.Size = new System.Drawing.Size(82, 17);
            this.subproceso3CheckBox.TabIndex = 2;
            this.subproceso3CheckBox.Text = "Suspendido";
            this.subproceso3CheckBox.UseVisualStyleBackColor = true;
            // 
            // subproceso1Label
            // 
            this.subproceso1Label.AutoSize = true;
            this.subproceso1Label.Location = new System.Drawing.Point(105, 25);
            this.subproceso1Label.Name = "subproceso1Label";
            this.subproceso1Label.Size = new System.Drawing.Size(77, 13);
            this.subproceso1Label.TabIndex = 3;
            this.subproceso1Label.Text = "Subproceso: S";
            // 
            // subproceso2Label
            // 
            this.subproceso2Label.AutoSize = true;
            this.subproceso2Label.Location = new System.Drawing.Point(105, 64);
            this.subproceso2Label.Name = "subproceso2Label";
            this.subproceso2Label.Size = new System.Drawing.Size(77, 13);
            this.subproceso2Label.TabIndex = 4;
            this.subproceso2Label.Text = "Subproceso: S";
            // 
            // subproceso3Label
            // 
            this.subproceso3Label.AutoSize = true;
            this.subproceso3Label.Location = new System.Drawing.Point(105, 102);
            this.subproceso3Label.Name = "subproceso3Label";
            this.subproceso3Label.Size = new System.Drawing.Size(78, 13);
            this.subproceso3Label.TabIndex = 5;
            this.subproceso3Label.Text = "Subproceso: U";
            // 
            // Form
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(359, 157);
            this.Controls.Add(this.subproceso3Label);
            this.Controls.Add(this.subproceso2Label);
            this.Controls.Add(this.subproceso1Label);
            this.Controls.Add(this.subproceso3CheckBox);
            this.Controls.Add(this.subproceso2CheckBox);
            this.Controls.Add(this.subprocesoCheckBox);
            this.Name = "Form";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.CheckBox subprocesoCheckBox;
        private System.Windows.Forms.CheckBox subproceso2CheckBox;
        private System.Windows.Forms.CheckBox subproceso3CheckBox;
        private System.Windows.Forms.Label subproceso1Label;
        private System.Windows.Forms.Label subproceso2Label;
        private System.Windows.Forms.Label subproceso3Label;
    }
}

