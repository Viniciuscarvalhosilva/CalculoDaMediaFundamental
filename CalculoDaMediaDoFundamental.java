package calculoDaMediaDoFundamental;

import java.util.Scanner;							
public class CalculoDaMediaDoFundamental 
{

	public static void main(String[] args) 
	{
		int cod;																//variavel do tipo inteiro
		float a = 0,b = 0,c = 0,media = 0;										//variaveis do tipo float
		Scanner read = new Scanner(System.in);
									
							
		System.out.println("************************************");
		System.out.println("**|CALCULO DA MEDIA DO FUNDAMENTAL**");
		System.out.println("************************************\n");
		do																		//comando da estrutura de repeticao (faça)	
		{	
			System.out.println("Digite o seu R.A: ");
			cod = read.nextInt();												//Grava valor digitado na Variavel 'cod'
					
			if(cod!=0)															//estrutura condicional(se 'cod' for diferente de '0')
			{
			
				System.out.println("DIGITE A PRIMEIRA NOTA: ");					//Exibe mensagem na tela do usuario
				a = read.nextFloat();											//Grava valor digitado na variavel 'a'

				System.out.println("DIGITE A SEGUNDA NOTA: ");
				b = read.nextFloat();

				System.out.println("DIGITE A TERCEIRA NOTA: ");
				c = read.nextFloat();
			
				media = (a + b + c) / 3;										//Calculo da media
				System.out.printf("\nMedia = %.2f\n\n",media);					//Exibe resultado do calculo da media com 2 casas decimais
						
				if(media >= 8) 													//Se 'media' maior ou igual a '8'
				{
					System.out.println("-----------------------------------");
					System.out.println("             APROVADO");				//Exibe  'aprovado'
					System.out.println("-----------------------------------\n\n");
				}
			
				else if(media > 6 && media < 8) 								//Se 'media' maior que 6 E 'media' menor que '8'
				{
					System.out.println("-----------------------------------");
					System.out.println("           RECUPERACAO");				//Exibe 'Recuperacao'
					System.out.println("-----------------------------------\n\n");
				}
			
				else 															//Se 'media' menor ou igual a '6'
				{
					System.out.println("------------------------------------");
					System.out.println("             REPROVADO");				//Exibe 'Reprovado'						
					System.out.println("------------------------------------\n\n");
				}
			}
			else																//se 'cod'for igual a '0'
			
				System.out.print("############### FIM ################");
			
			
		}while(cod!=0);															//condição da estrutura de repeticao
	
	}

}
