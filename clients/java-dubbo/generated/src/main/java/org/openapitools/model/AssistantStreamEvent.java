package org.openapitools.model;

import org.openapitools.model.DoneEvent;
import org.openapitools.model.ErrorEvent;
import org.openapitools.model.MessageStreamEvent;
import org.openapitools.model.RunStepStreamEvent;
import org.openapitools.model.RunStreamEvent;
import org.openapitools.model.ThreadStreamEvent;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 */
public class AssistantStreamEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether to enable input audio transcription.
   */
  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("event")
  private String event;

  @JsonProperty("data")
  private String data;

  /**
   * Whether to enable input audio transcription.
   * @return enabled
   */
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * 
   * @return event
   */
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  /**
   * 
   * @return data
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
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
    AssistantStreamEvent assistantStreamEvent = (AssistantStreamEvent) o;
    return Objects.equals(this.enabled, assistantStreamEvent.enabled) &&
        Objects.equals(this.event, assistantStreamEvent.event) &&
        Objects.equals(this.data, assistantStreamEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, event, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantStreamEvent {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
