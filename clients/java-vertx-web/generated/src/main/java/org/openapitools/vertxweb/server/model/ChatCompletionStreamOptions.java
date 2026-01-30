package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionStreamOptions   {
  
  private Boolean includeUsage;

  public ChatCompletionStreamOptions () {

  }

  public ChatCompletionStreamOptions (Boolean includeUsage) {
    this.includeUsage = includeUsage;
  }

    
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
    return Objects.equals(includeUsage, chatCompletionStreamOptions.includeUsage);
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
