public class StorageToInt{

int bitToInt(Bit b){
if(b.get_state()==true){
return 1;
}
else
{
return 0;
}
}
int twoBitsToInt(TwoBits tb) {
int b1=(tb.get_state1().get_state()) ? 1 : 0;
int b2=(tb.get_state2().get_state()) ? 2 : 0;
return b1+b2
}
int threeBitsToInt(ThreeBits tb) {
int twb=twoBitsToInt(tb.get_state2());
int b=bitToInt(tb.get_state1());
return twb+b;
}
