import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double kor;
        double eng;
        double math;
        int result;
        double average;

        System.out.println("국어점수 입력");
        kor = scan.nextDouble();
        System.out.println("영어점수 입력");
        eng = scan.nextDouble();
        System.out.println("수학점수 입력");
        math = scan.nextDouble();

        result = (int)kor + (int)eng + (int)math;
        average = (kor+eng+math)/3;
        System.out.println("3과목의 총점은:"+result);
        System.out.println("3과목의 평균은:"+average);
    }
}