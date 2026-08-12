
/*class Exercicio1l3{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Printando vetor de forma literal" + nums);
        System.out.println("Agora vamos ver os itens do vetor");
        for(int i = 0; i < nums.length; i++){
            System.out.println("Item:" + nums[i]);
        }
    }
}
*/

/*
class Exercicio2l3{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {a[0] * 2, a[1] * 2, a[2] * 2, a[3] * 2, a[4] * 2, a[5] * 2, a[6] * 2, a[7] * 2, a[8] * 2, a[9] * 2, };
        System.out.println("Aqui as duas coleções");
        for(int i = 0; i<a.length; i++){
            System.out.println("Item:" + a[i] + " Da lista A");
        }
        for(int j = 0; j<b.length; j++){
            System.out.println("Item:" + a[j] + " Da lista B");
        }
    }
}
*/

/*Exercicio 8
import java.util.Scanner;

class Aluno{
    private String nome;
    private double notaTrimestre1;
    private double notaTrimestre2;
    private double notaTrimestre3;


    public Aluno(String nome, double notaTrimestre1, double notaTrimestre2, double notaTrimestre3){
        this.nome = nome;
        this.notaTrimestre1 = notaTrimestre1;
        this.notaTrimestre2 = notaTrimestre2;
        this.notaTrimestre3 = notaTrimestre3;
    }

    public double media(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro trimestre:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota do segundo trimestre:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre:");
        double nota3 = scan.nextDouble();
        System.out.println("Agora digite o nome do aluno:");
        String nm = scan.next();

        Aluno al = new Aluno(nm, nota1, nota2, nota3);
        double calc = nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35 / 1;
        scan.close();
        return calc;
    }

    public static void media(double nt){
        if(nt < 6){
            System.out.println("O aluno não alcançou a nota minima, faltou:" + (nt-10) + " para alcançar o esperado" );
        }else{
            System.out.println("Aluno Alcançou a nota minima, nota do aluno:" + nt);
        }
    }

}

class Atividade8Al{
    public static void main(String[] args) {
    Aluno al = new Aluno("",0,0,0);
    double med = al.media();
    Aluno.media(med);
    }
}
*/

/*
class atividadeHeranca1{
    class Funcionario{
        private String nome, CPF; 
        private double salario;

        public String getNome(){
            return this.nome;
        }

        public String getCPF(){
            return this.CPF;
        }

        public double getSalario(){
            return this.salario;
        }

        public void setNome(String nm){
            this.nome = nm;
        }

        public void setCPF(String cpf){
            this.CPF = cpf;
        }

        public void setSalario(double sal){
            this.salario = sal;
        }
    }

    class Gerente extends Funcionario{
        private int Senha;

        public int getSenha(){
            return this.Senha;
        }

        public void setSenha(int senha){
            this.Senha = senha;
        }

        public boolean autenticaSenha(){
            if(getSenha() % 2 != 0){
                System.out.println("Senha inválida");
                return false;
            }else{
                System.out.println("Olá" + getNome() + "Bem-vindo");
                return true;
            }
        }
    }
}
*/

