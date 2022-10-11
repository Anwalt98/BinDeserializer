import java.util.Arrays;

public class EEP_ParamStruct {
    //uint_8, uint_16 приведены в Java-int,  uint_32 в Long
    //т.к. в Java нет unsigned типов
    // Calibration
    // Calibration
    int	_EEPROM_Flags;
    float       _MC_U1;
    float       _MC_Q1;
    float	    _MC_U2;
    float       _MC_Q2;
    float		_MC_U3;
    float       _MC_Q3;
    float		_MC_U4;
    float       _MC_Q4;
    float		_MC_U5;

    // Account
    int		_MC_DU;
    int _MC_InFilt_Kp;
    int		_MI_Clock_Divisor;

    // Outputs
    int _ITG_OutputWeight;
    int		_IFM_Mode;
    float		_IFM_Lowest_Value;
    float		_IFM_PulseWeight;

    float		_PWM_RangeFI_InLo_;
    float       _PWM_RangeFI_InHi_;
    float       _PWM_RangeFI_OutLo_;
    float       _PWM_RangeFI_OutHi_;
    float		_PWM_RangeIDAC_InLo_;
    float       _PWM_RangeIDAC_InHi_;
    int		    _PWM_RangeIDAC_OutLo_;
    int         _PWM_RangeIDAC_OutHi_;

    float		_Doze_Level1_10ls;

    float		_MO_CmpLevel1;
    float		_MO_CmpLevel2;

    // System
    int		_NetWork_Address;
    int _G_SerialNum_hi;
    int		    _G_SerialNum;

    // Testing (really removed, only for compatibility)
    float		_MC_Q5;
    int		_LCD_ValuesList;
    int		_LCD_Filter;
    int		_LCD_ValuesTime;
    int[]		_KBD_List;
    float		_Doze_Level2_10ls;
    long		_eTime_Stamp;
    long		_iTime_Stamp;

    public EEP_ParamStruct() {
    }

    public int get_EEPROM_Flags() {
        return _EEPROM_Flags;
    }

    public void set_EEPROM_Flags(int _EEPROM_Flags) {
        this._EEPROM_Flags    =   _EEPROM_Flags;
    }

    public float get_MC_U1() {
        return _MC_U1;
    }

    public void set_MC_U1(float _MC_U1) {
        this._MC_U1   =   _MC_U1;
    }

    public float get_MC_Q1() {
        return _MC_Q1;
    }

    public void set_MC_Q1(float _MC_Q1) {
        this._MC_Q1   =   _MC_Q1;
    }

    public float get_MC_U2() {
        return _MC_U2;
    }

    public void set_MC_U2(float _MC_U2) {
        this._MC_U2   =   _MC_U2;
    }

    public float get_MC_Q2() {
        return _MC_Q2;
    }

    public void set_MC_Q2(float _MC_Q2) {
        this._MC_Q2   =   _MC_Q2;
    }

    public float get_MC_U3() {
        return _MC_U3;
    }

    public void set_MC_U3(float _MC_U3) {
        this._MC_U3   =   _MC_U3;
    }

    public float get_MC_Q3() {
        return _MC_Q3;
    }

    public void set_MC_Q3(float _MC_Q3) {
        this._MC_Q3   =   _MC_Q3;
    }

    public float get_MC_U4() {
        return _MC_U4;
    }

    public void set_MC_U4(float _MC_U4) {
        this._MC_U4   =   _MC_U4;
    }

    public float get_MC_Q4() {
        return _MC_Q4;
    }

    public void set_MC_Q4(float _MC_Q4) {
        this._MC_Q4   =   _MC_Q4;
    }

    public float get_MC_U5() {
        return _MC_U5;
    }

    public void set_MC_U5(float _MC_U5) {
        this._MC_U5   =   _MC_U5;
    }

    public int get_MC_DU() {
        return _MC_DU;
    }

    public void set_MC_DU(int _MC_DU) {
        this._MC_DU   =   _MC_DU;
    }

    public int get_MC_InFilt_Kp() {
        return _MC_InFilt_Kp;
    }

    public void set_MC_InFilt_Kp(int _MC_InFilt_Kp) {
        this._MC_InFilt_Kp   =   _MC_InFilt_Kp;
    }

    public int get_MI_Clock_Divisor() {
        return _MI_Clock_Divisor;
    }

    public void set_MI_Clock_Divisor(int _MI_Clock_Divisor) {
        this._MI_Clock_Divisor   =   _MI_Clock_Divisor;
    }

    public int get_ITG_OutputWeight() {
        return _ITG_OutputWeight;
    }

    public void set_ITG_OutputWeight(int _ITG_OutputWeight) {
        this._ITG_OutputWeight   =   _ITG_OutputWeight;
    }

    public int get_IFM_Mode() {
        return _IFM_Mode;
    }

    public void set_IFM_Mode(int _IFM_Mode) {
        this._IFM_Mode   =   _IFM_Mode;
    }

    public float get_IFM_Lowest_Value() {
        return _IFM_Lowest_Value;
    }

