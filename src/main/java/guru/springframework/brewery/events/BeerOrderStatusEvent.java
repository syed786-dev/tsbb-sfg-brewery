package guru.springframework.brewery.events;

import guru.springframework.brewery.domain.BeerOrder;
import guru.springframework.brewery.domain.OrderStatusEnum;
import org.springframework.context.ApplicationEvent;

public class BeerOrderStatusEvent extends ApplicationEvent {

    private final OrderStatusEnum previousStatus;

    public BeerOrderStatusEvent(BeerOrder source, OrderStatusEnum previousStatus) {
        super(source);
        this.previousStatus = previousStatus;
    }

    public OrderStatusEnum getPreviousStatus() {
        return previousStatus;
    }

    public BeerOrder getBeerOrder(){
        return (BeerOrder) this.source;
    }
}
