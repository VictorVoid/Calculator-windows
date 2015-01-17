package Calculadora_;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SobreCalculadora extends JFrame implements ActionListener {
	
	private JLabel autor,creditos;
	private ImageIcon calculadora;
	private JButton ok;
	private JLabel img;
	public SobreCalculadora (){
	setSize(300,300);	
	setVisible (true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(250,250);
	adicionarComponentes();
	
	}
	public void adicionarComponentes(){
		setLayout(null);
		autor = new JLabel ("Victor Igor");
		creditos = new JLabel ("Desenvolvida: 09/07/2014");
		calculadora = new ImageIcon("image//calculadora.png");
		img = new JLabel (calculadora);
		ok = new JButton ("Ok");
		autor.setBounds(120,10,100,20);
		img.setBounds(0,20,100,100);
		creditos.setBounds(80,30,200,20);
		ok.setBounds(95,200,90,25); ok.setBackground(Color.white); ok.setForeground(Color.blue);
		add(autor);
		add(creditos);
		add(img);
		add(ok);
		ok.addActionListener(this);
	}
	public void actionPerformed (ActionEvent e){
		if (e.getSource() == ok){
			System.exit(0);
		}
	}
	
	
	/*
	 * Ela foi feita de de acordo com muitas coisas que aprendi no curso, Criei um frame, e apartir dele criei 
	 * um painel, a qual nele est� os componentes da aplica��o e seus eventos. Coloquei figuras nos bot�es,
	 * troquei a cor e utilizei duas Caixas de textos (JTextField) para que tenha a visualiza��o logo em cima dos n�meros clicados. 
	 * Seus eventos foi feito a partir de uma l�gica que consegui, n�o � a maneira mais eficiente de fazer, 
	 * mas foi a que consegui pensar, pois sei que tenho muito a aprender. 
	 * 
	 *  Algumas informa��es:
	 *  Lados POSITIVOS
	 *  	De acordo com numeros lidos ela � capaz de diminuir seus n�meros para que caibam na janela, foi feita
	 *  com o uso do setFont para setar a font e mudar - la.
	 *  
	 *  	Ela � capaz de ao mesmo tempo que vai somando os n�meros, j� vai mostrando o resultado na tela sem
	 *  mesmo precisar apertar no igual, al�m do mais capaz de calcular sua equa��o utilizando somente  soma e 
	 *  subtra��o.
	 *  		
	 *  
	 *  Lados NEGATIVOS E BUGS
	 *      N�O � capaz de desenvolver equa��es que misturem multiplica��o e divis�o ao mesmo tempo, e sim apenas
	 *      com 2 n�meros distintos para saber seu resultado.
	 *      A utiliza��o da virgula n�o est� pegando, sujeito a um bug.
	 *      
	 *        
	 *      L�GICA usada:
	 *     De acordo com o que o usu�rio for clicando no n�mero, ele � salvo numa vari�vel que concatenando os d�gitos
	 * e usando o setText modificando seu TextField e ao clicar em qualquer sinal, ele passa o que tava escrito
	 * na caixa de texto para a segunda caixa e fica logo em cima, e em seguida com uma vari�vel aucmuladora 
	 * recebendo zero no inicial, ele pega esse valor e faz o c�lculo, e utilizei alguns m�todos de String para
	 * manipular a caixa de texto. 
	 */	
		
		
	
}
