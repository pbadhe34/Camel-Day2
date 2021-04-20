 
package org.app;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * A processor which receives a order request and return a response.
 * <p/>
 */
public class OrderProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {
    	System.out.println("OrderProcessor process");
        Order order = exchange.getIn().getBody(Order.class);
        OrderResponse answer = new OrderResponse()
            .setAccepted(true)
            .setOrderId(order.getOrderId())
            .setDescription(String.format("Order accepted:[item='%s' quantity='%s']", order.getItemId(), order.getQuantity()));
        exchange.getOut().setBody(answer);
    }
}
