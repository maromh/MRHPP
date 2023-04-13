Public Class Form1
    Private Sub PeliculasBindingNavigatorSaveItem_Click(sender As Object, e As EventArgs) Handles PeliculasBindingNavigatorSaveItem.Click
        Me.Validate()
        Me.PeliculasBindingSource.EndEdit()
        Me.TableAdapterManager.UpdateAll(Me.PeliculasDataSet)

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'TODO: esta línea de código carga datos en la tabla 'PeliculasDataSet.Peliculas' Puede moverla o quitarla según sea necesario.
        Me.PeliculasTableAdapter.Fill(Me.PeliculasDataSet.Peliculas)

    End Sub

    Private Sub Boton1_Click(sender As Object, e As EventArgs) Handles boton1.Click
        Me.PeliculasTableAdapter.INSERTAR(NombreTextBox.Text, DirectorTextBox.Text, EstudioTextBox.Text, Año_de_lanzamientoTextBox.Text)
        Me.PeliculasTableAdapter.Fill(Me.PeliculasDataSet.Peliculas)
    End Sub

    Private Sub Boton2_Click(sender As Object, e As EventArgs) Handles boton2.Click
        PeliculasBindingSource.EndEdit()
        PeliculasTableAdapter.Update(PeliculasDataSet.Peliculas)
    End Sub

    Private Sub Boton3_Click(sender As Object, e As EventArgs) Handles boton3.Click
        PeliculasBindingSource.RemoveCurrent()
        PeliculasTableAdapter.Update(PeliculasDataSet.Peliculas)
    End Sub

    Private Sub Boton4_Click(sender As Object, e As EventArgs) Handles boton4.Click
        Me.PeliculasTableAdapter.FillBy(Me.PeliculasDataSet.Peliculas, NombreTextBox.Text)
    End Sub

    Private Sub Boton5_Click(sender As Object, e As EventArgs) Handles boton5.Click
        Me.PeliculasTableAdapter.Fill(Me.PeliculasDataSet.Peliculas)
    End Sub

    Private Sub Boton6_Click(sender As Object, e As EventArgs) Handles boton6.Click
        NombreTextBox.Text = ""
        DirectorTextBox.Text = ""
        EstudioTextBox.Text = ""
        Año_de_lanzamientoTextBox.Text = ""
    End Sub
End Class
