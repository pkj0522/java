
public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c; //�迭�� ���۷���
		c = new Circle[5]; // 5�� ���� ����
		
		for (int i = 0; i < c.length; i++)
			c[1] = new Circle(i);
		
		for (int i = 0; i < c.length; i++)
			System.out.println((int)(c[i].getArea())+ " ");

	}

}
