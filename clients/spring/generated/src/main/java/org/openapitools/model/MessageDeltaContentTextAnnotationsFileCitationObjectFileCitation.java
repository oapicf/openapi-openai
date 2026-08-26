package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
 */

@JsonTypeName("MessageDeltaContentTextAnnotationsFileCitationObject_file_citation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String fileId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String quote;

  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileId(@Nullable String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the specific File the citation is from.
   * @return fileId
   */
  
  @Schema(name = "file_id", description = "The ID of the specific File the citation is from.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_id")
  public @Nullable String getFileId() {
    return fileId;
  }

  @JsonProperty("file_id")
  public void setFileId(@Nullable String fileId) {
    this.fileId = fileId;
  }

  public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation quote(@Nullable String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * The specific quote in the file.
   * @return quote
   */
  
  @Schema(name = "quote", description = "The specific quote in the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quote")
  public @Nullable String getQuote() {
    return quote;
  }

  @JsonProperty("quote")
  public void setQuote(@Nullable String quote) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

