public class cuadrito{
    public int inicio = 0;
    public int tamaño = 0;
    public void cuadrado(){
	int i = 0;
	int col = 1;
	while (i<=(tamaño+inicio+1)){
	    i++;
	    if (i<inicio){
		System.out.print(" ");
		continue;
	    }
	    else if (i<(tamaño+inicio)){
	    	System.out.print("#");
		continue;
	    }
	    else if(i==(tamaño+inicio)){
	    	System.out.println(" ");
		i = 0;
		break;
	    }
	}
	do{
	    i++;
	    if (col == (tamaño-1)){
		i = 0;
		col = 0;
		break;
	    }
	    else if (i<inicio){
		System.out.print(" ");
		continue;
	    }
	    else if (i == inicio){
	    	System.out.print("#");
		continue;
	    }
	    else if (i == (tamaño+inicio-1)){
	    	System.out.println("#");
		i = 0;
		col++;
		continue;
	    }
	    System.out.print(" ");
	} while (i<=(tamaño+inicio+1));
	while (i<=(tamaño+inicio+1)){
	    i++;
	    if (i<inicio){
		System.out.print(" ");
		continue;
	    }
	    else if (i<(tamaño+inicio)){
	    	System.out.print("#");
		continue;
	    }
	    else if(i==(tamaño+inicio)){
	    	System.out.println(" ");
		i = 0;
		break;
	    }
	}
	System.out.println("");
    }
}