package ma.enset.simple_demo_springbatch.orderConfiguration;

import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<Order, Order> {
    @Override
    public Order process(Order item) {
        Double discountedAmount = item.amount() * 0.9;
        String customerName = item.customerName().toUpperCase();

        return new Order(item.orderId(), customerName, discountedAmount);
    }
}

