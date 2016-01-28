import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Component;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField pantalla;
	private String[] almacen = new String[10];
	public int i = 0;

	/*
	 * Launch the application.
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public Calc() {
		crearAlmacen();
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Calc.class.getResource("/media/icono_calculadora.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 194, 269);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(4, 0, 176, 39);
		contentPane.add(panel);
		panel.setLayout(null);

		pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setBackground(Color.GREEN);
		pantalla.setBounds(0, 11, 176, 23);
		panel.add(pantalla);
		pantalla.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 46, 170, 184);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("1");
			}
		});
		boton1.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton1.setBounds(0, 0, 39, 32);
		panel_1.add(boton1);

		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("4");
			}
		});
		boton4.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton4.setBounds(0, 36, 39, 32);
		panel_1.add(boton4);

		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("7");
			}
		});
		boton7.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton7.setBounds(0, 72, 39, 32);
		panel_1.add(boton7);

		// ///////////

		JButton punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numAntiguo = pantalla.getText();
				if (pantalla.getText().contains(".")) {

				} else {
					if (pantalla.getText().isEmpty()) {
						pantalla.setText("0.");
					} else {
						pantalla.setText(numAntiguo + ".");
					}
				}
			}
		});
		punto.setFont(new Font("Dialog", Font.PLAIN, 9));
		punto.setBounds(0, 108, 39, 32);
		panel_1.add(punto);

		// //////////

		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("2");
			}
		});
		boton2.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton2.setBounds(43, 0, 39, 32);
		panel_1.add(boton2);

		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("5");
			}
		});
		boton5.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton5.setBounds(43, 36, 39, 32);
		panel_1.add(boton5);

		JButton boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("8");
			}
		});
		boton8.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton8.setBounds(43, 72, 39, 32);
		panel_1.add(boton8);

		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("0");
			}
		});
		boton0.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton0.setBounds(43, 108, 39, 32);
		panel_1.add(boton0);

		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("3");
			}
		});
		boton3.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton3.setBounds(86, 0, 39, 32);
		panel_1.add(boton3);

		JButton boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("6");
			}
		});
		boton6.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton6.setBounds(86, 36, 39, 32);
		panel_1.add(boton6);

		JButton boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("9");
			}
		});
		boton9.setFont(new Font("Dialog", Font.PLAIN, 9));
		boton9.setBounds(86, 72, 39, 32);
		panel_1.add(boton9);

		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pantalla.getText().equals("+")
						|| pantalla.getText().equals("-")
						|| pantalla.getText().equals("x")
						|| pantalla.getText().equals("/")) {
					pantalla.setText("");
				} else {
					almacenar();
				}
				// imprimir();
				pantalla.setText(Integer.toString(operaciones()));
				crearAlmacen();
			}
		});

		igual.setFont(new Font("Dialog", Font.PLAIN, 9));
		igual.setBounds(86, 108, 39, 32);
		panel_1.add(igual);

		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("+");
			}
		});
		suma.setFont(new Font("Dialog", Font.PLAIN, 9));
		suma.setBounds(129, 0, 39, 32);
		panel_1.add(suma);

		JButton multi = new JButton("x");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("x");
			}
		});
		multi.setFont(new Font("Dialog", Font.PLAIN, 9));
		multi.setBounds(129, 36, 39, 32);
		panel_1.add(multi);

		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("-");
			}
		});
		resta.setFont(new Font("Dialog", Font.PLAIN, 9));
		resta.setBounds(129, 72, 39, 32);
		panel_1.add(resta);

		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escribir("/");
			}
		});
		dividir.setFont(new Font("Dialog", Font.PLAIN, 9));
		dividir.setBounds(129, 108, 39, 32);
		panel_1.add(dividir);

		JButton borrar = new JButton("BORRAR");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearAlmacen();
				pantalla.setText("");
			}
		});
		borrar.setBounds(0, 144, 170, 40);
		panel_1.add(borrar);
	}

	// /////////--------------------

	public void imprimir() {
		// System.out.println("Vpantalla: " + pantalla.getText());
		for (int i = 0; i < 10; i++) {
			System.out.println("pant" + this.i + " |Posición " + i + ": "
					+ almacen[i]);
		}
	}

	public void crearAlmacen() {
		this.i = 0;

		for (int i = 0; i < almacen.length; i++) {
			almacen[i] = "vacio";
		}
	}

	public void almacenar() {
		almacen[this.i] = pantalla.getText();
		this.i++;
	}

	public void escribir(String num) {
		if (num.equals("+") || num.equals("-") || num.equals("x")
				|| num.equals("/")) {
			if (pantalla.getText().isEmpty()) {
				pantalla.setText("0");
				almacenar();
				pantalla.setText(num);
				almacenar();
				System.out.println("if primer indice ");
				imprimir();
			} else if (pantalla.getText().contains("+")
					|| pantalla.getText().contains("-")
					|| pantalla.getText().contains("x")
					|| pantalla.getText().contains("/")) {
				pantalla.setText(num);
				System.out.println("if otro simbolo " + num);
			} else {
				almacenar();
				pantalla.setText(num);
				almacenar();
				System.out.println("if almacenar si es simbolo");
				imprimir();
			}
		} else {
			if (pantalla.getText().contains("+")
					|| pantalla.getText().contains("-")
					|| pantalla.getText().contains("x")
					|| pantalla.getText().contains("/")) {
				pantalla.setText(num);
				System.out.println("if primer num ");
				imprimir();
			} else {
				pantalla.setText(pantalla.getText().concat(num));
				System.out.println("if concatenación ");
				imprimir();
			}
		}
	}

	public int operaciones() { 
								
		int solucion = 0;
		int posicion = 0;
		for (int i = 0; i < this.i; i++) {
			if (almacen[this.i].equals("vacio")) {
				posicion = i;
			}
		}

		for (int i = 0; i < posicion; i++) {// i++, j += 3, k
											// +=// 2
			int num1 = Integer.parseInt(almacen[i]);
			int num2 = Integer.parseInt(almacen[i + 2]);
			String simbolo = almacen[i + 1];

			switch (simbolo) {
			case "+":
				solucion = num1 + num2;
				break;
			case "-":
				solucion = num1 - num2;
				break;
			case "x":
				solucion = num1 * num2;
				break;
			case "/":
				solucion = num1 / num2;
				break;
			}
			break;
		}
		return solucion;

	}
}

// }
