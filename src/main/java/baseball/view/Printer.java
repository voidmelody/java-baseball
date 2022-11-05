package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class Printer {

    public static void start(){
        String message = "숫자 야구 게임을 시작합니다.";
        System.out.println(message);
    }

    public static void inputNumber(){
        String message = "숫자를 입력해주세요 : ";
        System.out.println(message);
    }

    public static void allCorrect(){
        String message = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        System.out.println(message);
    }

    public static String askRestart(){
        String message = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
        System.out.println(message);
        String input = Console.readLine();
        return input;
    }

}
