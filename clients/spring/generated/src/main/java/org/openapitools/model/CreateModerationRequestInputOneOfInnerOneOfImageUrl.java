package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 */

@Schema(name = "CreateModerationRequest_input_oneOf_inner_oneOf_image_url", description = "Contains either an image URL or a data URL for a base64 encoded image.")
@JsonTypeName("CreateModerationRequest_input_oneOf_inner_oneOf_image_url")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationRequestInputOneOfInnerOneOfImageUrl {

  private URI url;

  public CreateModerationRequestInputOneOfInnerOneOfImageUrl() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateModerationRequestInputOneOfInnerOneOfImageUrl(URI url) {
    this.url = url;
  }

  public CreateModerationRequestInputOneOfInnerOneOfImageUrl url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Either a URL of the image or the base64 encoded image data.
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", example = "https://example.com/image.jpg", description = "Either a URL of the image or the base64 encoded image data.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

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

