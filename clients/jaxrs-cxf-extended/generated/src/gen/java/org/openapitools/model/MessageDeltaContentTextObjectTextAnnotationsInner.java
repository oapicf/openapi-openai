package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaContentTextObjectTextAnnotationsInner  {
  
 /**
  * The index of the annotation in the text content part.
  */
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")
  private Integer index;

public enum TypeEnum {

    @JsonProperty("file_citation") CITATION(String.valueOf("file_citation")),
    @JsonProperty("file_path") PATH(String.valueOf("file_path"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Always `file_citation`.
  */
  @ApiModelProperty(required = true, value = "Always `file_citation`.")
  private TypeEnum type;

 /**
  * The text in the message content that needs to be replaced.
  */
  @ApiModelProperty(value = "The text in the message content that needs to be replaced.")
  private String text;

  @ApiModelProperty(value = "")
  @Valid
  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  @ApiModelProperty(value = "")
  private Integer startIndex;

  @ApiModelProperty(value = "")
  private Integer endIndex;

  @ApiModelProperty(value = "")
  @Valid
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;
 /**
  * The index of the annotation in the text content part.
  * @return index
  */
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * Always &#x60;file_citation&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text in the message content that needs to be replaced.
  * @return text
  */
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Get fileCitation
  * @return fileCitation
  */
  @JsonProperty("file_citation")
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  /**
   * Sets the <code>fileCitation</code> property.
   */
 public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  /**
   * Sets the <code>fileCitation</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner fileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

 /**
  * Get startIndex
  * minimum: 0
  * @return startIndex
  */
  @JsonProperty("start_index")
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }

  /**
   * Sets the <code>startIndex</code> property.
   */
 public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * Sets the <code>startIndex</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

 /**
  * Get endIndex
  * minimum: 0
  * @return endIndex
  */
  @JsonProperty("end_index")
 @Min(0)  public Integer getEndIndex() {
    return endIndex;
  }

  /**
   * Sets the <code>endIndex</code> property.
   */
 public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  /**
   * Sets the <code>endIndex</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

 /**
  * Get filePath
  * @return filePath
  */
  @JsonProperty("file_path")
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  /**
   * Sets the <code>filePath</code> property.
   */
 public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  /**
   * Sets the <code>filePath</code> property.
   */
  public MessageDeltaContentTextObjectTextAnnotationsInner filePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
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
    MessageDeltaContentTextObjectTextAnnotationsInner messageDeltaContentTextObjectTextAnnotationsInner = (MessageDeltaContentTextObjectTextAnnotationsInner) o;
    return Objects.equals(this.index, messageDeltaContentTextObjectTextAnnotationsInner.index) &&
        Objects.equals(this.type, messageDeltaContentTextObjectTextAnnotationsInner.type) &&
        Objects.equals(this.text, messageDeltaContentTextObjectTextAnnotationsInner.text) &&
        Objects.equals(this.fileCitation, messageDeltaContentTextObjectTextAnnotationsInner.fileCitation) &&
        Objects.equals(this.startIndex, messageDeltaContentTextObjectTextAnnotationsInner.startIndex) &&
        Objects.equals(this.endIndex, messageDeltaContentTextObjectTextAnnotationsInner.endIndex) &&
        Objects.equals(this.filePath, messageDeltaContentTextObjectTextAnnotationsInner.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, fileCitation, startIndex, endIndex, filePath);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

