package Motor;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;



public class VentanaInicial extends JFrame {

	
	public VentanaInicial() {
		initComponents();
		setVisible(true);

		
		HiloCargaInicial r = new HiloCargaInicial();
		Thread t = new Thread(r);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	private JPanel contentPane;
	JProgressBar barraProgreso = new JProgressBar();

	
	
	
	
	
	
	class HiloCargaInicial implements Runnable{
    	public void run() {
    		while(barraProgreso.getValue()<100) {
				barraProgreso.setValue(barraProgreso.getValue() + 2);
				try {Thread.sleep(70);} 
				catch (InterruptedException e) {e.printStackTrace();}
    		}
    		dispose();
    	}
    }
	
	
	
	
	void initComponents() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 696, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		barraProgreso.setOpaque(true);
		barraProgreso.setForeground(new Color(255, 0, 128));
		barraProgreso.setBackground(new Color(75, 146, 180));
		barraProgreso.setBounds(105, 432, 480, 26);
		contentPane.add(barraProgreso);
		
		JLabel lblTitulo1 = new JLabel("I am a");
		lblTitulo1.setFont(new Font("SimSun", Font.PLAIN, 35));
		lblTitulo1.setBounds(218, 11, 108, 35);
		contentPane.add(lblTitulo1);
		
		JLabel lblTitulo2 = new JLabel("writer.");
		lblTitulo2.setForeground(new Color(255, 0, 0));
		lblTitulo2.setFont(new Font("SimSun", Font.PLAIN, 35));
		lblTitulo2.setBounds(338, 11, 126, 35);
		contentPane.add(lblTitulo2);
		
		JLabel lblFondoCarga = new JLabel("");
		lblFondoCarga.setIcon(new ImageIcon("C:\\Users\\cesar\\Desktop\\Programacion\\JAVA\\Proyectos\\BlocDeNotas\\src\\Graficos\\fondoPantallaCarga.png"));
		lblFondoCarga.setBounds(0, 0, 680, 439);
		contentPane.add(lblFondoCarga);
		
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
	
}
