package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChatCompletionRequestMessageContentPartImageImageUrl  {
  
 /**
  * Either a URL of the image or the base64 encoded image data.
  */
  @ApiModelProperty(required = true, value = "Either a URL of the image or the base64 encoded image data.")
  private URI url;

public enum DetailEnum {

    @JsonProperty("auto") AUTO(String.valueOf("auto")),
    @JsonProperty("low") LOW(String.valueOf("low")),
    @JsonProperty("high") HIGH(String.valueOf("high"));

    private String value;

    DetailEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DetailEnum fromValue(String value) {
        for (DetailEnum b : DetailEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  */
  @ApiModelProperty(value = "Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).")
  private DetailEnum detail = DetailEnum.AUTO;
 /**
  * Either a URL of the image or the base64 encoded image data.
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public URI getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public ChatCompletionRequestMessageContentPartImageImageUrl url(URI url) {
    this.url = url;
    return this;
  }

 /**
  * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  * @return detail
  */
  @JsonProperty("detail")
  public String getDetail() {
    return detail == null ? null : detail.value();
  }

  /**
   * Sets the <code>detail</code> property.
   */
 public void setDetail(DetailEnum detail) {
    this.detail = detail;
  }

  /**
   * Sets the <code>detail</code> property.
   */
  public ChatCompletionRequestMessageContentPartImageImageUrl detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageContentPartImageImageUrl chatCompletionRequestMessageContentPartImageImageUrl = (ChatCompletionRequestMessageContentPartImageImageUrl) o;
    return Objects.equals(this.url, chatCompletionRequestMessageContentPartImageImageUrl.url) &&
        Objects.equals(this.detail, chatCompletionRequestMessageContentPartImageImageUrl.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartImageImageUrl {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

