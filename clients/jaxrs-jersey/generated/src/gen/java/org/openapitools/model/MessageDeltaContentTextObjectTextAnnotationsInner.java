/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MessageDeltaContentTextObjectTextAnnotationsInner
 */
@JsonPropertyOrder({
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_INDEX,
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_TYPE,
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_TEXT,
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_FILE_CITATION,
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_START_INDEX,
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_END_INDEX,
  MessageDeltaContentTextObjectTextAnnotationsInner.JSON_PROPERTY_FILE_PATH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-04-14T13:41:38.036864137Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageDeltaContentTextObjectTextAnnotationsInner   {
  public static final String JSON_PROPERTY_INDEX = "index";
  @JsonProperty(JSON_PROPERTY_INDEX)
  private Integer index;

  /**
   * Always &#x60;file_citation&#x60;.
   */
  public enum TypeEnum {
    CITATION("file_citation"),
    
    PATH("file_path");

    private String value;

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

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_TEXT = "text";
  @JsonProperty(JSON_PROPERTY_TEXT)
  private String text;

  public static final String JSON_PROPERTY_FILE_CITATION = "file_citation";
  @JsonProperty(JSON_PROPERTY_FILE_CITATION)
  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  private Integer startIndex;

  public static final String JSON_PROPERTY_END_INDEX = "end_index";
  @JsonProperty(JSON_PROPERTY_END_INDEX)
  private Integer endIndex;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

  public MessageDeltaContentTextObjectTextAnnotationsInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the annotation in the text content part.
   * @return index
   **/
  @JsonProperty(value = "index")
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")
  @NotNull 
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
   * Always &#x60;file_citation&#x60;.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "Always `file_citation`.")
  @NotNull 
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
  @JsonProperty(value = "text")
  @ApiModelProperty(value = "The text in the message content that needs to be replaced.")
  
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
  @JsonProperty(value = "file_citation")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "start_index")
  @ApiModelProperty(value = "")
   @Min(0)
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
  @JsonProperty(value = "end_index")
  @ApiModelProperty(value = "")
   @Min(0)
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
  @JsonProperty(value = "file_path")
  @ApiModelProperty(value = "")
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

