import java.io.Serializable;
import java.util.*;

public class MethodCall implements Serializable {
    public Methods method;
    public Vector arguments;

    public MethodCall(Methods method, Vector arguments) {
        this.method = method;
        this.arguments = arguments;
    }
}
