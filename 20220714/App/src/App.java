public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        final int num = 10;
        System.out.println(num);
        
        int triangle = (20*10)/2; //삼각형의 면적 구하기
        int rectangle = 20*10; //사각형 면적

        System.out.println(triangle);
        System.out.println(rectangle);

        //상수를 이용하여 의미가 명확해질 수 있음
        //다른 값으로 계산할 때도 다른 곳을 수정할 필요 없이 초기값만 변경해주면 됨
        final int WIDTH = 20;
        final int HEIGHT = 10;

        int tri = (WIDTH*HEIGHT)/2;
        int rect = WIDTH*HEIGHT;

        System.out.println(tri);
        System.out.println(rect);


        /*
         * 변수에 타입이 있는 것처럼 리터럴에도 타입이 있다.
         * 종류             리터럴                      접미사
         * 논리             false,trun                  없음
         * 정수             123,0b101,077,0XFF          L      
         * 실수             3.14,3.0e8                  f,d
         * 문자             'A','1'                     없음
         * 문자열           "ABC","123"                 없음
         */

         /*
          * 정수형과 실수형에는 여러 타입이 존재하므로 리터럴에 접미사를 붙여서 타입을 구분한다
          long타입의 이러털에 L을 붙이고 접미사가 없으면 int타입의 리터럴이다.
          byte, short는 별도로 존재하지 않는다.

          10진수 외에도 2,8,16진수로 표현된 리터럴을 변수에 저장할 수 있다.
          */
        //8진수는 앞에 0을 붙인다
        int octNum = 010;
        //16진수는 앞에 0x을 붙인다
        int hexNum = 0x10;
        //2진수는 앞에 0b를 붙인다
        int binNum = 0b10;
        System.out.println(octNum);
        System.out.println(hexNum);
        System.out.println(binNum);
        
        //실수형 리터럴에는 접미사를 붙여서 타입을 구분한다. 정수형에서는 int가 기본 자료형인것처럼
        //실수형에서는 double이 기본 자료형이다. (접미사 d는 생략 가능하다)
        
        float fi = 3.14f;
        double dou = 1.45;
        //float fi = 3.14;  float타입 변수에 double타입 리터럴을 저장할 수 없다.
        System.out.println(fi);
        System.out.println(dou);
        
        
        /////

        //문자 리터럴
        /*
         * 'A'와 같이 작은 따옴표로 문자 하나를 감싸고 있는 것을 문자리터럴이라고 함
         * 
         */

         char ch = 'a';
         // char ch1 = 'ddd';
         String str = "dddddd";
         String str1 = ""; // 문자열 리터럴은 문자가 없는 것도 허용
         // char ch2 = ''; 문자가 없기 때문에 error
         char ch3 = ' '; // 공백으로 초기화

        //bool
        //1bit만 사용하지만 데이터를 다루는 최소단위는 byte이기 때문에 크기는 1byte이다.
         boolean isCheck = true;
         boolean isAttack = false;

         /*
          * 특수문자
          \t(tab)
          \n(new line 줄바꿈)
          \b(back space)
          \\
          \''
          \""
          \'u유니코드'(ex char a = \'u0041')
          */


        System.out.println('\'');               //작은 따옴표
        System.out.println("abc\t123\b678");    
        System.out.println('\n');
        System.out.println("\"Hello World\"");  //큰 따옴표
        System.out.println("C:\\");             //경로

    }
}
