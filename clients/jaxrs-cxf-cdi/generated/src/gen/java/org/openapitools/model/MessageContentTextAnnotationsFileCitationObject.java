package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.")
public class MessageContentTextAnnotationsFileCitationObject   {
  

public enum TypeEnum {

    @JsonProperty("file_citation") FILE_CITATION(String.valueOf("file_citation"));


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

  /**
   * Always &#x60;file_citation&#x60;.
   **/
  public MessageContentTextAnnotationsFileCitationObject type(TypeEnum type) {
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
  public MessageContentTextAnnotationsFileCitationObject text(String text) {
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
  public MessageContentTextAnnotationsFileCitationObject fileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
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
  public MessageContentTextAnnotationsFileCitationObject startIndex(Integer startIndex) {
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
  public MessageContentTextAnnotationsFileCitationObject endIndex(Integer endIndex) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextAnnotationsFileCitationObject messageContentTextAnnotationsFileCitationObject = (MessageContentTextAnnotationsFileCitationObject) o;
    return Objects.equals(this.type, messageContentTextAnnotationsFileCitationObject.type) &&
        Objects.equals(this.text, messageContentTextAnnotationsFileCitationObject.text) &&
        Objects.equals(this.fileCitation, messageContentTextAnnotationsFileCitationObject.fileCitation) &&
        Objects.equals(this.startIndex, messageContentTextAnnotationsFileCitationObject.startIndex) &&
        Objects.equals(this.endIndex, messageContentTextAnnotationsFileCitationObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, fileCitation, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextAnnotationsFileCitationObject {\n");
    
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

