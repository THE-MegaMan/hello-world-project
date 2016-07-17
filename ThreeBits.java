import java.io.* ;
public class ThreeBits {
Bit bit;
TwoBits twobit;
public ThreeBits(Bit first_bit, TwoBits double_bit) {
this.bit = first_bit;
this.twobit = double_bit;
}
public Bit  get_state1(){
return bit;
}
public TwoBits get_state2(){
return twobit;
}
public void setStates(Bit first, TwoBits second){
this.bit=first;
this.twobit=second;
}
public void dump(File file){

try{

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file,true));
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

