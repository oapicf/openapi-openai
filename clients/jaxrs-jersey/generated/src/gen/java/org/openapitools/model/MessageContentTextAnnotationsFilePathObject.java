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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */
@ApiModel(description = "A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")
@JsonPropertyOrder({
  MessageContentTextAnnotationsFilePathObject.JSON_PROPERTY_TYPE,
  MessageContentTextAnnotationsFilePathObject.JSON_PROPERTY_TEXT,
  MessageContentTextAnnotationsFilePathObject.JSON_PROPERTY_FILE_PATH,
  MessageContentTextAnnotationsFilePathObject.JSON_PROPERTY_START_INDEX,
  MessageContentTextAnnotationsFilePathObject.JSON_PROPERTY_END_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageContentTextAnnotationsFilePathObject   {
  /**
   * Always &#x60;file_path&#x60;.
   */
  public enum TypeEnum {
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

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  public static final String JSON_PROPERTY_START_INDEX = "start_index";
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  private Integer startIndex;

  public static final String JSON_PROPERTY_END_INDEX = "end_index";
  @JsonProperty(JSON_PROPERTY_END_INDEX)
  private Integer endIndex;

  public MessageContentTextAnnotationsFilePathObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;file_path&#x60;.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "Always `file_path`.")
  @NotNull 
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageContentTextAnnotationsFilePathObject text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text in the message content that needs to be replaced.
   * @return text
   **/
  @JsonProperty(value = "text")
  @ApiModelProperty(required = true, value = "The text in the message content that needs to be replaced.")
  @NotNull 
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageContentTextAnnotationsFilePathObject filePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * Get filePath
   * @return filePath
   **/
  @JsonProperty(value = "file_path")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  public void setFilePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  public MessageContentTextAnnotationsFilePathObject startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
   **/
  @JsonProperty(value = "start_index")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Min(0)
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageContentTextAnnotationsFilePathObject endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
   **/
  @JsonProperty(value = "end_index")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Min(0)
  public Integer getEndIndex() {
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
    MessageContentTextAnnotationsFilePathObject messageContentTextAnnotationsFilePathObject = (MessageContentTextAnnotationsFilePathObject) o;
    return Objects.equals(this.type, messageContentTextAnnotationsFilePathObject.type) &&
        Objects.equals(this.text, messageContentTextAnnotationsFilePathObject.text) &&
        Objects.equals(this.filePath, messageContentTextAnnotationsFilePathObject.filePath) &&
        Objects.equals(this.startIndex, messageContentTextAnnotationsFilePathObject.startIndex) &&
        Objects.equals(this.endIndex, messageContentTextAnnotationsFilePathObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, filePath, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextAnnotationsFilePathObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

