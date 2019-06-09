package aplicacao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import objetos.Categ;
import objetos.PessoaFisica;
import objetos.PessoaJuridica;
import objetos.Produto;
import objetos.Usuario;

public class Programa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int id, senha, qtde_estoque, celular, escolha, telefone, menuopcao, opcao, cnpj, i, j = 0;
		String login, nome, id_categ, email, cpf;
		double precovenda;
		boolean achou;

		List<Usuario> lista = new ArrayList<Usuario>();
		List<PessoaFisica> listaPessoaFisica = new ArrayList<PessoaFisica>();
		List<Categ> listaCategoria = new ArrayList<Categ>();
		List<Produto> listaProduto = new ArrayList<Produto>();

		try {
		while (true) {
			Menu();

			System.out.println("\nFavor escolher o que deseja:");
			menuopcao = input.nextInt();
			Usuario usuario = null;
			switch (menuopcao) {
			case 1:
				System.out.println("####  LOGIN ####\n");
				System.out.print("Favor digite seu nome:");
				login = input.next();
				System.out.println("Favor digite a senha:");
				senha = input.nextInt();
				usuario = new Usuario(login, senha);
				lista.add(usuario);
				break;

			case 2:
				System.out.println(
						"Cadastro de Pessoas:\n1 - Cadastrar Usuario\n2 - Listar Usuario\n3 - Alterar usuario\n");
				opcao = input.nextInt();
				if (opcao == 1) {
					System.out.print("Favor digite seu CPF para Cadastro:");
					cpf = input.next();
					System.out.print("Favor digite seu Nome:");
					nome = input.next();
					System.out.print("Favor digite seu E-mail: ");
					email = input.next();
					System.out.println("Favor digite seu numero do Celular: ");
					celular = input.nextInt();
					PessoaFisica pessoafisicausuario = new PessoaFisica(nome, email, celular, cpf);

					listaPessoaFisica.add(pessoafisicausuario);
					break;
				} else if (opcao == 2) {
					for (PessoaFisica p : listaPessoaFisica) {
						System.out.println(p);
					}
					break;
				} else if (opcao == 3) {
					System.out.println("qual pessoa deseja alterar?(informe o cpf)");
					cpf = input.next();
					achou = false;
					for (i = 0; i < listaPessoaFisica.size(); i++) {
						if (listaPessoaFisica.get(i).getCpf().equals(cpf)) {
							achou = true;
							do {
								System.out.println("o que deseja alterar?\n1-Cpf\n2-Email\n3-Celular\n4-Nome");
								j = input.nextInt();
								if (j < 1 || j > 4) {
									System.out.println("comando invalido, tente novamente");
								}
							} while (j < 1 || j > 4);

							switch (j) {
							case (1):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								cpf = input.next();
								listaPessoaFisica.get(i).setCpf(cpf);
								break;
							case (2):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								email = input.next();
								listaPessoaFisica.get(i).setEmail(email);
								break;
							case (3):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								celular = input.nextInt();
								listaPessoaFisica.get(i).setCelular(celular);
								break;
							case (4):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								nome = input.next();
								listaPessoaFisica.get(i).setNome(nome);
								break;
							}
						}
					}
					if (achou == false) {
						System.out.println("pessoa n�o encontrada.");
					}
				}
				break;
			case 3:
				System.out.println("Categ�ria do Produto\n 1 - Cadastrar Categoria:\n 2 - Listar Categoria\n 3 - Alterar Categoria\n");
				opcao = input.nextInt();
				if (opcao == 1) {
					System.out.println("Digite o NOME da categ�ria:");
					id_categ = input.next();
					Categ categ = new Categ(id_categ);
					listaCategoria.add(categ);
					break;
				} else if (opcao == 2) {
					for (Categ p : listaCategoria) {
						System.out.println(p);
					}
					break;
				}else if(opcao==3) {
					System.out.println("qual categoria deseja alterar?(informe o ID)");
					id_categ = input.next();
					achou = false;
					for (i = 0; i < listaCategoria.size(); i++) {
						if (listaCategoria.get(i).getId_categ().equals(id_categ)) {
							achou = true;
							System.out.println("qual devera ser o novo valor para o ID?");
							id_categ = input.next();
							listaCategoria.get(i).setId_categ(id_categ);
							break;
							}
						}
					if (achou == false) {
						System.out.println("pessoa n�o encontrada.");
					}
				break;
				}
			case 4:
				System.out.println("Cadastro de Produto:\n1 - Cadastrar Produto:\n2 - Listar Produtos\n3 - Alterar Produtos");
				opcao = input.nextInt();
				if (opcao == 1) {
					System.out.println("Favor digite o ID do produto para Cadastro: ");
					id = input.nextInt();
					System.out.print("Favor digite o nome do produto para Cadastro: ");
					nome = input.next();
					System.out.println("Favor digite o preco da venda: ");
					precovenda = input.nextDouble();
					System.out.println("Favor digite a quantidade em estoque: ");
					qtde_estoque = input.nextInt();
					Produto produto = new Produto(id, nome, precovenda, qtde_estoque);
					listaProduto.add(produto);
					break;
				} else if (opcao == 2) {
					for (Produto p : listaProduto) {
						System.out.println(p);
					}
					break;
				}
				else if(opcao==3) {
					System.out.println("qual produto deseja alterar?(informe o ID)");
					id = input.nextInt();
					achou = false;
					for (i = 0; i < listaProduto.size(); i++) {
						if (listaProduto.get(i).getId().equals(id)) {
							achou = true;
							do {
								System.out.println("o que deseja alterar?\n1-ID\n2-Nome\n3-Pre�o de venda\n4-Qnt de estoque");
								j = input.nextInt();
								if (j < 1 || j > 4) {
									System.out.println("comando invalido, tente novamente");
								}
							} while (j < 1 || j > 4);

							switch (j) {
							case (1):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								id = input.nextInt();
								listaProduto.get(i).setId(id);
								break;
							case (2):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								nome = input.next();
								listaProduto.get(i).setNome(nome);
								break;
							case (3):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								precovenda = input.nextDouble();
								listaProduto.get(i).setPrecovenda(precovenda);
								break;
							case (4):
								System.out.println("qual devera ser o novo valor para aquele dado?");
								qtde_estoque = input.nextInt();
								listaProduto.get(i).setQtde_estoque(qtde_estoque);
								break;
							}
						}
					}
					if (achou == false) {
						System.out.println("pessoa n�o encontrada.");
					}
				}
				break;
			case 5:
				System.out.println("### Cadastro de Fornecedores ###\n");
				System.out.println("Digite 1 - Pessoa F�sica");
				System.out.println("Digite 2 - Pessoa Juridica");
				escolha = input.nextInt();
				PessoaFisica pessoafisicacpf = null;
				PessoaJuridica pessoajuridica = null;
				if (escolha == 1) {
					System.out.print("Digite seu CPF: ");
					cpf = input.next();
					System.out.print("Digite seu Nome: ");
					nome = input.next();
					System.out.print("Digite seu E-mail: ");
					email = input.next();
					System.out.print("Digite seu celular: ");
					celular = input.nextInt();
					pessoafisicacpf = new PessoaFisica(nome, email, celular, cpf);

				} else if (escolha == 2) {
					System.out.print("Digite seu CNPJ: ");
					cnpj = input.nextInt();
					System.out.print("Digite seu Nome: ");
					nome = input.next();
					System.out.print("Digite seu E-mail: ");
					email = input.next();
					System.out.print("Digite seu celular: ");
					celular = input.nextInt();
					pessoajuridica = new PessoaJuridica(nome, email, celular, cnpj);
					System.out.println("\n 1 - Cadastrar novo Fornecedor:\n 2 - Voltar ao Menu");
					int novaescolha = input.nextInt();
					while (novaescolha == 1) {
						System.out.print("Digite seu CNPJ: ");
						cnpj = input.nextInt();
						System.out.print("Digite seu Nome: ");
						nome = input.next();
						System.out.print("Digite seu E-mail: ");
						email = input.next();
						System.out.print("Digite seu celular: ");
						celular = input.nextInt();
						pessoajuridica = new PessoaJuridica(nome, email, celular, cnpj);
						System.out.println("\n 1 - Cadastrar novo Fornecedor:\n 2 - Voltar ao Menu");
						if (novaescolha == 2) {
							System.out.println("At� logo!");
						}
						Menu();
					}
				} else {
					System.out.println("Op��o Inv�lida!");
				}

				break;

			case 12:
				System.exit(0);
				System.out.println("Programa encerrado");
				input.close();

			}
		}
	}
	catch(InputMismatchException exception1) {
		System.out.println("Op��o Inv�lida!");
	}
	catch(ArrayIndexOutOfBoundsException exception2) {
		System.out.println("Posi��o inv�lida!");	
	}
	catch (NumberFormatException exception3) {
		System.out.println("Imposs�vel realizar esta a��o.");
	}
	catch (IllegalArgumentException exception3) {
		System.out.println("Imposs�vel realizar esta a��o.");	
	}
	
	}

	public static void Menu() {
		System.out.println("\tSEJA BEM VINDO AO CONTROLE DE ESTOQUE\n" + "\t1 - Efetuar LOGIN\n "
				+ "\t2 - Cadastrar Pessoas / Listar / Alterar\n " + "\t3 - Cadastrar Categoria / Listar / Alterar\n "
				+ "\t4 - Cadastrar Produtos / Listar / Alterar\n "
				+ "\t5 - Cadastrar Fornecedores / Listar / Alterar\n " + "\t6 - Gerar Relat�rios\n "
				+ "\t7 - Visualizar Compras Anteriores\n " + "\t8 - Calcular consumo m�dio mensal\n "
				+ "\t9 - Gerar relat�rio do que se precisa comprar para suprir o m�s\n "
				+ "\t10 - Gerar relat�rio de fornecedores por produto\n "
				+ "\t11 - Gerar relat�rio de lucro liquido mensal\n" + "\t12 - Sair do Programa");
	}
}

