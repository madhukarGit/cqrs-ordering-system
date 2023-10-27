package com.food.ordering.system.order.service.domain.ports.inputs.message.listener.payment;

import com.food.ordering.system.order.service.domain.dto.messages.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentCompleted(PaymentResponse paymentResponse);
    void paymentCancelled(PaymentResponse paymentResponse);
}