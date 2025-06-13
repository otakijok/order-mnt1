package com.example.repository;

import com.example.entity.Estimate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 見積エンティティのJPAリポジトリインターフェースです。
 */
@Repository
public interface EstimateRepository extends JpaRepository<Estimate, String> {
    // 今後の開発で、必要に応じて検索メソッドをここに追加します。
    // 例えば、会社名での検索など:
    // List<Estimate> findByCompanyNameContaining(String companyName);
}
