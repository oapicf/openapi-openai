package org.openapitools.model;

import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObject;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MessageDeltaContentTextObjectTextAnnotationsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of the annotation in the text content part.
   */
  @JsonProperty("index")
  private Integer index;

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
  private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  @JsonProperty("start_index")
  private Integer startIndex;

  @JsonProperty("end_index")
  private Integer endIndex;

  @JsonProperty("file_path")
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

  /**
   * The index of the annotation in the text content part.
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

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
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
    return fileCitation;
  }

  public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
