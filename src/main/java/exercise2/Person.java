package exercise2;

class Person {

	private int age;
	private static int popSize=0;
	private static long sumAge=0;

	public Person (int age){

		this.age=age;
		popSize++;
		sumAge=sumAge+this.age;

	}


	public static int computePopulationSize(){
		return popSize;
	};



	public static float computeAveragePopulationAge(){
		return ((float)sumAge/popSize);
	};



	public static void resetPopulation(){
		sumAge=0;
		popSize = 0;
	}

}


