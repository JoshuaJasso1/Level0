int x = 400; 
int y = 600; 

void setup() {

  background(0, 0, 40); 
  size(800, 800);
}

void draw() {
  for (int i=0; i<20; i++) {
    float starX = random(1000);
    float starY = random(1000);
    ellipse(starX, starY, 10, 10);
  }
  y=y-1;
  fill(random(255), 0, 0);
  ellipse(x, y + 130, 90, 90);
  fill(248, 128, 0);
  ellipse(x, y + 115, 70, 70);
  fill(255, 153, 0);
  ellipse(x, y + 95, 35, 35);
  fill(100, 100, 100);
  triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
  fill(255, 255, 255);
  ellipse(80, 80, 130, 130);
}