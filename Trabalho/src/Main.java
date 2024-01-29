import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class Main {

	public static void main(String[] args) {
		double valorFinal = 0;
		double troco = 0;
		LocalTime horaAtualSemSegundos = LocalTime.now().truncatedTo(java.time.temporal.ChronoUnit.MINUTES);
		LocalDate dataAtualSemHoras = LocalDate.now();
		while (true) {
			 Scanner sc = new Scanner(System.in); {
					System.out.println("\n = = = BottleTech = = = \n  Better Than Others!\n \nOlá! Bem-vindo(a)!\n");
					System.out.print("OPÇÕES:\n1 - Produtos\n2 - Pagamento\n3 - Sugestões e Reclamações\n4 - Suporte Técnico\n5 - Encerrar programa\nDigite sua opção: ");
					int op = sc.nextInt();	
if(op == 1) {
System.out.println("┌─────────────┬───────────┬───────────┬───────────┬───────────┬───────────┐\n" +
	                                         "│ MODELOS     │ (1) 400ML │ (2) 500ML │ (3) 600ML │ (4) 750ML │ (5) 950ML │\n" +
	                                         "├─────────────┼───────────┼───────────┼───────────┼───────────┼───────────┤\n" +
	                                         "│ (1) - Trix  │ 50,00     │           │ 65,00     │ 80,00     │           │\n" +
	                                         "│ (2) - Basic │ 40,00     │           │ 55,00     │ 70,00     │           │\n" +
	                                         "│ (3) - Pires │           │ 100,00    │           │ 120,00    │ 160,00    │\n" +
	                                         "│ (4) - Soft  │           │ 80,00     │           │ 110,00    │ 150,00    │\n" +
	                                         "└─────────────┴───────────┴───────────┴───────────┴───────────┴───────────┘\n");
	                                 System.out.println("┌─────────────┬─────────┐\n" +
	                                         "│ FRETE       │ VALORES │\n" +
	                                         "├─────────────┼─────────┤\n" +
	                                         "│ Regional 1  │ 18,00   │\n" +
	                                         "│ Regional 2  │ 15,00   │\n" +
	                                         "│ Regional 3  │ 20,00   │\n" +
	                                         "│ Regional 4  │ 22,00   │\n" +
	                                         "│ Regional 5  │ 30,00   │\n" +
	                                         "│ Regional 6  │ 35,00   │\n" +
	                                         "│ Regional 7  │ 32,00   │\n" +
	                                         "│ Regional 8  │ 28,00   │\n" +
	                                         "│ Regional 9  │ 40,00   │\n" +
	                                         "│ Regional 10 │ 38,00   │\n" +
	                                         "│ Regional 11 │ 25,00   │\n" +
	                                         "│ Regional 12 │ 10,00   │\n" +
	                                         "└─────────────┴─────────┘\n");
	                                 try {
	                                     System.out.println("Insira o modelo desejado:");
	                                     int modelo = sc.nextInt();
	                                     System.out.println("Insira o tamanho: ");
	                                     double tamanho = sc.nextInt();
	                                     System.out.println("Insira a quantidade: ");
	                                     int quantidade = sc.nextInt();
	                                     System.out.println("Insira a sua região: ");
	                                     int regiao = sc.nextInt();

	                                     double valorDaRegiao = 0;
	                                     if (regiao == 1) {
	                                         valorDaRegiao = 18;
	                                     } else if (regiao == 2) {
	                                         valorDaRegiao = 15;
	                                     } else if (regiao == 3) {
	                                         valorDaRegiao = 20;
	                                     } else if (regiao == 4) {
	                                         valorDaRegiao = 22;
	                                     } else if (regiao == 5) {
	                                         valorDaRegiao = 30;
	                                     } else if (regiao == 6) {
	                                         valorDaRegiao = 35;
	                                     } else if (regiao == 7) {
	                                         valorDaRegiao = 32;
	                                     } else if(regiao == 8){
	                                         valorDaRegiao = 28;
	                                     } else if(regiao == 9){
	                                         valorDaRegiao =40;
	                                     } else if(regiao == 10){
	                                         valorDaRegiao = 38;
	                                     } else if(regiao == 11) {
	                                         valorDaRegiao = 25;
	                                     } else if(regiao == 12){
	                                         valorDaRegiao = 10;
	                                     }

	                                     double valor;


	                                     if (modelo == 1 && tamanho == 1) {
	                                         valor = 50;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 1 && tamanho == 3) {
	                                         valor = 65;
	                                     } else if (modelo == 1 && tamanho == 4) {
	                                         valor = 80;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 2 && tamanho == 1) {
	                                         valor = 40;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 2 && tamanho == 3) {
	                                         valor = 55;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 2 && tamanho == 4) {
	                                         valor = 70;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 3 && tamanho == 2) {
	                                         valor = 100;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 3 && tamanho == 4) {
	                                         valor = 120;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 3 && tamanho == 5) {
	                                         valor = 160;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 4 && tamanho == 2) {
	                                         valor = 80;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 4 && tamanho == 4) {
	                                         valor = 110;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else if (modelo == 4 && tamanho == 5) {
	                                         valor = 150;
	                                         valorFinal = (valor * quantidade) + valorDaRegiao;
	                                     } else {
	                                         System.out.println("Insira valores válidos para facilitar o atendimento, por favor.");
	                                     }
	                                     System.out.println("Valor: "+valorFinal+"R$ \nData e horário da compra: "+dataAtualSemHoras+" "+horaAtualSemSegundos);

	                                 } catch (Exception e) {
	                                     System.out.println("Insira somente números para facilitar o atendimento, por favor.");
	                                 }
	                             }else if (op == 2) {
	while (true ) {
		try {
			Scanner t= new Scanner(System.in);
		 System.out.println("\n = = = Area de Pagamento! = = = ");
		 System.out.println("\n1 - Debito \n2 - Credito \n3 - Pix \n4 - Dinheiro \n5 - Voltar ao Menu");
		 System.out.print("Selecione o metodo de pagamento: ");
		 int op2 = t.nextInt();
		 
		 if (op2 == 1) {
			 System.out.println("Pagamento via cartao de debito!");
			 System.out.println("   ▄▄▄▄▄▄▄  ▄  ▄  ▄ ▄▄▄  ▄▄▄▄▄▄▄  \r\n"
			 		+ "   █ ▄▄▄ █ █▄▄██ ▄▀▀▄█ █ █ ▄▄▄ █  \r\n"
			 		+ "   █ ███ █ ▄▀▀▀ ██▄▄▀▀▀█ █ ███ █  \r\n"
			 		+ "   █▄▄▄▄▄█ █▀▄▀▄ █▀█ ▄▀█ █▄▄▄▄▄█  \r\n"
			 		+ "   ▄▄ ▄  ▄▄▀▀▄ █▄█▄ █▀ ▄ ▄▄▄ ▄▄   \r\n"
			 		+ "   █▄ ▀  ▄█ ▄█▀ ▀█▀▀█▄▄█▄▀ ▄█▄▄▀  \r\n"
			 		+ "   ▄▀ ▀ █▄▄   ▀▀█▀▀█ ▀ █ ▄█ ▄▀█▄  \r\n"
			 		+ "   ▀ █▀ ▀▄█▀ ▀▄▄  ▀  ▀▀▀█  ▄▄▄▄▄  \r\n"
			 		+ "   ▀██▄▄▀▄███ ▀██▀▀███▀ █▀▄ ▀ █   \r\n"
			 		+ "   ▄▀▄█▀█▄▄ ▀█▀▀██  ▀█ █▀██ ▀ ▄█  \r\n"
			 		+ "   ▄ ▀█▀▀▄▄▀ ██▀ ▄█ █▀ ▄█▄▄█ ▄▀▀  \r\n"
			 		+ "   ▄▄▄▄▄▄▄ █▄█▀▀▀▄ ▄ ▄▄█ ▄ █ ▀█▀  \r\n"
			 		+ "   █ ▄▄▄ █  ▄ ▀▄▀▀█▄▄█ █▄▄▄█▀▀▀▄  \r\n"
			 		+ "   █ ███ █ ▀▀████▄   ▀██ ▀▀███ ▄  \r\n"
			 		+ "   █▄▄▄▄▄█ █▀▀▄▄▀  ▄█▀██▄     █   \r\n"
			 		+ "                                  "+valorFinal);
		 } else if (op2 == 2) {
			 System.out.println("Pagamento via cartao de credito!");
			 System.out.println("     ▄▄▄▄▄▄▄  ▄  ▄▄▄  ▄ ▄  ▄▄▄▄ ▄▄▄▄▄   ▄    ▄▄▄▄▄ ▄▄  ▄▄▄▄▄▄▄     \r\n"
			 		+ "     █ ▄▄▄ █ ▀▀ ▄ █ ▀▀▄▄▄█▀▄ ▄▄█  ▄▄▄█▀█▄ ▄█▄█   ▄█▄█  █ ▄▄▄ █     \r\n"
			 		+ "     █ ███ █ ▀   ██▄▀▄▀▀▀   ▄▀▄█▄▄▄█▀   ▀▀█▀▄▄ █▄ ▀ █  █ ███ █     \r\n"
			 		+ "     █▄▄▄▄▄█ █▀█▀█▀█▀█▀█▀▄▀█ ▄▀█ ▄ █▀▄▀█▀█▀█▀▄▀▄▀▄ █ ▄ █▄▄▄▄▄█     \r\n"
			 		+ "     ▄▄▄▄▄ ▄▄▄▄ ▀ █ ▄▀▄▄▄▄▄ █  █▄▄▄█▄▄▀ ▄█▀ ▀▀▀▀▄ █ █▀▄ ▄ ▄ ▄      \r\n"
			 		+ "     ▀▄▀▀█▀▄ █  ▄▀▀ ▄▄▄ ▀▄▄▀▄██ ▀▀▄▀▄█▄  ▄▀ ▄ ██▄ ▄ ██▀ █▀ ▄█▀     \r\n"
			 		+ "     ██ ▄ ▀▄▀▀▀▀▀█▀ ▀ ▄ █ ▄ ▄ ▄▄█▀▄█▄▀  ▄▄▀▀▀▀▀ ▀▀▄█ ▀█▀█▀█▀ ▄     \r\n"
			 		+ "     ▀█  █▄▄▀ ▀▄▀ ▀    ▀█▄▄ █▀▀▄▄ ▄█▀▀ ▄▀▀▄▄▄▀▀▀▄▀▄▄▄▀▄▄██▀██      \r\n"
			 		+ "     ▀▀  █▀▄ █▄ █▄█ ▄ ▀█▀▄█▀▀▀▀▄▄  █▄▀▄▀▄▄█▀▀▀▄▄█▀  █▀▄▄▀ █▀▀▄     \r\n"
			 		+ "     ▄▀▄ ▀ ▄▄█▀██▄▄█▄▄▄ ▀▄██▀▀██▄ █▀▀▀▀▄█▄█▄▀█▀▀█▄▄▄▀█▀ ▀ ▄▄█▀     \r\n"
			 		+ "     ▀▀  █▀▄▀▄▄▄▄ ▄█▀ ██▀▀▄ ███▄█▀█▀█▀▀  ▄█  ▀ █▄▀▀▄▄▀██▄▀ ▀▀▀     \r\n"
			 		+ "     █▀▄█  ▄██▄▀██▄▄▀ ▄█▀█ ▀▄█▄   ▄▀▄ ▄▄▀▀█▄  ▄▀▄▄▀▄ ▀ ▄▀ ▄█▄▀     \r\n"
			 		+ "      ▀ ▀▄▀▄▄  ▀█▄███ ██▀█▄▀▄▀▄  ▀█▄▀   ▄█▄ ▀ ▄█▄  ██▀▀▄▄▀▀█▄█     \r\n"
			 		+ "      ▄█ ▄▄▄▄▄▄█▄ ██ ▄ ▄▄  █ █▄▄▄███▀ █ ▀█▀ ▄ ▀█▀ ▄ ███▄▄▄▀██▀     \r\n"
			 		+ "     ▀  ▀█ ▄ █▄██▄▄▄▀ ▀█▄█▀█▄▄ █ ▄ █▄▀█▄▄▄██ ▀▄▀▀▀ ▄▄█ ▄ ██▀ ▀     \r\n"
			 		+ "     ▀█ ▄█▄▄▄█ ▄█▀ ▄▄ █▀▄▄▀▄██▀█▄▄▄█▄▀▄▄█▀█▄▀▀▀▀  ▄▄██▄▄▄███▀▀     \r\n"
			 		+ "     ▄▀█▄ ▀▄▄ █▀ ▄█▀ █▄▄▀▄▀▀▀█  ▄▀█ █▀▀▀██▄ ▀▀█▄ ▀▀▀▀ ▀▀ ▄█▀▄▀     \r\n"
			 		+ "     ▄▀▀██▀▄█    ▄ ▄▀ ▄ █ ▀▀▀▀▄█ ▄▄   ▄ ▄█▀▄▄  ▀ ▀ ▄▀ ▀ ▀▄▀▀▄▀     \r\n"
			 		+ "     █ █▀ ▄▄▄▀▀ ▄▀▀▀▄ █▄█ ▀  █ ▀█  ██▀ ▄▄▄ ▄ ▀ █▄▀▀ ▀ ██▀ █▀▀▄     \r\n"
			 		+ "      ▀▀█ ▀▄████▄▀██▄█▄█▄ █▄▀ ▄▄▄█▀▄ ▄▄▄█▀▀▄ █▄▀█▀▀▄ ▀▄▀ ▄▀▀▄█     \r\n"
			 		+ "     ▄▀▄▄▀ ▄█ ▄ █ █▄▄▀ █▄▄█ █ █▄▄█▄ ▄▄▄█▄█▄ ▀ ▄██ █▄▀█▄█ ██▀       \r\n"
			 		+ "     ▀▀▄▀▀▄▄█▀▄▄   ▄▄ █   ▄▀▄█▀▄▄▄██▄█▄▀▀█▀ ▄ ▀█▄ ▄▄ ██▀ ▄▀██      \r\n"
			 		+ "     █ ▀ ▄▄▄   █ ▀▄▀█▄▄ █ ▄ █ ▄▄▄ ▄█ ▀▄▀▀▄▄▄█▀█ ▀▀ █▀▀▀▀█▄█▀ █     \r\n"
			 		+ "     █▀█ ▀▄▄▄▀ ▀▀▄ ▄   █▀▄▄▄██▄   ▄▄▀▀▀▄██▀▄█ ▀▀▀▀▄▄  █▀▀  ▀▄▀     \r\n"
			 		+ "     ▀▀▀▀▀ ▄▀▀▀█▄ █▀███▄██  ▄▀▄▄█▄▄▄█▀█▄▄█▄█▀▀█▄█▀▀▄▀▄▄█▄▄▀▀ ▄     \r\n"
			 		+ "     ▄▄▄▄▄▄▄ █  ▀▀▄▀▀▄  ▀▄▀█▄███ ▄ █▄▀█▄█▄▄▄ ▄▀▀█ ▄▄██ ▄ ███▄▀     \r\n"
			 		+ "     █ ▄▄▄ █ ▄▄▀▄ ▀▄ ▀ ▄▀ ▀▀██ █▄▄▄█▄▀  ▀▄▄▄█▀ █▄▀█▀▀█▄▄▄██▀       \r\n"
			 		+ "     █ ███ █ █▀ ████▀ █ ▀█▀ ▄█▀█▄▀▄██▄ ▄▀█▀▄ ▄▄▀██▀▄▄▄█▄ ▀█▀       \r\n"
			 		+ "     █▄▄▄▄▄█ █▄ █▀██▀▄▀████ ▄▀▀   ▄█▀ ▀ ▄█▄ ▀ ▄█▀▀ ▄  ▄▄█ ▀▀▄      \r\n"
			 		+ "        "+valorFinal);
		 }
		 else if ( op2 == 3) {
			 System.out.println("pagamento via pix");
			 System.out.println("\r\n"
			 		+ " ▄▄▄▄▄▄▄   ▄ ▄   ▄▄▄ ▄  ▄  ▄▄▄▄▄▄▄\r\n"
			 		+ " █ ▄▄▄ █ ▀ ▀ ▄▀▄▀█   █▄█▄▄ █ ▄▄▄ █\r\n"
			 		+ " █ ███ █ ▀█▀ ▀ ▀▀█  █▀ █▄  █ ███ █\r\n"
			 		+ " █▄▄▄▄▄█ █▀▄▀█ ▄▀▄▀▄ ▄▀▄ ▄ █▄▄▄▄▄█\r\n"
			 		+ " ▄▄▄▄▄ ▄▄▄█▀█ ▄▀▄█▄ ▄ ▀▀█▄▄ ▄ ▄ ▄ \r\n"
			 		+ " █▀ █  ▄▀▀ █ ▀▀██▀▀█▀█ ▄▀▀█▀ ▄▄▀█▀\r\n"
			 		+ " ▀▄ ▄▀▄▄▀█▄▄ █▄▀██▄▀▀▄█▄▄▄▄ ▀▄▄▀  \r\n"
			 		+ "  ▀ ▄▀▀▄▀   ▄▄▀██▀ ▄▀█ █▀  ▀▄▄  █▀\r\n"
			 		+ " ▄▄  █▄▄▀ ▄▄█  ▀▄ ▄▀▀▀▀▀█▄█ ▄█ ▀▄ \r\n"
			 		+ " ▄▀█ █ ▄▀█▀  ▀█▄▄▀▄█▀█ ▄▀ ▄▀  █ █▀\r\n"
			 		+ "  ▄▄██▀▄███▄ █▀▄█▄ ▀▄ ▀▄▀██▀██ ▀▄ \r\n"
			 		+ " █▀▄ ▀▀▄█▀▀▄▄▄  ▄   ▀██▄▀▄▀▀▄▄█ █▀\r\n"
			 		+ " █ ▀▄█▄▄  █▄█  ▀▄▀ ▀██▀██▄▄█▄██▀ ▄\r\n"
			 		+ " ▄▄▄▄▄▄▄ █ █ ▀███▀▄▄▀▄▀▀▄█ ▄ ██▀▄▀\r\n"
			 		+ " █ ▄▄▄ █ ▄█  █▀▄▀▄▄▀██▀▄ █▄▄▄██▀██\r\n"
			 		+ " █ ███ █ █  ▄▄  █▀   █▄ █▀▀▄█▀█▀▀▀\r\n"
			 		+ " █▄▄▄▄▄█ ██▄█  ▀ ▄ ▀▀ ▀█▄▄▄  ▀█▀▄ \r\n"
			 		+ ""+valorFinal);
		 }
	                             
		 else if ( op2 == 4) {
			 while (true) {
			 System.out.println("pagamento em dinheiro");
			 System.out.print("pagamento: ");
		 double pagamento = sc.nextDouble();
		 troco = pagamento-valorFinal;
		 System.out.println("Pagamento recebido!");
		 System.out.println("Seu troco é: "+troco+"R$ "+"\n");
		 System.out.print("Digite um email para receber o comprovante digital! \nAqui: ");
		 String email = sc.next();
		 System.out.println("Comprovante enviado para: "+email);
	
		 break;
	       
			 }} else {
			 System.out.println("\nInsira uma opção válida, por favor.");
		 }
		 break;
		} catch (Exception e) {
			System.out.println("\nInsira somente numeros, por favor.\n");
		}
		
	       } } else if ( op == 3) {
       	   while(true){
      			System.out.print("\n = = = SUGESTÕES E AVALIAÇÕES = = = \n\nOlá! O que você deseja realizar?\n1 - Sugestão\n2 - Reclamação\n3 - Voltar\nInsira a sua opção: ");
      			int op3 = sc.nextInt();
      			sc.nextLine();
      			if(op3 == 1) {
      				System.out.println("No que podemos melhorar? Insira abaixo a sua sugestão: " );
      				String sugestao = sc.nextLine();
      				System.out.println("Sua sugestão foi enviada para a nossa equipe, obrigada!");
      			} else if(op3 ==2) {
      				System.out.println("No que podemos melhorar? Insira a sua reclamação:");
      				String reclamacao = sc.nextLine();
      				System.out.println("Agradecemos por sua reclamação, ela será enviada para a nossa central de atendimento ao cliente.");
      			} else if(op3 == 3) {
      				break;
      			} else {
      				System.out.println("\nInsira uma opção válida, por favor.\n");
      			}
      		}
        	  
          } else if ( op == 4) {
        	  String nomeCompleto = null;
              String email = null;
              String telefone = null;
              String senha = null;
              while(true) {
                  try {
                      System.out.println("===SUPORTE TÉCNICO===\n» Relate o seu problema\n1 - Cadastro\n2 - Login\n3 - Voltar\nInsira a sua opção:");
                      int op2 = sc.nextInt();
                      if (op2 == 1) {
                          sc.nextLine();
                          System.out.println("CADASTRO");
                          System.out.println("+---------------------------------------------------------------------------------------------------+\r\n"
                                  + "| Por que é preciso realizar um cadastro?                                                           |\r\n"
                                  + "+---------------------------------------------------------------------------------------------------+\r\n"
                                  + "| Caro cliente, para que possamos te ajudar é necessário realizar um cadastro em nossa plataforma. |\r\n"
                                  + "| Assim, será possível que a equipe de suporte entre em contato com você.                          |                                                                |\r\n"
                                  + "+---------------------------------------------------------------------------------------------------+\r\n"
                                  + "");
                          System.out.println("Insira");
                          System.out.println("Nome completo:");
                          nomeCompleto = sc.nextLine();
                          System.out.println("E-mail:");
                          email = sc.nextLine();
                          System.out.println("Telefone:");
                          telefone = sc.nextLine();
                          if(telefone.replace(" ","").length() > 11 || telefone.replace(" ", "").length() < 11){
                              System.out.println("Insira um número válido.");
                          } else {
                              System.out.println("Crie uma senha: ");
                              senha = sc.nextLine();
                          }


                      } else if (op2 == 2) {
                          sc.nextLine();
                          System.out.println("→ LOGIN");
                          System.out.println("E-mail:");
                          String emailLogin = sc.nextLine();
                          System.out.println("Senha:");
                          String senhaLogin = sc.nextLine();
                          if (emailLogin.equals(email) && senhaLogin.equals(senha)) {
                              System.out.println(String.format("Bem-vindo(a), %s.\nNome: %s\nTelefone: %s\nE-mail: %s", nomeCompleto, nomeCompleto, telefone, email));
                              System.out.println("Insira sua dúvida, ela será encaminhada para nossa equipe: ");
                              String duvida = sc.nextLine();
                              System.out.println("Agradecemos pela notificação. Em até 3 dias úteis um assistente da BottleTech entrará em contato com você.");

                          } else {
                              System.out.println("Suas credenciais estão incorretas.");
                          }

                      } else if (op2 == 3) {
                          break;
                      }
                  } catch(Exception e){
                      System.out.println("Insira uma opção válida.\n");
                  }
              
      }
          }

			  else if ( op == 5) {
				 System.out.println("Programa encerrado!");
				 break;
			  } else {
    				System.out.println("\nInsira uma opção válida, por favor.\n");
    			}
			 }
		
		}
	}
	}
