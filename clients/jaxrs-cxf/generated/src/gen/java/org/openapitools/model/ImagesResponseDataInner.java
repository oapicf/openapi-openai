package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImagesResponseDataInner  {
  
  @ApiModelProperty(value = "")
  private String url;

  @ApiModelProperty(value = "")
  private String b64Json;
 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImagesResponseDataInner url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get b64Json
   * @return b64Json
  **/
  @JsonProperty("b64_json")
  public String getB64Json() {
    return b64Json;
  }

  public void setB64Json(String b64Json) {
    this.b64Json = b64Json;
  }

  public ImagesResponseDataInner b64Json(String b64Json) {
    this.b64Json = b64Json;
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
    ImagesResponseDataInner imagesResponseDataInner = (ImagesResponseDataInner) o;
    return Objects.equals(this.url, imagesResponseDataInner.url) &&
        Objects.equals(this.b64Json, imagesResponseDataInner.b64Json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, b64Json);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesResponseDataInner {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    b64Json: ").append(toIndentedString(b64Json)).append("\n");
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

