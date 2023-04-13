<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Dim NombreLabel As System.Windows.Forms.Label
        Dim DirectorLabel As System.Windows.Forms.Label
        Dim EstudioLabel As System.Windows.Forms.Label
        Dim Año_de_lanzamientoLabel As System.Windows.Forms.Label
        Dim IdPeliculaLabel As System.Windows.Forms.Label
        Me.PeliculasBindingNavigator = New System.Windows.Forms.BindingNavigator(Me.components)
        Me.BindingNavigatorMoveFirstItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMovePreviousItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorSeparator = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorPositionItem = New System.Windows.Forms.ToolStripTextBox()
        Me.BindingNavigatorCountItem = New System.Windows.Forms.ToolStripLabel()
        Me.BindingNavigatorSeparator1 = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorMoveNextItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorMoveLastItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorSeparator2 = New System.Windows.Forms.ToolStripSeparator()
        Me.BindingNavigatorAddNewItem = New System.Windows.Forms.ToolStripButton()
        Me.BindingNavigatorDeleteItem = New System.Windows.Forms.ToolStripButton()
        Me.PeliculasBindingNavigatorSaveItem = New System.Windows.Forms.ToolStripButton()
        Me.PeliculasDataGridView = New System.Windows.Forms.DataGridView()
        Me.NombreTextBox = New System.Windows.Forms.TextBox()
        Me.DirectorTextBox = New System.Windows.Forms.TextBox()
        Me.EstudioTextBox = New System.Windows.Forms.TextBox()
        Me.Año_de_lanzamientoTextBox = New System.Windows.Forms.TextBox()
        Me.boton1 = New System.Windows.Forms.Button()
        Me.boton2 = New System.Windows.Forms.Button()
        Me.boton3 = New System.Windows.Forms.Button()
        Me.boton4 = New System.Windows.Forms.Button()
        Me.boton5 = New System.Windows.Forms.Button()
        Me.boton6 = New System.Windows.Forms.Button()
        Me.IdPeliculaTextBox = New System.Windows.Forms.TextBox()
        Me.PeliculasBindingSource = New System.Windows.Forms.BindingSource(Me.components)
        Me.PeliculasDataSet = New ProyectoDeBaseDeDatos.PeliculasDataSet()
        Me.DataGridViewTextBoxColumn1 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn2 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn3 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn4 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.DataGridViewTextBoxColumn5 = New System.Windows.Forms.DataGridViewTextBoxColumn()
        Me.PeliculasTableAdapter = New ProyectoDeBaseDeDatos.PeliculasDataSetTableAdapters.PeliculasTableAdapter()
        Me.TableAdapterManager = New ProyectoDeBaseDeDatos.PeliculasDataSetTableAdapters.TableAdapterManager()
        NombreLabel = New System.Windows.Forms.Label()
        DirectorLabel = New System.Windows.Forms.Label()
        EstudioLabel = New System.Windows.Forms.Label()
        Año_de_lanzamientoLabel = New System.Windows.Forms.Label()
        IdPeliculaLabel = New System.Windows.Forms.Label()
        CType(Me.PeliculasBindingNavigator, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.PeliculasBindingNavigator.SuspendLayout()
        CType(Me.PeliculasDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PeliculasBindingSource, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PeliculasDataSet, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PeliculasBindingNavigator
        '
        Me.PeliculasBindingNavigator.AddNewItem = Me.BindingNavigatorAddNewItem
        Me.PeliculasBindingNavigator.BindingSource = Me.PeliculasBindingSource
        Me.PeliculasBindingNavigator.CountItem = Me.BindingNavigatorCountItem
        Me.PeliculasBindingNavigator.DeleteItem = Me.BindingNavigatorDeleteItem
        Me.PeliculasBindingNavigator.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.BindingNavigatorMoveFirstItem, Me.BindingNavigatorMovePreviousItem, Me.BindingNavigatorSeparator, Me.BindingNavigatorPositionItem, Me.BindingNavigatorCountItem, Me.BindingNavigatorSeparator1, Me.BindingNavigatorMoveNextItem, Me.BindingNavigatorMoveLastItem, Me.BindingNavigatorSeparator2, Me.BindingNavigatorAddNewItem, Me.BindingNavigatorDeleteItem, Me.PeliculasBindingNavigatorSaveItem})
        Me.PeliculasBindingNavigator.Location = New System.Drawing.Point(0, 0)
        Me.PeliculasBindingNavigator.MoveFirstItem = Me.BindingNavigatorMoveFirstItem
        Me.PeliculasBindingNavigator.MoveLastItem = Me.BindingNavigatorMoveLastItem
        Me.PeliculasBindingNavigator.MoveNextItem = Me.BindingNavigatorMoveNextItem
        Me.PeliculasBindingNavigator.MovePreviousItem = Me.BindingNavigatorMovePreviousItem
        Me.PeliculasBindingNavigator.Name = "PeliculasBindingNavigator"
        Me.PeliculasBindingNavigator.PositionItem = Me.BindingNavigatorPositionItem
        Me.PeliculasBindingNavigator.Size = New System.Drawing.Size(800, 25)
        Me.PeliculasBindingNavigator.TabIndex = 0
        Me.PeliculasBindingNavigator.Text = "BindingNavigator1"
        Me.PeliculasBindingNavigator.Visible = False
        '
        'BindingNavigatorMoveFirstItem
        '
        Me.BindingNavigatorMoveFirstItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveFirstItem.Image = CType(resources.GetObject("BindingNavigatorMoveFirstItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveFirstItem.Name = "BindingNavigatorMoveFirstItem"
        Me.BindingNavigatorMoveFirstItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveFirstItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveFirstItem.Text = "Mover primero"
        '
        'BindingNavigatorMovePreviousItem
        '
        Me.BindingNavigatorMovePreviousItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMovePreviousItem.Image = CType(resources.GetObject("BindingNavigatorMovePreviousItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMovePreviousItem.Name = "BindingNavigatorMovePreviousItem"
        Me.BindingNavigatorMovePreviousItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMovePreviousItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMovePreviousItem.Text = "Mover anterior"
        '
        'BindingNavigatorSeparator
        '
        Me.BindingNavigatorSeparator.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorPositionItem
        '
        Me.BindingNavigatorPositionItem.AccessibleName = "Posición"
        Me.BindingNavigatorPositionItem.AutoSize = False
        Me.BindingNavigatorPositionItem.Name = "BindingNavigatorPositionItem"
        Me.BindingNavigatorPositionItem.Size = New System.Drawing.Size(50, 23)
        Me.BindingNavigatorPositionItem.Text = "0"
        Me.BindingNavigatorPositionItem.ToolTipText = "Posición actual"
        '
        'BindingNavigatorCountItem
        '
        Me.BindingNavigatorCountItem.Name = "BindingNavigatorCountItem"
        Me.BindingNavigatorCountItem.Size = New System.Drawing.Size(37, 22)
        Me.BindingNavigatorCountItem.Text = "de {0}"
        Me.BindingNavigatorCountItem.ToolTipText = "Número total de elementos"
        '
        'BindingNavigatorSeparator1
        '
        Me.BindingNavigatorSeparator1.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator1.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorMoveNextItem
        '
        Me.BindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveNextItem.Image = CType(resources.GetObject("BindingNavigatorMoveNextItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveNextItem.Name = "BindingNavigatorMoveNextItem"
        Me.BindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveNextItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveNextItem.Text = "Mover siguiente"
        '
        'BindingNavigatorMoveLastItem
        '
        Me.BindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorMoveLastItem.Image = CType(resources.GetObject("BindingNavigatorMoveLastItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorMoveLastItem.Name = "BindingNavigatorMoveLastItem"
        Me.BindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorMoveLastItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorMoveLastItem.Text = "Mover último"
        '
        'BindingNavigatorSeparator2
        '
        Me.BindingNavigatorSeparator2.Name = "BindingNavigatorSeparator"
        Me.BindingNavigatorSeparator2.Size = New System.Drawing.Size(6, 25)
        '
        'BindingNavigatorAddNewItem
        '
        Me.BindingNavigatorAddNewItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorAddNewItem.Image = CType(resources.GetObject("BindingNavigatorAddNewItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorAddNewItem.Name = "BindingNavigatorAddNewItem"
        Me.BindingNavigatorAddNewItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorAddNewItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorAddNewItem.Text = "Agregar nuevo"
        '
        'BindingNavigatorDeleteItem
        '
        Me.BindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.BindingNavigatorDeleteItem.Image = CType(resources.GetObject("BindingNavigatorDeleteItem.Image"), System.Drawing.Image)
        Me.BindingNavigatorDeleteItem.Name = "BindingNavigatorDeleteItem"
        Me.BindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = True
        Me.BindingNavigatorDeleteItem.Size = New System.Drawing.Size(23, 22)
        Me.BindingNavigatorDeleteItem.Text = "Eliminar"
        '
        'PeliculasBindingNavigatorSaveItem
        '
        Me.PeliculasBindingNavigatorSaveItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.PeliculasBindingNavigatorSaveItem.Image = CType(resources.GetObject("PeliculasBindingNavigatorSaveItem.Image"), System.Drawing.Image)
        Me.PeliculasBindingNavigatorSaveItem.Name = "PeliculasBindingNavigatorSaveItem"
        Me.PeliculasBindingNavigatorSaveItem.Size = New System.Drawing.Size(23, 22)
        Me.PeliculasBindingNavigatorSaveItem.Text = "Guardar datos"
        '
        'PeliculasDataGridView
        '
        Me.PeliculasDataGridView.AutoGenerateColumns = False
        Me.PeliculasDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.PeliculasDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.DataGridViewTextBoxColumn1, Me.DataGridViewTextBoxColumn2, Me.DataGridViewTextBoxColumn3, Me.DataGridViewTextBoxColumn4, Me.DataGridViewTextBoxColumn5})
        Me.PeliculasDataGridView.DataSource = Me.PeliculasBindingSource
        Me.PeliculasDataGridView.Location = New System.Drawing.Point(12, 12)
        Me.PeliculasDataGridView.Name = "PeliculasDataGridView"
        Me.PeliculasDataGridView.Size = New System.Drawing.Size(541, 220)
        Me.PeliculasDataGridView.TabIndex = 1
        '
        'NombreLabel
        '
        NombreLabel.AutoSize = True
        NombreLabel.Location = New System.Drawing.Point(80, 314)
        NombreLabel.Name = "NombreLabel"
        NombreLabel.Size = New System.Drawing.Size(47, 13)
        NombreLabel.TabIndex = 2
        NombreLabel.Text = "Nombre:"
        '
        'NombreTextBox
        '
        Me.NombreTextBox.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.PeliculasBindingSource, "Nombre", True))
        Me.NombreTextBox.Location = New System.Drawing.Point(133, 311)
        Me.NombreTextBox.Name = "NombreTextBox"
        Me.NombreTextBox.Size = New System.Drawing.Size(100, 20)
        Me.NombreTextBox.TabIndex = 3
        '
        'DirectorLabel
        '
        DirectorLabel.AutoSize = True
        DirectorLabel.Location = New System.Drawing.Point(80, 362)
        DirectorLabel.Name = "DirectorLabel"
        DirectorLabel.Size = New System.Drawing.Size(47, 13)
        DirectorLabel.TabIndex = 4
        DirectorLabel.Text = "Director:"
        '
        'DirectorTextBox
        '
        Me.DirectorTextBox.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.PeliculasBindingSource, "Director", True))
        Me.DirectorTextBox.Location = New System.Drawing.Point(133, 359)
        Me.DirectorTextBox.Name = "DirectorTextBox"
        Me.DirectorTextBox.Size = New System.Drawing.Size(100, 20)
        Me.DirectorTextBox.TabIndex = 5
        '
        'EstudioLabel
        '
        EstudioLabel.AutoSize = True
        EstudioLabel.Location = New System.Drawing.Point(82, 413)
        EstudioLabel.Name = "EstudioLabel"
        EstudioLabel.Size = New System.Drawing.Size(45, 13)
        EstudioLabel.TabIndex = 6
        EstudioLabel.Text = "Estudio:"
        '
        'EstudioTextBox
        '
        Me.EstudioTextBox.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.PeliculasBindingSource, "Estudio", True))
        Me.EstudioTextBox.Location = New System.Drawing.Point(133, 410)
        Me.EstudioTextBox.Name = "EstudioTextBox"
        Me.EstudioTextBox.Size = New System.Drawing.Size(100, 20)
        Me.EstudioTextBox.TabIndex = 7
        '
        'Año_de_lanzamientoLabel
        '
        Año_de_lanzamientoLabel.AutoSize = True
        Año_de_lanzamientoLabel.Location = New System.Drawing.Point(24, 460)
        Año_de_lanzamientoLabel.Name = "Año_de_lanzamientoLabel"
        Año_de_lanzamientoLabel.Size = New System.Drawing.Size(103, 13)
        Año_de_lanzamientoLabel.TabIndex = 8
        Año_de_lanzamientoLabel.Text = "Año de lanzamiento:"
        '
        'Año_de_lanzamientoTextBox
        '
        Me.Año_de_lanzamientoTextBox.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.PeliculasBindingSource, "Año_de_lanzamiento", True))
        Me.Año_de_lanzamientoTextBox.Location = New System.Drawing.Point(133, 457)
        Me.Año_de_lanzamientoTextBox.Name = "Año_de_lanzamientoTextBox"
        Me.Año_de_lanzamientoTextBox.Size = New System.Drawing.Size(100, 20)
        Me.Año_de_lanzamientoTextBox.TabIndex = 9
        '
        'boton1
        '
        Me.boton1.Font = New System.Drawing.Font("Adobe Heiti Std R", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.boton1.Location = New System.Drawing.Point(271, 248)
        Me.boton1.Name = "boton1"
        Me.boton1.Size = New System.Drawing.Size(109, 35)
        Me.boton1.TabIndex = 10
        Me.boton1.Text = "Insertar"
        Me.boton1.UseVisualStyleBackColor = True
        '
        'boton2
        '
        Me.boton2.Font = New System.Drawing.Font("Adobe Heiti Std R", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.boton2.Location = New System.Drawing.Point(427, 248)
        Me.boton2.Name = "boton2"
        Me.boton2.Size = New System.Drawing.Size(109, 35)
        Me.boton2.TabIndex = 11
        Me.boton2.Text = "Actualizar"
        Me.boton2.UseVisualStyleBackColor = True
        '
        'boton3
        '
        Me.boton3.Font = New System.Drawing.Font("Adobe Heiti Std R", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.boton3.Location = New System.Drawing.Point(271, 311)
        Me.boton3.Name = "boton3"
        Me.boton3.Size = New System.Drawing.Size(109, 35)
        Me.boton3.TabIndex = 12
        Me.boton3.Text = "Borrar"
        Me.boton3.UseVisualStyleBackColor = True
        '
        'boton4
        '
        Me.boton4.Font = New System.Drawing.Font("Adobe Heiti Std R", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.boton4.Location = New System.Drawing.Point(427, 311)
        Me.boton4.Name = "boton4"
        Me.boton4.Size = New System.Drawing.Size(109, 35)
        Me.boton4.TabIndex = 13
        Me.boton4.Text = "Buscar"
        Me.boton4.UseVisualStyleBackColor = True
        '
        'boton5
        '
        Me.boton5.Font = New System.Drawing.Font("Adobe Heiti Std R", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.boton5.Location = New System.Drawing.Point(271, 374)
        Me.boton5.Name = "boton5"
        Me.boton5.Size = New System.Drawing.Size(109, 35)
        Me.boton5.TabIndex = 14
        Me.boton5.Text = "Reiniciar"
        Me.boton5.UseVisualStyleBackColor = True
        '
        'boton6
        '
        Me.boton6.Font = New System.Drawing.Font("Adobe Heiti Std R", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.boton6.Location = New System.Drawing.Point(416, 374)
        Me.boton6.Name = "boton6"
        Me.boton6.Size = New System.Drawing.Size(137, 35)
        Me.boton6.TabIndex = 15
        Me.boton6.Text = "Nuevo Registro"
        Me.boton6.UseVisualStyleBackColor = True
        '
        'IdPeliculaLabel
        '
        IdPeliculaLabel.AutoSize = True
        IdPeliculaLabel.Location = New System.Drawing.Point(68, 266)
        IdPeliculaLabel.Name = "IdPeliculaLabel"
        IdPeliculaLabel.Size = New System.Drawing.Size(59, 13)
        IdPeliculaLabel.TabIndex = 16
        IdPeliculaLabel.Text = "Id Pelicula:"
        '
        'IdPeliculaTextBox
        '
        Me.IdPeliculaTextBox.DataBindings.Add(New System.Windows.Forms.Binding("Text", Me.PeliculasBindingSource, "IdPelicula", True))
        Me.IdPeliculaTextBox.Location = New System.Drawing.Point(133, 263)
        Me.IdPeliculaTextBox.Name = "IdPeliculaTextBox"
        Me.IdPeliculaTextBox.Size = New System.Drawing.Size(100, 20)
        Me.IdPeliculaTextBox.TabIndex = 17
        '
        'PeliculasBindingSource
        '
        Me.PeliculasBindingSource.DataMember = "Peliculas"
        Me.PeliculasBindingSource.DataSource = Me.PeliculasDataSet
        '
        'PeliculasDataSet
        '
        Me.PeliculasDataSet.DataSetName = "PeliculasDataSet"
        Me.PeliculasDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema
        '
        'DataGridViewTextBoxColumn1
        '
        Me.DataGridViewTextBoxColumn1.DataPropertyName = "IdPelicula"
        Me.DataGridViewTextBoxColumn1.HeaderText = "IdPelicula"
        Me.DataGridViewTextBoxColumn1.Name = "DataGridViewTextBoxColumn1"
        '
        'DataGridViewTextBoxColumn2
        '
        Me.DataGridViewTextBoxColumn2.DataPropertyName = "Nombre"
        Me.DataGridViewTextBoxColumn2.HeaderText = "Nombre"
        Me.DataGridViewTextBoxColumn2.Name = "DataGridViewTextBoxColumn2"
        '
        'DataGridViewTextBoxColumn3
        '
        Me.DataGridViewTextBoxColumn3.DataPropertyName = "Director"
        Me.DataGridViewTextBoxColumn3.HeaderText = "Director"
        Me.DataGridViewTextBoxColumn3.Name = "DataGridViewTextBoxColumn3"
        '
        'DataGridViewTextBoxColumn4
        '
        Me.DataGridViewTextBoxColumn4.DataPropertyName = "Estudio"
        Me.DataGridViewTextBoxColumn4.HeaderText = "Estudio"
        Me.DataGridViewTextBoxColumn4.Name = "DataGridViewTextBoxColumn4"
        '
        'DataGridViewTextBoxColumn5
        '
        Me.DataGridViewTextBoxColumn5.DataPropertyName = "Año_de_lanzamiento"
        Me.DataGridViewTextBoxColumn5.HeaderText = "Año_de_lanzamiento"
        Me.DataGridViewTextBoxColumn5.Name = "DataGridViewTextBoxColumn5"
        '
        'PeliculasTableAdapter
        '
        Me.PeliculasTableAdapter.ClearBeforeFill = True
        '
        'TableAdapterManager
        '
        Me.TableAdapterManager.BackupDataSetBeforeUpdate = False
        Me.TableAdapterManager.PeliculasTableAdapter = Me.PeliculasTableAdapter
        Me.TableAdapterManager.UpdateOrder = ProyectoDeBaseDeDatos.PeliculasDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(576, 506)
        Me.Controls.Add(IdPeliculaLabel)
        Me.Controls.Add(Me.IdPeliculaTextBox)
        Me.Controls.Add(Me.boton6)
        Me.Controls.Add(Me.boton5)
        Me.Controls.Add(Me.boton4)
        Me.Controls.Add(Me.boton3)
        Me.Controls.Add(Me.boton2)
        Me.Controls.Add(Me.boton1)
        Me.Controls.Add(Año_de_lanzamientoLabel)
        Me.Controls.Add(Me.Año_de_lanzamientoTextBox)
        Me.Controls.Add(EstudioLabel)
        Me.Controls.Add(Me.EstudioTextBox)
        Me.Controls.Add(DirectorLabel)
        Me.Controls.Add(Me.DirectorTextBox)
        Me.Controls.Add(NombreLabel)
        Me.Controls.Add(Me.NombreTextBox)
        Me.Controls.Add(Me.PeliculasDataGridView)
        Me.Controls.Add(Me.PeliculasBindingNavigator)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PeliculasBindingNavigator, System.ComponentModel.ISupportInitialize).EndInit()
        Me.PeliculasBindingNavigator.ResumeLayout(False)
        Me.PeliculasBindingNavigator.PerformLayout()
        CType(Me.PeliculasDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PeliculasBindingSource, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PeliculasDataSet, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents PeliculasDataSet As PeliculasDataSet
    Friend WithEvents PeliculasBindingSource As BindingSource
    Friend WithEvents PeliculasTableAdapter As PeliculasDataSetTableAdapters.PeliculasTableAdapter
    Friend WithEvents TableAdapterManager As PeliculasDataSetTableAdapters.TableAdapterManager
    Friend WithEvents PeliculasBindingNavigator As BindingNavigator
    Friend WithEvents BindingNavigatorAddNewItem As ToolStripButton
    Friend WithEvents BindingNavigatorCountItem As ToolStripLabel
    Friend WithEvents BindingNavigatorDeleteItem As ToolStripButton
    Friend WithEvents BindingNavigatorMoveFirstItem As ToolStripButton
    Friend WithEvents BindingNavigatorMovePreviousItem As ToolStripButton
    Friend WithEvents BindingNavigatorSeparator As ToolStripSeparator
    Friend WithEvents BindingNavigatorPositionItem As ToolStripTextBox
    Friend WithEvents BindingNavigatorSeparator1 As ToolStripSeparator
    Friend WithEvents BindingNavigatorMoveNextItem As ToolStripButton
    Friend WithEvents BindingNavigatorMoveLastItem As ToolStripButton
    Friend WithEvents BindingNavigatorSeparator2 As ToolStripSeparator
    Friend WithEvents PeliculasBindingNavigatorSaveItem As ToolStripButton
    Friend WithEvents PeliculasDataGridView As DataGridView
    Friend WithEvents DataGridViewTextBoxColumn1 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn2 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn3 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn4 As DataGridViewTextBoxColumn
    Friend WithEvents DataGridViewTextBoxColumn5 As DataGridViewTextBoxColumn
    Friend WithEvents NombreTextBox As TextBox
    Friend WithEvents DirectorTextBox As TextBox
    Friend WithEvents EstudioTextBox As TextBox
    Friend WithEvents Año_de_lanzamientoTextBox As TextBox
    Friend WithEvents boton1 As Button
    Friend WithEvents boton2 As Button
    Friend WithEvents boton3 As Button
    Friend WithEvents boton4 As Button
    Friend WithEvents boton5 As Button
    Friend WithEvents boton6 As Button
    Friend WithEvents IdPeliculaTextBox As TextBox
End Class
