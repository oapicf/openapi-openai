package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MessageContentTextAnnotationsFileCitationObjectFileCitation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageContentTextAnnotationsFileCitationObjectFileCitation   {
  @JsonProperty("file_id")
  private String fileId;

  @JsonProperty("quote")
  private String quote;

  public MessageContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The ID of the specific File the citation is from.
   * @return fileId
  **/
  @ApiModelProperty(required = true, value = "The ID of the specific File the citation is from.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public MessageContentTextAnnotationsFileCitationObjectFileCitation quote(String quote) {
    this.quote = quote;
    return this;
  }

   /**
   * The specific quote in the file.
   * @return quote
  **/
  @ApiModelProperty(required = true, value = "The specific quote in the file.")
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
    MessageContentTextAnnotationsFileCitationObjectFileCitation messageContentTextAnnotationsFileCitationObjectFileCitation = (MessageContentTextAnnotationsFileCitationObjectFileCitation) o;
    return Objects.equals(this.fileId, messageContentTextAnnotationsFileCitationObjectFileCitation.fileId) &&
        Objects.equals(this.quote, messageContentTextAnnotationsFileCitationObjectFileCitation.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, quote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextAnnotationsFileCitationObjectFileCitation {\n");
    
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

