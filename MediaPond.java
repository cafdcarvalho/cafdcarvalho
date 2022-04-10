
import java.util.Scanner;

public class MediaPond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Média Ponderada 6.5 para ser aprovado.");
		  
		    
		  // vamos solicitar as quatro notas do aluno
		  Double AVA1, AVA2, A2, A3, media, med, media2;
	
		    
		  System.out.print("Informe a nota AVA1 nota: ");
		  AVA1 = Double.parseDouble(entrada.nextLine());
		    
		  System.out.print("Informe a nota AVA2 nota: ");		   
		  AVA2 = Double.parseDouble(entrada.nextLine());
		    
		  System.out.print("Informe a nota A2 nota: ");
		  A2 = Double.parseDouble(entrada.nextLine());
		  
		    
		  // vamos calcular a média aritmética
		  media = (AVA1/10 + AVA2/10)  / 2 * .4 + (A2 * .6);
		  //media = med / 10;
		  
		  System.out.println(String.format("%.2f %n ", media));
		    
		  // vamos verificar se o aluno foi aprovado ou reprovado
		  if(media >= 6.5){
			  System.out.println("O aluno foi aprovado");
		  }else{
		      System.out.println("O aluno não atingiu a média, pode fazer A3");
		     
		       
		  System.out.print("Informe a nota A3 nota: ");
		  A3 = Double.parseDouble(entrada.nextLine());
		    
		  media2 = (AVA1/10 + AVA2/10) / 2 * .4 + (A3 * .6);
		      
		  if(media2 >= 6.5){
		      System.out.println(String.format("%.2f %n ", media2));
		  }else{
		      System.out.println(String.format("%.2f %n ", media2));
		    
		    
		      }
		    
		  System.out.println("\n");
		  }
		}

	}


