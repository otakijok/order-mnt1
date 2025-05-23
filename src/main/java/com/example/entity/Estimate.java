package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 見積テーブルのためのエンティティクラスです。
 */
@Entity
@Data
@RequiredArgsConstructor
public class Estimate {
    @Id
    private final String estimateId; // 見積番号
    private String employeeCode; // 社員コード
    private String orderStatus; // 受注状況
    private String orderProbability; // 受注確度
    @Temporal(TemporalType.DATE)
    private Date estimateDate; // 見積日
    private String companyName; // 会社名
    private String companyNameKana; // 会社名カナ
    private String clientContact; // 客先担当者
    private String clientContactKana; // 客先担当者カナ
    private String clientOrderNumber; // 客先注文番号
    private String subject; // 件名
    @Temporal(TemporalType.DATE)
    private Date deliveryDate; // 納入日
    @Temporal(TemporalType.DATE)
    private Date inspectionDate; // 検収予定日
    private String paymentTerms; // 支払条件
    private BigDecimal totalAmount; // 合計金額
    private BigDecimal estimateAmount; // 見積金額
    private String notes; // 特記事項
    private Boolean isLatest; // 最新フラグ
    private Boolean isDeleted; // 削除フラグ
}