package banco;
import java.io.File;
import java.util.Scanner;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Banco_Akka {
/**
* @param args the command line arguments
*/
	
	public static int cuenta=0;
	public static ActorSystem Sistema=ActorSystem.create("Sistema");
	public static ActorRef Person1Actor = Sistema.actorOf(new Props(Person_akka.class), "Persona1");
	public static ActorRef Person2Actor = Sistema.actorOf(new Props(Person_akka.class), "Persona2");
	public static ActorRef Sumador = Sistema.actorOf(new Props(Sumador_akka.class), "Sumador");



public static void main(String[] args) {
	
	try{
    	
        int i[]=new int [10];
        int j=0;
        int carrera=0;	

		Scanner scan = new Scanner(new File(args[0]));
        while (scan.hasNextInt()){
            i[j]=scan.nextInt();
            j++;
        }

        
 Cuenta.reset();
 
for (int p=2;p<2+i[0];p++){
Person1Actor.tell("Operar"+Integer.toString(i[p]),null);

}


for (int k=5;k<7;k++){
Person2Actor.tell("Operar"+Integer.toString(i[k]),null);

}

Sistema.shutdown();
Sistema.awaitTermination();//JOIN  

System.out.println("Total: " + Cuenta.Total());
 
	  
	}
    catch(Exception e){
        System.out.println(e.getClass().getName());
    }
}
}