```mermaid
erDiagram
    見積 {
        string 見積番号 PK
        string 社員コード
        string 受注状況
        string 受注確度
        date 見積日
        string 会社名
        string 会社名カナ
        string 客先担当者
        string 客先担当者カナ
        string 客先注文番号
        string 件名
        date 納入日
        date 検収予定日
        string 支払条件
        float 合計金額
        float 見積金額
        string 特記事項
        boolean 最新フラグ
        boolean 削除フラグ
    }

    見積明細 {
        string 見積番号 PK, FK
        int 明細番号 PK
        string 項目
        string 明細
        string 摘要
        int 数量
        string 単位
        float 単価
        float 金額
        boolean 最新フラグ
        boolean 削除フラグ
    }

    注文 {
        string 注文番号 PK
        string 社員コード
        string 見積番号 FK
        date 注文日
        string 会社名
        string 会社名カナ
        string 客先担当者
        string 客先担当者カナ
        string 客先注文番号
        string 件名
        date 納入日
        date 検収日
        string 支払条件
        float 合計金額
        string 特記事項
        boolean 最新フラグ
        boolean 削除フラグ
    }

    注文明細 {
        string 注文番号 PK, FK
        int 明細番号 PK
        string 摘要
        int 数量
        string 単位
        float 単価
        float 金額
        boolean 最新フラグ
        boolean 削除フラグ
    }

    請求 {
        string 請求番号 PK
        string 注文番号 FK
        string 社員コード
        date 請求日
        string 会社名
        string 会社名カナ
        string 客先担当者
        string 客先担当者カナ
        string 客先注文番号
        string 件名
        date 納入日
        string 支払条件
        float 合計金額
        string 消費税区分
        float 消費税率
        float 消費税額
        float 請求金額
        string 特記事項
        boolean 最新フラグ
        boolean 破棄フラグ
    }

    請求明細 {
        string 請求番号 PK, FK
        int 明細番号 PK
        string 項目
        string 明細
        string 摘要
        int 数量
        string 単位
        float 単価
        float 金額
        boolean 最新フラグ
        boolean 破棄フラグ
    }

    見積 ||--o{ 見積明細: ""
    見積 ||--o{ 注文: ""
    注文 ||--o{ 注文明細: ""
    注文 ||--o{ 請求: ""
    請求 ||--o{ 請求明細: ""