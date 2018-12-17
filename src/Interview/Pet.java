package Interview;

public class Pet {
String name;
int age;
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public Pet(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "[name=" + name + ", age=" + age + "]";
}

}
