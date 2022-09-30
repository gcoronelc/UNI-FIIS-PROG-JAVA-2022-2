package aprendojava.demo;

public class Three implements One, Two{

    @Override
    public int sumar(int n1, int n2) {
        return (n1+n2);
    }

    @Override
    public int producto(int n1, int n2) {
        return (n1*n2);
    }
    
}
