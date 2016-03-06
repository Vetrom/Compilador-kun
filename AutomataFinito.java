/*PROYECTO FINAL 1: AUTOMATA DE ESTADO FINITO*/

/*NOTAS*/
//Agregar estado para reconocer "=="
//Agregar estados para reconocer enteros con o sin signo respectivamente (igual con los flotantes y exp)

import java.util.*;
 
public class AutomataFinito {
    
    public static void main(String[] args) {
    	
    	int Ent, Est, i, opc;
    	char sim;
    	boolean bandera = false;
    	String cadena, cadena2;
    	
    	Scanner leer = new Scanner(System.in);
    	Automata x = new Automata();
    	
    	do{
	    	System.out.println("AUTOMATA DE ESTADO FINITO\n\nINGRESA LA CADENA A ANALIZAR:");
	    	leer.reset();
	    	cadena = leer.next();
	    	
	    	if(x.Palabra_reservada(cadena)){
	    		System.out.println("\nCADENA CORRECTA!\n");
	    		System.out.println("La cadena es: Palabra reservada\n");
	    	}
	    	else{
		    	cadena2 = cadena + "#";
		    	System.out.println(cadena2);
		    	i = -1;
		    	Est = 0;
		    	do{
					i++;
		    		switch(cadena2.charAt(i)){
		    			
		    			case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'F':
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'f':
							Ent = 0;
							break;
							
						case 'G':
						case 'I':
						case 'J':
						case 'K':
						case 'L':
						case 'M':
						case 'N':
						case 'O':
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
						case 'T':
						case 'U':
						case 'V':
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
						case 'g':
						case 'i':
						case 'j':
						case 'k':
						case 'l':
						case 'm':
						case 'n':
						case 'o':
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v':
						case 'w':
						case 'x':
						case 'y':
						case 'z':
							Ent = 1;
							break;
						
						case 'E':
						case 'e':
							Ent = 2;
							break;
						
						case 'H':	
						case 'h':
							Ent = 3;
							break;
						
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
							Ent = 4;
							break;
							
						case '6':
						case '7':
						case '8':
						case '9':
							Ent = 4;
							break;
						
						case '_':
							Ent = 5;
							break;
							
						case '.':
							Ent = 6;
							break;
							
						case '+':
							Ent = 7;
							break;
							
						case '-':
							Ent = 8;
							break;
						
						case '*':
						case '/':
						case '%':
							Ent = 9;
							break;
							
						case '=':
							Ent = 10;
							break;
							
						case '>':
							Ent = 11;
							break;
							
						case '<':
							Ent = 12;
							break;
							
						case '!':
							Ent = 13;
							break;
								
						case '&':
							Ent = 14;
							break;
						
						case '|':
							Ent = 15;
							break;
							
						case '#':
							Ent = 16;
							break;
						
						default:
		    				Ent = 123;
		    				break;
		    		}
		    		
		    		if(Ent == 123){
		    			System.out.println("\nCARACTER INVÁLIDO EN LA POSICIÓN: " + (i+1));
		    			break;
		    		}
		    		
		    		Est = x.Tabla_estado(Est, Ent);
		    		System.out.println(Est);
		    		
		    		if(Est == 101){
		    			System.out.println("\nCARACTER EN POSICION INCORRECTA UBICADO EN: " + (i+1));
		    			break;
		    		}
		    		
		    		if(Est == 222){
		    			System.out.println("\nLA CADENA ESTÁ INCOMPLETA");
		    			break;
		    		}
		    		
		    		
		    	}while(cadena2.charAt(i) != '#');
		    	
		    	if(Est != 101 && Est != 222 && Ent != 123){
		    		
		    		System.out.println("\nCADENA CORRECTA!\n");
		    		System.out.print("La cadena es: ");
		    		
		    		switch(Est){
		    			
		    			case 1:
		    			case 2:
		    			case 5:
		    				System.out.println("Operador aritmético");
		    				break;
		    				
		    			case 3:
		    				System.out.println("Incremento");
		    				break;
		    				
		    			case 4:
		    				System.out.println("Decremento");
		    				break;
		    				
		    			case 6:
		    			case 7:
		    			case 8:
		    				System.out.println("Operador relacional");
		    				break;
		    				
		    			case 9:
		    			case 12:
		    			case 13:
		    				System.out.println("Operador logico");
		    				break;
		    				
		    			case 14:
		    			case 15:
		    				System.out.println("Identificador");
		    				break;
		    				
		    			case 16:
		    				System.out.println("Entero decimal");
		    				break;
		    				
		    			case 18:
		    				System.out.println("Real decimal");
		    				break;
		    				
		    			case 20:
		    			case 26:
		    				System.out.println("Operador de asignacion");
		    				break;
		    				
		    			case 21:
		    				System.out.println("Numero hexadecimal en ensamblador");
		    				break;
		    				
		    			case 23:
		    			case 25:
		    				System.out.println("Numero en notación exponencial");
		    				break;
		    				
		    			case 27:
		    				System.out.println("Entero con signo");
		    				break;
		    				
		    			case 29:
		    				System.out.println("Real con signo");
		    				break;
		    				
		    			case 32:
		    			case 33:
		    				System.out.println("Numero en notación exponencial con ambos signos");
		    				break;
		    				
		    			case 34:
		    			case 35:
		    				System.out.println("Numero en notación exponencial con signo");
		    				break;
		    				
		    			case 36:
		    			case 37:
		    				System.out.println("Numero en notación exponencial con signo en exponente");
		    				break;
		    			
		    		}
		    		
		    	}
	    	}
	    	
	    	System.out.print("Desea ingresar otra cadena?\n1.-Si\t2.-No\n\nOpcion: ");
	    	opc = leer.nextInt();
	    	
	    	if(opc == 2)
	    		bandera = true;
	    	
    }while(!bandera);
    
    }
}
