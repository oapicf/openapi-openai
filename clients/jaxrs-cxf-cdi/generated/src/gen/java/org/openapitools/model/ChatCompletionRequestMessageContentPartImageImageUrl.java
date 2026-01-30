package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ChatCompletionRequestMessageContentPartImageImageUrl   {
  
  private URI url;


public enum DetailEnum {

    @JsonProperty("auto") AUTO(String.valueOf("auto")), @JsonProperty("low") LOW(String.valueOf("low")), @JsonProperty("high") HIGH(String.valueOf("high"));


    private String value;

    DetailEnum(String v) {
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

  private DetailEnum detail = DetailEnum.AUTO;

  /**
   * Either a URL of the image or the base64 encoded image data.
   **/
  public ChatCompletionRequestMessageContentPartImageImageUrl url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Either a URL of the image or the base64 encoded image data.")
  @JsonProperty("url")
  @NotNull
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }


  /**
   * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
   **/
  public ChatCompletionRequestMessageContentPartImageImageUrl detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

