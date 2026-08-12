/*import java.util.Scanner;

class Questao12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        int maior = 0, menor = 999999999;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            nums[i] = scanner.nextInt();

            if(nums[i] > maior){
                maior = nums[i];
                
            }
            if(nums[i] < menor){
                menor = nums[i];
                
            }
        }  
        System.out.println("O maior Número é:" + maior);
        System.out.println("O menor Número é:" + menor);
        scanner.close();
    }
}

class Questao13{
    public static void main(String[] args){
        int[][] matriz = new int[3][3];
        int soma = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println("Digite um número");
                matriz[i][j] = scan.nextInt();
            }
        }

        for(int i =0; i < 3; i++){
            soma += matriz[i][i];
        }
        scan.close();
        System.out.println("A soma da diagonal principal é: " + soma);
    }
}
*/