package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageContentTextObjectTextAnnotationsInner  {
  
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
  @ApiModelProperty(required = true, value = "The text in the message content that needs to be replaced.")
  private String text;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  @ApiModelProperty(required = true, value = "")
  private Integer startIndex;

  @ApiModelProperty(required = true, value = "")
  private Integer endIndex;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;
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
  public MessageContentTextObjectTextAnnotationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text in the message content that needs to be replaced.
  * @return text
  */
  @JsonProperty("text")
  @NotNull
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
  public MessageContentTextObjectTextAnnotationsInner text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Get fileCitation
  * @return fileCitation
  */
  @JsonProperty("file_citation")
  @NotNull
  public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  /**
   * Sets the <code>fileCitation</code> property.
   */
 public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  /**
   * Sets the <code>fileCitation</code> property.
   */
  public MessageContentTextObjectTextAnnotationsInner fileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

 /**
  * Get startIndex
  * minimum: 0
  * @return startIndex
  */
  @JsonProperty("start_index")
  @NotNull
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
  public MessageContentTextObjectTextAnnotationsInner startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

 /**
  * Get endIndex
  * minimum: 0
  * @return endIndex
  */
  @JsonProperty("end_index")
  @NotNull
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
  public MessageContentTextObjectTextAnnotationsInner endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

 /**
  * Get filePath
  * @return filePath
  */
  @JsonProperty("file_path")
  @NotNull
  public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  /**
   * Sets the <code>filePath</code> property.
   */
 public void setFilePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  /**
   * Sets the <code>filePath</code> property.
   */
  public MessageContentTextObjectTextAnnotationsInner filePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
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
    MessageContentTextObjectTextAnnotationsInner messageContentTextObjectTextAnnotationsInner = (MessageContentTextObjectTextAnnotationsInner) o;
    return Objects.equals(this.type, messageContentTextObjectTextAnnotationsInner.type) &&
        Objects.equals(this.text, messageContentTextObjectTextAnnotationsInner.text) &&
        Objects.equals(this.fileCitation, messageContentTextObjectTextAnnotationsInner.fileCitation) &&
        Objects.equals(this.startIndex, messageContentTextObjectTextAnnotationsInner.startIndex) &&
        Objects.equals(this.endIndex, messageContentTextObjectTextAnnotationsInner.endIndex) &&
        Objects.equals(this.filePath, messageContentTextObjectTextAnnotationsInner.filePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, fileCitation, startIndex, endIndex, filePath);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

