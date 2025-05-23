package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 見積管理のコントローラークラスです。
 */
@Controller
public class EstimateController {

    /**
     * 見積書参照画面を表示します。
     *
     * @param model モデル
     * @return 見積書参照画面のテンプレート名
     */
    @GetMapping("/estimate/view")
    public String viewEstimates(Model model) {
        // 必要に応じてデータをモデルに追加
        model.addAttribute("message", "見積書一覧を表示します。");
        return "estimate/view";
    }
}