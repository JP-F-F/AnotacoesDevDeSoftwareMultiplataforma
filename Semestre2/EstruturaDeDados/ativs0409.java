//import java.util.Scanner;
/*
class Problema1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            nums [i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Número:" + i + " Número Digitado " + nums[i]);
        }
        scanner.close();
    }
}
*/

/*
class Problema2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            nums [i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            
            if(nums[i] % 2 == 0){
                System.out.println("Número Par:" + nums[i]);
                cont++;
            }

        }
        System.out.println("Foram encontrados " + cont + " números pares");
    }
        
}
*/

/*
class Problema3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[5];
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            nums[i] = scanner.nextDouble();
        }
        for(int i = 0; i < 5; i++){
            soma += nums[i];

        }
        System.out.println("A soma de todos os valores do array é:" + soma);
        double med = soma / 5;
        System.out.println("A media de todos os valores do array é:" + med);
        scanner.close();
    }
}
*/

/*
class Problema4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[8];
        int maior = 0, menor = 999999999, posMaior = 0, posMenor = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um número");
            nums[i] = scanner.nextInt();

            if(nums[i] > maior){
                maior = nums[i];
                posMaior = i;
            }
            if(nums[i] < menor){
                menor = nums[i];
                posMenor = i;
            }
        }  
        System.out.println("O maior Número é:" + maior + " e sua posição no array é:" + posMaior);
        System.out.println("O menor Número é:" + menor + " e sua posição no array é:" + posMenor);
        scanner.close();
    }
    
}
*/

/*class Problema5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            nums[(nums.length) - 1] = scanner.nextInt();
        }
    }
}
*/