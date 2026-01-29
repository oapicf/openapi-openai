package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */

@Schema(name = "MessageDeltaContentTextAnnotationsFilePathObject", description = "A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextAnnotationsFilePathObject implements MessageDeltaContentTextObjectTextAnnotationsInner {

  private Integer index;

  /**
   * Always `file_path`.
   */
  public enum TypeEnum {
    FILE_PATH("file_path");

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

  private @Nullable String text;

  private @Nullable MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

  private @Nullable Integer startIndex;

  private @Nullable Integer endIndex;

  public MessageDeltaContentTextAnnotationsFilePathObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageDeltaContentTextAnnotationsFilePathObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the annotation in the text content part.
   * @return index
   */
  @NotNull 
  @Schema(name = "index", description = "The index of the annotation in the text content part.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `file_path`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `file_path`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * The text in the message content that needs to be replaced.
   * @return text
   */
  
  @Schema(name = "text", description = "The text in the message content that needs to be replaced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject filePath(@Nullable MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Get filePath
   * @return filePath
   */
  @Valid 
  @Schema(name = "file_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_path")
  public @Nullable MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  public void setFilePath(@Nullable MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject startIndex(@Nullable Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
   */
  @Min(value = 0) 
  @Schema(name = "start_index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_index")
  public @Nullable Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(@Nullable Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject endIndex(@Nullable Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
   */
  @Min(value = 0) 
  @Schema(name = "end_index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_index")
  public @Nullable Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(@Nullable Integer endIndex) {
    this.endIndex = endIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentTextAnnotationsFilePathObject messageDeltaContentTextAnnotationsFilePathObject = (MessageDeltaContentTextAnnotationsFilePathObject) o;
    return Objects.equals(this.index, messageDeltaContentTextAnnotationsFilePathObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextAnnotationsFilePathObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextAnnotationsFilePathObject.text) &&
        Objects.equals(this.filePath, messageDeltaContentTextAnnotationsFilePathObject.filePath) &&
        Objects.equals(this.startIndex, messageDeltaContentTextAnnotationsFilePathObject.startIndex) &&
        Objects.equals(this.endIndex, messageDeltaContentTextAnnotationsFilePathObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, filePath, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFilePathObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

