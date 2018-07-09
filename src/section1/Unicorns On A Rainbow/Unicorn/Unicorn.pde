PImage rainbow;
   PImage unicorn;
void setup(){
rainbow=loadImage("123.png");
size(800,600);
rainbow.resize(width,height);
unicorn = loadImage ("12.png");

}

void draw(){
background(rainbow);

 image(unicorn, mouseX, mouseY);
}