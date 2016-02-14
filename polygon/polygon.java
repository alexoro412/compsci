public class polygon{

public int numSides;
public int sideLength;

public polygon(){
	this.numSides = 3;
	this.sideLength = (int)(Math.random()*9)+1;
}

public int getSides(){return this.numSides;}

public int getPerimeter(){return this.numSides * this.sideLength;}

public boolean equals(Object o){

	if(o instanceof polygon){	
		polygon t = (polygon)(o);
		return this.numSides == (t.getSides());
	}else{
		return false;
	}
}

public String toString(){

	return super.toString() + " Sides: " + this.getSides() + " Perimeter: " + this.getPerimeter();

}

}
