package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private boolean isTriangle;
    private double bisector;

    public void reset(){
        this.firstSide = 0;
        this.secondSide = 0;
        this.thirdSide = 0;
    }

    private void setIsTriangle(){
        this.isTriangle = false;

        if (this.firstSide > 0)
            if (this.secondSide > 0)
                if (this.thirdSide > 0)
                    if (this.firstSide + this.secondSide > this.thirdSide)
                        if (this.thirdSide + this.secondSide > this.firstSide)
                            if (this.firstSide + this.thirdSide > this.secondSide)
                                this.isTriangle = true;

    }

    private void setBisector() {
        if (this.isTriangle) {
            this.bisector= Math.sqrt(
                    (double) (this.firstSide * this.secondSide * (this.firstSide + this.secondSide + this.thirdSide)
                            * (this.firstSide + this.secondSide - this.thirdSide))
                            /(this.firstSide + this.thirdSide)
            );
        } else this.bisector = 0;
    }

    @Override
    public String toString() {
        return "Длина первой стороны: " + this.firstSide +
                "\nДлина второй стороны: " + this.secondSide +
                "\nДлина третьей стороны: " + this.thirdSide;
    }

    public String getBisector(){
        if (this.bisector != 0) {
            return "\nДлина биссектрисы = " + String.format("%.2f", this.bisector);
        } else {
            return "\nТреугольника с такими сторонами не существует! Попробуйте еще раз";
        }
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }
    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }
    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;

        setIsTriangle();
        setBisector();
    }
}