    public void set_IFM_Lowest_Value(float _IFM_Lowest_Value) {
        this._IFM_Lowest_Value   =   _IFM_Lowest_Value;
    }

    public float get_IFM_PulseWeight() {
        return _IFM_PulseWeight;
    }

    public void set_IFM_PulseWeight(float _IFM_PulseWeight) {
        this._IFM_PulseWeight   =   _IFM_PulseWeight;
    }

    public float get_PWM_RangeFI_InLo_() {
        return _PWM_RangeFI_InLo_;
    }

    public void set_PWM_RangeFI_InLo_(float _PWM_RangeFI_InLo_) {
        this._PWM_RangeFI_InLo_   =   _PWM_RangeFI_InLo_;
    }

    public float get_PWM_RangeFI_InHi_() {
        return _PWM_RangeFI_InHi_;
    }

    public void set_PWM_RangeFI_InHi_(float _PWM_RangeFI_InHi_) {
        this._PWM_RangeFI_InHi_   =   _PWM_RangeFI_InHi_;
    }

    public float get_PWM_RangeFI_OutLo_() {
        return _PWM_RangeFI_OutLo_;
    }

    public void set_PWM_RangeFI_OutLo_(float _PWM_RangeFI_OutLo_) {
        this._PWM_RangeFI_OutLo_   =   _PWM_RangeFI_OutLo_;
    }

    public float get_PWM_RangeFI_OutHi_() {
        return _PWM_RangeFI_OutHi_;
    }

    public void set_PWM_RangeFI_OutHi_(float _PWM_RangeFI_OutHi_) {
        this._PWM_RangeFI_OutHi_   =   _PWM_RangeFI_OutHi_;
    }

    public float get_PWM_RangeIDAC_InLo_() {
        return _PWM_RangeIDAC_InLo_;
    }

    public void set_PWM_RangeIDAC_InLo_(float _PWM_RangeIDAC_InLo_) {
        this._PWM_RangeIDAC_InLo_   =   _PWM_RangeIDAC_InLo_;
    }

    public float get_PWM_RangeIDAC_InHi_() {
        return _PWM_RangeIDAC_InHi_;
    }

    public void set_PWM_RangeIDAC_InHi_(float _PWM_RangeIDAC_InHi_) {
        this._PWM_RangeIDAC_InHi_   =   _PWM_RangeIDAC_InHi_;
    }

    public int get_PWM_RangeIDAC_OutLo_() {
        return _PWM_RangeIDAC_OutLo_;
    }

    public void set_PWM_RangeIDAC_OutLo_(int _PWM_RangeIDAC_OutLo_) {
        this._PWM_RangeIDAC_OutLo_   =   _PWM_RangeIDAC_OutLo_;
    }

    public int get_PWM_RangeIDAC_OutHi_() {
        return _PWM_RangeIDAC_OutHi_;
    }

    public void set_PWM_RangeIDAC_OutHi_(int _PWM_RangeIDAC_OutHi_) {
        this._PWM_RangeIDAC_OutHi_   =   _PWM_RangeIDAC_OutHi_;
    }

    public float get_Doze_Level1_10ls() {
        return _Doze_Level1_10ls;
    }

    public void set_Doze_Level1_10ls(float _Doze_Level1_10ls) {
        this._Doze_Level1_10ls   =   _Doze_Level1_10ls;
    }

    public float get_MO_CmpLevel1() {
        return _MO_CmpLevel1;
    }

    public void set_MO_CmpLevel1(float _MO_CmpLevel1) {
        this._MO_CmpLevel1   =   _MO_CmpLevel1;
    }

    public float get_MO_CmpLevel2() {
        return _MO_CmpLevel2;
    }

    public void set_MO_CmpLevel2(float _MO_CmpLevel2) {
        this._MO_CmpLevel2   =   _MO_CmpLevel2;
    }

    public int get_NetWork_Address() {
        return _NetWork_Address;
    }

    public void set_NetWork_Address(short _NetWork_Address) {
        this._NetWork_Address   =   _NetWork_Address;
    }

    public int get_G_SerialNum_hi() {
        return _G_SerialNum_hi;
    }

    public void set_G_SerialNum_hi(int _G_SerialNum_hi) {
        this._G_SerialNum_hi   =   _G_SerialNum_hi;
    }

    public int get_G_SerialNum() {
        return _G_SerialNum;
    }

    public void set_G_SerialNum(int _G_SerialNum) {
        this._G_SerialNum   =   _G_SerialNum;
    }

    public float get_MC_Q5() {
        return _MC_Q5;
    }

    public void set_MC_Q5(float _MC_Q5) {
        this._MC_Q5   =   _MC_Q5;
    }

    public int get_LCD_ValuesList() {
        return _LCD_ValuesList;
    }

    public void set_LCD_ValuesList(int _LCD_ValuesList) {
        this._LCD_ValuesList   =   _LCD_ValuesList;
    }

    public int get_LCD_Filter() {
        return _LCD_Filter;
    }

