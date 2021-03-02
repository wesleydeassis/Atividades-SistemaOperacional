package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RedesController Rcontroller = new RedesController();
		
		int opc = 0;
		String os = System.getProperty("os.name");
		
		
		  do {
		      opc = Integer.parseInt(JOptionPane.showInputDialog
		                ("\n ** Ação a ser realizada **  \n1 - Ip  \n2 - Ping \n9 - Finaliza"));
		      switch (opc) {
		        case 1: Rcontroller.ip(os);  // Buscando o menu Cadastrar 
		              break;
		        case 2: Rcontroller.ping(os);  // Buscando o menu Consultar
		             break;
		        case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
		          //Finaliza o Programa
		        break;
		 
		        default: JOptionPane.showMessageDialog(null,"Opção inválida");
		      } 
		    } while (opc!=9);
		  }

	}


