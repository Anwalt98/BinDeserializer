import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;

public class EEP_ParamStructDeserializer {

    public static EEP_ParamStruct deserialize(Path path) throws IOException {
        EEP_ParamStruct eep_paramStruct = new EEP_ParamStruct();
        byte[] bytes = Files.readAllBytes(path);
        ByteBuffer wrappedBuffer = ByteBuffer.wrap(bytes);
        reverse(bytes);

        eep_paramStruct._iTime_Stamp = uint_32ToLong(new byte[]{bytes[1], bytes[2],bytes[3],bytes[4]});
        eep_paramStruct._eTime_Stamp = uint_32ToLong(new byte[]{bytes[5], bytes[6],bytes[7],bytes[8]});
        eep_paramStruct._Doze_Level2_10ls = wrappedBuffer.getFloat(9);
        eep_paramStruct._KBD_List = new int[]{uint_8ToInt(bytes[13]),
                uint_8ToInt(bytes[14]),
                uint_8ToInt(bytes[15]),
                uint_8ToInt(bytes[16])};
        eep_paramStruct._LCD_ValuesTime = uint_16ToInt(new byte[]{bytes[17], bytes[18]});
        eep_paramStruct._LCD_Filter = uint_16ToInt(new byte[]{bytes[19],bytes[20]});
        eep_paramStruct._LCD_ValuesList = uint_16ToInt(new byte[]{bytes[21],bytes[22]});
        eep_paramStruct._MC_Q5 = wrappedBuffer.getFloat(23);
        eep_paramStruct._G_SerialNum = uint_16ToInt(new byte[]{bytes[27],bytes[28]});
        eep_paramStruct._G_SerialNum_hi = uint_8ToInt(bytes[29]);
        eep_paramStruct._NetWork_Address = uint_8ToInt(bytes[30]);
        eep_paramStruct._MO_CmpLevel2 = wrappedBuffer.getFloat(31);
        eep_paramStruct._MO_CmpLevel1 = wrappedBuffer.getFloat(35);
        eep_paramStruct._Doze_Level2_10ls  = wrappedBuffer.getFloat(39);
        eep_paramStruct._PWM_RangeIDAC_OutHi_ = uint_16ToInt(new byte[]{bytes[43],bytes[44]});
        eep_paramStruct._PWM_RangeIDAC_OutLo_ = uint_16ToInt(new byte[]{bytes[45],bytes[46]});
        eep_paramStruct._PWM_RangeIDAC_InHi_ = wrappedBuffer.getFloat(47);
        eep_paramStruct._PWM_RangeIDAC_InLo_ = wrappedBuffer.getFloat(51);
        eep_paramStruct._PWM_RangeFI_OutHi_ = wrappedBuffer.getFloat(55);
        eep_paramStruct._PWM_RangeFI_OutLo_ = wrappedBuffer.getFloat(59);
        eep_paramStruct._PWM_RangeFI_InHi_ = wrappedBuffer.getFloat(63);
        eep_paramStruct._PWM_RangeFI_InLo_ = wrappedBuffer.getFloat(67);
        eep_paramStruct._IFM_PulseWeight = wrappedBuffer.getFloat(71);
        eep_paramStruct._IFM_Lowest_Value = wrappedBuffer.getFloat(75);
        eep_paramStruct._IFM_Mode  = uint_16ToInt(new byte[]{bytes[79],bytes[80]});
        eep_paramStruct._ITG_OutputWeight = wrappedBuffer.getShort(81);
        eep_paramStruct._MI_Clock_Divisor = uint_16ToInt(new byte[]{bytes[83],bytes[84]});
        eep_paramStruct._MC_InFilt_Kp = wrappedBuffer.getShort(85);
        eep_paramStruct._MC_DU = uint_16ToInt(new byte[]{bytes[87],bytes[88]});
        eep_paramStruct._MC_U5 = wrappedBuffer.getFloat(89);
        eep_paramStruct._MC_Q4 = wrappedBuffer.getFloat(93);
        eep_paramStruct._MC_U4 = wrappedBuffer.getFloat(97);
        eep_paramStruct._MC_Q3 = wrappedBuffer.getFloat(101);
        eep_paramStruct._MC_U3 = wrappedBuffer.getFloat(105);
        eep_paramStruct._MC_Q2 = wrappedBuffer.getFloat(109);
        eep_paramStruct._MC_U2 = wrappedBuffer.getFloat(113);
        eep_paramStruct._MC_Q1 = wrappedBuffer.getFloat(117);
        eep_paramStruct._MC_U1 = wrappedBuffer.getFloat(121);
        eep_paramStruct._EEPROM_Flags = uint_16ToInt(new byte[]{bytes[126],bytes[0]});

        return eep_paramStruct;
    }



    //методами ниже переводим uint_8, uint_16 из structa в Java-int,  uint_32 в Long
    //т.к. в Java нет unsigned типов
    private static int uint_8ToInt(byte byteToConvert){
        return byteToConvert & 0xFF;
    }

    private static int uint_16ToInt(byte[] bytes) {
        ByteBuffer bb = ByteBuffer.wrap(bytes);
//        bb = bb.order(ByteOrder.LITTLE_ENDIAN);
        int n = 0;
        while (bb.hasRemaining()) {
            short s = bb.getShort();
            n = 0xFFFF & s;
        }
        return n;
    }

    private static long uint_32ToLong(byte[] bytes){
        ByteBuffer buffer = ByteBuffer.allocate(4).put(bytes);
        buffer.position(0);
        return buffer.getInt() & 0xFFFFFFFFL;
    }

    public static void reverse(byte[] array) {

        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        byte tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

}
