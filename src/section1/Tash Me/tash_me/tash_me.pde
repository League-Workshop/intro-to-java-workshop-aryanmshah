PImage mustache;
  PImage president;
void setup () {
president = loadImage ("trump.png");
 size (800,600);
 president.resize(width, height);
 mustache = loadImage ("11.png");
 mustache.resize(300,320);
 
 background(president);
}

void draw() {
if(mousePressed)
{
  background(president);
 
 image(mustache, mouseX, mouseY);
}

}