    public void set_LCD_Filter(int _LCD_Filter) {
        this._LCD_Filter   =   _LCD_Filter;
    }

    public int get_LCD_ValuesTime() {
        return _LCD_ValuesTime;
    }

    public void set_LCD_ValuesTime(int _LCD_ValuesTime) {
        this._LCD_ValuesTime   =   _LCD_ValuesTime;
    }

    public int[] get_KBD_List() {
        return _KBD_List;
    }

    public void set_KBD_List(int[] _KBD_List) {
        this._KBD_List   =   _KBD_List;
    }

    public float get_Doze_Level2_10ls() {
        return _Doze_Level2_10ls;
    }

    public void set_Doze_Level2_10ls(float _Doze_Level2_10ls) {
        this._Doze_Level2_10ls   =   _Doze_Level2_10ls;
    }

    public long get_eTime_Stamp() {
        return _eTime_Stamp;
    }

    public void set_eTime_Stamp(long _eTime_Stamp) {
        this._eTime_Stamp   =   _eTime_Stamp;
    }

    public long get_iTime_Stamp() {
        return _iTime_Stamp;
    }

    public void set_iTime_Stamp(long _iTime_Stamp) {
        this._iTime_Stamp   =   _iTime_Stamp;
    }

    @Override
    public String toString() {
        return "EEP_ParamStruct{" +  "\n" +
                " _EEPROM_Flags  =   " + _EEPROM_Flags + ",\n" +
                " _MC_U1  =  " + _MC_U1 + ",\n" +
                " _MC_Q1  =  " + _MC_Q1 + ",\n" +
                " _MC_U2  =  " + _MC_U2 + ",\n" +
                " _MC_Q2  =  " + _MC_Q2 + ",\n" +
                " _MC_U3  =  " + _MC_U3 + ",\n" +
                " _MC_Q3  =  " + _MC_Q3 + ",\n" +
                " _MC_U4  =  " + _MC_U4 + ",\n" +
                " _MC_Q4  =  " + _MC_Q4 + ",\n" +
                " _MC_U5  =  " + _MC_U5 + ",\n" +
                " _MC_DU  =  " + _MC_DU + ",\n" +
                " _MC_InFilt_Kp  =  " + _MC_InFilt_Kp +  ",\n" +
                " _MI_Clock_Divisor  =  " + _MI_Clock_Divisor + ",\n" +
                " _ITG_OutputWeight  =  " + _ITG_OutputWeight + ",\n" +
                " _IFM_Mode  =  " + _IFM_Mode + ",\n" +
                " _IFM_Lowest_Value  =  " + _IFM_Lowest_Value + ",\n" +
                " _IFM_PulseWeight  =  " + _IFM_PulseWeight + ",\n" +
                " _PWM_RangeFI_InLo_  =  " + _PWM_RangeFI_InLo_ + ",\n" +
                " _PWM_RangeFI_InHi_  =  " + _PWM_RangeFI_InHi_ + ",\n" +
                " _PWM_RangeFI_OutLo_  =  " + _PWM_RangeFI_OutLo_ + ",\n" +
                " _PWM_RangeFI_OutHi_  =  " + _PWM_RangeFI_OutHi_ + ",\n" +
                " _PWM_RangeIDAC_InLo_  =  " + _PWM_RangeIDAC_InLo_ + ",\n" +
                " _PWM_RangeIDAC_InHi_  =  " + _PWM_RangeIDAC_InHi_ + ",\n" +
                " _PWM_RangeIDAC_OutLo_  =  " + _PWM_RangeIDAC_OutLo_ + ",\n" +
                " _PWM_RangeIDAC_OutHi_  =  " + _PWM_RangeIDAC_OutHi_ + ",\n" +
                " _Doze_Level1_10ls  =  " + _Doze_Level1_10ls + ",\n" +
                " _MO_CmpLevel1  =  " + _MO_CmpLevel1 + ",\n" +
                " _MO_CmpLevel2  =  " + _MO_CmpLevel2 + ",\n" +
                " _NetWork_Address  =  " + _NetWork_Address + ",\n" +
                " _G_SerialNum_hi  =  " + _G_SerialNum_hi + ",\n" +
                " _G_SerialNum   =  " + _G_SerialNum + ",\n" +
                " _MC_Q5  =  " + _MC_Q5 + ",\n" +
                " _LCD_ValuesList  =  " + _LCD_ValuesList + ",\n" +
                " _LCD_Filter  =  " + _LCD_Filter + ",\n" +
                " _LCD_ValuesTime  =  " + _LCD_ValuesTime + ",\n" +
                " _KBD_List  =  " + Arrays.toString(_KBD_List) + ",\n" +
                " _Doze_Level2_10ls  =  " + _Doze_Level2_10ls + ",\n" +
                " _eTime_Stamp  =  " + _eTime_Stamp + ",\n" +
                " _iTime_Stamp  =  " + _iTime_Stamp + ",\n" +
                '}';
    }
}
