void setup() {
  size(500, 500);
}
void draw() {
  for (int i= 10; i>=1; i--) {
    ellipse(250, 250, i*10, i*10);

    if (i %2==0) {
      fill(255, 0, 0);
    } else {
      fill(128, 128, 128);
    }
  }
}