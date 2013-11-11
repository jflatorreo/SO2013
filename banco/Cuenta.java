package banco;


public class Cuenta {
	private static int cuenta=0;
	
	public static int ChangeAccount(int op){
		int t;
		t=cuenta;
		t=cuenta+op;
		cuenta=t;
        return cuenta;
    }
	public static int Total(){
        return cuenta;
    }
	public static void reset(){
        cuenta=0;
    }
}
