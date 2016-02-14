public class SimpleString
{

	public char[] array;
	public SimpleString(){
		array = new char[0];
	}
	public SimpleString(char[] a){
		this.array = a;
	}
	public SimpleString(SimpleString str){
		this.array = str.array;
	}
	public SimpleString substring(int to){
		char[] arr = new char[this.length() - to];
		for(int i = to;i<array.length;i++){
			arr[i] = array[i];
		}
		SimpleString ret = new SimpleString(arr);
		return ret;
	}
	public SimpleString substring(int to, int from){
		char[] arr = new char[from - to];
		for(int i = to;i<from;i++){
			arr[i] = array[i];
		}
		SimpleString ret = new SimpleString(arr);
		return ret;
	}
	public char charAt(int val){
		return array[val];
	}
	public int indexOf(SimpleString myStr){
		for(int i = 0;i<this.length()-myStr.length();i++){
			if(this.substring(i,i+myStr.length()-1).array == myStr.array){
				return i;
			}
		}
		return -1;
	}
	public SimpleString concat(SimpleString str){
		char[] newArray = new char[this.length() + str.length()];
		for(int i = 0;i<this.length();i++){
			newArray[i] = this.charAt(i);
		}
		for(int i = this.length();i<newArray.length;i++){
			newArray[i] = str.charAt(i);
		}
		SimpleString s = new SimpleString(newArray);
		return s;
	}
	public String toString(){
		String s = "";
		for(int i = 0;i<array.length;i++){
			s += this.charAt(i);
		}
		return s;
	}
	public int length(){ return this.array.length;}
}
