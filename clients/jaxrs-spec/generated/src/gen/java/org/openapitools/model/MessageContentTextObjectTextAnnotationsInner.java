package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MessageContentTextObject_text_annotations_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentTextObjectTextAnnotationsInner   {
  public enum TypeEnum {

    FILE_CITATION(String.valueOf("file_citation")), FILE_PATH(String.valueOf("file_path"));


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
  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;
  private Integer startIndex;
  private Integer endIndex;
  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  public MessageContentTextObjectTextAnnotationsInner() {
  }

  @JsonCreator
  public MessageContentTextObjectTextAnnotationsInner(
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "text") String text,
    @JsonProperty(required = true, value = "file_citation") MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation,
    @JsonProperty(required = true, value = "start_index") Integer startIndex,
    @JsonProperty(required = true, value = "end_index") Integer endIndex,
    @JsonProperty(required = true, value = "file_path") MessageContentTextAnnotationsFilePathObjectFilePath filePath
  ) {
    this.type = type;
    this.text = text;
    this.fileCitation = fileCitation;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
    this.filePath = filePath;
  }

  /**
   * Always &#x60;file_citation&#x60;.
   **/
  public MessageContentTextObjectTextAnnotationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `file_citation`.")
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
  public MessageContentTextObjectTextAnnotationsInner text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text in the message content that needs to be replaced.")
  @JsonProperty(required = true, value = "text")
  @NotNull public String getText() {
    return text;
  }

  @JsonProperty(required = true, value = "text")
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
  @JsonProperty(required = true, value = "file_citation")
  @NotNull @Valid public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  @JsonProperty(required = true, value = "file_citation")
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
  @JsonProperty(required = true, value = "start_index")
  @NotNull  @Min(0)public Integer getStartIndex() {
    return startIndex;
  }

  @JsonProperty(required = true, value = "start_index")
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
  @JsonProperty(required = true, value = "end_index")
  @NotNull  @Min(0)public Integer getEndIndex() {
    return endIndex;
  }

  @JsonProperty(required = true, value = "end_index")
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
  @JsonProperty(required = true, value = "file_path")
  @NotNull @Valid public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  @JsonProperty(required = true, value = "file_path")
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

