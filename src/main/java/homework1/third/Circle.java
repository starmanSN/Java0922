package homework1.third;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Circle extends Shape {
    int radius;
    String color;


    @Override
    void draw() {
        System.out.println("Draw a circle");
    }
}
