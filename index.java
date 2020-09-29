void setup() {
	size(300, 300);
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);

  background(200);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill(mouseX,mouseY,mouseX);
  rect(mouseX, mouseY,20,100);
  // Draw Zoog's head
  stroke(0);
  fill(mouseX,mouseY,mouseX);
  ellipse(mouseX, mouseY - 30,60,60);
  // Draw Zoog's eyes
  fill(255,0,0);
 ellipse(mouseX -12, mouseY - 30,16,32);
  ellipse(mouseX +12, mouseY - 30,16,32);
  // Draw Zoog's legs
  stroke(0);
  line(mouseX - 10,mouseY + 50,mouseX - 10 ,mouseY + 75);
  line(mouseX + 10,mouseY + 50,mouseX + 10 ,mouseY + 75);
}