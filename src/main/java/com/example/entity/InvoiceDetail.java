package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 請求明細テーブルのためのエンティティクラスです。
 */
@Entity
@Data
@NoArgsConstructor
@IdClass(InvoiceDetail.InvoiceDetailId.class) // 複合主キーを指定
public class InvoiceDetail {
    @Id
    private String invoiceId; // 請求番号
    @Id
    private Integer detailId; // 明細番号
    private String item; // 項目
    private String detail; // 明細
    private String remarks; // 摘要
    private Integer quantity; // 数量
    private String unit; // 単位
    private BigDecimal unitPrice; // 単価
    private BigDecimal amount; // 金額
    private Boolean isLatest; // 最新フラグ
    private Boolean isDiscarded; // 破棄フラグ

    /**
     * 請求明細テーブルの複合主キーを表すインナークラスです。
     */
    @Data
    @NoArgsConstructor
    public static class InvoiceDetailId implements Serializable {
        private String invoiceId; // 請求番号
        private Integer detailId; // 明細番号
    }
}