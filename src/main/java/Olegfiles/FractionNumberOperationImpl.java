package Olegfiles;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    FractionNumberImpl a = new FractionNumberImpl();
    FractionNumberImpl b = new FractionNumberImpl();
    FractionNumberImpl c = new FractionNumberImpl();

    public FractionNumberImpl getA() {
        return a;
    }

    public void setA(FractionNumberImpl a) {
        this.a = a;
    }

    public FractionNumberImpl getB() {
        return b;
    }

    public void setB(FractionNumberImpl b) {
        this.b = b;
    }


    @Override
    public FractionNumberImpl add(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a.getDivisor() != b.getDivisor()) {
            c.setDividend(a.getDividend() * b.getDivisor() + b.getDividend() * a.getDivisor());
            c.setDivisor(a.getDivisor() * b.getDivisor());
            return c;
        } else {
            c.setDividend(a.getDividend() + b.getDividend());
            c.setDivisor(a.getDividend());
            return c;
        }
    }

    @Override
    public FractionNumberImpl sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a.getDivisor() != b.getDivisor()) {
            c.setDividend(a.getDividend() * b.getDivisor() - b.getDividend() * a.getDivisor());
            c.setDivisor(a.getDivisor() * b.getDivisor());
            return c;
        } else {
            c.setDividend(a.getDividend() + b.getDividend());
            c.setDivisor(a.getDividend());
            return c;
        }
    }

    @Override
    public FractionNumberImpl mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        c.setDividend(a.getDividend() * b.getDividend());
        c.setDivisor(a.getDivisor() * b.getDivisor());
        return c;
    }

    @Override
    public FractionNumberImpl div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        c.setDividend(a.getDividend() * b.getDivisor());
        c.setDivisor(a.getDivisor() * b.getDividend());
        return c;
    }
}
