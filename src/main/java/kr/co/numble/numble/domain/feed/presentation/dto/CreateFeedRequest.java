package kr.co.numble.numble.domain.feed.presentation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CreateFeedRequest {

    @ApiModelProperty(value = "게시글 내용", example = "내용")
    @NotNull(message = "content는 Null을 허용하지 않습니다.")
    private String content;

    @ApiModelProperty(value = "카테고리 id", example = "10")
    @NotNull(message = "categoryId는 필수로 입력해야 합니다.")
    private Long categoryId;
}
