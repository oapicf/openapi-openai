package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 **/
@ApiModel(description = "Contains either an image URL or a data URL for a base64 encoded image.")
@JsonTypeName("CreateModerationRequest_input_oneOf_inner_oneOf_image_url")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationRequestInputOneOfInnerOneOfImageUrl   {
  private URI url;

  public CreateModerationRequestInputOneOfInnerOneOfImageUrl() {
  }

  @JsonCreator
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl(
    @JsonProperty(required = true, value = "url") URI url
  ) {
    this.url = url;
  }

  /**
   * Either a URL of the image or the base64 encoded image data.
   **/
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://example.com/image.jpg", required = true, value = "Either a URL of the image or the base64 encoded image data.")
  @JsonProperty(required = true, value = "url")
  @NotNull public URI getUrl() {
    return url;
  }

  @JsonProperty(required = true, value = "url")
  public void setUrl(URI url) {
    this.url = url;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

