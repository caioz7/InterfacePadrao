import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
class InterfaceGrafica extends JFrame{
	//Funcoes funcoes = new Funcoes();
	JFrame JanelaPrincipal = new JFrame();
	JDesktopPane desktopPane = new JDesktopPane();
	JLabel labBack = new JLabel(new ImageIcon(getClass().getResource("Background.jpg")));
	
	JButton buttonOp01 = new JButton("Opcao 01"); // ter usar o imageicon direto no jbutton
	JButton buttonOp02 = new JButton("Opcao 02");
	JButton buttonOp03 = new JButton("Opcao 03");
	JButton buttonOp04 = new JButton("Opcao 04");
	JButton buttonSair = new JButton("Sair");
	
	JInternalFrame internalOp01 = new JInternalFrame("InternalFrame 01");
	JInternalFrame internalOp02 = new JInternalFrame("InternalFrame 02");
	JInternalFrame internalOp03 = new JInternalFrame("InternalFrame 03");
	JInternalFrame internalOp04 = new JInternalFrame("InternalFrame 04");

	static final int RESOLUCAO_X = 1200; 
	static final int RESOLUCAO_Y = 650; 
	
	public InterfaceGrafica(){
		repaint();
		JanelaPrincipal.getContentPane().setLayout(null);
		//setUndecorated(true);
		setSize(RESOLUCAO_X, RESOLUCAO_Y);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Ajuda Suporte!");
		labBack.setSize(RESOLUCAO_X, RESOLUCAO_Y);
		JanelaPrincipal.setUndecorated(true);
		
		//Adicionando componentes na Janela principal
		getContentPane().add(desktopPane);
		getContentPane().add(internalOp01);
		getContentPane().add(internalOp02);
		getContentPane().add(internalOp03);
		getContentPane().add(internalOp04);
		getContentPane().add(buttonOp01);
		getContentPane().add(buttonOp02);
		getContentPane().add(buttonOp03);
		getContentPane().add(buttonOp04);
		getContentPane().add(buttonSair);
		getContentPane().add(labBack);
		
		//Botoes da janela principal
		buttonOp01.setBounds(10,30,120,120);;
		buttonOp01.setContentAreaFilled(true);
		buttonOp01.setBorderPainted(true);
		buttonOp01.setToolTipText("Dica");
		buttonOp01.setEnabled(true);
		
		buttonOp02.setBounds(10,180,120,120);
		buttonOp02.setContentAreaFilled(true);
		buttonOp02.setBorderPainted(true);
		buttonOp02.setToolTipText("Dica");
		
		buttonOp03.setBounds(10,330,120,120);
		buttonOp03.setContentAreaFilled(true);
		buttonOp03.setBorderPainted(true);
		buttonOp03.setToolTipText("Dica");
		
		buttonOp04.setBounds(10,480,120,120);
		buttonOp04.setContentAreaFilled(true);
		buttonOp04.setBorderPainted(true);
		buttonOp04.setToolTipText("Dica");

		buttonSair.setBounds(1050,490,120,120);
		buttonSair.setContentAreaFilled(true);
		buttonSair.setBorderPainted(true);
		buttonSair.setToolTipText("Sair");
		
		//Janelas internas
		internalOp01.setLayout(null);
		internalOp01.setClosable(true);
		internalOp01.setSize(RESOLUCAO_X-170,RESOLUCAO_Y-200);
		internalOp01.setLocation(RESOLUCAO_X - 1045, RESOLUCAO_Y - 620);
		internalOp01.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		internalOp01.setMaximizable(true);
		internalOp01.setIconifiable(true);
		
		
		internalOp02.setClosable(true);
		internalOp02.setSize(RESOLUCAO_X-170,RESOLUCAO_Y-200);
		internalOp02.setLocation(RESOLUCAO_X - 1045, RESOLUCAO_Y - 620);
		internalOp02.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		internalOp02.setBackground(Color.WHITE);
		internalOp02.setMaximizable(true);
		internalOp02.setIconifiable(true);
		
		internalOp03.setClosable(true);
		internalOp03.setSize(RESOLUCAO_X-170,RESOLUCAO_Y-200);
		internalOp03.setLocation(RESOLUCAO_X - 1045, RESOLUCAO_Y - 620);
		internalOp03.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		internalOp03.setBackground(Color.WHITE);
		internalOp03.setMaximizable(true);
		internalOp03.setIconifiable(true);
		
		internalOp04.setClosable(true);
		internalOp04.setSize(RESOLUCAO_X-170,RESOLUCAO_Y-200);
		internalOp04.setLocation(RESOLUCAO_X - 1045, RESOLUCAO_Y - 620);
		internalOp04.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		internalOp04.setBackground(Color.WHITE);
		internalOp04.setMaximizable(true);
		internalOp04.setIconifiable(true);
		
		//Abaixo estao as acoes de cada botao da tela inicial
		buttonOp01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				internalOp01.setVisible(true);
			}
		});
		
		buttonOp02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				internalOp02.setVisible(true);

			}
		});
		
		buttonOp03.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				internalOp03.setVisible(true);

			}
		});
		
		buttonOp04.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				internalOp04.setVisible(true);

			}
		});
		buttonSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(1);				
			}
		});
	}
}