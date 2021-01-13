package mysql;

import java.util.ArrayList;
import java.util.Scanner;

import dao.UsuarioDAO;

public class MySQLMelhorado {

	public static void main(String[] args) {

		System.out.println("===== INSERIR USUÁRIO=====");
		Scanner sc = new Scanner(System.in);
		System.out.println("Forneça o email: ");
		String email = sc.nextLine();
		System.out.println("Forneça a senha: ");
		String senha = sc.nextLine();

		Usuario u = new Usuario();
		u.setEmail(email);
		u.setSenha(senha);

		boolean inserido = UsuarioDAO.inserirUsuario(u);
		if (inserido) {
			System.out.println("Usuário cadastrado com sucesso.");
		} else {
			System.out.println("Erro ao cadastrar o usuário. Tente novamente.");
		}
	}

}
