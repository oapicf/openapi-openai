package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImagesResponseDataInner   {
  
  private String url;
  private String b64Json;

  public ImagesResponseDataInner () {

  }

  public ImagesResponseDataInner (String url, String b64Json) {
    this.url = url;
    this.b64Json = b64Json;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("b64_json")
  public String getB64Json() {
    return b64Json;
  }
  public void setB64Json(String b64Json) {
    this.b64Json = b64Json;
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
    return Objects.equals(url, imagesResponseDataInner.url) &&
        Objects.equals(b64Json, imagesResponseDataInner.b64Json);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
