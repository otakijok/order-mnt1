package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 請求テーブルのためのエンティティクラスです。
 */
@Entity
@Data
@NoArgsConstructor
public class Invoice {
    @Id
    private String invoiceId; // 請求番号
    private String orderId; // 注文番号（外部キーとして扱うが、関連付けはしない）
    private String employeeCode; // 社員コード
    private Date invoiceDate; // 請求日
    private String companyName; // 会社名
    private String companyNameKana; // 会社名カナ
    private String clientContact; // 客先担当者
    private String clientContactKana; // 客先担当者カナ
    private String clientOrderNumber; // 客先注文番号
    private String subject; // 件名
    private Date deliveryDate; // 納入日
    private String paymentTerms; // 支払条件
    private BigDecimal totalAmount; // 合計金額
    private String taxCategory; // 消費税区分
    private BigDecimal taxRate; // 消費税率
    private BigDecimal taxAmount; // 消費税額
    private BigDecimal invoiceAmount; // 請求金額
    private String notes; // 特記事項
    private Boolean isLatest; // 最新フラグ
    private Boolean isDiscarded; // 破棄フラグ
}