int x = 563;
int y = 421;
PImage catPic;
void setup(){
 size(1000,1000);
  catPic = loadImage("cat.jpg");
                catPic.resize(1000,1000);
background(catPic);


}

void draw()


{
        if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(255,0,0);
ellipse (x,y, 100,100);
ellipse (x+200,y, 100,100);
x+=10;
y+=10;
}