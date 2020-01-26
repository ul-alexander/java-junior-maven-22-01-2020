package Olegfiles;

public class FractionNumberImpl implements FractionNumber {
    private int dividend;
    private int divisor;

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return this.dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            System.out.println("Знаменатель не может быть равен нулю");
        } else {
            this.divisor = divisor;
        }

    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    public void printResult() {
        int x = 0;
        do {
            x = 0;
            for (int i = 11; i > 0; i--) {
                if (this.dividend % i == 0 && this.divisor % i == 0) {
                    this.dividend /= i;
                    this.divisor /= i;
                    x++;
                }
            }
        } while (x == 0);
        if (this.dividend > this.divisor && this.dividend % this.divisor != 0) {

            System.out.print((this.dividend / this.divisor) + " " + (this.dividend - (this.dividend / this.divisor) * this.divisor) + "/" + this.divisor);

        } else if (this.dividend == this.divisor || this.dividend % this.divisor == 0) {

            System.out.print((this.dividend / this.divisor));

        } else if (this.dividend < this.divisor) {

            System.out.print(this.dividend + "/" + this.divisor);

        } else if (this.divisor == 1) {
            System.out.print(this.dividend);

        }
    }

    @Override
    public double value() {
        return ((double) this.dividend / this.divisor);
    }

    @Override
    public String toString() {
        return dividend + "/" + divisor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FractionNumberImpl)) return false;

        FractionNumberImpl number = (FractionNumberImpl) o;

        if (getDividend() != number.getDividend()) return false;
        return getDivisor() == number.getDivisor();
    }

    @Override
    public int hashCode() {
        int result = getDividend();
        result = 31 * result + getDivisor();
        return result;
    }
}
