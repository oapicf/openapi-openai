package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeResponseCreateParams;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only. 
 */

@Schema(name = "RealtimeClientEventResponseCreate", description = "This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventResponseCreate {

  private @Nullable String eventId;

  /**
   * The event type, must be `response.create`.
   */
  public enum TypeEnum {
    RESPONSE_CREATE("response.create");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private @Nullable RealtimeResponseCreateParams response;

  public RealtimeClientEventResponseCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeClientEventResponseCreate(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventResponseCreate eventId(@Nullable String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
   */
  
  @Schema(name = "event_id", description = "Optional client-generated ID used to identify this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_id")
  public @Nullable String getEventId() {
    return eventId;
  }

  public void setEventId(@Nullable String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventResponseCreate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.create`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.create`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventResponseCreate response(@Nullable RealtimeResponseCreateParams response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   */
  @Valid 
  @Schema(name = "response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response")
  public @Nullable RealtimeResponseCreateParams getResponse() {
    return response;
  }

  public void setResponse(@Nullable RealtimeResponseCreateParams response) {
    this.response = response;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeClientEventResponseCreate realtimeClientEventResponseCreate = (RealtimeClientEventResponseCreate) o;
    return Objects.equals(this.eventId, realtimeClientEventResponseCreate.eventId) &&
        Objects.equals(this.type, realtimeClientEventResponseCreate.type) &&
        Objects.equals(this.response, realtimeClientEventResponseCreate.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventResponseCreate {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

