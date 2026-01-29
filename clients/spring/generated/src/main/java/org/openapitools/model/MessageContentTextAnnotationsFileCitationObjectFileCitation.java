package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MessageContentTextAnnotationsFileCitationObjectFileCitation
 */

@JsonTypeName("MessageContentTextAnnotationsFileCitationObject_file_citation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentTextAnnotationsFileCitationObjectFileCitation {

  private String fileId;

  private String quote;

  public MessageContentTextAnnotationsFileCitationObjectFileCitation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageContentTextAnnotationsFileCitationObjectFileCitation(String fileId, String quote) {
    this.fileId = fileId;
    this.quote = quote;
  }

  public MessageContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the specific File the citation is from.
   * @return fileId
   */
  @NotNull 
  @Schema(name = "file_id", description = "The ID of the specific File the citation is from.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_id")
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
   */
  @NotNull 
  @Schema(name = "quote", description = "The specific quote in the file.", requiredMode = Schema.RequiredMode.REQUIRED)
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

