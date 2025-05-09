class Box{
int width,height,depth;
Box(int w, int h, int d){
width = w;
height = h;
depth = d;
}
int volume(){
return width*height*depth;
}
public static void main(String[] args){
Box b = new Box(2,3,4);
System.out.println("volume:"+b.volume());
}
}