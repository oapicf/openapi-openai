package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 **/
@ApiModel(description = "A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")
@JsonTypeName("MessageDeltaContentTextAnnotationsFilePathObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextAnnotationsFilePathObject   {
  private Integer index;
  public enum TypeEnum {

    FILE_PATH(String.valueOf("file_path"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private TypeEnum type;
  private String text;
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;
  private Integer startIndex;
  private Integer endIndex;

  public MessageDeltaContentTextAnnotationsFilePathObject() {
  }

  @JsonCreator
  public MessageDeltaContentTextAnnotationsFilePathObject(
    @JsonProperty(required = true, value = "index") Integer index,
    @JsonProperty(required = true, value = "type") TypeEnum type
  ) {
    this.index = index;
    this.type = type;
  }

  /**
   * The index of the annotation in the text content part.
   **/
  public MessageDeltaContentTextAnnotationsFilePathObject index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")
  @JsonProperty(required = true, value = "index")
  @NotNull public Integer getIndex() {
    return index;
  }

  @JsonProperty(required = true, value = "index")
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always &#x60;file_path&#x60;.
   **/
  public MessageDeltaContentTextAnnotationsFilePathObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `file_path`.")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text in the message content that needs to be replaced.
   **/
  public MessageDeltaContentTextAnnotationsFilePathObject text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "The text in the message content that needs to be replaced.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  @JsonProperty("text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public MessageDeltaContentTextAnnotationsFilePathObject filePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file_path")
  @Valid public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  @JsonProperty("file_path")
  public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  /**
   * minimum: 0
   **/
  public MessageDeltaContentTextAnnotationsFilePathObject startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("start_index")
   @Min(0)public Integer getStartIndex() {
    return startIndex;
  }

  @JsonProperty("start_index")
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * minimum: 0
   **/
  public MessageDeltaContentTextAnnotationsFilePathObject endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("end_index")
   @Min(0)public Integer getEndIndex() {
    return endIndex;
  }

  @JsonProperty("end_index")
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
    MessageDeltaContentTextAnnotationsFilePathObject messageDeltaContentTextAnnotationsFilePathObject = (MessageDeltaContentTextAnnotationsFilePathObject) o;
    return Objects.equals(this.index, messageDeltaContentTextAnnotationsFilePathObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextAnnotationsFilePathObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextAnnotationsFilePathObject.text) &&
        Objects.equals(this.filePath, messageDeltaContentTextAnnotationsFilePathObject.filePath) &&
        Objects.equals(this.startIndex, messageDeltaContentTextAnnotationsFilePathObject.startIndex) &&
        Objects.equals(this.endIndex, messageDeltaContentTextAnnotationsFilePathObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, filePath, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFilePathObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

