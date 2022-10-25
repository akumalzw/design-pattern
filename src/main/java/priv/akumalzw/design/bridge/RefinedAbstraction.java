package priv.akumalzw.design.bridge;

public class RefinedAbstraction extends Abstraction {
    @Override
    void operation() {
        implementor.operationImp();
    }
}
