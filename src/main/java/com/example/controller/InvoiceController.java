package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 請求管理のコントローラークラスです。
 */
@Controller
public class InvoiceController {

    /**
     * 請求書参照画面を表示します。
     *
     * @param model モデル
     * @return 請求書参照画面のテンプレート名
     */
    @GetMapping("/invoice/view")
    public String viewInvoices(Model model) {
        // 必要に応じてデータをモデルに追加
        model.addAttribute("message", "請求書一覧を表示します。");
        return "invoice/view";
    }
}