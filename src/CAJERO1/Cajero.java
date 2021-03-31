package CAJERO1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		// Creamos la instancia sc para crear el objetpo Scanner
					Scanner sc = new Scanner(System.in);
					FileWriter archivo = null;
					PrintWriter pw = null;
					String a = "";
					//Creamos la lista 
					//Contador para la inscrincion
					int j = 0;
					//Creamos el arrayslist para los nombres
					ArrayList<String> arrnombre = new ArrayList<String>(7+j);
					//Para solucionar posibles errores
					arrnombre.add(0, "" );
					arrnombre.add(1, "" );
					arrnombre.add(2, "" );
					arrnombre.add(3, "Jhonny Jarama" );
					arrnombre.add(4, "Cristian De la Cruz" );
					arrnombre.add(5, "Piero Saenz" );
					arrnombre.add(6, "David Yarleque"  );
					//Creamos el arrayslist para las tarjetas
					ArrayList<Integer> arrtarjetas = new ArrayList<Integer>(7+j);
					arrtarjetas.add(0, 2244646);
					arrtarjetas.add(1, 22454654);
					arrtarjetas.add(2, 22546654);
					arrtarjetas.add(3, 1332636);
					arrtarjetas.add(4, 1257588);
					arrtarjetas.add(5, 1251203);
					arrtarjetas.add(6, 1239274);
					//Creamos el arrayslist para las dni
					ArrayList<Integer> arrdni = new ArrayList<Integer>(7+j);
					arrdni.add(0, 6546546);
					arrdni.add(1, 546464);
					arrdni.add(2, 48646664);
					arrdni.add(3, 76199581);
					arrdni.add(4, 73042638);
					arrdni.add(5, 75895689);
					arrdni.add(6, 77384408);
					//Creamos el arrayslist para las contraseñas
					ArrayList<Integer> arrcontras = new ArrayList<Integer>(7+j);
					arrcontras.add(0, 4646);
					arrcontras.add(1, 7666);
					arrcontras.add(2, 5465);
					arrcontras.add(3, 46646);
					arrcontras.add(4, 86641);
					arrcontras.add(5, 89413);
					arrcontras.add(6, 79449);
					//Creamos el arrayslist para los montos
					ArrayList<Float> arrmonto = new ArrayList<Float>(7+j);
					arrmonto.add(0, 0f);
					arrmonto.add(1, 0f);
					arrmonto.add(2, 0f);
					arrmonto.add(3, 450f);
					arrmonto.add(4, 421f);
					arrmonto.add(5, 356f);
					arrmonto.add(6, 356f);
					//Asignamos el valor NO para poder utilizar el bucle while
				     String pre = "N";
				     
				     //Utilizamos el while bucle por las repeticiones
				     while (pre.equals("N")) {
				    	 //Imprimimos la bienvenida al usuario
				    	 System.out.println("\n========================================================");
				    	 System.out.println("Bienvenido al cajero en linea multifuncional del grupo 5");
				    	 System.out.println("========================================================");
				    	 //Pedimos una opcion al usuario
				    	 System.out.println("\n¿Que opcion desea?: \nOperaciones Bancarias[1] \nRegistrar[2]"
				    	 		+ "\nSalir[3]");
				    	 //Asignamos al valor opera una determinada operacion
				    	 System.out.print("Que opcion desea: ");
				    	 int opera = sc.nextInt();
				    	 //Utilizamos el bucle para los errores
				    	 while ( opera >=4 || opera <=0) {
				    		 System.out.println("Opcion no valida");
				    		 System.out.println("===========");
				    		 System.out.print("¿Que opcion desea?: \nOperaciones Bancarias[1] \nRegistrar[2]"
				 	    	 		+ "\nSalir[3]");
				    		 System.out.print("\n¿Qué opcion desea?: ");
					    	 opera = sc.nextInt();
				    		 
				    	 }
				    	 //Reiniciamos la lectura
				    	 sc.nextLine();
				    	 //Utilizamos el switch para las operaciones con el mismo valor
				    	 switch (opera) {
				    	 //Para el caso 1 = Operaciones Bancarias
				    		 case 1:
				    			 //Preguntamos que aplique la clave con dni o tarjeta
				    			 //Se asigna a la variable ingreso
				    			 System.out.print("Opcion de ingreso (DNI[1]-Tarjeta[2]-Salir[3]):"  );
				    			 int ingreso = sc.nextInt();
				    			 //Uso del while para eliminar errores
				    			 while ( ingreso >=4 || ingreso <=0 ) {
				    				 System.out.println("Ingrese solo dni o tarjeta");
				    				 System.out.print("Opcion de ingreso (DNI[1]-Tarjeta[2] -Salir[3]): "  );
				    				 ingreso = sc.nextInt();
				    			 }
				    			 //Reinicio de lectura
				    			 sc.nextLine();
				    			 //En caso el usuario ingrese 3 
				    			 if ( ingreso == 3) {
				    				 pre = "N";
							    	break;	 
				    				 
				    			 }
				    			 
				    			 //Aplicamos la clave con dni
				    		   if ( ingreso == 1) {
				    			   //Ingresamos el dni y la contraseña para los valores de dni y clave respectivamente.
				    			   System.out.print("Ingrese su DNI: ");
				    			   int dni = sc.nextInt();
				    			   System.out.print("Ingrese su clave: ");
				    			   int clave = sc.nextInt();
				    			   //Reinicio de lectura
				    			   sc.nextLine();
				    			   //Utilizamos el bucle for para ver todos los casos de la lista hasta llegar al que  tengo.
				    			   for (int i = 0; i< arrnombre.size(); i++ ) {
				    				 
				    				  //si es correcto con los datos de mis arrayslist se expresa lo siguiente
				    				  if ( dni==arrdni.get(i)&& clave==arrcontras.get(i)) {
				    					   System.out.println("\n--------------------------");
										   System.out.println("Registro encontrado");
										   System.out.println("\n--------------------------");
										   System.out.println("Contraseña   :  ********");
										   System.out.println("Cliente : "+ arrnombre.get(i));
										   System.out.println("Monto    : "+ arrmonto.get(i));
										   
									 	    	 
									    	 
										   //Especificamos el valor de "S" par utilizar el bucle while
										   String repe = "S";
										   
										   //Aplicamos la eleccion de operacion
										   System.out.println("Elección de operación: \n\nRetiro[1]"
										   		+ "\n\nDeposito a cuenta propia[2] \n\nTransferencia[3] \n\nSalir[4]" );
										   System.out.print("\nIngrese elección: ");
										   int elec = sc.nextInt();
										   //Aplicamos un bucle while para eliminar errores
										   while ( elec <= 0 && elec >=4)  {
									    		 System.out.println("Elección no valida");
									    		 System.out.println("===========");
									    		 System.out.println("Elección de operación: \n\nRetiro[1]"
													   		+ "\n\nDeposito a cuenta propia[2] \n\nTransferencia[3] \n\nSalir[4]");
									    		 System.out.print("\nIngrese elección: ");
									    		 elec = sc.nextInt();
										   }
							
										   while (repe.equals("S")) {
										 //Utilizamos switch para las operaciones 
										   switch ( elec) {
										   //Caso1 = Retiros
										   case 1:
											   //Preguntamos el monto a agregar para poder configurar el nuevo monto del arrays list
											   System.out.print("\n¿Cuanto desea retirar?: ");
											   float  retiro = sc.nextFloat();
											   float resto = 0;
											   //Realiamoz y analizamos las condiciones
											   if ( retiro != 0 && arrmonto.get(i) >= retiro && retiro % 2 == 0 &&  retiro % 5 == 0) {
											   // Esta condicion se cumple solo si el retiro es mayor a 0 
												   //y el retiro no sea mayor al monto establecido 	   
												   resto = arrmonto.get(i) - retiro;
												   arrmonto.remove(i);
												   arrmonto.add(i, resto);
												   System.out.println("\n--------------------------");
												   System.out.println("Operacion exitosa");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + retiro);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
												   
												   
												   
												   
												  
											   }
											   else if ( (retiro % 2 != 0 &&  retiro % 5 != 0) || retiro % 2 != 0 || retiro % 5 != 0) {
												   //Esta condicion saltara en caso el retiro sea mayor al monto
												   System.out.println("\n--------------------------");
												   System.out.println("No se puede retirar modenas en este cajero \nRepita la operacion o \ndirijase al banco para depositos de monedas");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												  
											   }
											   else if ( arrmonto.get(i) < retiro ) {
												 //Esta condicion saltara en caso el retiro sea mayor al monto
												   System.out.println("\n--------------------------");
												   System.out.println("No cuenta con el saldo suficiente");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
												   
											   }
											   else {
												  //Esta condicion saltara en caso de que el retiro sea 0 
												   System.out.println("\n--------------------------");
												   System.out.println("Saldo sin operacion");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												     
											   }
											   
											   
											   try {
													
													archivo = new FileWriter("Boleta.txt", true);
													pw = new PrintWriter(archivo);
													String bole_nombre = arrnombre.get(i);
													String bole_opera = "Retiro";
													float bole_monto = arrmonto.get(i);
													String bole_confi = "SI";
													if ( resto == 0 && arrmonto.get(i) != 0) bole_confi = "NO";
													String bole_estado = bole_confi;
													boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
													
													pw.println("<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
													pw.println("==============================");
													pw.println("==============================");
													pw.println("Nombre de la cuenta . . . : " + bole.NombreCompleto() );
													pw.println("Tipo de operación . . . . . : " + bole.OperacionRealizada());
													pw.println("Estado de cuenta. . . . . . : " + bole.Mostrarmonto());
													pw.println("Estado . . . . . . . . . . . . . . : " + bole.MostrarEstado());
													pw.println("Monto actual . . . . . . . . . . . : " + arrmonto.get(i));
													if ( resto == 0f && arrmonto.get(i) != 0) retiro = 0f;
													pw.println("Se retiro . . . . . . . . . . . : "+ retiro);
													
													System.out.println("Su boleta fue creada correctamente . . .");
												}catch(Exception ex1 ) {
													ex1.printStackTrace();
											
												} finally {
													//Cierre del archivo
													try {
														if ( archivo != null) archivo.close();
													
													}catch (Exception ex2) {
														ex2.printStackTrace();
													}
												}
												
											   
												   
											   //Reinicio de lectura
											   sc.nextLine();
											   //Preguntamos si desea repitir otra operacion
											   System.out.print("¿Desea realizar otra operación[S/N]?: ");
											   repe = sc.nextLine();
											   repe = repe.toUpperCase();
											   //Si es así  se continua con la operacion
											   if ( repe.equals("S")) {
												   System.out.println("Elección de operación: \nRetiro[1]"
													   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
									    		 System.out.print("Ingrese elección: ");
									    		 elec = sc.nextInt();
											   }
											   //Para terminar en esto
										        break;
										        
										   case 2:
											   //Este caso se cumple si el usuario solicita la opcion de
											   //Deposito de la cuenta
											   System.out.print("\n¿Cuanto desea depositar a la cuenta?: ");
											   float  adic = sc.nextFloat();
											   float suma = 0;
											   //Definimos un if para comprobar que la adicion no sea 0
											   //Y que no sea multiplo de 2 y de 5 para no poder ingresar monedas 
			                                        if ( adic != 0 && adic >= 10f && adic % 2== 0 && adic % 5 == 0) {
												   //Realizamos la respectiva operacion
												   suma = arrmonto.get(i) + adic;
												   arrmonto.remove(i);
												   arrmonto.add(i, suma);
												   System.out.println("\n--------------------------");
												   System.out.println("Operacion exitosa");
												   System.out.println("\n--------------------------");
												   System.out.println("Se deposito: " + adic);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
											   }
											   else if (adic == 0 ) {
												   //Esta condicion se cumple 
												   //si el usuario ingresara 0
												   System.out.println("\n--------------------------");
												   System.out.println("Saldo sin operacion");
												   System.out.println("\n--------------------------");
												   System.out.println("Se deposito: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
												   
											   }
											   else {
												 //Esta condicion se cumple 
												   //si el usuario ingresara un digito con monedas
												   System.out.println("\n--------------------------");
												   System.out.println("No se puede depositar monedas");
												   System.out.println("\n--------------------------");
												   System.out.println("Realice nuevamente la operacion");
												   System.out.println("Se deposito: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												     
											   }
			                                        
			                                        
			                                        try {
														
														archivo = new FileWriter("Boleta.txt", true);
														pw = new PrintWriter(archivo);
														String bole_nombre = arrnombre.get(i);
														String bole_opera = "Deposito";
														float bole_monto = arrmonto.get(i);
														String bole_confi = "SI";
														if ( suma == 0 ) bole_confi = "NO";
														String bole_estado = bole_confi;
														boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
														
														pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
														pw.println("==============================");
														pw.println("==============================");
														pw.println("Nombre de la cuenta . . . . . . : " + bole.NombreCompleto() );
														pw.println("Tipo de operación . . . . . . . . : " + bole.OperacionRealizada());
														pw.println("Estado de cuenta. . . . . . . . .  : " + bole.Mostrarmonto());
														pw.println("Estado . . . . . . . . . . . . . . . . . : " + bole.MostrarEstado());
														pw.println("Monto actual . . . . . . . . . . . : " + arrmonto.get(i));
														if ( suma == 0f ) adic = 0f;
														pw.println("Se adiciono a su monto  . . . : "+ adic);
														
														System.out.println("Su boleta fue creada correctamente . . .");
													}catch(Exception ex1 ) {
														ex1.printStackTrace();
												
													} finally {
														//Cierre del archivo
														try {
															if ( archivo != null) archivo.close();
														
														}catch (Exception ex2) {
															ex2.printStackTrace();
														}
													}
												   
											   //Reinicio de lectura
											   sc.nextLine();
											   System.out.print("¿Desea realizar otra operación?[S/N]: ");
											   repe = sc.nextLine();
											   repe = repe.toUpperCase();
											   if ( repe.equals("S")) {
												   System.out.println("Elección de operación: \nRetiro[1]"
													   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
									    		 System.out.print("Ingrese elección: ");
									    		 elec = sc.nextInt();
											   }
										        break;
											  //Este caso se cumple si el usuario ingresa la opcion de transferencia 
										   case 3:
											   //Solicitamos el medio (DNI o TARJETA)
											   System.out.print("Opción de ingreso para transferencia [DNI{1}-Tarjeta{2}]: "  );
								    			 int trans= sc.nextInt();
								    			//Reinicio de lectura
												   sc.nextLine();
								    			 while (trans >=3  && trans <=0) {
								    				 System.out.println("Ingrese solo dni o tarjeta para poder ejecutar la transacción");
								    				 //Pedimos que eliga una opcion
								    				 System.out.print("Opción de ingreso para transferencia [DNI{1}-Tarjeta{2}]: "  );
									    			 trans= sc.nextInt();
								    			 }
											     //Se cumple si el usuario decide transferir por DNI
								    			 if ( trans == 1) {
								    				 //Solicitamos el DNI y el monto a transferir
								    				 System.out.print("\nIngrese DNI de la cuenta de destino: ");
								    				 int trans_dni = sc.nextInt();
								    				 
								    				 System.out.print("\nIngrese monto a transferir: ");
								    				 float trans_monto = sc.nextFloat();
								    				 
								    				 //Definimos una varible dentro del for para agregar el monto a la cuenta del receptor
								    				 //Y de igual manera definimos que no sea la misma cuenta 
								    				 //y el monto a transferir no exceda el saldo de el emisor
								    				 
								    				 for ( int x = 0; x< arrnombre.size(); x++) {
								    					 float trans_suma_tar = 0, trans_resta =0;
								    					 if ( trans_dni ==arrdni.get(x)  && arrmonto.get(i) >= trans_monto && trans_dni !=arrdni.get(i) ) {
								    						    //Operacion
								    						
								    						    trans_suma_tar = arrmonto.get(x) + trans_monto;
									    						arrmonto.remove(x);
									    						arrmonto.add(x ,trans_suma_tar);
									    						trans_resta = arrmonto.get(i) - trans_monto;
									    						arrmonto.remove(i);
									    						arrmonto.add(i,trans_resta);
									    						   
									    						   System.out.println("\n--------------------------");
																   System.out.println("Operacion exitosa");
																   System.out.println("\n--------------------------");
																   System.out.println("Se deposito: " + trans_monto );
																   System.out.println("Nombre del receptor: " + arrnombre.get(x));
																   System.out.println("Número de DNI del receptor: " + arrdni.get(x));
																   System.out.println("Nombre del emisor: " + arrnombre.get(i));
																   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
																   
																   try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
																  
																   break;
																   
									    					 }
									    					      //Este if se cumple si el emisor envia mas de lo que tiene en su cuenta
				                                                  if ( arrmonto.get(i) < trans_monto && !(arrdni.contains(trans_dni) == false ) && ( trans_dni == arrdni.get(x)  && arrmonto.get(i) >= trans_monto && trans_dni !=arrdni.get(i) ) == false ) {
									    						   
									    						   System.out.println("\n--------------------------");
																   System.out.println("Operacion incorrecta\nNo tienen los fondos suficientes");
																   System.out.println("\n--------------------------");
																   System.out.println("Se deposito: " + 0 );
																   System.out.println("Nombre del emisor: " + arrnombre.get(i));
																   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
																   
																   try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
																   break;
																   
									    					 }
				                                                  //Este if se cumple si la cuenta a la que se desea enviar no existe
				                                                  if ( arrdni.contains(trans_dni) == false && !(arrmonto.get(i) < trans_monto) && ( trans_dni ==arrdni.get(x) && arrmonto.get(i) >= trans_monto && trans_dni !=arrdni.get(i) ) == false) {
				     					    						 
				     					    						   System.out.println("\n--------------------------");
				     												   System.out.println("Operacion incorrecta\nLa cuenta no existe");
				     												   System.out.println("\n--------------------------");
				     												   System.out.println("Se deposito: " + 0 );
				     												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
				     												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
				     												   
				     												  try {
						       												
						       												archivo = new FileWriter("Boleta.txt", true);
						       												pw = new PrintWriter(archivo);
						       												String bole_nombre = arrnombre.get(i);
						       												String bole_opera = "Transferencia";
						       												float bole_monto = arrmonto.get(i);
						       												String bole_confi = "SI";
						       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
						       												String bole_estado = bole_confi;
						       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
						       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
						       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
						       												pw.println("==============================");
						       												pw.println("==============================");
						       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
						       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
						       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
						       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
						       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
						       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
						       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
						       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
						       												
						       												System.out.println("Su boleta fue creada correctamente . . .");
						       											}catch(Exception ex1 ) {
						       												ex1.printStackTrace();
						       										
						       											} finally {
						       												//Cierre del archivo
						       												try {
						       													if ( archivo != null) archivo.close();
						       												
						       												}catch (Exception ex2) {
						       													ex2.printStackTrace();
						       												}
						       											}
				     												  break;
				     												   
				     					    					 } 
				                                                  //Este if se cumple si la cuenta a la que se desea enviar no existe  y el monto aumenta 
				                                                  if ( arrdni.contains(trans_dni) == false && arrmonto.get(i) < trans_monto && ( trans_dni == arrdni.get(x) && arrmonto.get(i) >= trans_monto && trans_dni!=arrdni.get(i) ) == false) {
				      					    						 
				      					    						   System.out.println("\n--------------------------");
				      												   System.out.println("Operacion incorrecta\nLa cuenta no existe y no cuentas con los suficientes fondos" );
				      												   System.out.println("\n--------------------------");
				      												   System.out.println("Se deposito: " + 0 );
				      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
				      												   System.out.println("Mi monto actual: " + arrmonto.get(i));
				      												   
				      												 try {
						       												
						       												archivo = new FileWriter("Boleta.txt", true);
						       												pw = new PrintWriter(archivo);
						       												String bole_nombre = arrnombre.get(i);
						       												String bole_opera = "Transferencia";
						       												float bole_monto = arrmonto.get(i);
						       												String bole_confi = "SI";
						       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
						       												String bole_estado = bole_confi;
						       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
						       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
						       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
						       												pw.println("==============================");
						       												pw.println("==============================");
						       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
						       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
						       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
						       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
						       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
						       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
						       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
						       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
						       												
						       												System.out.println("Su boleta fue creada correctamente . . .");
						       											}catch(Exception ex1 ) {
						       												ex1.printStackTrace();
						       										
						       											} finally {
						       												//Cierre del archivo
						       												try {
						       													if ( archivo != null) archivo.close();
						       												
						       												}catch (Exception ex2) {
						       													ex2.printStackTrace();
						       												}
						       											}
				      												 break;
				      												   
				      												   
				      					    					 }
				                                                   
				                                                   
				                                                   //Este se umple si el usuario trate de enviar a su misma cuenta
				                                                   if ( trans_dni ==arrdni.get(i)  && (trans_dni == arrdni.get(x)  && (arrmonto.get(i)) >= trans_monto && trans_dni!=arrdni.get(i)  == false))    {
				      					    						 
				      					    						   System.out.println("\n--------------------------");
				      												   System.out.println("Operacion incorrecta\nNo se puede enviar a la misma cuenta");
				      												   System.out.println("\n--------------------------");
				      												   System.out.println("Se deposito: " + 0 );
				      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
				      												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
				      												   
				      												 try {
						       												
						       												archivo = new FileWriter("Boleta.txt", true);
						       												pw = new PrintWriter(archivo);
						       												String bole_nombre = arrnombre.get(i);
						       												String bole_opera = "Transferencia";
						       												float bole_monto = arrmonto.get(i);
						       												String bole_confi = "SI";
						       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
						       												String bole_estado = bole_confi;
						       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
						       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
						       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
						       												pw.println("==============================");
						       												pw.println("==============================");
						       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
						       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
						       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
						       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
						       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
						       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
						       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
						       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
						       												
						       												System.out.println("Su boleta fue creada correctamente . . .");
						       											}catch(Exception ex1 ) {
						       												ex1.printStackTrace();
						       										
						       											} finally {
						       												//Cierre del archivo
						       												try {
						       													if ( archivo != null) archivo.close();
						       												
						       												}catch (Exception ex2) {
						       													ex2.printStackTrace();
						       												}
						       											}
				      												 break;
				      												  
				      					    					 }             
								    				 } 
			   
																  //reinicio de lectura
									    				           sc.nextLine();
																  System.out.print("¿Desea realizar otra operación?[S/N]: ");
																   repe = sc.nextLine();
																   repe = repe.toUpperCase();
																   if ( repe.equals("S")) {
																	   System.out.println("Elección de operación: \nRetiro[1]"
																		   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
														    		 System.out.print("Ingrese elección: ");
														    		 elec = sc.nextInt();
																   }
														    		 break;
													 
								    			 }
								    			 //Este if se aplica si el usuario decide enviar al receptor por su tarjeta
								    			 if ( trans == 2) {
								    				 System.out.print("\nIngrese tarjeta de la cuenta de destino: ");
								    				 int trans_tar = sc.nextInt();
								    				 
								    				 System.out.print("\nIngrese monto a transferir: ");
								    				 float trans_monto_tar = sc.nextFloat();
								    				 sc.nextLine();
								    				 //Definimos una varible dentro del for para agregar el monto a la otra cuenta
								    				 //Y de igual manera definimos que no sea la misma cuenta 
								    				 //y el monto a transferir no exceda el saldo de el emisor
								    				 for ( int x = 0; x< arrnombre.size(); x++) {
								    					 //el equals compara mientras la variable y el array sean las mismas 
								    					 float trans_suma_tar = 0, trans_resta = 0;
								    					 if ( trans_tar==arrtarjetas.get(x)  && (arrmonto.get(i)) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  ) {
								    						//Operacion
								    						trans_suma_tar = arrmonto.get(x) + trans_monto_tar;
								    						arrmonto.remove(x);
								    						arrmonto.add(x ,trans_suma_tar);
								    						trans_resta = arrmonto.get(i) - trans_monto_tar;
								    						arrmonto.remove(i);
								    						arrmonto.add(i,trans_resta);
								    						
								    						   System.out.println("\n--------------------------");
															   System.out.println("Operacion exitosa");
															   System.out.println("\n--------------------------");
															   System.out.println("Se deposito: " + trans_monto_tar );
															   System.out.println("Nombre del receptor: " + arrnombre.get(x));
															   System.out.println("Número de tarjeta del receptor: " + arrtarjetas.get(x));
															   System.out.println("Nombre del emisor: " + arrnombre.get(i));
															   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
															   
															   try {
				       												
				       												archivo = new FileWriter("Boleta.txt", true);
				       												pw = new PrintWriter(archivo);
				       												String bole_nombre = arrnombre.get(i);
				       												String bole_opera = "Transferencia";
				       												float bole_monto = arrmonto.get(i);
				       												String bole_confi = "SI";
				       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
				       												String bole_estado = bole_confi;
				       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
				       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
				       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
				       												pw.println("==============================");
				       												pw.println("==============================");
				       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
				       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
				       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
				       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
				       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
				       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
				       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
				       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
				       												
				       												System.out.println("Su boleta fue creada correctamente . . .");
				       											}catch(Exception ex1 ) {
				       												ex1.printStackTrace();
				       										
				       											} finally {
				       												//Cierre del archivo
				       												try {
				       													if ( archivo != null) archivo.close();
				       												
				       												}catch (Exception ex2) {
				       													ex2.printStackTrace();
				       												}
				       											}
															   
															   break;
															   
								    					 }
								    					       //Este if se cumple si el emisor envia mas de lo que tiene en su cuenta
			                                                  if ( arrmonto.get(i) < trans_monto_tar && !(arrtarjetas.contains(trans_tar) == false ) && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false ) {
								    						 
								    						   System.out.println("\n--------------------------");
															   System.out.println("Operacion incorrecta\nNo tienen los fondos suficientes");
															   System.out.println("\n--------------------------");
															   System.out.println("Se deposito: " + 0 );
															   System.out.println("Nombre del emisor: " + arrnombre.get(i));
															   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
															   
															   try {
				       												
				       												archivo = new FileWriter("Boleta.txt", true);
				       												pw = new PrintWriter(archivo);
				       												String bole_nombre = arrnombre.get(i);
				       												String bole_opera = "Transferencia";
				       												float bole_monto = arrmonto.get(i);
				       												String bole_confi = "SI";
				       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
				       												String bole_estado = bole_confi;
				       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
				       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
				       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
				       												pw.println("==============================");
				       												pw.println("==============================");
				       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
				       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
				       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
				       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
				       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
				       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
				       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
				       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
				       												
				       												System.out.println("Su boleta fue creada correctamente . . .");
				       											}catch(Exception ex1 ) {
				       												ex1.printStackTrace();
				       										
				       											} finally {
				       												//Cierre del archivo
				       												try {
				       													if ( archivo != null) archivo.close();
				       												
				       												}catch (Exception ex2) {
				       													ex2.printStackTrace();
				       												}
				       											}
															   break;
															   
								    					 }
			                                                //Este if se cumple si el emisor envia a una cuenta inexistente
			                                                  if ( arrtarjetas.contains(trans_tar) == false && !(arrmonto.get(i) < trans_monto_tar) && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false) {
			     					    						 
			     					    						   System.out.println("\n--------------------------");
			     												   System.out.println("Operacion incorrecta\nLa cuenta no existe");
			     												   System.out.println("\n--------------------------");
			     												   System.out.println("Se deposito: " + 0 );
			     												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
			     												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
			     												   
			     												  try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
			     												  break;
			     												   
			     					    					 }     
			                                                  //Este if se cumple si el emisor envia a una cuenta inexistente y si no tiene el dinero suficiente
			                                                  if ( arrtarjetas.contains(trans_tar) == false && arrmonto.get(i) < trans_monto_tar && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false) {
			                                                	
			      					    						   System.out.println("\n--------------------------");
			      												   System.out.println("Operacion incorrecta\nLa cuenta no existe y no cuentas con los suficientes fondos" );
			      												   System.out.println("\n--------------------------");
			      												   System.out.println("Se deposito: " + 0 );
			      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
			      												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
			      												   
			      												 try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
			      												 break;
			      												   
			      												   
			      					    					 }
			                                                   
			                                                   
			                                                //Este if se cumple si el emisor envia a su propia cuenta 
			                                                   if ( trans_tar==arrtarjetas.get(i)  && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false)    {
			      					    						 
			      					    						 System.out.println("\n--------------------------");
			      												   System.out.println("Operacion incorrecta\nNo se puede enviar a la misma cuenta");
			      												   System.out.println("\n--------------------------");
			      												   System.out.println("Se deposito: " + 0 );
			      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
			      												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
			      												   
			      												 try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
			      												 break;
			      												  
			      					    					 }
					
								    				 } 
								    				 
								    					 
								    					 
			                                                 
			                                                  
			                                                  
								    				 
			                                                   
															  //reinicio de lectura
								    				           sc.nextLine();
															  System.out.print("¿Desea realizar otra operación?[S/N]: ");
															   repe = sc.nextLine();
															   repe = repe.toUpperCase();
															   if ( repe.equals("S")) {
																   System.out.println("Elección de operación: \nRetiro[1]"
																	   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
													    		 System.out.print("Ingrese elección: ");
													    		 elec = sc.nextInt();
															   }
													    		 break;
												
								    					 }
								    				 
								    			 
										   case 4:
										   //Este caso se cumple en caso coloque la opcion salir   
											   pre = "N";
									    		break;	 
											   
								    			 //Este se cumple en caso el usuario quisiera realizar otra operacion
								    			 default:
								    				 System.out.print("¿Desea realizar otra operación?: ");
													   repe = sc.nextLine();
													   repe = repe.toUpperCase();
													   if ( repe.equals("S")) {
														   System.out.println("Elección de operación: \nRetiro[1]"
															   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
											    		 System.out.print("Ingrese elección: ");
											    		 elec = sc.nextInt();
													   }
													   pre = "N";
											    		
								    				 break;
										   }
										   
										   }	   
										   
				    				   }
				    				  //CONTAINS ANALIZA SI EL ELEMENTO SE ENCUENTRA EN LA LISTA
				    				  else if ( arrdni.contains(dni) == false || arrcontras.contains(clave) == false|| (arrdni.contains(dni) == false && arrcontras.contains(clave) == false)  ) {
				    					   System.out.println("Error coloque nuevamente ,");
				    					   System.out.print("Ingrese su DNI: ");
				    	    			   dni = sc.nextInt();
				    	    			   System.out.print("Ingrese su clave: ");
				    	    			   clave = sc.nextInt();
				    	    			 
				    	    			   //Reinicio de lectura
				    	    			   sc.nextLine();
				    	    			   
				    				   }
				    				   
					                   
				    			   }
				    			   pre = "N";
				    			   break;
				    				   }
				    		   //CASO PARA TARJETA
				    		   sc.nextLine();
				    		   if ( ingreso == 2) {
				    			   //Ingresamos la tarjeta y la contraseña para los valores tarjeta y clave respectivamente.
				    			   System.out.println("Ingrese su tarjeta: ");
				    			   int tarjetas = sc.nextInt();
				    			   System.out.println("Ingrese su clave: ");
				    			   int clave_tar = sc.nextInt();
				    			   //Reinicio de lectura
				    			   sc.nextLine();
				    			   //Utilizamos el bucle for para ver todos los casos de la lista hasta llegar al que  tengo.
				    			   for (int i = 0; i< arrnombre.size(); i++ ) {
				    				   
				    				   
				    				  //si es correcto con los datos de mis arrayslist se expresa lo siguiente
				    				   if ( tarjetas==arrtarjetas.get(i) && clave_tar==(arrcontras.get(i))) {
				    					   System.out.println("\n--------------------------");
										   System.out.println("Registro encontrado");
										   System.out.println("\n--------------------------");
										   System.out.println("Contraseña   :  *******");
										   System.out.println("Cliente : "+ arrnombre.get(i));
										   System.out.println("Monto    : "+ arrmonto.get(i));
										   
									 	    	 
									    	 
										   //Especificamos el valor de "S" par utilizar el bucle while
										   String repe = "S";
										   
										   //Aplicamos la eleccion de operacion
										   System.out.println("Elección de operación: \n\nRetiro[1]"
										   		+ "\n\nDeposito a cuenta propia[2] \n\nTransferencia[3] \n\nSalir[4]" );
										   System.out.print("\nIngrese elección: ");
										   int elec = sc.nextInt();
										   //Aplicamos un bucle while para eliminar errores
										   while ( elec <= 0 && elec >=4)  {
									    		 System.out.println("Elección no valida");
									    		 System.out.println("===========");
									    		 System.out.println("Elección de operación: \n\nRetiro[1]"
													   		+ "\n\nDeposito a cuenta propia[2] \n\nTransferencia[3] \n\nSalir[4]");
									    		 System.out.print("\nIngrese elección: ");
									    		 elec = sc.nextInt();
										   }
							
										   while (repe.equals("S")) {
										 //Utilizamos switch para las operaciones 
										   switch ( elec) {
										   //Caso1 = Retiros
										   case 1:
											   //Preguntamos el monto a agregar para poder configurar el nuevo monto del arrays list
											   System.out.print("\n¿Cuanto desea retirar?: ");
											   float  retiro = sc.nextFloat();
											   float resto = 0;
											   //Realiamoz y analizamos las condiciones
											   if ( retiro != 0 && arrmonto.get(i) >= retiro && retiro % 2 == 0 &&  retiro % 5 == 0) {
												   //Operacion
												   resto = arrmonto.get(i) - retiro;
												   arrmonto.remove(i);
												   arrmonto.add(i, resto);
												   System.out.println("\n--------------------------");
												   System.out.println("Operacion exitosa");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + retiro);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
											   }
											   else if ( (retiro % 2 != 0 &&  retiro % 5 != 0) || retiro % 2 != 0 || retiro % 5 != 0) {
												   //Esta condicion saltara en caso el retiro sea mayor al monto
												   System.out.println("\n--------------------------");
												   System.out.println("No se puede retirar modenas en este cajero \nRepita la operacion o \ndirijase al banco para depositos de monedas");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
											   }
											   else if ( arrmonto.get(i) < retiro ) {
												   //Este caso se cumple mientras el usuario retire mas de lo que tiene en su cuenta
												   System.out.println("\n--------------------------");
												   System.out.println("No cuenta con el saldo suficiente");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
												   
											   }
											   else {
												   //En caso intente retirar una cantidad imposible
												   System.out.println("\n--------------------------");
												   System.out.println("Saldo sin operacion");
												   System.out.println("\n--------------------------");
												   System.out.println("Se retiro: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												     
											   }
												   
											   try {
													
													archivo = new FileWriter("Boleta.txt", true);
													pw = new PrintWriter(archivo);
													String bole_nombre = arrnombre.get(i);
													String bole_opera = "Retiro";
													float bole_monto = arrmonto.get(i);
													String bole_confi = "SI";
													if ( resto == 0 && arrmonto.get(i) != 0) bole_confi = "NO";
													String bole_estado = bole_confi;
													boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
													
													pw.println("<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
													pw.println("==============================");
													pw.println("==============================");
													pw.println("Nombre de la cuenta . . . : " + bole.NombreCompleto() );
													pw.println("Tipo de operación . . . . . : " + bole.OperacionRealizada());
													pw.println("Estado de cuenta. . . . . . : " + bole.Mostrarmonto());
													pw.println("Estado . . . . . . . . . . . . . . : " + bole.MostrarEstado());
													pw.println("Monto actual . . . . . . . . . . . : " + arrmonto.get(i));
													if ( resto == 0f && arrmonto.get(i) != 0) retiro = 0f;
													pw.println("Se retiro . . . . . . . . . . . : "+ retiro);
													
													System.out.println("Su boleta fue creada correctamente . . .");
												}catch(Exception ex1 ) {
													ex1.printStackTrace();
											
												} finally {
													//Cierre del archivo
													try {
														if ( archivo != null) archivo.close();
													
													}catch (Exception ex2) {
														ex2.printStackTrace();
													}
												}
												
											   
											   
											   //Reinicio de lectura
											   sc.nextLine();
											   //Preguntamos si desea repitir otra operacion
											   System.out.print("¿Desea realizar otra operación[S/N]?: ");
											   repe = sc.nextLine();
											   repe = repe.toUpperCase();
											   //Si es así  se continua con la operacion
											   if ( repe.equals("S")) {
												   System.out.println("Elección de operación: \nRetiro[1]"
													   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
									    		 System.out.print("Ingrese elección: ");
									    		 elec = sc.nextInt();
											   }
											   //Para terminar en esto
										        break;
										        
										   case 2:
											   //Este caso se cumple si el usuario escoje depositar en su cuenta
											   System.out.print("\n¿Cuanto desea depositar a la cuenta?: ");
											   float  adic = sc.nextFloat();
											   float suma = 0;
											        //Definimos un if para comprobar que la adicion no sea 0
											        //Y que no sea multiplo de 2 y de 5 para no poder ingresar monedas
			                                        if ( adic != 0 && adic >= 10f && adic % 2== 0 && adic % 5 == 0) {
												   //Operacion
												   suma = arrmonto.get(i) + adic;
												   arrmonto.remove(i);
												   arrmonto.add(i, suma);
												   System.out.println("\n--------------------------");
												   System.out.println("Operacion exitosa");
												   System.out.println("\n--------------------------");
												   System.out.println("Se deposito: " + adic);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
											   }
			                                        //Se cumple en caso el usuario intente depositar 0 
											   else if (adic == 0 ) {
												   System.out.println("\n--------------------------");
												   System.out.println("Saldo sin operacion");
												   System.out.println("\n--------------------------");
												   System.out.println("Se deposito: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												   
												   
											   }
											   else {
												   //En caso intente depositar un numero imposible para el cajero
												   System.out.println("\n--------------------------");
												   System.out.println("No se puede depositar monedas");
												   System.out.println("\n--------------------------");
												   System.out.println("Realice nuevamente la operacion");
												   System.out.println("Se deposito: " + 0);
												   System.out.println("Monto actual: " + arrmonto.get(i));
												     
											   }
		                                                try {
														
														archivo = new FileWriter("Boleta.txt", true);
														pw = new PrintWriter(archivo);
														String bole_nombre = arrnombre.get(i);
														String bole_opera = "Deposito";
														float bole_monto = arrmonto.get(i);
														String bole_confi = "SI";
														if ( suma == 0 ) bole_confi = "NO";
														String bole_estado = bole_confi;
														boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
														
														pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
														pw.println("==============================");
														pw.println("==============================");
														pw.println("Nombre de la cuenta . . . . . . : " + bole.NombreCompleto() );
														pw.println("Tipo de operación . . . . . . . . : " + bole.OperacionRealizada());
														pw.println("Estado de cuenta. . . . . . . . .  : " + bole.Mostrarmonto());
														pw.println("Estado . . . . . . . . . . . . . . . . . : " + bole.MostrarEstado());
														pw.println("Monto actual . . . . . . . . . . . : " + arrmonto.get(i));
														if ( suma == 0f ) adic = 0f;
														pw.println("Se adiciono a su monto  . . . : "+ adic);
														
														System.out.println("Su boleta fue creada correctamente . . .");
													}catch(Exception ex1 ) {
														ex1.printStackTrace();
												
													} finally {
														//Cierre del archivo
														try {
															if ( archivo != null) archivo.close();
														
														}catch (Exception ex2) {
															ex2.printStackTrace();
														}
													}
												   
			                                        
											   //Reinicio de lectura
											   sc.nextLine();
											   //En caso el usuario desee continuar con otra operacion 
											   System.out.print("¿Desea realizar otra operación[S/N]?: ");
											   repe = sc.nextLine();
											   repe = repe.toUpperCase();
											   if ( repe.equals("S")) {
												   System.out.println("Elección de operación: \nRetiro[1]"
													   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
									    		 System.out.print("Ingrese elección: ");
									    		 elec = sc.nextInt();
											   }
										        break;
											   
										   case 3:
											   //Solicitamos el medio (DNI o TARJETA)
											   System.out.print("Opción de ingreso para transferencia [DNI{1}-Tarjeta{2}]: "  );
								    			 int trans= sc.nextInt();
								    			//Reinicio de lectura
												   sc.nextLine();
								    			 while (trans >=3  && trans <=0) {
								    				 System.out.println("Ingrese solo dni o tarjeta para poder ejecutar la transacción");
								    				 //Pedimos que eliga una opcion
								    				 System.out.print("Opción de ingreso para transferencia [DNI{1}-Tarjeta{2}]: "  );
									    			 trans= sc.nextInt();
								    			 }
											     //Se cumple si el usuario decide transferir por DNI
								    			 if ( trans == 1) {
								    				 //Solicitamos el DNI y el monto a transferir
								    				 System.out.print("\nIngrese DNI de la cuenta de destino: ");
								    				 int trans_dni = sc.nextInt();
								    				 
								    				 System.out.print("\nIngrese monto a transferir: ");
								    				 float trans_monto = sc.nextFloat();
								    				 
								    				 //Definimos una varible dentro del for para agregar el monto a la cuenta del receptor
								    				 //Y de igual manera definimos que no sea la misma cuenta 
								    				 //y el monto a transferir no exceda el saldo de el emisor
								    				 
								    				 for ( int x = 0; x< arrnombre.size(); x++) {
								    					 float trans_suma_tar = 0, trans_resta =0;
								    					 if ( trans_dni ==arrdni.get(x)  && arrmonto.get(i) >= trans_monto && trans_dni !=arrdni.get(i) ) {
								    						    //Operacion
								    						
								    						    trans_suma_tar = arrmonto.get(x) + trans_monto;
									    						arrmonto.remove(x);
									    						arrmonto.add(x ,trans_suma_tar);
									    						trans_resta = arrmonto.get(i) - trans_monto;
									    						arrmonto.remove(i);
									    						arrmonto.add(i,trans_resta);
									    						   
									    						   System.out.println("\n--------------------------");
																   System.out.println("Operacion exitosa");
																   System.out.println("\n--------------------------");
																   System.out.println("Se deposito: " + trans_monto );
																   System.out.println("Nombre del receptor: " + arrnombre.get(x));
																   System.out.println("Número de DNI del receptor: " + arrdni.get(x));
																   System.out.println("Nombre del emisor: " + arrnombre.get(i));
																   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
																   
																   try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
																  
																   break;
																   
									    					 }
									    					      //Este if se cumple si el emisor envia mas de lo que tiene en su cuenta
				                                                  if ( arrmonto.get(i) < trans_monto && !(arrdni.contains(trans_dni) == false ) && ( trans_dni == arrdni.get(x)  && arrmonto.get(i) >= trans_monto && trans_dni !=arrdni.get(i) ) == false ) {
									    						   
									    						   System.out.println("\n--------------------------");
																   System.out.println("Operacion incorrecta\nNo tienen los fondos suficientes");
																   System.out.println("\n--------------------------");
																   System.out.println("Se deposito: " + 0 );
																   System.out.println("Nombre del emisor: " + arrnombre.get(i));
																   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
																   
																   try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
																   break;
																   
									    					 }
				                                                  //Este if se cumple si la cuenta a la que se desea enviar no existe
				                                                  if ( arrdni.contains(trans_dni) == false && !(arrmonto.get(i) < trans_monto) && ( trans_dni ==arrdni.get(x) && arrmonto.get(i) >= trans_monto && trans_dni !=arrdni.get(i) ) == false) {
				     					    						 
				     					    						   System.out.println("\n--------------------------");
				     												   System.out.println("Operacion incorrecta\nLa cuenta no existe");
				     												   System.out.println("\n--------------------------");
				     												   System.out.println("Se deposito: " + 0 );
				     												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
				     												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
				     												   
				     												  try {
						       												
						       												archivo = new FileWriter("Boleta.txt", true);
						       												pw = new PrintWriter(archivo);
						       												String bole_nombre = arrnombre.get(i);
						       												String bole_opera = "Transferencia";
						       												float bole_monto = arrmonto.get(i);
						       												String bole_confi = "SI";
						       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
						       												String bole_estado = bole_confi;
						       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
						       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
						       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
						       												pw.println("==============================");
						       												pw.println("==============================");
						       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
						       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
						       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
						       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
						       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
						       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
						       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
						       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
						       												
						       												System.out.println("Su boleta fue creada correctamente . . .");
						       											}catch(Exception ex1 ) {
						       												ex1.printStackTrace();
						       										
						       											} finally {
						       												//Cierre del archivo
						       												try {
						       													if ( archivo != null) archivo.close();
						       												
						       												}catch (Exception ex2) {
						       													ex2.printStackTrace();
						       												}
						       											}
				     												  break;
				     												   
				     					    					 } 
				                                                  //Este if se cumple si la cuenta a la que se desea enviar no existe  y el monto aumenta 
				                                                  if ( arrdni.contains(trans_dni) == false && arrmonto.get(i) < trans_monto && ( trans_dni == arrdni.get(x) && arrmonto.get(i) >= trans_monto && trans_dni!=arrdni.get(i) ) == false) {
				      					    						 
				      					    						   System.out.println("\n--------------------------");
				      												   System.out.println("Operacion incorrecta\nLa cuenta no existe y no cuentas con los suficientes fondos" );
				      												   System.out.println("\n--------------------------");
				      												   System.out.println("Se deposito: " + 0 );
				      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
				      												   System.out.println("Mi monto actual: " + arrmonto.get(i));
				      												   
				      												 try {
						       												
						       												archivo = new FileWriter("Boleta.txt", true);
						       												pw = new PrintWriter(archivo);
						       												String bole_nombre = arrnombre.get(i);
						       												String bole_opera = "Transferencia";
						       												float bole_monto = arrmonto.get(i);
						       												String bole_confi = "SI";
						       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
						       												String bole_estado = bole_confi;
						       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
						       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
						       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
						       												pw.println("==============================");
						       												pw.println("==============================");
						       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
						       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
						       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
						       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
						       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
						       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
						       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
						       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
						       												
						       												System.out.println("Su boleta fue creada correctamente . . .");
						       											}catch(Exception ex1 ) {
						       												ex1.printStackTrace();
						       										
						       											} finally {
						       												//Cierre del archivo
						       												try {
						       													if ( archivo != null) archivo.close();
						       												
						       												}catch (Exception ex2) {
						       													ex2.printStackTrace();
						       												}
						       											}
				      												 break;
				      												   
				      												   
				      					    					 }
				                                                   
				                                                   
				                                                   //Este se umple si el usuario trate de enviar a su misma cuenta
				                                                   if ( trans_dni ==arrdni.get(i)  && (trans_dni == arrdni.get(x)  && (arrmonto.get(i)) >= trans_monto && trans_dni!=arrdni.get(i)  == false))    {
				      					    						 
				      					    						   System.out.println("\n--------------------------");
				      												   System.out.println("Operacion incorrecta\nNo se puede enviar a la misma cuenta");
				      												   System.out.println("\n--------------------------");
				      												   System.out.println("Se deposito: " + 0 );
				      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
				      												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
				      												   
				      												 try {
						       												
						       												archivo = new FileWriter("Boleta.txt", true);
						       												pw = new PrintWriter(archivo);
						       												String bole_nombre = arrnombre.get(i);
						       												String bole_opera = "Transferencia";
						       												float bole_monto = arrmonto.get(i);
						       												String bole_confi = "SI";
						       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
						       												String bole_estado = bole_confi;
						       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
						       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto = 0f;
						       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
						       												pw.println("==============================");
						       												pw.println("==============================");
						       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
						       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
						       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
						       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
						       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto));
						       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
						       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto );
						       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
						       												
						       												System.out.println("Su boleta fue creada correctamente . . .");
						       											}catch(Exception ex1 ) {
						       												ex1.printStackTrace();
						       										
						       											} finally {
						       												//Cierre del archivo
						       												try {
						       													if ( archivo != null) archivo.close();
						       												
						       												}catch (Exception ex2) {
						       													ex2.printStackTrace();
						       												}
						       											}
				      												 break;
				      												  
				      					    					 }             
								    				 } 
			   
																  //reinicio de lectura
									    				           sc.nextLine();
																  System.out.print("¿Desea realizar otra operación?[S/N]: ");
																   repe = sc.nextLine();
																   repe = repe.toUpperCase();
																   if ( repe.equals("S")) {
																	   System.out.println("Elección de operación: \nRetiro[1]"
																		   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
														    		 System.out.print("Ingrese elección: ");
														    		 elec = sc.nextInt();
																   }
														    		 break;
													 
								    			 }
								    			 //Este if se aplica si el usuario decide enviar al receptor por su tarjeta
								    			 if ( trans == 2) {
								    				 System.out.print("\nIngrese tarjeta de la cuenta de destino: ");
								    				 int trans_tar = sc.nextInt();
								    				 
								    				 System.out.print("\nIngrese monto a transferir: ");
								    				 float trans_monto_tar = sc.nextFloat();
								    				 sc.nextLine();
								    				 //Definimos una varible dentro del for para agregar el monto a la otra cuenta
								    				 //Y de igual manera definimos que no sea la misma cuenta 
								    				 //y el monto a transferir no exceda el saldo de el emisor
								    				 for ( int x = 0; x< arrnombre.size(); x++) {
								    					 //el equals compara mientras la variable y el array sean las mismas 
								    					 float trans_suma_tar = 0, trans_resta = 0;
								    					 if ( trans_tar==arrtarjetas.get(x)  && (arrmonto.get(i)) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  ) {
								    						//Operacion
								    						trans_suma_tar = arrmonto.get(x) + trans_monto_tar;
								    						arrmonto.remove(x);
								    						arrmonto.add(x ,trans_suma_tar);
								    						trans_resta = arrmonto.get(i) - trans_monto_tar;
								    						arrmonto.remove(i);
								    						arrmonto.add(i,trans_resta);
								    						
								    						   System.out.println("\n--------------------------");
															   System.out.println("Operacion exitosa");
															   System.out.println("\n--------------------------");
															   System.out.println("Se deposito: " + trans_monto_tar );
															   System.out.println("Nombre del receptor: " + arrnombre.get(x));
															   System.out.println("Número de tarjeta del receptor: " + arrtarjetas.get(x));
															   System.out.println("Nombre del emisor: " + arrnombre.get(i));
															   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
															   
															   try {
				       												
				       												archivo = new FileWriter("Boleta.txt", true);
				       												pw = new PrintWriter(archivo);
				       												String bole_nombre = arrnombre.get(i);
				       												String bole_opera = "Transferencia";
				       												float bole_monto = arrmonto.get(i);
				       												String bole_confi = "SI";
				       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
				       												String bole_estado = bole_confi;
				       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
				       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
				       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
				       												pw.println("==============================");
				       												pw.println("==============================");
				       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
				       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
				       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
				       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
				       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
				       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
				       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
				       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
				       												
				       												System.out.println("Su boleta fue creada correctamente . . .");
				       											}catch(Exception ex1 ) {
				       												ex1.printStackTrace();
				       										
				       											} finally {
				       												//Cierre del archivo
				       												try {
				       													if ( archivo != null) archivo.close();
				       												
				       												}catch (Exception ex2) {
				       													ex2.printStackTrace();
				       												}
				       											}
															   
															   break;
															   
								    					 }
								    					       //Este if se cumple si el emisor envia mas de lo que tiene en su cuenta
			                                                  if ( arrmonto.get(i) < trans_monto_tar && !(arrtarjetas.contains(trans_tar) == false ) && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false ) {
								    						 
								    						   System.out.println("\n--------------------------");
															   System.out.println("Operacion incorrecta\nNo tienen los fondos suficientes");
															   System.out.println("\n--------------------------");
															   System.out.println("Se deposito: " + 0 );
															   System.out.println("Nombre del emisor: " + arrnombre.get(i));
															   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
															   
															   try {
				       												
				       												archivo = new FileWriter("Boleta.txt", true);
				       												pw = new PrintWriter(archivo);
				       												String bole_nombre = arrnombre.get(i);
				       												String bole_opera = "Transferencia";
				       												float bole_monto = arrmonto.get(i);
				       												String bole_confi = "SI";
				       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
				       												String bole_estado = bole_confi;
				       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
				       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
				       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
				       												pw.println("==============================");
				       												pw.println("==============================");
				       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
				       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
				       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
				       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
				       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
				       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
				       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
				       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
				       												
				       												System.out.println("Su boleta fue creada correctamente . . .");
				       											}catch(Exception ex1 ) {
				       												ex1.printStackTrace();
				       										
				       											} finally {
				       												//Cierre del archivo
				       												try {
				       													if ( archivo != null) archivo.close();
				       												
				       												}catch (Exception ex2) {
				       													ex2.printStackTrace();
				       												}
				       											}
															   break;
															   
								    					 }
			                                                //Este if se cumple si el emisor envia a una cuenta inexistente
			                                                  if ( arrtarjetas.contains(trans_tar) == false && !(arrmonto.get(i) < trans_monto_tar) && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false) {
			     					    						 
			     					    						   System.out.println("\n--------------------------");
			     												   System.out.println("Operacion incorrecta\nLa cuenta no existe");
			     												   System.out.println("\n--------------------------");
			     												   System.out.println("Se deposito: " + 0 );
			     												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
			     												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
			     												   
			     												  try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
			     												  break;
			     												   
			     					    					 }     
			                                                  //Este if se cumple si el emisor envia a una cuenta inexistente y si no tiene el dinero suficiente
			                                                  if ( arrtarjetas.contains(trans_tar) == false && arrmonto.get(i) < trans_monto_tar && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false) {
			                                                	
			      					    						   System.out.println("\n--------------------------");
			      												   System.out.println("Operacion incorrecta\nLa cuenta no existe y no cuentas con los suficientes fondos" );
			      												   System.out.println("\n--------------------------");
			      												   System.out.println("Se deposito: " + 0 );
			      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
			      												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
			      												   
			      												 try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
			      												 break;
			      												   
			      												   
			      					    					 }
			                                                   
			                                                   
			                                                //Este if se cumple si el emisor envia a su propia cuenta 
			                                                   if ( trans_tar==arrtarjetas.get(i)  && ( trans_tar==arrtarjetas.get(x)  && arrmonto.get(i) >= trans_monto_tar && !(trans_tar==arrtarjetas.get(i))  )== false)    {
			      					    						 
			      					    						 System.out.println("\n--------------------------");
			      												   System.out.println("Operacion incorrecta\nNo se puede enviar a la misma cuenta");
			      												   System.out.println("\n--------------------------");
			      												   System.out.println("Se deposito: " + 0 );
			      												   System.out.println("Nombre del emisor: " + arrnombre.get(i));
			      												   System.out.println("Mi monto actual: " + arrmonto.get(i)); 
			      												   
			      												 try {
					       												
					       												archivo = new FileWriter("Boleta.txt", true);
					       												pw = new PrintWriter(archivo);
					       												String bole_nombre = arrnombre.get(i);
					       												String bole_opera = "Transferencia";
					       												float bole_monto = arrmonto.get(i);
					       												String bole_confi = "SI";
					       												if ( trans_suma_tar == 0 && trans_resta == 0 ) bole_confi = "NO";
					       												String bole_estado = bole_confi;
					       												boleta bole = new boleta ( bole_nombre , bole_opera, bole_monto, bole_estado);
					       												if (  trans_suma_tar == 0 && trans_resta == 0  ) trans_monto_tar = 0f;
					       												pw.println("\n<<<<<<<<<<<<  BOLETA  >>>>>>>>>>>>");
					       												pw.println("==============================");
					       												pw.println("==============================");
					       												pw.println("Nombre de la cuenta del emisor . . . . . . : " + bole.NombreCompleto() );
					       												pw.println("Tipo de operación . . . . . . . . . . . . . . . . . : " + bole.OperacionRealizada());
					       												pw.println("Estado de mi cuenta. . . . . . . . . . . . . . . . . . : " + bole.Mostrarmonto());
					       												pw.println("Estado  de mi operacion  . . . . . . . . . . . . : " + bole.MostrarEstado());
					       												pw.println("Mi anterior monto  . . . . . . . . . . . . . . . . . . . . : " + (arrmonto.get(i) + trans_monto_tar));
					       												pw.println("Mi monto actual . . . . . . . . . . . . . . . . . . . . : " + arrmonto.get(i));
					       												pw.println("Se adiciono a la cuenta a transferir1   . . . : "+ trans_monto_tar );
					       												pw.println("Nombre de la cuenta del receptor . . . . . . : " + arrnombre.get(x));
					       												
					       												System.out.println("Su boleta fue creada correctamente . . .");
					       											}catch(Exception ex1 ) {
					       												ex1.printStackTrace();
					       										
					       											} finally {
					       												//Cierre del archivo
					       												try {
					       													if ( archivo != null) archivo.close();
					       												
					       												}catch (Exception ex2) {
					       													ex2.printStackTrace();
					       												}
					       											}
			      												 break;
			      												  
			      					    					 }
					
								    				 } 
															  //reinicio de lectura
								    				           sc.nextLine();
															  System.out.print("¿Desea realizar otra operación?[S/N]: ");
															   repe = sc.nextLine();
															   repe = repe.toUpperCase();
															   if ( repe.equals("S")) {
																   System.out.println("Elección de operación: \nRetiro[1]"
																	   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
													    		 System.out.print("Ingrese elección: ");
													    		 elec = sc.nextInt();
															   }
													    		 break;
												
								    					 }
								    			 
										   case 4:
											   pre = "N";
									    		
											   break;
								    			 
								    			 default:
								    				 //Retornar al menu principal
								    				 System.out.print("¿Desea realizar otra operación?: ");
													   repe = sc.nextLine();
													   repe = repe.toUpperCase();
													   if ( repe.equals("S")) {
														   System.out.println("Elección de operación: \nRetiro[1]"
															   		+ "\nDeposito a cuenta propia[2] \nTransferencia[3]");
											    		 System.out.print("Ingrese elección: ");
											    		 elec = sc.nextInt();
													   }
													   pre = "N";
											    		
								    				 break;
										   }
										   
										   }	   
				    				   }else if ( arrtarjetas.contains(tarjetas) == false || arrcontras.contains(clave_tar) == false|| (arrtarjetas.contains(tarjetas) == false && arrcontras.contains(clave_tar) == false)  ) {
				    					   System.out.println("Error coloque nuevamente ,");
				    					   System.out.print("Ingrese su tarjeta: ");
				    	    			   tarjetas = sc.nextInt();
				    	    			   System.out.print("Ingrese su clave: ");
				    	    			   clave_tar = sc.nextInt();
				    
				    	    			   //Reinicio de lectura
				    	    			   sc.nextLine();
				    	    			   
				    				   }
				    				   
				    				   
				    				   }
				    			   pre = "N";
				    			   break;	   
				    			   }
				    				   
				    		 //Registro de cuenta         
				    		 case 2:
				    			 //Creamos la instancia ram para crear el objero Ramdon
				    			 Random ram = new Random();
				    			  System.out.println("\nBienvenido al sistema integrado de registros");
				    			  
				    			  System.out.print("¿Desea continuar? [Si{1} / No{2}]: ");
				    			  int conti = sc.nextInt();
				    			   //Uso del while para eliminar errores
					    		 while ( conti >=3 || conti<=0 ) {
					    		 System.out.println("Ingrese solo los parametros");
					    		 System.out.print("¿Desea continuar? [Si{1} / No{2}]: ");
					   		    	conti = sc.nextInt();
					    			 }
					    		 if ( conti == 1) {
					    			 
					    			  int com_todo = 2;
					    			//Reinicio de lectura(Buffer)
						    			 sc.nextLine();
						    			 
					    			  while ( com_todo != 1 ) {
					    				  System.out.println("\n<<<<<Registro de cuenta>>>>>");
							    			 //Reinicio de lectura(Buffer)
							    			 sc.nextLine();
							    			 System.out.print("\nIngrese su nombre: ");
							    			  String re_name= sc.nextLine();
							    			//Reinicio de lectura(Buffer)
								    		sc.nextLine();
							    			  System.out.print("\n¿Su  nombre es correcto? [SI{1}/No{2}]: ");
							    			  int com_re_name = sc.nextInt();
							    			  while (com_re_name!=1 ) {
							    				//Reinicio de lectura(Buffer)
									    			 sc.nextLine();
							    				  System.out.print("\nIngrese su nombre: ");
								    			  re_name= sc.nextLine();
								    			  sc.nextLine();
								    			  
								    			  System.out.print("\n¿Su  nombre es correcto? [SI{1}/No{2}]: ");
								    			  com_re_name = sc.nextInt();
							    			  }
							    			//Reinicio de lectura(Buffer)
								    			 sc.nextLine();
							    			 System.out.print("\nIngrese su apellido: ");
							    			  String re_ape= sc.nextLine();
							    			//Reinicio de lectura(Buffer)
								    			sc.nextLine();
							    			  System.out.print("\n¿Su apellido es correcto? [SI{1}/No{2}]: ");
							    			  int com_re_ape = sc.nextInt();
							    			  while (com_re_ape!=1 ) {
							    				//Reinicio de lectura(Buffer)
									    			 sc.nextLine();
							    				  System.out.print("\nIngrese su apellido: ");
							    				  com_re_ape = sc.nextInt();
							    				  sc.nextLine();
							    				  System.out.print("\n¿Su  apellido es correcto? [SI{1}/No{2}]: ");
								    			   com_re_ape = sc.nextInt();
							    			  }
							    			  sc.nextLine();
							    			  System.out.print("\nIngrese su DNI: ");
							    			  int re_dni= sc.nextInt();
							    			//Reinicio de lectura(Buffer)
								    			 sc.nextLine();
								    			while ( re_dni <= 9999999 || re_dni >=100000000 ) {
								    				System.out.println("\nDNI incorrecto \nDebe llevar 8 digitos  ");
								    				System.out.print("\nIngrese su DNI: ");
									    			 re_dni= sc.nextInt();
									    			//Reinicio de lectura(Buffer)
									    			 sc.nextLine();
								    				
								    			}
								    			sc.nextLine();
							    			  System.out.print("\n¿Los datos  del DNI son correctos? [SI{1}/No{2}]: ");
							    			  int com_re_dni = sc.nextInt();
							    			//Reinicio de lectura(Buffer)
								    			 sc.nextLine();
							    			  while (com_re_dni!=1   ) {
							    				//Reinicio de lectura(Buffer)
									    			 sc.nextLine();
							    				  System.out.print("\nIngrese su DNI: ");
								    			  re_dni= sc.nextInt();
								    			//Reinicio de lectura(Buffer)
									    			 sc.nextLine();
									    			while ( re_dni <= 9999999 || re_dni >=100000000 ) {
									    				System.out.println("\nDNI incorrecto \nDebe llevar 8 digitos  ");
									    				System.out.print("\nIngrese su DNI: ");
										    			 re_dni= sc.nextInt();
										    			//Reinicio de lectura(Buffer)
										    			 sc.nextLine();
										    			 sc.nextLine();
										    			  System.out.print("\n¿Los datos  del DNI son correctos? [SI{1}/No{2}]: ");
										    			   com_re_dni = sc.nextInt();
										    			//Reinicio de lectura(Buffer)
											    			 sc.nextLine();
									    			}
								
							    			  }
							    			
							    			//Reinicio de lectura(Buffer)
								    			 sc.nextLine();
					    		
					    		 
					    			  System.out.println("\nAnalizando datos . . . "); 
					    			  //Creando la tarjeta
					    			  //desde 1000000 hasta 9999999  
					    			  int re_tarjeta =ram.nextInt(9999999 - 1000000 + 1) + 1000000;
					    			  //Para que la tarjeta no se repita
					    			  while( arrtarjetas.contains(re_tarjeta) == true) {
					    				  re_tarjeta =ram.nextInt(9999999 - 999999 + 1) + 999999;
					    			  }
					    			  
					    			  
					    			//Creando la contraseña
					    			  //desde 10000 hasta 99999 
					    			  int re_contraseña =ram.nextInt(99999 - 10000 + 1) + 10000;
					    			  //Para que la tarjeta no se repita
					    			  while( arrcontras.contains(re_contraseña) == true) {
					    				  re_contraseña =ram.nextInt(99999 - 10000 + 1) + 10000;
					    			  }
					    			  
					    			  //Mostrando los datos creados
					    			  System.out.println("\nSu tarjeta es : "+ re_tarjeta);
					    			  
					    			  System.out.println("\nSu contraseña es : "+ re_contraseña);
					    			  sc.nextLine();
					    			  //Pregunta si desea cambiar la contraseña
					    			  System.out.print("¿Desea cambiar de contraseña? [Si{1}/No{2}]: ");
					    			  int cam_contra = sc.nextInt();
					    			  //Limitamos las opciones de 1 a 2
					    			  while ( cam_contra >= 3 || cam_contra <=0) {
					    				  System.out.println("Eliga la opcion 1 o 2");
					    				  System.out.print("¿Desea cambiar de contraseña? [Si{1}/No{2}]: ");
						    			  cam_contra = sc.nextInt();
					    			  }
					    			  sc.nextLine();
					    			  //Se cumple en caso de que el usuario desee cambiar la contraseña 
					    			  if ( cam_contra == 1) {
					    				  System.out.println("\nColoque la contraseña elegida por usted\n(Tiene que contener 5 digitos)");
					    				  System.out.print("\nIngrese contraseña: ");
						    			  int re_new_contra = sc.nextInt();
						    			  sc.nextLine();
						    			  //Limitamos los digitos a 5 solamente
						    			  while ( (re_new_contra >= 100000 || re_new_contra <=9999) || (arrcontras.contains(re_new_contra)) == true ) {
						    				  System.out.println("Contraseña erronea");
						    				  System.out.println("\nColoque la contraseña elegida por usted\n(Tiene que contener 5 digitos)");
						    				  System.out.print("\nIngrese contraseña: ");
							    			  re_new_contra = sc.nextInt();
							    			  sc.nextLine();
							    			  
						    			  }
						    			  //Cambio de datos de la contraseña
						    			  re_contraseña = re_new_contra;

					    			  }
					    			  
					    			//Reinicio de lectura(Buffer)
						    			 sc.nextLine();
					    			  System.out.print("¿Desea continuar con el registro? [SI{1}/No{2}]: ");
					    			  int confi_re = sc.nextInt();
					    			//Reinicio de lectura(Buffer)
						    			 sc.nextLine();
						    			 while ( confi_re >= 3 && confi_re <=0) {
						    				  System.out.println("Eliga la opcion 1 o 2");
						    				  System.out.print("¿Desea continuar con el registro? [SI{1}/No{2}]: ");
							    			 confi_re = sc.nextInt();
							    			//Reinicio de lectura(Buffer)
								    			 sc.nextLine();
						    			  }
						    		//Preguntamos al usuario si esta seguro de continuar con el registro	
						    		switch ( confi_re) {
						    		case 1:
						    			j = j + 1;
						    			//Reinicio de lectura(Buffer)
						    			sc.nextLine();
						    			arrnombre.add(arrnombre.size(), re_name + " " + re_ape );
						    			arrdni.add(arrdni.size(), re_dni);
						    			arrtarjetas.add(arrtarjetas.size(), re_tarjeta);
						    			arrcontras.add(arrcontras.size(), re_contraseña);
						    			arrmonto.add(arrmonto.size(), 0f);
						    			
						    			
						    			
						    			System.out.println("\n-------------------------------------");
						    			System.out.println("Registro completado");
						    			System.out.println("-------------------------------------");
						    			System.out.println("Nombre de la cuenta : " + arrnombre.get(arrnombre.size() - 1));
						    			System.out.println("Número de DNI : " + arrdni.get(arrdni.size() - 1));
						    			System.out.println("Número de tarjeta : " + arrtarjetas.get(arrtarjetas.size() - 1));
						    			System.out.println("Contraseña   : " + arrcontras.get(arrcontras.size() - 1));
						    			System.out.println("Monto : " + arrmonto.get(arrmonto.size() - 1));
						    			
						    			//Reinicio de lectura(Buffer)
						    			 sc.nextLine();
						    			System.out.print("\n¿Desea abonar dinero a su cuenta? [Si{1}/No{2}]: ");
						    			int abo = sc.nextInt();
						    			
						    			while ( abo >= 3 && abo <=0) {
						    				  System.out.println("Eliga la opcion 1 o 2");
						    				  System.out.print("¿Desea abonar dinero a su cuenta? [Si{1}/No{2}]: ");
								    		   abo = sc.nextInt();
							    			//Reinicio de lectura(Buffer)
								    			 sc.nextLine();
						    			  }
						    		sc.nextLine();
						    	if ( abo == 1) {
						    		int re_pre = 1;
						    		while ( re_pre ==1) {
						    		 //Este caso se cumple si el usuario escoje depositar en su cuenta
									   System.out.print("\nCuanto desea depositar a la cuenta: ");
									   float  adic = sc.nextFloat();
									   float suma = 0;
									        //Definimos un if para comprobar que la adicion no sea 0
									        //Y que no sea multiplo de 2 y de 5 para no poder ingresar monedas
		                                 if ( adic != 0 && adic >= 10f && adic % 2== 0 && adic % 5 == 0) {
										   //Operacion
										   suma = arrmonto.get(arrnombre.size()-1) + adic;
										   arrmonto.remove(arrnombre.size()-1);
										   arrmonto.add(arrnombre.size()-1, suma);
										   System.out.println("\n--------------------------");
										   System.out.println("Operacion exitosa");
										   System.out.println("\n--------------------------");
										   System.out.println("Se deposito: " + adic);
										   System.out.println("Monto actual: " + arrmonto.get(arrnombre.size() - 1));
										   
									   }
		                                 //Se cumple en caso el usuario intente depositar 0 
									   else if (adic == 0 ) {
										   System.out.println("\n--------------------------");
										   System.out.println("Saldo sin operacion");
										   System.out.println("\n--------------------------");
										   System.out.println("Se deposito: " + 0);
										   System.out.println("Monto actual: " + arrmonto.get(arrnombre.size() - 1));
										   
										   
									   }
									   else {
										   //En caso intente depositar un numero imposible para el cajero
										   System.out.println("\n--------------------------");
										   System.out.println("No se puede depositar monedas");
										   System.out.println("\n--------------------------");
										   System.out.println("Realice nuevamente la operacion");
										   System.out.println("Se deposito: " + 0);
										   System.out.println("Monto actual: " + arrmonto.get(arrnombre.size() - 1));
										     
									   }
		                                 //Preguntamos al Usuario si desea abonar dinero a su cuenta nueva
		                                 System.out.println("¿Desea abonar más? [Si{1}/No{2}");
		                                 re_pre = sc.nextInt();
		                                 while ( re_pre>= 3 || re_pre<=0) {
		                                	 System.out.println("\nEliga la opcion 1 o 2");
		                                	 System.out.println("¿Desea abonar más? [Si{1}/No{2}");
		                                     re_pre = sc.nextInt();
		                                 }
		                                
		                                 if ( re_pre == 2) {
		                                	 com_todo = 1;
		                                	 
		                                 }  
						    		}      
		                                 
		                               System.out.println("Cuenta agregada exitosamente");
									   //Reinicio de lectura
									   sc.nextLine();
									   pre = "N";
									   
								        break;
						    	}
						    		case 2:
						    			pre = "N";
						    			break;
						           default:
						        	   pre = "N";
						        	   break;
						    			
						    		}
					    			  
					    			  
						    		pre = "N";
						    		break;	  
					    			  }
					    			  
					    	  pre = "N";
					    		break;	  
					    		 }  
				    			 
				    				   
				    case 3:
					    		 pre = "S";  
					    		 break;
				    			   }
				    			   
				    	          
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    			   
				    	 
			
				    		   }
				           System.out.println("\n<<<<<GRACIAS POR SU PREFERENCIA>>>>>");
				           System.out.println("\nTU CAJERO FELIZ");
					   System.out.println("\nTu cajero  en linea 24/7");
					   System.out.println("\nGRUPO 05");
					   
						
					   
					   
					   
					   
				     }
				}


