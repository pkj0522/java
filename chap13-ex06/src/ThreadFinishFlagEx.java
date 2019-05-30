import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th; // ������ ���۷���
		
		public ThreadFinishFlagEx() {
			setTitle("ThreadFinishFlagEx ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(null);
			
			c.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					th.finish(); // RandomThread ������ ���� ���
				}
			});
			setSize(300, 200);
			setVisible(true);
			
			th = new RandomThread(c); // ������ ����
			th.start(); // ������ ���۽�Ŵ
	}

	public static void main(String[] args) {
		new ThreadFinishFlagEx();

	}

}
