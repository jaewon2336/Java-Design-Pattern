package ex03_1;

public class TigerAdapter extends Animal {

    private FakeOuterTiger fakeOuterTiger;

    public TigerAdapter(FakeOuterTiger fakeOuterTiger) {
        this.fakeOuterTiger = fakeOuterTiger;
    }

    @Override
    public String getName() {
        return fakeOuterTiger.getFullName();
    }

}
