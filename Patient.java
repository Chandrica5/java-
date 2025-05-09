class Patient {
String patientname;
double weight,height;
Patient(String name, double w, double h){
patientname=name;
weight = w;
height = h;
}
double computeBMI(){
return weight/(height*height);
}
public static void main(String[] args){
Patient p = new Patient("Diya", 45,60);
System.out.println("patient is :"+p.patientname+" and their BMI is:"+ p.computeBMI());
}
}