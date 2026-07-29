package br.com.alura.estudoInterface.exercicio5;

public class Livro extends Comerciavel implements Calculavel{
    //Atributos
    private String tituloLivro;
    private String autor;
    private String editora;

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco;
    }
}
