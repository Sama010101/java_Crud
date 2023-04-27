package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

//MVC
/*
 * Model
 * View
 * Controller
 */

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("Cleitinho Rasta");
		contato.setIdade(53);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		Contato c1 = new Contato();
		c1.setNome("Maria Clara");
		c1.setIdade(19);
		c1.setDataCadastro(new Date());
		c1.setId(3);
		
		//contatoDao.update(c1);
		
		contatoDao.deleteByID(4);
		//Visualiza��o dos registros do banco de dados TODOS
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: "+c.getNome());
		}
	}

}
