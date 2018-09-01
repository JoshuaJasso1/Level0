int a = 250;
int x = 250;
int y = 250;
void setup() {
  size(500, 500);
}
void draw() {
  background(255, 0, 0);
  ellipse(x, y, a, a);
  if (mousePressed) {
    int distance = getDistance(x, y, mouseX, mouseY);
    System.out.println(distance);
    int halfDistance = a/2;
    if (distance > -halfDistance && distance < halfDistance) {
      x = int (random(a));
      y = int (random(a));
    }
  }
}
void mousePressed() {
  int distance = getDistance(x, y, mouseX, mouseY);
  System.out.println(distance);
  int halfDistance =distance/2;
  if (distance > -halfDistance && distance < halfDistance) {
    x = int (random(a));
    y = int (random(a));
    ellipse(x, y, a, a);
  }
}
int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);
}