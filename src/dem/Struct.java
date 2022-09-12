package dem;

import java.util.LinkedList;

public class Struct {

	String link;

	LinkedList<Struct> children = new LinkedList<>();
	LinkedList<Struct> parents = new LinkedList<>();

	public Struct(String link, LinkedList<Struct> children) {
		this.link = link;
		this.children = children;
	}

	public Struct(String link) {
	}

	public Struct() {
	}

	public Struct(String link, Struct child) {
		this.link = link;
		children.add(child);
	}

	public Struct(String link, Struct child, Struct parent) {
		this.link = link;
		children.add(child);
		parents.add(parent);
	}

	public Struct(String link, LinkedList<Struct> children, LinkedList<Struct> parents) {
		this.link = link;
		this.children = children;
		this.parents = parents;
	}

}
