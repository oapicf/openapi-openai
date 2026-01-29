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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageObject;



/**
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 */

@ApiModel(description = "Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T10:45:08.090000084Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageStreamEventOneOf1   {
  


  public enum EventEnum {
    THREAD_MESSAGE_IN_PROGRESS("thread.message.in_progress");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EventEnum event;
  private MessageObject data;

  /**
   */
  public MessageStreamEventOneOf1 event(EventEnum event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }

  /**
   */
  public MessageStreamEventOneOf1 data(MessageObject data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public MessageObject getData() {
    return data;
  }
  public void setData(MessageObject data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStreamEventOneOf1 messageStreamEventOneOf1 = (MessageStreamEventOneOf1) o;
    return Objects.equals(event, messageStreamEventOneOf1.event) &&
        Objects.equals(data, messageStreamEventOneOf1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStreamEventOneOf1 {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

