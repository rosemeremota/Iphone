public class Iphone implements Telefone, Internet, ReprodutorMusical{
    

public Iphone(){
}


public void ligar(){
   System.out.println("Ligando..."); 
}

public void atender(){

   System.out.println("Atendendo...."); 
}
public void desligar(){
   System.out.println("Desligando...."); 
}

public void exibirPagina(){
    System.out.println("Exibindo a pagina...."); 
}
public void atualizarPagina(){
    System.out.println("Atualizando a pagina...."); 
}
public void fecharPagina(){
    System.out.println("Fechando a pagina...."); 
}
public void tocar(){
    System.out.println("Tocando a musica...."); 
}
public void pausar(){
    System.out.println("Pausando a musica...."); 
}
public void desligarRep(){
    System.out.println("Desligando a musica...."); 
} 



}
