package banco;

import akka.actor.UntypedActor;

class Person_akka extends UntypedActor{

	
public void onReceive(Object message) throws Exception {

if(message instanceof String ) {

String ms=(String)message;
int dato= Integer.parseInt(ms.substring(6));
String s= ms.substring(0,6);

switch (s){
case "Operar":{

	//Cuenta.ChangeAccount(dato);
	Banco_Akka.Sumador.tell("Operar"+dato,null);

break;
}
default:
System.out.println("huu?");
}
}
else{
unhandled(message);
}
}
}