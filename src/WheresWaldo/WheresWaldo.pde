import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
void setup() {
  PImage waldo = loadImage("waldo.jpg");
  size(2560, 1598);
  image(waldo, 0, 0);
  doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
  woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}
void draw() {
  if (mouseX >1600 && mouseY >530 && mouseX <1625 && mouseY <620) {
    playWoohoo();
  } else {
    playDoh();
  }
}
void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}
void playDoh() {
     doh.stop();
     doh.trigger();
}