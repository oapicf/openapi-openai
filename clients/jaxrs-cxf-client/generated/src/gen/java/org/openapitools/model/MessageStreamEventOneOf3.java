package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.MessageObject;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 **/
@ApiModel(description="Occurs when a [message](/docs/api-reference/messages/object) is completed.")

public class MessageStreamEventOneOf3  {
  
public enum EventEnum {

THREAD_MESSAGE_COMPLETED(String.valueOf("thread.message.completed"));


    private String value;

    EventEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
        for (EventEnum b : EventEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private EventEnum event;

  @ApiModelProperty(required = true, value = "")
  private MessageObject data;
 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public String getEvent() {
    if (event == null) {
      return null;
    }
    return event.value();
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public MessageStreamEventOneOf3 event(EventEnum event) {
    this.event = event;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public MessageObject getData() {
    return data;
  }

  public void setData(MessageObject data) {
    this.data = data;
  }

  public MessageStreamEventOneOf3 data(MessageObject data) {
    this.data = data;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStreamEventOneOf3 messageStreamEventOneOf3 = (MessageStreamEventOneOf3) o;
    return Objects.equals(this.event, messageStreamEventOneOf3.event) &&
        Objects.equals(this.data, messageStreamEventOneOf3.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStreamEventOneOf3 {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

