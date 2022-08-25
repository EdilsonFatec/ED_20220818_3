package view;
import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int qtde;
		double soma;

		Controller somat = new Controller();
		
	    qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde = "));
	    soma =  somat.Somatorio(qtde);
	    
		System.out.println("Somatorio = "+soma);
	}

}