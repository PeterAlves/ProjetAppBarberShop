package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Agenda {

	private JFrame frame;
	private JTable tableAgenda;
	private JTextField labelValor;
	private JTextField labelHora;
	private JTextField labelData;
	private JTextField labelId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda window = new Agenda();
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
	public Agenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 542, 834);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tableAgenda = new JTable();
		tableAgenda.setCellSelectionEnabled(true);
		tableAgenda.setColumnSelectionAllowed(true);
		tableAgenda.setFillsViewportHeight(true);
		tableAgenda.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Cliente", "Servi\u00E7o", "Valor", "Data", "Hora", "Observa\u00E7\u00E3o"
			}
		));
		tableAgenda.setFont(new Font("Tahoma", Font.BOLD, 6));
		tableAgenda.setBounds(10, 531, 506, 253);
		frame.getContentPane().add(tableAgenda);
		
		JTextArea labelObservacao = new JTextArea();
		labelObservacao.setBounds(10, 370, 506, 106);
		frame.getContentPane().add(labelObservacao);
		
		JButton btAgendar = new JButton("Agendar");
		btAgendar.setSelectedIcon(null);
		btAgendar.setForeground(Color.WHITE);
		btAgendar.setBackground(Color.ORANGE);
		btAgendar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btAgendar.setBounds(34, 487, 453, 34);
		frame.getContentPane().add(btAgendar);
		
		labelValor = new JTextField();
		labelValor.setBounds(139, 212, 337, 33);
		frame.getContentPane().add(labelValor);
		labelValor.setColumns(10);
		
		labelHora = new JTextField();
		labelHora.setColumns(10);
		labelHora.setBounds(139, 297, 337, 33);
		frame.getContentPane().add(labelHora);
		
		JComboBox comboBoxServico = new JComboBox();
		comboBoxServico.setBounds(139, 168, 337, 33);
		frame.getContentPane().add(comboBoxServico);
		
		labelData = new JTextField();
		labelData.setColumns(10);
		labelData.setBounds(139, 256, 337, 33);
		frame.getContentPane().add(labelData);
		
		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(139, 124, 337, 33);
		frame.getContentPane().add(comboBoxCliente);
		
		labelId = new JTextField();
		labelId.setColumns(10);
		labelId.setBounds(139, 80, 337, 33);
		frame.getContentPane().add(labelId);
		
		JLabel txtId = new JLabel("Id");
		txtId.setHorizontalAlignment(SwingConstants.LEFT);
		txtId.setForeground(Color.WHITE);
		txtId.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtId.setBounds(65, 78, 64, 33);
		frame.getContentPane().add(txtId);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblCliente.setForeground(Color.WHITE);
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCliente.setBounds(65, 124, 69, 33);
		frame.getContentPane().add(lblCliente);
		
		JLabel lblServio = new JLabel("Servi\u00E7o");
		lblServio.setHorizontalAlignment(SwingConstants.LEFT);
		lblServio.setForeground(Color.WHITE);
		lblServio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblServio.setBounds(65, 166, 69, 33);
		frame.getContentPane().add(lblServio);
		
		JLabel lblValorR = new JLabel("Valor R$");
		lblValorR.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorR.setForeground(Color.WHITE);
		lblValorR.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorR.setBounds(65, 212, 69, 33);
		frame.getContentPane().add(lblValorR);
		
		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.LEFT);
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(65, 254, 69, 33);
		frame.getContentPane().add(lblData);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setHorizontalAlignment(SwingConstants.LEFT);
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHora.setBounds(65, 295, 69, 33);
		frame.getContentPane().add(lblHora);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setHorizontalAlignment(SwingConstants.LEFT);
		lblObservaes.setForeground(Color.WHITE);
		lblObservaes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblObservaes.setBounds(10, 339, 101, 33);
		frame.getContentPane().add(lblObservaes);
	}
}
