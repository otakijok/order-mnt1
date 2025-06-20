package com.example.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

/**
 * 見積明細テーブルのためのエンティティクラスです。
 */
@Entity
@Data
@IdClass(EstimateDetail.EstimateDetailId.class) // 複合主キーを指定
public class EstimateDetail {
    @Id
    private String estimateId; // 見積番号
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
    private Boolean isDeleted; // 削除フラグ

    /**
     * 見積明細テーブルの複合主キーを表すインナークラスです。
     */
    @Data
    public static class EstimateDetailId implements Serializable {
        private String estimateId; // 見積番号
        private Integer detailId; // 明細番号
    }
}