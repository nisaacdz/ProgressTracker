package dem;

import java.util.LinkedList;

public class Operations {

	public static void push(Status s) {
		Struct temp = Status.generate(s);

		temp.parents.add(getMainStruct());
		getMainStruct().children.add(temp);
		changeMainStruct(temp);
	}

	public static Struct getMainStruct() {
		return null;
	}

	public static void changeMainStruct(Struct s) {

	}

	public static void undo() {

	}

	public static void redo() {

	}

	public static int getSize() {
		return 0;
	}

	public static int getLength() {
		return 0;
	}

	public static void brachWithMain() {
		
	}

	public static void branch() {
		
	}

	public static void join() {
		
	}

	public static String generateLink() {
		return null;
	}

	public static LinkedList<Struct> shiftBack() {
		return null;
	}

	public static LinkedList<Struct> shiftForward() {
		return null;
	}

}
