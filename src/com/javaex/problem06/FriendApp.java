package com.javaex.problem06;
import java.util.Scanner;
public class FriendApp {
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("친구를 3명 등록해 주세요");
        
        // 친구정보 입력받기
        for (int i = 0; i < friendArray.length; i++) {
            String input = sc.nextLine();
            String[] info = input.split(" "); // 공백으로 분리

            // Friend 객체 생성 후 배열에 저장
            friendArray[i] = new Friend(info[0], info[1], info[2]);
        }
        
        // 친구정보 출력
        for(int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }
        sc.close();
    }
}
