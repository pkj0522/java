import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MyLabel extends JLabel{
	int barSize = 0; // ���� ũ��
	int maxBarSize;
	
	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponen(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))
				/maxBarSize*barSize);
		if(width==0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) { return; }
		}
		barSize++;
		repaint(); // �� �ٽñ׸���
		notify();
	}
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e)
			{ return; }
		}
		barSize--;
		repaint(); // �� �ٽ� �׸���
		notify();
	}
}
