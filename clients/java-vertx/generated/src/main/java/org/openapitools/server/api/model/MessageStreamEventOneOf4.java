package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.MessageObject;

/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageStreamEventOneOf4   {
  


  public enum EventEnum {
    THREAD_MESSAGE_INCOMPLETE("thread.message.incomplete");

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

  public MessageStreamEventOneOf4 () {

  }

  public MessageStreamEventOneOf4 (EventEnum event, MessageObject data) {
    this.event = event;
    this.data = data;
  }

    
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }

    
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
    MessageStreamEventOneOf4 messageStreamEventOneOf4 = (MessageStreamEventOneOf4) o;
    return Objects.equals(event, messageStreamEventOneOf4.event) &&
        Objects.equals(data, messageStreamEventOneOf4.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStreamEventOneOf4 {\n");
    
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
