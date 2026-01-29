package apimodels;

import apimodels.MessageDeltaContentTextAnnotationsFileCitationObject;
import apimodels.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import apimodels.MessageDeltaContentTextAnnotationsFilePathObject;
import apimodels.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MessageDeltaContentTextObjectTextAnnotationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageDeltaContentTextObjectTextAnnotationsInner   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

  /**
   * Always `file_citation`.
   */
  public enum TypeEnum {
    FILE_CITATION("file_citation"),
    
    FILE_PATH("file_path");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("text")
  
  private String text;

  @JsonProperty("file_citation")
  @Valid

  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  @JsonProperty("start_index")
  @Min(0)

  private Integer startIndex;

  @JsonProperty("end_index")
  @Min(0)

  private Integer endIndex;

  @JsonProperty("file_path")
  @Valid

  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

  public MessageDeltaContentTextObjectTextAnnotationsInner index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the annotation in the text content part.
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentTextObjectTextAnnotationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Always `file_citation`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextObjectTextAnnotationsInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text in the message content that needs to be replaced.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageDeltaContentTextObjectTextAnnotationsInner fileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

   /**
   * Get fileCitation
   * @return fileCitation
  **/
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  public MessageDeltaContentTextObjectTextAnnotationsInner startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
  **/
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageDeltaContentTextObjectTextAnnotationsInner endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
  **/
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public MessageDeltaContentTextObjectTextAnnotationsInner filePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentTextObjectTextAnnotationsInner messageDeltaContentTextObjectTextAnnotationsInner = (MessageDeltaContentTextObjectTextAnnotationsInner) o;
    return Objects.equals(index, messageDeltaContentTextObjectTextAnnotationsInner.index) &&
        Objects.equals(type, messageDeltaContentTextObjectTextAnnotationsInner.type) &&
        Objects.equals(text, messageDeltaContentTextObjectTextAnnotationsInner.text) &&
        Objects.equals(fileCitation, messageDeltaContentTextObjectTextAnnotationsInner.fileCitation) &&
        Objects.equals(startIndex, messageDeltaContentTextObjectTextAnnotationsInner.startIndex) &&
        Objects.equals(endIndex, messageDeltaContentTextObjectTextAnnotationsInner.endIndex) &&
        Objects.equals(filePath, messageDeltaContentTextObjectTextAnnotationsInner.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, fileCitation, startIndex, endIndex, filePath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextObjectTextAnnotationsInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fileCitation: ").append(toIndentedString(fileCitation)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

