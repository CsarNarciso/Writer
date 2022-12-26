package Motor;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import javax.swing.*;
import java.util.*;
import java.util.regex.*;




public class VI  {
    
    
	
	
	
	
        
//  INSTANCIAS VP ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?�
    
	private javax.swing.JFrame f = new javax.swing.JFrame();
    private javax.swing.JLabel etiPalabras = new javax.swing.JLabel();
    private javax.swing.JLabel etiSalto = new javax.swing.JLabel();
    private javax.swing.JTextArea texto = new javax.swing.JTextArea();
    private javax.swing.JScrollPane scroll = new javax.swing.JScrollPane();

    
    
//  INSTANCIAS VE ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?�
    private javax.swing.JDialog jd = new javax.swing.JDialog(f, true);
    
    
    
//  INSTANCIAS VIN ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?� 
    JProgressBar barraProgreso = new JProgressBar();
    
    
    
//  VARIABLES E INSTANCIAS GENERALES  ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?�
    

    private String DIRE = "C:\\Users\\cesar\\Desktop\\Programacion\\JAVA\\Graficos\\Procesador de textos\\";
    private FileWriter conexionTXT_e = null; private BufferedWriter txt_e = null;
    private File archivoEjecucion = null;
    private String nombreArchivo = null; 

    JFileChooser vDirectorios = new JFileChooser();
    
    
    private String aprovacionGuardado="Correcto";
    private boolean salir=false;
    private boolean guardado=true;
    private String ultimoTexto = texto.getText();
    private String venida_ve_ng="";
    

    
   
  
//    //�?�?�?�?�?�?�?�?�?�?�?�?�?�?�?�?�?�? METODOS Y CLASES INTERNAS ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?�
    
    
    
    
    class Accion extends AbstractAction{
        String funcion, tipo;
        Accion(String func, String tipoGuardar){
            funcion=func;
            tipo=tipoGuardar;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            switch(funcion){
                case "Abrir": accionAbrir(); break;
                case "Guardar": accionGuardar(tipo); break;
                case "Nueva": accionNueva(); break;
                case "Borrar": accionBorrar(); break;
                case "Salir": accionSalir(); break;
            }
        }
    }
    

    void accionAbrir(){
            
            
        if(getGuardado()){

            do{

                int a = vDirectorios.showOpenDialog(null);

                if(a!=JFileChooser.CANCEL_OPTION){



                    if(getArchivoEjecucion()==null){
                        setArchivoEjecucion(new File("")); 
                    }

                    if(getArchivoEjecucion().getAbsolutePath().equals(vDirectorios.getSelectedFile().getAbsolutePath())){
                       JOptionPane.showMessageDialog(null, "El archivo ya esta en ejecucion", "", JOptionPane.ERROR_MESSAGE);
                       setSalir(false); 
                    }  
                    else{
                         try{
                            setArchivoEjecucion(vDirectorios.getSelectedFile());
                            BufferedReader extractor = new BufferedReader(new FileReader(getArchivoEjecucion()));
                            texto.read(extractor, "");

                            setUltimoTexto(texto.getText());

                            extractor.close();



                        }catch(IOException ex){}
                        setSalir(true);
                    }


                }else{setSalir(true);}



            }while(getSalir()==false);
        }
        else{ventanaAvisoGuardar("a");}
            
    }
    
    
    void accionGuardar(String tipo){

            try{

                setAprovacionGuardado("Correcto");

                if( getArchivoEjecucion()==null || tipo == "gc" ){



                    do{

                        if(getAprovacionGuardado()!="Correcto"){


                            if(getAprovacionGuardado()=="Existe"){
                                if(JOptionPane.showConfirmDialog(vDirectorios, 
                                    "Ya existe el archivo "+
                                    getNombreArchivo()+"\n�Desea sobreescribirlo?", 
                                    "", JOptionPane.ERROR_MESSAGE) 

                                   == JOptionPane.YES_OPTION)
                                {setAprovacionGuardado("Sobreescribir");}
                                else{setAprovacionGuardado("Salir");}
                                setSalir(true);
                                }

                            if(getAprovacionGuardado()=="Incorrecto"){
                                JOptionPane.showMessageDialog(vDirectorios, 
                                    "Nombre incorrecto", 
                                    "", JOptionPane.ERROR_MESSAGE);}

                        }



                        if(getAprovacionGuardado()!="Sobreescribir"){

                            int b = vDirectorios.showSaveDialog(null);
                            if(b == JFileChooser.APPROVE_OPTION){



                                if(Pattern.compile("^[\\w]+(\\.)(txt$)").matcher(vDirectorios.getSelectedFile().getName()).find()){

                                    setNombreArchivo(vDirectorios.getSelectedFile().getName());
                                    setArchivoEjecucion(vDirectorios.getSelectedFile());
                                    setAprovacionGuardado("Correcto"); setSalir(true);

                                    if(getArchivoEjecucion().exists()){
                                        setAprovacionGuardado("Existe"); setSalir(false);
                                    }
                                }
                                else{setAprovacionGuardado("Incorrecto"); setSalir(false);}


                            }else{setAprovacionGuardado("Salir"); setSalir(true);}
                        }


                    }while(getSalir()!=true);
                }


                setConexionTXT_e(new FileWriter(getArchivoEjecucion().getAbsolutePath()));
                setTxt_e(new BufferedWriter(getConexionTXT_e()));
                
                if(getAprovacionGuardado()=="Correcto" || getAprovacionGuardado()=="Sobreescribir"){    

                    texto.write(getTxt_e());
                    setUltimoTexto(texto.getText());
                    setGuardado(true);
                    
                }else{setGuardado(false);}
                
                getConexionTXT_e().close(); getTxt_e().close();

            }catch(IOException ex){}

    }
    
    

