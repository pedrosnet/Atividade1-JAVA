import java.util.Scanner;

	class Main{

		public static void main(String[] argas){

			Scanner leitor = new Scanner(System.in);
			String opcao;
            String opcao2;
            String opcao3;

			String enigma1 = "Você acorda em uma sala estranha com apenas um papel no centro da sala\nVocê pega o papel e lê a seguinte mensagem:\nPara sair da sala você deve resolver alguns enigmas, qui vai a primeira:\n O que é, o que é, Sobe, sobe, sobe e jamais desce... \n \n1. Balão \n2. Idade \n3. Avião \n ";
			
			String c1 = "2";
			
			System.out.println(enigma1);
			opcao = leitor.nextLine();

			String final1 =  "\n\nVocê errou a charada, \nO chão embaixo de você se abre e você cai em um abismo sem fim";

			String enigma2 = "\n\nVocê acertou a charada, \nUma porta se abre e você vai até ela\nAo entrar você vê outro papel a sua frente,\ncontudo existem 3 salas de cores diferentes, uma preta, uma roxa e uma rosa, no papel está escrito:\nQual cor forma se misturarmos azul com vermelho?\n\n1. Rosa 2. Preto 3. Roxo\n\n";

			String c2 = "3";
			
			if(opcao.equals(c1)) {
			System.out.println(enigma2);
			} else { 
				System.out.println(final1);
				System. exit(1);
			}

            opcao2 = leitor.nextLine();
			
			String final2 =  "\n\nA sala que você entrou é esmagada por vigas de ferro, você perdeu";
			
			String enigma3 = "\n\nVocê acertou a charada,\nAs duas outras portas são esmagas e uma porta se abre ao seu lado, \nao entrar você vê um homem de preto \ne ele diz que é o criador daquilo tudo,\nele fala que você ir embora pela porta ao lado \nVocê lembra por tudo que passou e: \n\n1.Sair pela porta ao lado \n\n2.Lutar com o homem de preto\n\n";

			String f3 = "1";
			
			if(opcao2.equals(c2)) {
				System.out.println(enigma3);
			} else { 
				System.out.println(final2);
				System. exit(1);
			}

            opcao3 = leitor.nextLine();

			String final3 =  "\n\nVocê sai pela porta ao lado, e se vê no meio da sua cidade, \nvocê segue sua vida como sempre foi";
			String final4 =  "\n\nVocê luta com o homem de preto, \nvocê o derrota e decida se tornar o novo homem de preto \nVocê agora será o novo líder";
            
			if(opcao3.equals(f3)) {
				System.out.println(final3);
			} else { 
				System.out.println(final4);
				System. exit(1);
			}

		
		}
	}