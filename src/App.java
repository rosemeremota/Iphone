public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        System.out.println("Testando o Iphone !");
        System.out.println(" ");

        Iphone iphone = new Iphone();
        // telefone 
        System.out.println("Função telefone ");
        iphone.ligar();
        iphone.atender();
        iphone.desligar();
        System.out.println(" ");

        // internet 
        System.out.println("Função internet ");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.fecharPagina();
         System.out.println(" ");

        // ReprodutorMusical 
        System.out.println("Função Reprodutor Musical ");
        iphone.tocar();
        iphone.pausar();
        iphone.desligarRep();
         System.out.println(" "); 

    }
}