    void accionNueva(){
        if(getGuardado()){motorVentanaAvisoGuardar("n");}
        else{ventanaAvisoGuardar("n");}
    }
    
    
    
    void accionBorrar(){
        if(getArchivoEjecucion()!=null){
            if(getGuardado()){motorVentanaAvisoGuardar("b");}
            else{ventanaAvisoGuardar("b");}
        }
    }
    
    
    void accionSalir(){
        if(getGuardado()){System.exit(0);}
        else{ventanaAvisoGuardar("s");}
    }
    
    
    class HiloTextoModificado implements Runnable{
        @Override
        public void run(){
            
            while(true){
                
            if(!getUltimoTexto().equals(texto.getText()) ){setGuardado(false);}
            
            if(texto.getText()!=null){
               etiPalabras.setText("Palabras: " + new StringTokenizer(texto.getText()).countTokens());
            }
            
            }
        }
    }
    
    
    void motorVentanaAvisoGuardar(String t){
        
        if (t!="s"){
            texto.setText("");
            setArchivoEjecucion(null);
        }
        
        
        if(t=="b" && getArchivoEjecucion()!=null){
            JOptionPane.showMessageDialog(null, "El archivo se ha borrado exitosamente", "", JOptionPane.INFORMATION_MESSAGE);  
            getArchivoEjecucion().getAbsoluteFile().delete();
        }
        
        setUltimoTexto(texto.getText());
        setGuardado(true);
        
        
    }

    
    
    void ventanaAvisoGuardar(String t){
        
       venida_ve_ng=t;
        new VentanaEmergente_NoGuardado();
        
    }
    
    
    
    class gg extends AbstractAction {
        String a="";

        gg(String a){
            this.a=a;
        }

        public void actionPerformed(ActionEvent e){
            jd.setVisible(false);
            System.out.println("--------"+a);
            System.out.println("......."+venida_ve_ng);
            
            if(a!="c"){
                
                
                if(a=="g"){accionGuardar("g");
                    if(!guardado){venida_ve_ng="cancelado";}
                }
                else{motorVentanaAvisoGuardar(venida_ve_ng); }
                
                switch(getVenida_ve_ng()){
                    case "a": accionAbrir(); break;
    //                        case "b": accionBorrar(); break;
                    case "s": accionSalir(); break;
                }
            }
            

        }
    }

    
    
