// generic arrays

public class GenericArrays {
	public <T> void printArray(T[] array) {
		for(T item:array) { 
		System.out.println(item);
		}
	}
}

	public static void main(String[] args){
		int[] intArray = {1,2,3};
		String[] stringArray = {"Hello","World"};
		
		printArray(intArray);
		printArray(stringArray);
	}
}