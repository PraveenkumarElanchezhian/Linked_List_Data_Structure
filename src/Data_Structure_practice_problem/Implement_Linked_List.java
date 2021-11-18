package Data_Structure_practice_problem;

import java.util.LinkedList;

public class Implement_Linked_List {
	public static void main(String[] args) {
		Single_Linked_List list = new Single_Linked_List();
		list.append(56);
		list.append(30);
		list.append(70);
		list.popLastElement();
		list.display();
	}

}
