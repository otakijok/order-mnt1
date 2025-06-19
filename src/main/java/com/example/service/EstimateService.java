package com.example.service;

import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.entity.Estimate;
import com.example.form.EstimateSearchForm;
import com.example.repository.EstimateRepository;

/**
 * 見積もりに関するビジネスロジックを提供するサービスクラスです。
 */
@Service
@Transactional
public class EstimateService {

    private final EstimateRepository estimateRepository;

    /**
     * EstimateServiceのコンストラクタです。
     *
     * @param estimateRepository 見積リポジトリ
     */
    public EstimateService(EstimateRepository estimateRepository) {
        this.estimateRepository = estimateRepository;
    }

    /**
     * 指定された検索条件に基づいて見積もりを検索します。
     * 現時点では、このメソッドはすべての見積もりを最大15件まで返します。
     * TODO: 検索フォームに基づいたフィルタリングロジックを実装します。
     *
     * @param form 見積検索フォーム
     * @return 見積もりエンティティのリスト
     */
    public List<Estimate> searchEstimates(EstimateSearchForm form) {
        // 現時点ではフィルタリングを行わず、全件取得して最初の15件を返す
        // 将来的にはformの条件で絞り込む
        return findAllEstimatesLimited();
    }

    /**
     * すべての見積もりを取得します。
     * このメソッドは主に初期表示や、フィルタリングが不要な場合に使用されます。
     *
     * @param pageable ページネーション情報
     * @return 見積もりエンティティのリスト
     */
    public List<Estimate> findAllEstimates(Pageable pageable) {
        return estimateRepository.findAll(pageable).getContent();
    }

    /**
     * すべての見積もりをページネーションなしで取得します（最初の15件）。
     * searchEstimatesから呼び出されることを想定しています。
     *
     * @return 見積もりエンティティのリスト (最大15件)
     */
    public List<Estimate> findAllEstimatesLimited() {
        Pageable pageable = PageRequest.of(0, 15); // 最初のページ、15件
        return estimateRepository.findAll(pageable).getContent();
    }
}
