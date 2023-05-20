package listas.duplamente.encadeadas;

public class NodoDuplamente {

	    private int data;
	    private NodoDuplamente previous;
	    private NodoDuplamente next;
	    
	    public NodoDuplamente(int data) {
	        this.data = data;
	        this.previous = null;
	        this.next = null;
	    }
	    
	    public int getData() {
	        return data;
	    }
	    
	    public void setData(int data) {
	        this.data = data;
	    }
	    
	    public NodoDuplamente getPrevious() {
	        return previous;
	    }
	    
	    public void setPrevious(NodoDuplamente previous) {
	        this.previous = previous;
	    }
	    
	    public NodoDuplamente getNext() {
	        return next;
	    }
	    
	    public void setNext(NodoDuplamente next) {
	        this.next = next;
	    }
	
	}
