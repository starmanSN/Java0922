package homework1.third;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Triangle extends Shape {
    int width;
    int height;
    String color;

    @Override
    void draw() {
        super.draw();
    }
}
