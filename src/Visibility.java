public abstract class Visibility {
	private boolean inBackground = false;
	
	public Visibility() {
		
	}
	/**Changes the visibility of the Shape
	 * sets inBackground to true, if in background. Else set inBackground to false
	 * 
	 * 
	 */
	public void changeVisibility() {
		if(inBackground ==false) {
			this.inBackground = true;
		}else{
			this.inBackground = false;
		}
	}
	/**Shows the visibility of an Object
	 * 
	 * @return inBackground
	 */
	public boolean isVisible() {
		return inBackground;
	}
}
