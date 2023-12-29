package _231229;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResourceException {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        FileInput();
        System.out.println("[프로그램 종료]");
    }
    public static void FileInput(){
        FileInputStream file = null;
        try{
            file = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } finally {
            try {
                if (file != null) file.close();
            } catch (IOException io){
                io.printStackTrace();
            }
            System.out.println("finally는 항상 수행됨");
        }
    }
}
