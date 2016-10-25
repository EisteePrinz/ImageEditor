import java.awt.Graphics;

public class ImageEditorPanel extends JPanel{
	private BufferedImage image;
	
	public void setImage(BufferedImage img){
		image = img;
		repaint();
	}
	@Override
	public void paintComponent(Graphics g){
		if (image != null){
			g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		}
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(400,300);
	}
}