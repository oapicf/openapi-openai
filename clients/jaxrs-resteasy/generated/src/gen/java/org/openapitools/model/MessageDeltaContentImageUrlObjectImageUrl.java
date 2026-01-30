package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentImageUrlObjectImageUrl   {
  
  private String url;

  /**
   * Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
   */
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
      return String.valueOf(value);
    }
  }

  private DetailEnum detail = DetailEnum.AUTO;

  /**
   * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
   **/
  
  @ApiModelProperty(value = "The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

