package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */
@ApiModel(description = "Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ChatCompletionRequestAssistantMessageAudio   {
  @JsonProperty("id")
  private String id;

  public ChatCompletionRequestAssistantMessageAudio id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for a previous audio response from the model. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for a previous audio response from the model. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestAssistantMessageAudio chatCompletionRequestAssistantMessageAudio = (ChatCompletionRequestAssistantMessageAudio) o;
    return Objects.equals(this.id, chatCompletionRequestAssistantMessageAudio.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessageAudio {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

