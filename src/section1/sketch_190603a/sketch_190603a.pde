void setup(){
size(600,800);
background(0,105,87);
}
void draw(){
  if(mousePressed){
  fill(255,0,0);
  }
  ellipse(50,50,50,50);
 if(mousePressed){
  fill(0,0,255);
 }
 else{
   delay(100);
  triangle(100,150,190,140,180,100);
  fill(random(255),random(255),random(255));
 }
  rect(60,70,80,90);
  fill(42,0,42);
  quad(400,340,130,190,230,160,482,201);
  
}