//Pessoa f�sica est� no case 2
//Pessoa jur�dica:
/*
System.out.println("qual fornecedor deseja alterar?(informe o cnpj)");
cnpj = input.nextInt();
achou = false;
for (i = 0; i < listaFornecedor.size(); i++) {
	if (listaFornecedor.get(i).getCnpj().equals(cnpj)) {
		achou = true;
		do {
			System.out.println("o que deseja alterar?\n1-Cnpj\n2-Email\n3-Celular\n4-Nome");
			j = input.nextInt();
			if (j < 1 || j > 4) {
				System.out.println("comando invalido, tente novamente");
			}
		} while (j < 1 || j > 4);

		switch (j) {
		case (1):
			System.out.println("qual devera ser o novo valor para aquele dado?");
			cnpj = input.nextInt();
			listaFornecedor.get(i).setCnpj(cnpj);
			break;
		case (2):
			System.out.println("qual devera ser o novo valor para aquele dado?");
			email = input.next();
			listaFornecedor.get(i).setEmail(email);
			break;
		case (3):
			System.out.println("qual devera ser o novo valor para aquele dado?");
			celular = input.nextInt();
			listaFornecedor.get(i).setCelular(celular);
			break;
		case (4):
			System.out.println("qual devera ser o novo valor para aquele dado?");
			nome = input.next();
			listaFornecedor.get(i).setNome(nome);
			break;
		}
	}
}
if (achou == false) {
	System.out.println("fornecedor n�o encontrado.");
}
break;
*/