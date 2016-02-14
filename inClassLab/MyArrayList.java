public class MyArrayList{

/* constructs an array list with a DEFAULT_CAPACITY */
private int size;
private Object[] array;

public MyArrayList(){
size = 0;
array = new Object[1];

}

/* constructs an array list with a capacity that is passed in */

public MyArrayList(int initialCapacity){
	size = 0;
	array = new Object[initialCapacity];
}

/* returns the size of the array list */

public int size(){ return size;}

/* returns the Object at position index */

public Object get(int index){
if(index >= size || index < 0) return null;
return array[index];
}

/* replaces the element at index with x returns the element formerly

at the specified position */

public Object set(int index, Object newItem){
Object old = get(index);
if(index < 0 || index >= array.length){
return null;
}
array[index] = newItem;
return old;

}

/* appends item to the end of the list, returns true */

public boolean add(Object item){

if(size <= array.length) doubleCapacity();
array[size] = item;
size++;
return true;
}

/* inserts item at position index, sliding elements at position index

and higher to the right (adds 1 to their indices) and adjusts size */

public void add(int index, Object item){
	//if(index < 0) break;
	if(index > array.length) doubleCapacity();
	if(size <= array.length) doubleCapacity();
	size++;	
	for(int i = size-1;i>index;i--){
		array[i] = array[i-1];
	}	
	array[index] = item;
	//size++;

}

/* removes elements from position index sliding elements at position

index + 1 and higher to the left (subtracts 1 from their indices) and

adjusts size */

public Object remove(int index){
	if(index < 0 || index > size) return null;
	Object output = array[index];
	for(int i = index; i<size;i++){
		array[i] = array[i+1];
	}
	size--;
	return output;

}

/* doubles the capacity of the Object array */

private void doubleCapacity(){
	Object[] newArray = new Object[array.length*2];
	for(int i = 0;i<array.length;i++){
		newArray[i] = array[i];
	}
	array = newArray;
}
}
