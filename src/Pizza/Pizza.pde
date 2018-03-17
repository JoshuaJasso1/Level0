void setup() {
  size(500, 500);
  fill(226, 191, 140);
  ellipse(250, 250, 250, 250);
  fill(215, 0, 0);
  ellipse(250, 250, 230, 230);
  fill(250, 230, 140);
  ellipse(250, 250, 215, 215);
}
void draw() {
  PImage pepperoni = loadImage("pepperoni.ppm.gif");
  pepperoni.resize(10, 10);
  image(pepperoni, 280, 250);
  image(pepperoni, 260, 250);
  image(pepperoni, 240, 250);
  image (pepperoni, 220, 250);
  image(pepperoni, 200, 250);



}