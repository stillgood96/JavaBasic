package DAY_12_18;

public class SamKwangCOE_VO {
    private int 인사번호;
    private int 고객번호;
    private String 고객이름;
    private String 주소;
    private String 시도;
    private String 우편번호;
    private String 전화번호;
    private int 주분번호;
    private String 주문일;
    private String 납기일;
    private String 주민등록번호;
    private String 성명;
    private String 소속부서;
    private String 직책;
    private String 입사일;

    public SamKwangCOE_VO() {
    }

    public SamKwangCOE_VO(int 인사번호, int 고객번호, String 고객이름, String 전화번호, String 주문일, String 소속부서, String 직책) {
        this.인사번호 = 인사번호;
        this.고객번호 = 고객번호;
        this.고객이름 = 고객이름;
        this.전화번호 = 전화번호;
        this.주문일 = 주문일;
        this.소속부서 = 소속부서;
        this.직책 = 직책;
    }



    public SamKwangCOE_VO(int 인사번호, int 고객번호, String 고객이름, String 주소, String 시도, String 우편번호, String 전화번호, int 주분번호, String 주문일, String 납기일, String 주민등록번호, String 성명, String 소속부서, String 직책, String 입사일) {
        this.인사번호 = 인사번호;
        this.고객번호 = 고객번호;
        this.고객이름 = 고객이름;
        this.주소 = 주소;
        this.시도 = 시도;
        this.우편번호 = 우편번호;
        this.전화번호 = 전화번호;
        this.주분번호 = 주분번호;
        this.주문일 = 주문일;
        this.납기일 = 납기일;
        this.주민등록번호 = 주민등록번호;
        this.성명 = 성명;
        this.소속부서 = 소속부서;
        this.직책 = 직책;
        this.입사일 = 입사일;
    }

    public int get인사번호() {
        return 인사번호;
    }

    public void set인사번호(int 인사번호) {
        this.인사번호 = 인사번호;
    }

    public int get고객번호() {
        return 고객번호;
    }

    public void set고객번호(int 고객번호) {
        this.고객번호 = 고객번호;
    }

    public String get고객이름() {
        return 고객이름;
    }

    public void set고객이름(String 고객이름) {
        this.고객이름 = 고객이름;
    }

    public String get주소() {
        return 주소;
    }

    public void set주소(String 주소) {
        this.주소 = 주소;
    }

    public String get시도() {
        return 시도;
    }

    public void set시도(String 시도) {
        this.시도 = 시도;
    }

    public String get우편번호() {
        return 우편번호;
    }

    public void set우편번호(String 우편번호) {
        this.우편번호 = 우편번호;
    }

    public String get전화번호() {
        return 전화번호;
    }

    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }

    public int get주분번호() {
        return 주분번호;
    }

    public void set주분번호(int 주분번호) {
        this.주분번호 = 주분번호;
    }

    public String get주문일() {
        return 주문일;
    }

    public void set주문일(String 주문일) {
        this.주문일 = 주문일;
    }

    public String get납기일() {
        return 납기일;
    }

    public void set납기일(String 납기일) {
        this.납기일 = 납기일;
    }

    public String get주민등록번호() {
        return 주민등록번호;
    }

    public void set주민등록번호(String 주민등록번호) {
        this.주민등록번호 = 주민등록번호;
    }

    public String get성명() {
        return 성명;
    }

    public void set성명(String 성명) {
        this.성명 = 성명;
    }

    public String get소속부서() {
        return 소속부서;
    }

    public void set소속부서(String 소속부서) {
        this.소속부서 = 소속부서;
    }

    public String get직책() {
        return 직책;
    }

    public void set직책(String 직책) {
        this.직책 = 직책;
    }

    public String get입사일() {
        return 입사일;
    }

    public void set입사일(String 입사일) {
        this.입사일 = 입사일;
    }
}
