package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation   {
  @JsonProperty("file_id")
  private String fileId;

  @JsonProperty("quote")
  private String quote;

  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The ID of the specific File the citation is from.
   * @return fileId
  **/
  @ApiModelProperty(value = "The ID of the specific File the citation is from.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation quote(String quote) {
    this.quote = quote;
    return this;
  }

   /**
   * The specific quote in the file.
   * @return quote
  **/
  @ApiModelProperty(value = "The specific quote in the file.")
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation messageDeltaContentTextAnnotationsFileCitationObjectFileCitation = (MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation) o;
    return Objects.equals(this.fileId, messageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fileId) &&
        Objects.equals(this.quote, messageDeltaContentTextAnnotationsFileCitationObjectFileCitation.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, quote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

