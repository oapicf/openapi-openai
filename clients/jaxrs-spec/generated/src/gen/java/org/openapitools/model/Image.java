package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents the url or the content of an image generated by the OpenAI API.
 **/
@ApiModel(description = "Represents the url or the content of an image generated by the OpenAI API.")
@JsonTypeName("Image")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-14T13:42:15.676976801Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Image   {
  private @Valid String b64Json;
  private @Valid String url;
  private @Valid String revisedPrompt;

  /**
   * The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;.
   **/
  public Image b64Json(String b64Json) {
    this.b64Json = b64Json;
    return this;
  }

  
  @ApiModelProperty(value = "The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.")
  @JsonProperty("b64_json")
  public String getB64Json() {
    return b64Json;
  }

  @JsonProperty("b64_json")
  public void setB64Json(String b64Json) {
    this.b64Json = b64Json;
  }

  /**
   * The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default).
   **/
  public Image url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The URL of the generated image, if `response_format` is `url` (default).")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The prompt that was used to generate the image, if there was any revision to the prompt.
   **/
  public Image revisedPrompt(String revisedPrompt) {
    this.revisedPrompt = revisedPrompt;
    return this;
  }

  
  @ApiModelProperty(value = "The prompt that was used to generate the image, if there was any revision to the prompt.")
  @JsonProperty("revised_prompt")
  public String getRevisedPrompt() {
    return revisedPrompt;
  }

  @JsonProperty("revised_prompt")
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
    return Objects.equals(this.b64Json, image.b64Json) &&
        Objects.equals(this.url, image.url) &&
        Objects.equals(this.revisedPrompt, image.revisedPrompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b64Json, url, revisedPrompt);
  }

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

