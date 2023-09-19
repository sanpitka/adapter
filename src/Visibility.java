public abstract class Visibility {
	private boolean inBackground = false;
	
	public Visibility() {
		
	}
	
	public void changeVisibility() {
		if(inBackground ==false) {
			this.inBackground = true;
		}else{
			this.inBackground = false;
		}
	}
	public boolean isVisible() {
		return inBackground;
	}
}
