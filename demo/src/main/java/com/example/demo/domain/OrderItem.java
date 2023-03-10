package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import com.example.demo.domain.Item.Item;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "order_item")
@Getter @Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;     // 주문가격
    private int count;          // 주문수량
}
