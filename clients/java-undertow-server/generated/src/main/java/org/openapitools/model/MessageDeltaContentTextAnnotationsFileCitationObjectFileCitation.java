/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-04-14T13:39:44.119769156Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation   {
  
  private String fileId;
  private String quote;

  /**
   * The ID of the specific File the citation is from.
   */
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the specific File the citation is from.")
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * The specific quote in the file.
   */
  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation quote(String quote) {
    this.quote = quote;
    return this;
  }

  
  @ApiModelProperty(value = "The specific quote in the file.")
  @JsonProperty("quote")
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
    return Objects.equals(fileId, messageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fileId) &&
        Objects.equals(quote, messageDeltaContentTextAnnotationsFileCitationObjectFileCitation.quote);
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

