package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation   {
  
  private String fileId;
  private String quote;

  /**
   * The ID of the specific File the citation is from.
   **/
  
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
   **/
  
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

