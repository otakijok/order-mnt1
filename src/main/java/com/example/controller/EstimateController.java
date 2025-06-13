package com.example.controller;

import com.example.entity.Estimate;
import com.example.form.EstimateSearchForm;
import com.example.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * 見積管理のコントローラークラスです。
 */
@Controller
public class EstimateController {

    private final EstimateService estimateService;

    /**
     * EstimateControllerのコンストラクタです。
     *
     * @param estimateService 見積サービス
     */
    @Autowired
    public EstimateController(EstimateService estimateService) {
        this.estimateService = estimateService;
    }

    /**
     * 見積書一覧画面を表示します。
     * 検索条件に基づいて見積もりを検索し、結果を画面に渡します。
     *
     * @param form  検索条件を格納するフォームオブジェクト
     * @param model モデル
     * @return 見積書一覧画面のテンプレート名
     */
    @GetMapping("/estimate/view")
    public String viewEstimates(@ModelAttribute EstimateSearchForm form, Model model) {
        List<Estimate> estimates = estimateService.searchEstimates(form);
        model.addAttribute("estimates", estimates);
        model.addAttribute("estimateSearchForm", form);
        model.addAttribute("screenTitle", "見積書(一覧)"); // 画面タイトルを設定
        // model.addAttribute("message", "見積書一覧を表示します。"); // この行は不要になるためコメントアウトまたは削除
        return "estimate/view";
    }
}
