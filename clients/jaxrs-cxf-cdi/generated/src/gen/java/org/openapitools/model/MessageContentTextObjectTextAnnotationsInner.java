package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class MessageContentTextObjectTextAnnotationsInner   {
  

public enum TypeEnum {

    @JsonProperty("file_citation") CITATION(String.valueOf("file_citation")), @JsonProperty("file_path") PATH(String.valueOf("file_path"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String text;

  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  private Integer startIndex;

  private Integer endIndex;

  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  /**
   * Always &#x60;file_citation&#x60;.
   **/
  public MessageContentTextObjectTextAnnotationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
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
  public MessageContentTextObjectTextAnnotationsInner text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text in the message content that needs to be replaced.")
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public MessageContentTextObjectTextAnnotationsInner fileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file_citation")
  @NotNull
  public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }
  public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }


  /**
   * minimum: 0
   **/
  public MessageContentTextObjectTextAnnotationsInner startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start_index")
  @NotNull
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  /**
   * minimum: 0
   **/
  public MessageContentTextObjectTextAnnotationsInner endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("end_index")
  @NotNull
 @Min(0)  public Integer getEndIndex() {
    return endIndex;
  }
  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }


  /**
   **/
  public MessageContentTextObjectTextAnnotationsInner filePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file_path")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

