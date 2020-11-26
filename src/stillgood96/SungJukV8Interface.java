package stillgood96;
/**
 * 파일명: SungjukV8
 * 작성일: 2020.11.26
 * 프로그램 설명: 성적처리프로그램 v8
 * 성적처리 프로그램을 체계적으로 만들려고 함
 * 객체지향 기법을 토대로 CRUD기능을 제공하도록 작성
 * 성적 데이터 입력/조회/수정/삭제 메뉴를 제공해서
 * 프로그램의 사용성을 높임
 *
 * SungJukService : readSungJuk, showSungJuk
 *                showOneSungJuk, modifySungJuk,
 *                removeSungJuk, displayMenu, computeSungJuk
 *
 */

/**
 * SungJukV8Interface
 * 성적처리 인터페이스
 */
public interface SungJukV8Interface {
    void newSungJuk();
    void readSungJuk();
    void readOneSungJuk();
    void modifySungJuk();
    void removeSungJuk();
}
