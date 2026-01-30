package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextObjectTextAnnotationsInner   {
  
  private Integer index;

  /**
   * Always &#x60;file_citation&#x60;.
   */
  public enum TypeEnum {
    FILE_CITATION("file_citation"),

        FILE_PATH("file_path");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String text;
  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;
  private Integer startIndex;
  private Integer endIndex;
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

  /**
   * The index of the annotation in the text content part.
   **/
  
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;file_citation&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "Always `file_citation`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text in the message content that needs to be replaced.
   **/
  
  @ApiModelProperty(value = "The text in the message content that needs to be replaced.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file_citation")
  @Valid
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }
  public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start_index")
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end_index")
 @Min(0)  public Integer getEndIndex() {
    return endIndex;
  }
  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file_path")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

