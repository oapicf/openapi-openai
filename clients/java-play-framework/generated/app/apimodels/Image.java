package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents the url or the content of an image generated by the OpenAI API.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Image   {
  @JsonProperty("b64_json")
  
  private String b64Json;

  @JsonProperty("url")
  
  private String url;

  @JsonProperty("revised_prompt")
  
  private String revisedPrompt;

  public Image b64Json(String b64Json) {
    this.b64Json = b64Json;
    return this;
  }

   /**
   * The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
   * @return b64Json
  **/
  public String getB64Json() {
    return b64Json;
  }

  public void setB64Json(String b64Json) {
    this.b64Json = b64Json;
  }

  public Image url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the generated image, if `response_format` is `url` (default).
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Image revisedPrompt(String revisedPrompt) {
    this.revisedPrompt = revisedPrompt;
    return this;
  }

   /**
   * The prompt that was used to generate the image, if there was any revision to the prompt.
   * @return revisedPrompt
  **/
  public String getRevisedPrompt() {
    return revisedPrompt;
  }

  public void setRevisedPrompt(String revisedPrompt) {
    this.revisedPrompt = revisedPrompt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(b64Json, image.b64Json) &&
        Objects.equals(url, image.url) &&
        Objects.equals(revisedPrompt, image.revisedPrompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b64Json, url, revisedPrompt);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    b64Json: ").append(toIndentedString(b64Json)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    revisedPrompt: ").append(toIndentedString(revisedPrompt)).append("\n");
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

