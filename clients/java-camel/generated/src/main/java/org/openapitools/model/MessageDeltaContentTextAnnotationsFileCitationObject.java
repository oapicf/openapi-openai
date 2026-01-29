package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */

@Schema(name = "MessageDeltaContentTextAnnotationsFileCitationObject", description = "A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T10:45:13.353144236Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextAnnotationsFileCitationObject implements MessageDeltaContentTextObjectTextAnnotationsInner {

  private Integer index;

  /**
   * Always `file_citation`.
   */
  public enum TypeEnum {
    FILE_CITATION("file_citation");

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

  private String text;

  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  private Integer startIndex;

  private Integer endIndex;

  public MessageDeltaContentTextAnnotationsFileCitationObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageDeltaContentTextAnnotationsFileCitationObject(Integer index, TypeEnum type) {
    this.index = index;
    this.type = type;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject index(Integer index) {
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

  public MessageDeltaContentTextAnnotationsFileCitationObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always `file_citation`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Always `file_citation`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text in the message content that needs to be replaced.
   * @return text
   */
  
  @Schema(name = "text", description = "The text in the message content that needs to be replaced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject fileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

  /**
   * Get fileCitation
   * @return fileCitation
   */
  @Valid 
  @Schema(name = "file_citation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_citation")
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject startIndex(Integer startIndex) {
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
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject endIndex(Integer endIndex) {
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
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
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
    MessageDeltaContentTextAnnotationsFileCitationObject messageDeltaContentTextAnnotationsFileCitationObject = (MessageDeltaContentTextAnnotationsFileCitationObject) o;
    return Objects.equals(this.index, messageDeltaContentTextAnnotationsFileCitationObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextAnnotationsFileCitationObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextAnnotationsFileCitationObject.text) &&
        Objects.equals(this.fileCitation, messageDeltaContentTextAnnotationsFileCitationObject.fileCitation) &&
        Objects.equals(this.startIndex, messageDeltaContentTextAnnotationsFileCitationObject.startIndex) &&
        Objects.equals(this.endIndex, messageDeltaContentTextAnnotationsFileCitationObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, fileCitation, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFileCitationObject {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fileCitation: ").append(toIndentedString(fileCitation)).append("\n");
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

