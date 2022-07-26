package com.hanium.gabojago.dto.post;

import com.hanium.gabojago.domain.Post;
import com.hanium.gabojago.domain.PostTag;
import com.hanium.gabojago.domain.Tag;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter @Setter
public class PostUpdateRequest {
    private String title;
    private String context;
    private List<Integer> tags;
    private List<Long> deleteFiles;
    private List<MultipartFile> insertFiles;

    public PostTag toPostTag(Post post, Tag tag) {
        return PostTag.builder()
                .post(post)
                .tag(tag)
                .build();
    }
}
