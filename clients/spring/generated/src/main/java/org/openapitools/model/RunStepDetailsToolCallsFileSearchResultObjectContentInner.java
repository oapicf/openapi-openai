package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RunStepDetailsToolCallsFileSearchResultObjectContentInner
 */

@JsonTypeName("RunStepDetailsToolCallsFileSearchResultObject_content_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchResultObjectContentInner {

  /**
   * The type of the content.
   */
  public enum TypeEnum {
    TEXT("text");

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

  private @Nullable TypeEnum type;

  private @Nullable String text;

  public RunStepDetailsToolCallsFileSearchResultObjectContentInner type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the content.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of the content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsFileSearchResultObjectContentInner text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content of the file.
   * @return text
   */
  
  @Schema(name = "text", description = "The text content of the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchResultObjectContentInner runStepDetailsToolCallsFileSearchResultObjectContentInner = (RunStepDetailsToolCallsFileSearchResultObjectContentInner) o;
    return Objects.equals(this.type, runStepDetailsToolCallsFileSearchResultObjectContentInner.type) &&
        Objects.equals(this.text, runStepDetailsToolCallsFileSearchResultObjectContentInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchResultObjectContentInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

