package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 注文テーブルのためのエンティティクラスです。
 */
@Entity
@Table(name = "ORDER_TABLE") // テーブル名を指定
@Data
@NoArgsConstructor
public class Order {
    @Id
    private String orderId; // 注文番号
    private String employeeCode; // 社員コード
    private String estimateId; // 見積番号（外部キーとして扱うが、関連付けはしない）
    private Date orderDate; // 注文日
    private String companyName; // 会社名
    private String companyNameKana; // 会社名カナ
    private String clientContact; // 客先担当者
    private String clientContactKana; // 客先担当者カナ
    private String clientOrderNumber; // 客先注文番号
    private String subject; // 件名
    private Date deliveryDate; // 納入日
    private Date inspectionDate; // 検収日
    private String paymentTerms; // 支払条件
    private BigDecimal totalAmount; // 合計金額
    private String notes; // 特記事項
    private Boolean isLatest; // 最新フラグ
    private Boolean isDeleted; // 削除フラグ
}