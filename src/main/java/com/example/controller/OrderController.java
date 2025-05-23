package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 注文管理のコントローラークラスです。
 */
@Controller
public class OrderController {

    /**
     * 注文書参照画面を表示します。
     *
     * @param model モデル
     * @return 注文書参照画面のテンプレート名
     */
    @GetMapping("/order/view")
    public String viewOrders(Model model) {
        // 必要に応じてデータをモデルに追加
        model.addAttribute("message", "注文書一覧を表示します。");
        return "order/view";
    }
}