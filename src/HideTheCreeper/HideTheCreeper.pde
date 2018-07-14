PImage creeper;
void setup() {
  size(742, 304);
  PImage minecraft = loadImage("background.jpg");
  minecraft.resize(742, 304);
  background(minecraft);
  creeper = loadImage("creeper.jpg");
  creeper.resize(4, 6);
}
void draw () {
  image(creeper, 0, 0);
  if (mouseX == 0 && mouseY == 0 && mousePressed) {
    noFill();
    stroke(0, 255, 0);
    ellipse(mouseX, mouseY, 5, 5);
  } else if (mousePressed){
    noFill();
    stroke(255, 0, 0);
    ellipse(mouseX, mouseY, 5, 5);
  }
}