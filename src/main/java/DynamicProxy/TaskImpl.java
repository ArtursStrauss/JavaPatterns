package DynamicProxy;

public class TaskImpl implements Task {
    @Override
    public void setData(String data) {
        System.out.println(data + " Data is saved");
    }

    @Override
    public int getData(int x) {
        return x * 10;
    }
}
