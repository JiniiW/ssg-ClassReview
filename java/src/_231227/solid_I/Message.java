package _231227.solid_I;

public interface Message {
    default String sendMessage(String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }
}
