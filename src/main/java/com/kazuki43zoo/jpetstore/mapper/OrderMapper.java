/*
 *    Copyright 2016-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.kazuki43zoo.jpetstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kazuki43zoo.jpetstore.domain.Order;
import com.kazuki43zoo.jpetstore.domain.OrderLine;

/**
 * @author Kazuki Shimizu
 */
@Mapper
public interface OrderMapper {
    List<Order> getOrdersByUsername(String username);

    Order getOrder(int orderId);

    void insertOrder(Order order);

    void insertOrderStatus(Order order);

    List<OrderLine> getOrderLines(int orderId);

    void insertOrderLine(OrderLine orderLine);


}