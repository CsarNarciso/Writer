package Motor;


public class Uso_BlocDeNotas implements Uso_VI {

    public static void main(String[] args) {
    	
    	new VentanaPrincipal();
    	
	    new VentanaInicial();
	    
	    x.getF().setVisible(true);
	    
	    Runnable r = x.new HiloTextoModificado();
	    Thread t = new Thread(r);
	    t.start();
    }

}
