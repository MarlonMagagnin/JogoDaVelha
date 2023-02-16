package jogoDaVelha;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	public void show() {
		JFrame frame = new JFrame("Login");
		frame.setBounds(500, 150, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel usuarioLabel = new JLabel("Usuário");
		usuarioLabel.setBounds(10, 20, 80, 25);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(10, 50, 80, 25);
		
		JTextField usuarioTextField = new JTextField();
		usuarioTextField.setBounds(80, 20, 125, 25);
		
		JPasswordField senhaPasswordField = new JPasswordField();
		senhaPasswordField.setBounds(80, 50, 125, 25);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(80, 100, 100, 25);
		
		btnEntrar.addActionListener(e -> {
			
			String usuario = usuarioTextField.getText();
			String senha = String.valueOf(senhaPasswordField.getPassword());
			
			if(usuario.equals("marlon") && senha.equals("123")) {
				Jogo jogo = new Jogo();
				jogo.show();
				frame.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "As credenciais estão incorretas!");
			}
		});
		
		panel.add(usuarioLabel);
		panel.add(senhaLabel);
		panel.add(usuarioTextField);
		panel.add(senhaPasswordField);
		panel.add(btnEntrar);
		
		
		frame.add(panel);
		frame.getRootPane().setDefaultButton(btnEntrar);
		frame.setVisible(true);
		
		
		
	}

}
