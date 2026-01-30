package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 */

@Schema(name = "ChatCompletionStreamOptions", description = "Options for streaming response. Only set this when you set `stream: true`. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionStreamOptions {

  private Boolean includeUsage;

  public ChatCompletionStreamOptions includeUsage(Boolean includeUsage) {
    this.includeUsage = includeUsage;
    return this;
  }

  /**
   * If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
   * @return includeUsage
   */
  
  @Schema(name = "include_usage", description = "If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_usage")
  public Boolean getIncludeUsage() {
    return includeUsage;
  }

  public void setIncludeUsage(Boolean includeUsage) {
    this.includeUsage = includeUsage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionStreamOptions chatCompletionStreamOptions = (ChatCompletionStreamOptions) o;
    return Objects.equals(this.includeUsage, chatCompletionStreamOptions.includeUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamOptions {\n");
    sb.append("    includeUsage: ").append(toIndentedString(includeUsage)).append("\n");
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

