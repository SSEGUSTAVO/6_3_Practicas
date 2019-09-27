public class triangulito{
    public int inicio = 0;
    public int tamaño = 0;
    public void escaleno(){
	int i = 0;
	int col = 0;
	int cont = inicio;
	while (col<=(tamaño+1)){
	    i++;
	    if (col==tamaño){
		if (i == (tamaño+inicio)){
		    System.out.println("#");
		    break;
		}
		else if (i < inicio){
		    System.out.print(" ");
		    continue;
		}
		else {
		    System.out.print("#");
		    continue;
		}
	    }
	    else if (i<(tamaño+inicio)){
		if (i == cont){
		    System.out.println("#");
		    col++;
		    cont++;
		    i = 0;
		    continue;
		}
		else if (i<inicio){
		    System.out.print(" ");
		}
		else if (i == inicio){
		    System.out.print("#");
		}
		else if (i > inicio){
		    System.out.print(" ");
		}
	    }
	}
    }
}