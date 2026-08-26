package org.openapitools.model;

import org.openapitools.model.MessageContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MessageContentTextObjectTextAnnotationsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Always &#x60;file_citation&#x60;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The text in the message content that needs to be replaced.
   */
  @JsonProperty("text")
  private String text;

  @JsonProperty("file_citation")
  private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  @JsonProperty("start_index")
  private Integer startIndex;

  @JsonProperty("end_index")
  private Integer endIndex;

  @JsonProperty("file_path")
  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  /**
   * Always &#x60;file_citation&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The text in the message content that needs to be replaced.
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * 
   * @return fileCitation
   */
  public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
    this.fileCitation = fileCitation;
  }

  /**
   * 
   * @return startIndex
   */
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * 
   * @return endIndex
   */
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  /**
   * 
   * @return filePath
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