    class AccionScroll extends AbstractAction{
        int estadoScroll;
        
        @Override
        public void actionPerformed(ActionEvent e){
            estadoScroll++;
            switch(estadoScroll){
                case 1:
                    texto.setLineWrap(false);
                    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
                    etiSalto.setText("Salto de linea: desactivado");
                    break;
                case 2:
                    texto.setLineWrap(true);
                    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); estadoScroll=0;
                    etiSalto.setText("Salto de linea: activado");
                    break;
            }
        }
    }
    


    class AccionCopPegCor implements ActionListener{
            private String n;
            AccionCopPegCor(String n){this.n = n;}
            @Override
            public void actionPerformed(ActionEvent e){
                switch(n){
                    case "Cop":
                        texto.copy(); break;
                    case "Peg":
                        texto.paste(); break;
                    case "Cor":
                        texto.cut(); break;
                }
            }
    }

    
    
    
//  METODOS GS  ?�?�?�?�?�?�?�?�??�?�?�?�?�?�?�?�?�?�
    
    
    javax.swing.JTextArea getTexto() {
		return texto;
	}


	void setTexto(javax.swing.JTextArea texto) {
		this.texto = texto;
	}
	

	javax.swing.JLabel getEtiPalabras() {
		return etiPalabras;
	}


	void setEtiPalabras(javax.swing.JLabel etiPalabras) {
		this.etiPalabras = etiPalabras;
	}


	javax.swing.JLabel getEtiSalto() {
		return etiSalto;
	}


	void setEtiSalto(javax.swing.JLabel etiSalto) {
		this.etiSalto = etiSalto;
	}


	String getDIRE() {
		return DIRE;
	}


	void setDIRE(String dIRE) {
		DIRE = dIRE;
	}


	FileWriter getConexionTXT_e() {
		return conexionTXT_e;
	}


	void setConexionTXT_e(FileWriter conexionTXT_e) {
		this.conexionTXT_e = conexionTXT_e;
	}


	BufferedWriter getTxt_e() {
		return txt_e;
	}


	void setTxt_e(BufferedWriter txt_e) {
		this.txt_e = txt_e;
	}


	File getArchivoEjecucion() {
		return archivoEjecucion;
	}


	void setArchivoEjecucion(File archivoEjecucion) {
		this.archivoEjecucion = archivoEjecucion;
	}


	String getNombreArchivo() {
		return nombreArchivo;
	}


	void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}


	JFileChooser getvDirectorios() {
		return vDirectorios;
	}


	void setvDirectorios(JFileChooser vDirectorios) {
		this.vDirectorios = vDirectorios;
	}


	String getAprovacionGuardado() {
		return aprovacionGuardado;
	}


	void setAprovacionGuardado(String a) {
		this.aprovacionGuardado = a;
	}


	boolean getSalir() {
		return salir;
	}


	void setSalir(boolean salir) {
		this.salir = salir;
	}


	boolean getGuardado() {
		return guardado;
	}


	void setGuardado(boolean guardado) {
		this.guardado = guardado;
	}


	String getUltimoTexto() {
		return ultimoTexto;
	}


	void setUltimoTexto(String ultimoTexto) {
		this.ultimoTexto = ultimoTexto;
	}


	String getVenida_ve_ng() {
		return venida_ve_ng;
	}


	void setVenida_ve_ng(String venida_ve_ng) {
		this.venida_ve_ng = venida_ve_ng;
	}
	
	
    
	javax.swing.JScrollPane getScroll() {
		return scroll;
	}


	void setScroll(javax.swing.JScrollPane scroll) {
		this.scroll = scroll;
	}
	
	
	javax.swing.JFrame getF() {
		return f;
	}


	void setF(javax.swing.JFrame f) {
		this.f = f;
	}
	
	
	javax.swing.JDialog getJd() {
		return jd;
	}


	void setJd(javax.swing.JDialog jd) {
		this.jd = jd;
	}
	
	
	javax.swing.JProgressBar getBarraProgreso() {
		return barraProgreso;
	}


}
