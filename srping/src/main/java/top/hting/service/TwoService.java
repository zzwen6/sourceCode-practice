package top.hting.service;

public class TwoService {

    private OneService oneService;

    public void sayHello(){
        oneService.hello();
    }

    // 要提供get set 方法，否则xml不通过
    public OneService getOneService() {
        return oneService;
    }

    public void setOneService(OneService oneService) {
        this.oneService = oneService;
    }
}
