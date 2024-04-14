package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.")
public class MessageStreamEventOneOf4   {
  

public enum EventEnum {

    @JsonProperty("thread.message.incomplete") THREAD_MESSAGE_INCOMPLETE(String.valueOf("thread.message.incomplete"));


    private String value;

    EventEnum(String v) {
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

  private EventEnum event;

  private MessageObject data;

  /**
   **/
  public MessageStreamEventOneOf4 event(EventEnum event) {
    this.event = event;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("event")
  @NotNull
  public EventEnum getEvent() {
    return event;
  }
  public void setEvent(EventEnum event) {
    this.event = event;
  }


  /**
   **/
  public MessageStreamEventOneOf4 data(MessageObject data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
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
    return Objects.equals(this.event, messageStreamEventOneOf4.event) &&
        Objects.equals(this.data, messageStreamEventOneOf4.data);
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

