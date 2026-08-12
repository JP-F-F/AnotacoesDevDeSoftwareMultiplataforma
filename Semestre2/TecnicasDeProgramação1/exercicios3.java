/*
class Atividade13{
    abstract class Funcionario{
        private String Nome;
        private String Matricula;

        public String getNome(){
            return this.Nome;
        }
        public void setNome(String nome){
            this.Nome = nome;
        }
        public String getMatricula(){
            return this.Matricula;
        }
        public void setMatricula(String matricula){
            this.Nome = matricula;
        }

        public abstract double calcularSalario();
    }

    class funcionarioCLT extends Funcionario{
        private double Salario;
        private double Descontos;

        public double getSalario(){
            return this.Salario;
        }

        public void setSalario(double salario){
            this.Salario = salario;
        }
        public double getDescontos(){
            return this.Descontos;
        }

        public void setDescontos(double descontos){
            this.Descontos = descontos;
        }

        @Override
        public double calcularSalario(){
            return this.Salario - this.Descontos;
        }
    }

    class funcionarioPJ extends Funcionario{
        private int Horas;
        private double VlrHoras;

        public double getHoras(){
            return this.Horas;
        }

        public void setHoras(int horas){
            this.Horas = horas;
        }
        public double getVlrhoras(){
            return this.VlrHoras;
        }

        public void setVlrHoras(double hrs){
            this.VlrHoras = hrs;
        }

        @Override
        public double calcularSalario(){
            return this.Horas * this.VlrHoras;
        }
    }

    abstract class Veiculo{
        private String Modelo;
        private String Marca;
        private String Ano;

        public String getModelo(){
            return this.Modelo;
        }

        public void setModelo(String modelo){
            this.Modelo = modelo;
        }

        public String getMarca(){
            return this.Marca;
        }

        public void setMarca(String marca){
            this.Marca = marca;
        }
        
        public String getAno(){
            return this.Ano;
        }

        public void setAno(String ano){
            this.Ano = ano;
        }

        public abstract double calcularImposto(double IPVA, double aliquota);

        public void exibirDetalhes(){
            System.out.println("Aqui estão os detalhes de veiculo:");
            System.out.println("Modelo:" + this.Modelo + "Marca" + this.Marca + "Ano:" + this.Ano);
        }
    }

    class Carro extends Veiculo{

        @Override
        public double calcularImposto(double IPVA, double aliquota){
            return IPVA + aliquota;
        }
    }

    class Moto extends  Veiculo{
        private double CRLV;

        
        public double getCRLV(){
            return this.CRLV;
        }

        public void setCRLV(double clrv){
            this.CRLV = clrv;
        }

        @Override
        public double calcularImposto(double IPVA, double aliquota){
            return IPVA + aliquota + this.CRLV;
        }
    }

    class caminha extends Veiculo{
        private double VlrVenal;


        public double getVlrVenal(){
            return this.VlrVenal;
        }

        public void setVlrVenal(double vlr){
            this.VlrVenal = vlr;
        }
        @Override
        public double calcularImposto(double IPVA, double aliquota){
            return IPVA + aliquota + this.VlrVenal;
        }
    }
}
*/

/*
class Atividade14{
    public interface Notificavel{
        public abstract void enviarMensagem(String mensagem);
    }

    class EmailNotificacao implements Notificavel{
        private String Email;

        public String getEmail(){
            return this.Email;
        }

        public void setEmail(String email){
            this.Email = email;
        }

        @Override
        public void enviarMensagem(String mensagem){
            System.out.println("Mensagem: " + mensagem);
            System.out.println("Enviada para o email: " + this.Email);
        }
    }

    class SMSNotificacao implements Notificavel{
        private String SMS;
      
        public String getSMS(){
            return this.SMS;
        }

        public void setSMS(String sms){
            this.SMS = sms;
        }

        @Override
        public void enviarMensagem(String mensagem){
            System.out.println("Mensagem: " + mensagem);
            System.out.println("Enviada para o telefone: " + this.SMS);
        }
    }

    public interface FormaGeometrica{
        public abstract double calcularArea();
        public abstract double calcularPerimetro();
    }

    class circulo implements FormaGeometrica{

        @Override 
        public double calcularArea(){
            return Math.pow(Math.PI, 2);
        }

        @Override
        public double calcularPerimetro(){
            return 2 * Math.PI;
        }
    }

    class Retangulo implements FormaGeometrica{
        private double Altura;
        private double Base;

        public double getAltura(){
            return this.Altura;
        }

        public void setAltura(double altura){
            this.Altura = altura;
        }

        public double getBase(){
            return this.Base;
        }

        public void setBase(double base){
            this.Base = base;
        }

        @Override 
        public double calcularArea(){
            return this.Base * this.Altura;
        }

        @Override
        public double calcularPerimetro(){
            return 2 * (this.Base + this.Altura);
        }
    }
}
*/
