PImage donkey;
PImage tail;
void setup(){
size(550, 406);
donkey = loadImage("donkey.jpg");
tail = loadImage("tail.jpg");

}
void draw(){
background (donkey);
image(tail, mouseX, mouseY);



}