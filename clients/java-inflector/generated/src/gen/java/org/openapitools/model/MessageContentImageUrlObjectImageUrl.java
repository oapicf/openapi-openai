package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentImageUrlObjectImageUrl   {
  @JsonProperty("url")
  private URI url;

  /**
   * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
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

    @JsonCreator
    public static DetailEnum fromValue(String text) {
      for (DetailEnum b : DetailEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("detail")
  private DetailEnum detail = DetailEnum.AUTO;

  /**
   * The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
   **/
  public MessageContentImageUrlObjectImageUrl url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.")
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
   **/
  public MessageContentImageUrlObjectImageUrl detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`")
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
    return Objects.equals(url, messageContentImageUrlObjectImageUrl.url) &&
        Objects.equals(detail, messageContentImageUrlObjectImageUrl.detail);
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

