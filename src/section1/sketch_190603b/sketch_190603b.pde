PImage rainbow;
PImage unicorn;
void setup(){
rainbow = loadImage("Rainbow.jpg");
size(800,600);
rainbow.resize(width,height);
unicorn = loadImage ("Unicorn-PNG-Clipart.png");
unicorn.resize(200,200);
}
void draw(){
  background(rainbow);
  image(unicorn,mouseX, mouseY);
}
