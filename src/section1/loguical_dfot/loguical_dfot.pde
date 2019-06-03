int x = 50;
int size = 50;
void setup(){
  size(800,800);
}
void draw(){
  if(mousePressed){
  fill(random(255), random(255), random(255));
  x = x+5;
  size = size + 10;
  }
  else{
    fill(0,255,0);
  }
  ellipse(mouseX,mouseY,size,size);
  
}
