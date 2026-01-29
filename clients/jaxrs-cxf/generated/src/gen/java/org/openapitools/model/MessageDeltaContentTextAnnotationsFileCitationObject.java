package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 */
@ApiModel(description="A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.")

public class MessageDeltaContentTextAnnotationsFileCitationObject  {
  
 /**
  * The index of the annotation in the text content part.
  */
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")

  private Integer index;

public enum TypeEnum {

FILE_CITATION(String.valueOf("file_citation"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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
 /**
   * The index of the annotation in the text content part.
   * @return index
  **/
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Always &#x60;file_citation&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The text in the message content that needs to be replaced.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Get fileCitation
   * @return fileCitation
  **/
  @JsonProperty("file_citation")
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject fileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

 /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
  **/
  @JsonProperty("start_index")
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

 /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
  **/
  @JsonProperty("end_index")
 @Min(0)  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObject endIndex(Integer endIndex) {
    this.endIndex = endIndex;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

