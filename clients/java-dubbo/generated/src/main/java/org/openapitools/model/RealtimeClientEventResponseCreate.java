package org.openapitools.model;

import org.openapitools.model.RealtimeResponseCreateParams;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only. 
 */
public class RealtimeClientEventResponseCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Optional client-generated ID used to identify this event.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be &#x60;response.create&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("response")
  private RealtimeResponseCreateParams response;

  /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;response.create&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return response
   */
  public RealtimeResponseCreateParams getResponse() {
    return response;
  }

  public void setResponse(RealtimeResponseCreateParams response) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
