import java.util.*;
public class Exercicio6_3 {

	public static void main(String[] args) {
		// 1- variaveis
		float custoProduto[] = new float[3];
		int quantEstoque[][] = new int[3][3];
		byte armazemMaiorQuant = 0;
		int maiorSomaQuantArmazem = 0;
		int somaQuantArmazem = 0;
		float custoProdutoArmazem;
		float custoEstoqueArmazem = 0;
		float custoEstoqueTotal = 0;
		byte linha,coluna;
		Scanner leia = new Scanner(System.in);
		
		// 2- Entrada de dados
		for (byte x = 0; x <= 2; x++) {
			System.out.print("Digite o custo do produto " + (x+1) + ": ");
			custoProduto[x] = leia.nextFloat();
		}
		
		for (linha = 0; linha <= 2; linha++) {	
			for (coluna = 0; coluna <= 2; coluna++) {
				System.out.print("Digite a quantidade do produto " + (coluna+1) + 
						" no armazem " + (linha+1) + ": ");
				quantEstoque[linha][coluna] = leia.nextInt();
				
				// 3 - calculos e saidas
				custoProdutoArmazem = quantEstoque[linha][coluna] * custoProduto[coluna];
				System.out.println("Custo do produto " + (coluna+1) + " no armazem " + 
						(linha+1) + ": " + custoProdutoArmazem);
				
				custoEstoqueArmazem = custoEstoqueArmazem + custoProdutoArmazem;
				somaQuantArmazem = somaQuantArmazem + quantEstoque[linha][coluna];
			}
			
			System.out.println("Custo do estoque no armazem " + (linha+1) + ": " + custoEstoqueArmazem);
			custoEstoqueTotal = custoEstoqueTotal + custoEstoqueArmazem;
			
			if (somaQuantArmazem > maiorSomaQuantArmazem) {
				maiorSomaQuantArmazem = somaQuantArmazem;
				armazemMaiorQuant = (byte)(linha + 1);
			}	
			
			somaQuantArmazem = 0;
			custoEstoqueArmazem = 0;
			
		}
		
		System.out.println("Custo total do estoque: " + custoEstoqueTotal);
		System.out.println("Armazem que contem a maior quantidade de produtos: " + armazemMaiorQuant);

	}

}
