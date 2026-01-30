package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentTextAnnotationsFileCitationObject   {
  

  /**
   * Always &#x60;file_citation&#x60;.
   */
  public enum TypeEnum {
    FILE_CITATION("file_citation");
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
  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;
  private Integer startIndex;
  private Integer endIndex;

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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file_citation")
  @NotNull
  @Valid
  public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }
  public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  /**
   * minimum: 0
   **/
  
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

