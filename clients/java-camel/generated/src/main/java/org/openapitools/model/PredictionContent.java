package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PredictionContentContent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */

@Schema(name = "PredictionContent", description = "Static predicted output content, such as the content of a text file that is being regenerated. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PredictionContent {

  /**
   * The type of the predicted content you want to provide. This type is currently always `content`. 
   */
  public enum TypeEnum {
    CONTENT("content");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private PredictionContentContent content;

  public PredictionContent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PredictionContent(TypeEnum type, PredictionContentContent content) {
    this.type = type;
    this.content = content;
  }

  public PredictionContent type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the predicted content you want to provide. This type is currently always `content`. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The type of the predicted content you want to provide. This type is currently always `content`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PredictionContent content(PredictionContentContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @NotNull @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public PredictionContentContent getContent() {
    return content;
  }

  public void setContent(PredictionContentContent content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionContent predictionContent = (PredictionContent) o;
    return Objects.equals(this.type, predictionContent.type) &&
        Objects.equals(this.content, predictionContent.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionContent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

