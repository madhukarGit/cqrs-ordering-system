package com.food.ordering.system.order.service.domain.ports.inputs.message.listener.restaurantapproval;

import com.food.ordering.system.order.service.domain.dto.messages.RestaurantApprovalResponse;
import com.food.ordering.system.order.service.domain.entity.Restaurant;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);
    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
