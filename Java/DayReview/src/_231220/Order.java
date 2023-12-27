package _231220;

import java.util.List;
// Order : 결제, 출고, 배송시작, 배송완료, 취소, 배송정보변경 기능 등
public class Order {
    private List<OrderLine> orderLines; //항목별 구매량에 따른 가격
    private Money totalAmounts; //총금액
    private ShippingInfo shippingInfo; //배송정보
    private OrderState state; //주문의 상태

    //주문정보와 배송정보를 받아오는 생성자
    public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo){
        setOrderLines(orderLines); //주문정보
        setShippingInfo(shippingInfo); //배송정보
    }

    //1. 최소 한 종류 이상의 상품 주문, 2. 한 상품을 한 개 이상 주문 -> orderLine setter 메서드
    public void setOrderLines(List<OrderLine> orderLines) {
        //주문 정보 존재여부 메서드 호출
        verifyAtLestOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        //3. 총 주문금액은 각 상품의 구매 가격 합을 모두 더한 금액
        calculateTotalAmounts();

    }
    private void calculateTotalAmounts() {
        //Stream : 순회하여 처리 //.mapToInt : 정수형 변환
        //(x -> x.getAmounts()) : 배열의 각 요소 x에 대해 getAmounts()메서드를 호출 -> 4.품목별 총액 계산
        // .sum() : 호출한 결과값을 모두 더함 -> 모든 품목의 총액 계산
        int sum = orderLines.stream().mapToInt(x -> x.getAmounts()).sum();
        this.totalAmounts = new Money(sum);
    }

    private void verifyAtLestOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if(orderLines == null || orderLines.isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    //5. 주문할 때 배송지 정보를 반드시 입력 -> shipping setter 메서드
    public void setShippingInfo(ShippingInfo shippingInfo) {
        if(shippingInfo == null){
            throw new IllegalArgumentException("no Shipping");
        }
        this.shippingInfo = shippingInfo;
    }


    //6. 출고를 하면 배송지를 변경할 수 없다.
    public void changeShipped(ShippingInfo shippingInfo){
        //배송상태 확인 메서드 호출
        verifyNotYetShipped();
        //새로운 주소 다시 입력
        setShippingInfo(shippingInfo);
    }

    //상태 확인 메서드
    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING){
            throw new IllegalArgumentException("already shipped");
        }
    }

    //7. 출고 전에 주문을 취소할 수 있다.
    public void cancel(){
        //배송상태 확인 메서드 호출
        verifyNotYetShipped();
        this.state = OrderState.CANCELED;
    }
}
