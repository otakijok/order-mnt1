package com.example.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 見積検索条件を格納するフォームクラスです。
 */
@Data
public class EstimateSearchForm {

    /**
     * 作成者
     */
    private String creator;

    /**
     * 見積番号年
     */
    private String quotationYear;

    /**
     * 連番
     */
    private Integer serialNumber;

    /**
     * 枝番
     */
    private Integer branchNumber;

    /**
     * 合計金額(円)From
     */
    private BigDecimal totalAmountFrom;

    /**
     * 合計金額(円)To
     */
    private BigDecimal totalAmountTo;

    /**
     * 会社名
     */
    private String companyName;

    /**
     * 受注状況
     */
    private String orderStatus;

    /**
     * 見積日From
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date estimateDateFrom;

    /**
     * 見積日To
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date estimateDateTo;

    /**
     * 納入日From
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deliveryDateFrom;

    /**
     * 納入日To
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deliveryDateTo;
}
