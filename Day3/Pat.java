class Pat{
       String name;
       double  weight,height;
       patient(double w,double h){
               weight=w;
               height=h;
       }
       double BMI() {
               
              return (weight/(height*height))*703;
        }
}
public class Patirnts{
        public static void main(String[] args) {
             
               Patient p=new patient(75,156);
                
               System.out.println(BMI is:"+p.BMI());
         }
} 