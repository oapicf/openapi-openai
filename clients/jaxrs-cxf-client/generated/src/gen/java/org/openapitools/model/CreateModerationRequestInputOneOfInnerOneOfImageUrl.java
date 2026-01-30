package org.openapitools.model;

import java.net.URI;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 */
@ApiModel(description="Contains either an image URL or a data URL for a base64 encoded image.")

public class CreateModerationRequestInputOneOfInnerOneOfImageUrl  {
  
 /**
  * Either a URL of the image or the base64 encoded image data.
  */
  @ApiModelProperty(example = "https://example.com/image.jpg", required = true, value = "Either a URL of the image or the base64 encoded image data.")

  private URI url;
 /**
   * Either a URL of the image or the base64 encoded image data.
   * @return url
  **/
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public CreateModerationRequestInputOneOfInnerOneOfImageUrl url(URI url) {
    this.url = url;
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
    CreateModerationRequestInputOneOfInnerOneOfImageUrl createModerationRequestInputOneOfInnerOneOfImageUrl = (CreateModerationRequestInputOneOfInnerOneOfImageUrl) o;
    return Objects.equals(this.url, createModerationRequestInputOneOfInnerOneOfImageUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestInputOneOfInnerOneOfImageUrl {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

