import java.io.* ;
public class TwoBits {
Bit bit1;
Bit bit2;
public TwoBits(Bit first_bit, Bit second_bit) {
this.bit1 = first_bit;
this.bit2 = second_bit;
}
public Bit  get_state1(){
return bit1;
}
public Bit get_state2(){
return bit2;
}
public void setStates(Bit first, Bit second){
this.bit1=first;
this.bit2=second;
}
public void dump(File file){

try{

out = new ObjectOutputStream(new FileOutputStream(file,true));
out.writeObject(this);
out.flush();
out.close();

}
catch (FileNotFoundException ex) {

System.err.println("Sorry, this file doesn't exist");
ex.printStackTrace();

}
catch (Exception ex) {
System.err.println("An error occured. Please try again later");
}

}

}

