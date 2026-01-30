package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaContentImageUrlObjectImageUrl  {
  
 /**
  * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  */
  @ApiModelProperty(value = "The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.")
  private String url;

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
  * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  */
  @ApiModelProperty(value = "Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.")
  private DetailEnum detail = DetailEnum.AUTO;
 /**
  * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public MessageDeltaContentImageUrlObjectImageUrl url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
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
  public MessageDeltaContentImageUrlObjectImageUrl detail(DetailEnum detail) {
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
    MessageDeltaContentImageUrlObjectImageUrl messageDeltaContentImageUrlObjectImageUrl = (MessageDeltaContentImageUrlObjectImageUrl) o;
    return Objects.equals(this.url, messageDeltaContentImageUrlObjectImageUrl.url) &&
        Objects.equals(this.detail, messageDeltaContentImageUrlObjectImageUrl.detail);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

