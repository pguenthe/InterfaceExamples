import java.util.ArrayList;

public class PrinterQueue {
	public static void main(String[] args) {
		ArrayList <Printable> queue = new ArrayList<Printable>();
		SlideShow s1 = new SlideShow();
		queue.add(s1); //add a slideshow
		
		TermPaper t1 = new TermPaper();
		queue.add(t1);
		
		//this is all you can ask things in the queue
		//to do, because all we know about them here
		// is that they're Printable
		System.out.println(queue.get(0).MAX_PAGES);
		queue.get(0).print();

		System.out.println(queue.get(1).MAX_PAGES);
		queue.get(1).print();
		
		//what you can't do: Class-specific stuff
		//queue.get(0).addSlide();//Printable doesn't have that method
		//could cast it to get that
//		if (queue.get(0) instanceof SlideShow)
//			((SlideShow)queue.get(0)).addSlide();
	}
}
