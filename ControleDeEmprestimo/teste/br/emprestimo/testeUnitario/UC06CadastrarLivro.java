package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

@SuppressWarnings("unused")
public class UC06CadastrarLivro {
	public static Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test(expected=RuntimeException.class)
	public void CT01UC06CadastrarLivro_com_isbn_invalido_branco() {
		livro.setIsbn("");
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_isbn_invalido_nulo() {
		livro.setIsbn(null);
	}
	@Test(expected=RuntimeException.class)
	public void CT03UC06CadastrarLivro_com_titulo_invalido_branco() {
		livro.setTitulo("");
	}
	@Test(expected=RuntimeException.class)
	public void CT04UC06CadastrarLivro_com_titulo_invalido_nulo() {
		livro.setTitulo(null);
	}
	@Test
	public void CT05UC06CadastrarLivro_com_obtem_isbn() {
		livro.setIsbn("211212");
		assertEqual("211212",livro.getIsbn()); 
	}
	private void assertEqual(String string, String isbn) {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void CT06UC06CadastrarLivro_obtem_titulo() {
		livro.setTitulo("Engenharia de Software");
		assertEqual("Engenharia de Software",livro.getTitulo());
	}
	@Test(expected=RuntimeException.class)
	public void CT07UC06Cadastrar_Livro_com_Autor_Invalido() {
		livro.setAutor("");
	}
	@Test(expected=RuntimeException.class)
	public void CT08UC06Cadastrar_Livro_com_Autor_Nulo() {
		livro.setAutor(null);
	}
	@Test
	public void CT09UC06CadastrarLivro_com_Autor() {
		livro.setAutor("Pressman");
		assertEqual("Pressman",livro.getAutor()); 
	}
}
