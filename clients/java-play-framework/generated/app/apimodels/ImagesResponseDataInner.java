package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ImagesResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ImagesResponseDataInner   {
  @JsonProperty("url")
  
  private String url;

  @JsonProperty("b64_json")
  
  private String b64Json;

  public ImagesResponseDataInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImagesResponseDataInner b64Json(String b64Json) {
    this.b64Json = b64Json;
    return this;
  }

   /**
   * Get b64Json
   * @return b64Json
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

