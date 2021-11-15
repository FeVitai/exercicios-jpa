package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("mouse", 123.78);
		dao.incluirAtomico(produto).fechar();
//		dao.abrirT().incluir(produto).fecharT().fechar();
		System.out.println("ID" + produto.getId());
	}
	
}
