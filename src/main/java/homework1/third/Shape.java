package homework1.third;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
abstract class Shape {
    int width;
    int height;
    int radius;
    String color;

    void draw() {
        System.out.println("Draw your shape");
    }
}
