package shortenurl.presentation.dto;

import lombok.Getter;
import shortenurl.domain.ShortenUrl;

@Getter
public class ShortenUrlCreateResponseDto {
    private final String originalUrl;
    private final String shortenUrlKey;

    public ShortenUrlCreateResponseDto(ShortenUrl shortenUrl) {
        this.originalUrl = shortenUrl.getOriginalUrl();
        this.shortenUrlKey = shortenUrl.getShortenUrlKey();
    }
}
