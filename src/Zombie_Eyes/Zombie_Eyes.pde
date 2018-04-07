void setup() {
  size(612, 459);
  PImage face = loadImage("face.jpg");
  image(face,0 , 0);
}

void draw() {
  ellipse(243, 143, 20, 20);
  ellipse(310, 135, 15, 15);
  fill(255, 0, 0);
  fill(mouseX, mouseY, 0);


}