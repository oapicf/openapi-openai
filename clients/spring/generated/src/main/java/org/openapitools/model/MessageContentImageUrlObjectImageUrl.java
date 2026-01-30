package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MessageContentImageUrlObjectImageUrl
 */

@JsonTypeName("MessageContentImageUrlObject_image_url")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentImageUrlObjectImageUrl {

  private URI url;

  /**
   * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
   */
  public enum DetailEnum {
    AUTO("auto"),
    
    LOW("low"),
    
    HIGH("high");

    private final String value;

    DetailEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DetailEnum fromValue(String value) {
      for (DetailEnum b : DetailEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DetailEnum detail = DetailEnum.AUTO;

  public MessageContentImageUrlObjectImageUrl() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageContentImageUrlObjectImageUrl(URI url) {
    this.url = url;
  }

  public MessageContentImageUrlObjectImageUrl url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", description = "The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public MessageContentImageUrlObjectImageUrl detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
   * @return detail
   */
  
  @Schema(name = "detail", description = "Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public DetailEnum getDetail() {
    return detail;
  }

  public void setDetail(DetailEnum detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentImageUrlObjectImageUrl messageContentImageUrlObjectImageUrl = (MessageContentImageUrlObjectImageUrl) o;
    return Objects.equals(this.url, messageContentImageUrlObjectImageUrl.url) &&
        Objects.equals(this.detail, messageContentImageUrlObjectImageUrl.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentImageUrlObjectImageUrl {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

