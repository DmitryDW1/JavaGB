package OOP.oop4.cw3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenBox<T>{
    T obj;
    List binaryString;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public List getBinaryString() {
        return binaryString;
    }

    public void setBinaryString(List binaryString) {
        this.binaryString = binaryString;
    }
}
