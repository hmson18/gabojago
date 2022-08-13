package com.hanium.gabojago.repository;

import com.hanium.gabojago.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
     Optional<Bookmark> findByBookmarkId(Long bookmarkId);
}
