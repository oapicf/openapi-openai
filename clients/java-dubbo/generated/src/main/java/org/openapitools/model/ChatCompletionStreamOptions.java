package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 */
public class ChatCompletionStreamOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value. 
   */
  @JsonProperty("include_usage")
  private Boolean includeUsage;

  /**
   * If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value. 
   * @return includeUsage
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
