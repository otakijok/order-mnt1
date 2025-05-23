package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 注文明細テーブルのためのエンティティクラスです。
 */
@Entity
@Data
@NoArgsConstructor
@IdClass(OrderDetail.OrderDetailId.class) // 複合主キーを指定
public class OrderDetail {
    @Id
    private String orderId; // 注文番号
    @Id
    private Integer detailId; // 明細番号
    private String remarks; // 摘要
    private Integer quantity; // 数量
    private String unit; // 単位
    private BigDecimal unitPrice; // 単価
    private BigDecimal amount; // 金額
    private Boolean isLatest; // 最新フラグ
    private Boolean isDeleted; // 削除フラグ

    /**
     * 注文明細テーブルの複合主キーを表すインナークラスです。
     */
    @Data
    @NoArgsConstructor
    public static class OrderDetailId implements Serializable {
        private String orderId; // 注文番号
        private Integer detailId; // 明細番号
    }
}