package com.deepdiveusingjava.udemy.arrays;

public class Arrays {

	public static void main(String[] args) {
		pros();
		System.out.println();
		cons();
		System.out.println();
		System.out.println(" If the code doesn't require the loop, it means, has an index, it's gonna be a CONSTANT TIME.");
		System.out.println(" If the code requires the loop, it means hasn't an index, it's gonna be a LINEAR TIME.");
	}


	private static void pros() {
		System.out.println("PROS: ");
		System.out.println(" You have to specify the size of the array because, in memory, it will \n"
				+" reserve a continuous block for this array, so, all the values will be \n"
				+" in this block, not scattered in different places in memory. \n"
				+" Every element in the array will occupy the same amount of space in \n"
				+" memory of the specified type, it works such for primitive types as \n"
				+" objects because the objects array will store the reference of the \n"
				+" object, not the object itself. \n"
				+" If we know the index of the array, the time to retrieve or insert or update or delete \n"
				+" the element will be the same regardless of the position of the element in the \n"
				+" array because we can just do a simple mathematical formula to find  \n"
				+" the element in the memory. \n"
				+" In others words, we will need only 3 steps to retrieve this element. \n"
				+" Formula: startAddressMemory + (indexOfArray * sizeOfTheTypeOrReferenceOfTheElement) \n"				
				+"\n Big-O: It will be the best scenario ever: O(1) - Constant time. ");	
		
		System.out.println("\nARRAY: ");

		int[] intArray = createIntArray();
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	private static void cons() {
		System.out.println("CONS: ");
		System.out.println(" If you don't know the index of the element in the array, it will be \n"
		+" more difficult to retrieve the element, because you will have to go \n"
		+" through the array until you find the element you want. \n"
		+" If we want to retrieve the element with the value equals to -22, \n"
		+" we will have to go through to the whole array as following example below. \n"
		+" If we want to delete a specific element and shift the position of all others elements, \n"
		+" we will have to loop and decrease each position of each element after that deleted element. \n"
		+"\n Big-O: It will be the worst scenario ever: O(N) - Linear time. ");
		
		System.out.println("\nINDEX: ");
		
		int[] intArray = createIntArray();

		int index = -1;
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] == -22){
				index = i;
				break;
			}
		}
		
		System.out.println("Index for '-22' value is: " + index);
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	private static int[] createIntArray() {
		int[] intArray = new int[7];

		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		return intArray;
	}

}
