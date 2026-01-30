/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 */

@ApiModel(description = "Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TruncationObject   {
  


  public enum TypeEnum {
    AUTO("auto"),
    LAST_MESSAGES("last_messages");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private Integer lastMessages;

  /**
   * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
   */
  public TruncationObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The number of most recent messages from the thread when constructing the context for the run.
   * minimum: 1
   */
  public TruncationObject lastMessages(Integer lastMessages) {
    this.lastMessages = lastMessages;
    return this;
  }

  
  @ApiModelProperty(value = "The number of most recent messages from the thread when constructing the context for the run.")
  @JsonProperty("last_messages")
  public Integer getLastMessages() {
    return lastMessages;
  }
  public void setLastMessages(Integer lastMessages) {
    this.lastMessages = lastMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TruncationObject truncationObject = (TruncationObject) o;
    return Objects.equals(type, truncationObject.type) &&
        Objects.equals(lastMessages, truncationObject.lastMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, lastMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TruncationObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lastMessages: ").append(toIndentedString(lastMessages)).append("\n");
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

