package apimodels;

import apimodels.MessageContentTextAnnotationsFileCitationObject;
import apimodels.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import apimodels.MessageContentTextAnnotationsFilePathObject;
import apimodels.MessageContentTextAnnotationsFilePathObjectFilePath;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MessageContentTextObjectTextAnnotationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageContentTextObjectTextAnnotationsInner   {
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
  @NotNull

  private String text;

  @JsonProperty("file_citation")
  @NotNull
@Valid

  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  @JsonProperty("start_index")
  @NotNull
@Min(0)

  private Integer startIndex;

  @JsonProperty("end_index")
  @NotNull
@Min(0)

  private Integer endIndex;

  @JsonProperty("file_path")
  @NotNull
@Valid

  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  public MessageContentTextObjectTextAnnotationsInner type(TypeEnum type) {
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

  public MessageContentTextObjectTextAnnotationsInner text(String text) {
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

  public MessageContentTextObjectTextAnnotationsInner fileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

   /**
   * Get fileCitation
   * @return fileCitation
  **/
  public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  public MessageContentTextObjectTextAnnotationsInner startIndex(Integer startIndex) {
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

  public MessageContentTextObjectTextAnnotationsInner endIndex(Integer endIndex) {
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

  public MessageContentTextObjectTextAnnotationsInner filePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  public void setFilePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
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
    MessageContentTextObjectTextAnnotationsInner messageContentTextObjectTextAnnotationsInner = (MessageContentTextObjectTextAnnotationsInner) o;
    return Objects.equals(type, messageContentTextObjectTextAnnotationsInner.type) &&
        Objects.equals(text, messageContentTextObjectTextAnnotationsInner.text) &&
        Objects.equals(fileCitation, messageContentTextObjectTextAnnotationsInner.fileCitation) &&
        Objects.equals(startIndex, messageContentTextObjectTextAnnotationsInner.startIndex) &&
        Objects.equals(endIndex, messageContentTextObjectTextAnnotationsInner.endIndex) &&
        Objects.equals(filePath, messageContentTextObjectTextAnnotationsInner.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, fileCitation, startIndex, endIndex, filePath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextObjectTextAnnotationsInner {\n");
    
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

