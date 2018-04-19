package br.emprestimo.testeUnitario;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC02CadastrarUsuario {
public static Usuario usuario;	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setNome("Jose");
		usuario.setRa("1234567890 ");
	}
	
	@Test(expected=RuntimeException.class)
	public void CT01UC02CadastrarUsuario_com_ra_branco() {
		usuario.setRa("");
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC02CadastrarUsuario_com_ra_invalido() {
		usuario.setRa(null);
	}
	@Test
	public void CT03UC02CadastrarUsuario_com_ra_valido() {
		usuario.setRa("1234567890");
		assertEqual("1234567890",usuario.getRa()); 
	}
	private void assertEqual(String string, String ra) {
		// TODO Auto-generated method stub
	}
	
	@Test(expected=RuntimeException.class)
	public void CT04UC02CadastrarUsuario_com_nome_branco() {
		usuario.setNome("");
	}
	@Test(expected=RuntimeException.class)
	public void CT05UC02CadastrarUsuario_com_nome_invalido() {
		usuario.setNome(null);
	}
	@Test
	public void CT06UC02CadastrarUsuario_com_nome_valido() {
		usuario.setNome("Jose");
		assertEqual("Jose",usuario.getNome()); 
	}
	
	@Test
	public void CT07UC02CadastrarUsuario_teste_equals() {
		Usuario resultadoEsperado = new Usuario ();
		resultadoEsperado.setNome("Jose");
		resultadoEsperado.setRa("1234567890");
		assertTrue(resultadoEsperado.equals(usuario));
	}

}
