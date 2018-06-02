void setup() {
  fill(0, 0, 0);
  size(500, 250);
}
void draw() {
  if (mouseX >140 && mouseY >110 && mouseX < 200 && mouseY < 140) {
    background(0, 0, 0);
    fill(255, 255, 255);
    ellipse(175, 125, 100, 50);
    ellipse(325, 125, 100, 50);
    fill(0, 0, 0);
    ellipse(mouseX, mouseY, 25, 25);
    ellipse(mouseX + 150, mouseY, 25, 25);
  }
}