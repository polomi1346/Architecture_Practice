package SOLID;

// 1. Strategy interface
interface DiscountStrategy {
    double calculate(double amount);
}

// 2. Concrete strategies
class RegularDiscount implements DiscountStrategy {
    public double calculate(double amount) {
        return amount * 0.1;
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double calculate(double amount) {
        return amount * 0.2;
    }
}

// Optional: new strategy, no changes to DiscountCalculator needed
class VIPDiscount implements DiscountStrategy {
    public double calculate