/* 
class AtividadeHeranca2{
    class Veiculo{
        private String Placa;
        private int Ano;

        public Veiculo(){}

        public Veiculo(String placa, int ano){
          this.Placa = placa;
          this.Ano = ano;
        }

        public String getPlaca(){
            return Placa;
        }
        
        public int getAno(){
            return Ano;
        }

        public void setPlaca(String placa){
            this.Placa = placa;
        }

        public void setAno(int ano){
            this.Ano = ano;
        }

        public void SetAno(String ano){
            this.Ano = Integer.parseInt(ano);
        }

        
        public void exibirDados(){
            System.out.println("Ano:" + getAno() + "Placa:" + getPlaca());
        }
    }

    class Caminhao extends Veiculo{
        private int Eixos;

        public Caminhao(String placa, int ano, int eixos){
            this.setAno(ano);
            this.setPlaca(placa);
            this.Eixos = eixos;
        }

        public int getEixos(){
            return this.Eixos;
        }

        public void setEixos(int eixos){
            this.Eixos = eixos;
        }

        public void exibirDados(){
            System.out.println("Ano:" + getAno() + "Placa:" + getPlaca() + "Eixos:" + getEixos());
        }

    }

    class Onibus extends Veiculo{
        private int Assentos;

        public int getAssentos(){
            return this.Assentos;
        }

        public void setAssentos(int Assentos){
            this.Assentos = Assentos;
        }

        public Onibus(String placa, int ano, int assentos){
            setAno(ano);
            setPlaca(placa);
            this.Assentos = assentos;
        }

        public void exibirDados(){
            System.out.println("Ano:" + getAno() + "Placa:" + getPlaca() + "Eixos:" + getAssentos());
        }
    }
}
*/
/* 
class Atividade12{
    abstract class Forma{
        private String Cor;

        public String getCor(){
            return this.Cor;
        }

        public void setCor(String cor){
            this.Cor = cor;
        }
    }
    class Triangulo extends Forma{
        private double Base;
        private double Altura;
        
        public double getBase(){
            return this.Base;
        }

        public void setBase(Double base){
            this.Base = base;
        }

        public double getAltura(){
            return this.Altura;
        }

        public void setCor(Double altura){
            this.Altura = altura;
        }

        public Triangulo(double base, double altura, String cor){
            this.Base = base;
            this.Altura = altura;
            setCor(cor);
        }

        public double area(){
            return this.Base * this.Altura / 2;
        }

        public String toString(){
            return String.format("Triangulo:(Base=%d, Altura=%d, Cor=%s)", Base, Altura, getCor());
        }
    }

    class Circulo extends Forma{
        private double Raio;

        public double getRaio(){
            return this.Raio;
        }

        public void setRaio(Double raio){
            this.Raio = raio;
        }
        
        public Circulo(double raio, String cor){
            this.Raio = raio;
            setCor(cor);
        }

        public double area(){
            return Math.PI * Raio * Raio;
        }

        public double getDiametro(){
            return 2 * Raio;
        }

        public String toString(){
            return String.format("Circulo:(Raio=%d, Cor=%s)", Raio, getCor());
        }
    }

    class Retangulo extends Forma{
        private double Lado1;
        private double Lado2;

        public Retangulo(double lado1, double lado2, String cor){
            this.Lado1 = lado1;
            this.Lado2 = lado2;
            setCor(cor);
        }
        
        public Retangulo(double lado1, String cor){
            this.Lado1 = lado1;
            setCor(cor);
        }

        public double getLado1(){
            return this.Lado1;
        }

        public void setLado1(Double lado){
            this.Lado1 = lado;
        }

        public double getLado2(){
            return this.Lado2;
        }

        public void setLado2(Double lado){
            this.Lado2 = lado;
        }

        public double area(){
            return Lado1 * Lado2;
        }

        public String toString(){
            return String.format("Retangulo:(Lado1=%d, Lado2=%d, Cor=%s)", Lado1, Lado2, getCor());
        }
    }

    class Quadrado extends Retangulo{
        public Quadrado(Double lado, String cor){
            super(lado, cor);
        }

        public String toString(){
            return String.format("Quadrado:(Lado=%d, Lado2=%d, Cor=%s)", getLado1(), getCor());
        }
    }

    class Main{
        public static void main(String[] args) {
            Circulo circulo = new Circulo(30, "Vermelho");
            Quadrado quadrado = new Quadrado(7.0, "Verde");
            Retangulo retangulo = new Retangulo(10, 20, "Amarelo");
            Triangulo triangulo = new Triangulo(5, 10, "Rose");
            System.out.println("Metodos do Retangulo");
            retangulo.area();
            retangulo.toString();
            System.out.println("Metodos do Circulo");
            circulo.area();
            circulo.getDiametro();
            circulo.toString();
            System.out.println("Metodos do Triangulo");
            triangulo.area();
            triangulo.toString();
            System.out.println("Metodos do Quadrado");
            quadrado.toString();
        }
    }
}
*/