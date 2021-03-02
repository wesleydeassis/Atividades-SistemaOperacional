package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	
	public RedesController(){
	super();
	}

	public void ip(String os) {
		String process="";
		if(os.contains("Windows")){
			process ="ipconfig";}
			
		else {
			process="ifconfig";
				
			}
		
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			//StringBuffer bufferip = new StringBuffer();
			String linha = buffer.readLine();
			while (linha != null){
				
				if(linha.contains("Ethernet")|| linha.contains("IPv4") ){
			
				
				System.out.println(linha);
				
				
				
				}
				linha = buffer.readLine();
				
				
				if(linha.contains("flag")|| linha.contains("inet")){
				
				
				}
					
					
				}
			
			
						
		
				
	
			
				buffer.close();
				leitor.close();
				fluxo.close();
				
			
			

		
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		}
		
	
		
			
		
		
		
	

	public void ping(String os) {
		// TODO Auto-generated method stub
		 String process = "";
		

	        if(os.contains("Windows")) {
	            process = "ping -n 10 www.google.com.br";
	        } else 
	            if(os.contains("Linux")) {
	                process = "ping -c 10 www.google.com.br";
	            } 

	        try {
	            Process p = Runtime.getRuntime().exec(process);
	            InputStream fluxo = p.getInputStream();
	            InputStreamReader leitor = new InputStreamReader(fluxo);
	            BufferedReader buffer = new BufferedReader(leitor);
	            String linha = buffer.readLine();

	            while (linha != null) {
	                linha = buffer.readLine();
	               
	            
	           
	                    if (linha.contains("time") || linha.contains("tempo")) {
	                    	System.out.println("Tempo: "+linha);
	                      
	                    }
	                    	                
	                    if (linha.contains("Média") ||linha.contains("Average")) {
	                    	System.out.println("O ping médio é:"+linha);
	                    }
	                }  
	          
	            buffer.close();
	            leitor.close();
	            fluxo.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	
	
	
	

