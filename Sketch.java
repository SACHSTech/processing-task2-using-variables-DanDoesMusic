import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  fill(255, 128, 0);
  ellipse(width/4, height/4,
        width/2, height/2);
  ellipse((float)(width * 0.75), height/4,
        width/2, height/2);
ellipse(width/4, (float)(height*0.75),
        width/2, height/2);
ellipse((float)(width*0.75), (float)(height*0.75),
        width/2, height/2);

fill(255, 0, 0);
ellipse(width/2, height/2,
        width/2, height/2);
  }
  
  // define other methods down here.
}