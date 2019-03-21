
public class Circle {
	int radius; // 반지름
	String name; // 원의 이름

	public Circle() {

	}
	
	public double getArea() {
		return 3.14*radius*radius;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 5;
		pizza.name="책을피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적" + area);
		
		Circle dount = new Circle();
		dount.radius = 3;
		dount.name = "머리";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적"+ area);

	}

}
