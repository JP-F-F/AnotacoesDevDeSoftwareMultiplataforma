//import java.util.Arrays;
//import java.util.Scanner;
/*
class Ativ1{
    public static void main(String[] args) {
        double[] nums = new double[10];
        double soma = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            nums[i] = scan.nextDouble();
        }
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
        System.out.println("A soma dos items no vetor é:" + soma);
        scan.close();
    }
}
*/

/*
class Ativ2{
    public static void main(String[] args) {
        double[] nums = new double[15];
        Scanner scan = new Scanner(System.in);
        double maior = 0;
        double menor = 0;
        for(int i =0; i<15; i++){
            System.out.println("Digite um número");
            nums[i] = scan.nextDouble();
            menor = nums[0];

            if(nums[i] > maior){
                maior = nums[i];
            }
            if(nums[i] < menor){
                menor = nums[i];
            }
        }
        System.out.println("O maior Número é:" + maior);
        System.out.println("O menor Número é:" + menor);
        scan.close();

    }
}
*/

/*
class Ativ3{
    public static void main(String[] args) {
        double[] nums = new double[8];
        Scanner scan = new Scanner(System.in);
        int pos = 0;
        for(int i=0; i<8; i++){
            System.out.println("Digite um número");
            nums[i] = scan.nextDouble();
        }
        System.out.println("Array original" + Arrays.toString(nums));
        for(int i = nums.length-1; i != 0; i--){
            if(pos != 4){            
                double trc = nums[pos];
                nums[pos] = nums[i];
                nums[i] = trc;
                pos++;
            }else{
                break;
            }           

        }
        System.out.println("Array invertido" + Arrays.toString(nums));

    }
}
*/