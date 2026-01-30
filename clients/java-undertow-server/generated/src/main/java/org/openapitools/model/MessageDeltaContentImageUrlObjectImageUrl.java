/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentImageUrlObjectImageUrl   {
  
  private String url;


  public enum DetailEnum {
    AUTO("auto"),
    LOW("low"),
    HIGH("high");

    private String value;

    DetailEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DetailEnum detail = DetailEnum.AUTO;

  /**
   * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
   */
  public MessageDeltaContentImageUrlObjectImageUrl url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
   */
  public MessageDeltaContentImageUrlObjectImageUrl detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.")
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
    MessageDeltaContentImageUrlObjectImageUrl messageDeltaContentImageUrlObjectImageUrl = (MessageDeltaContentImageUrlObjectImageUrl) o;
    return Objects.equals(url, messageDeltaContentImageUrlObjectImageUrl.url) &&
        Objects.equals(detail, messageDeltaContentImageUrlObjectImageUrl.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageUrlObjectImageUrl {\n");
    
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

