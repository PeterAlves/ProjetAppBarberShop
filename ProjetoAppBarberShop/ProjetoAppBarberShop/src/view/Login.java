package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;

import controller.LoginController;

import javax.swing.JToolBar;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField labelLogin;
	private JPasswordField labelSenha;
	private final LoginController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		controller = new LoginController(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 691);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel txtLogin = new JLabel("Login");
		txtLogin.setBackground(SystemColor.text);
		txtLogin.setFont(UIManager.getFont("CheckBoxMenuItem.font"));
		txtLogin.setBounds(102, 180, 46, 25);
		frame.getContentPane().add(txtLogin);
		
		labelLogin = new JTextField();
		labelLogin.setBounds(100, 206, 296, 48);
		frame.getContentPane().add(labelLogin);
		labelLogin.setColumns(10);
		
		JLabel titleSaraiva = new JLabel("saraiva cortes");
		titleSaraiva.setBounds(0, 72, 490, 48);
		titleSaraiva.setHorizontalAlignment(SwingConstants.CENTER);
		titleSaraiva.setBackground(Color.GRAY);
		titleSaraiva.setFont(new Font("Western Square freehand", Font.BOLD, 40));
		titleSaraiva.setIcon(null);
		frame.getContentPane().add(titleSaraiva);
		
		JLabel titleBarbearia = new JLabel("BarBearia");
		titleBarbearia.setBounds(0, 41, 490, 48);
		titleBarbearia.setHorizontalAlignment(SwingConstants.CENTER);
		titleBarbearia.setFont(new Font("Western Square freehand", Font.BOLD, 35));
		titleBarbearia.setBackground(Color.GRAY);
		frame.getContentPane().add(titleBarbearia);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(186, 380, 112, 35);
		btnEntrar.setBackground(SystemColor.textHighlight);
		btnEntrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.fiztarefa();
				
			}
		});
		frame.getContentPane().add(btnEntrar);
		
		JLabel layerLogin = new JLabel("");
		layerLogin.setBounds(72, 166, 353, 336);
		layerLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		layerLogin.setHorizontalAlignment(SwingConstants.CENTER);
		layerLogin.setForeground(Color.WHITE);
		layerLogin.setBackground(Color.MAGENTA);
		frame.getContentPane().add(layerLogin);
		
		JLabel txtSenha = new JLabel("Senha");
		txtSenha.setFont(UIManager.getFont("CheckBoxMenuItem.font"));
		txtSenha.setBackground(Color.WHITE);
		txtSenha.setBounds(100, 283, 46, 25);
		frame.getContentPane().add(txtSenha);
		
		labelSenha = new JPasswordField();
		labelSenha.setBounds(100, 307, 296, 48);
		frame.getContentPane().add(labelSenha);
	}

	public void exibeMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

	public JTextField getLabelLogin() {
		return labelLogin;
	}

	public void setLabelLogin(JTextField labelLogin) {
		this.labelLogin = labelLogin;
	}

	public JPasswordField getLabelSenha() {
		return labelSenha;
	}

	public void setLabelSenha(JPasswordField labelSenha) {
		this.labelSenha = labelSenha;
	}
	
	
}
