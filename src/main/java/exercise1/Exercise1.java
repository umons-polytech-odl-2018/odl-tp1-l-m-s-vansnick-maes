/*package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return null;
	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.

		String nom1="salut";
		int age1= 15;
		Person person1=new Person(nom1,age1);


		//system.out.println("il s'appelle"+person1.getAge()+" et il a "+person1.getName()+" ans");

	}
}*/

package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		return new Person (name, age );
	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
		String name=args[0]; 						// la fonction a une série de paramètres et name est le premier. La fonction test se charge de passer le nom en premier paramètre.
		int age = Integer.parseInt(args[1]);		// le second argument que la fonction test va passer est le nom mais tous les arguments sont des strings donc on doit les convertir en int -> Integer.parseInt
		Person person = createPerson(name, age);	// Person ~ type (genre int ou float) et person ~ nom de la variable
		System.out.println("Personne: "+ person.getName() + ',' + person.getAge());		// comme cout en c++

	}
}
