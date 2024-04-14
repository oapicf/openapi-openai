package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */

@Schema(name = "MessageStreamEvent_oneOf_2", description = "Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.")
@JsonTypeName("MessageStreamEvent_oneOf_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-14T13:54:16.789070334Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageStreamEventOneOf2 implements MessageStreamEvent {

  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    THREAD_MESSAGE_DELTA("thread.message.delta");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
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

  private MessageDeltaObject data;

  public MessageStreamEventOneOf2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MessageStreamEventOneOf2(EventEnum event, MessageDeltaObject data) {
    this.event = event;
    this.data = data;
  }

  public MessageStreamEventOneOf2 event(EventEnum event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @NotNull 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event")
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public MessageStreamEventOneOf2 data(MessageDeltaObject data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public MessageDeltaObject getData() {
    return data;
  }

  public void setData(MessageDeltaObject data) {
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
    MessageStreamEventOneOf2 messageStreamEventOneOf2 = (MessageStreamEventOneOf2) o;
    return Objects.equals(this.event, messageStreamEventOneOf2.event) &&
        Objects.equals(this.data, messageStreamEventOneOf2.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStreamEventOneOf2 {\n");
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

