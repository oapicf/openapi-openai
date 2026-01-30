package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DoneEvent;
import org.openapitools.model.ErrorEvent;
import org.openapitools.model.MessageStreamEvent;
import org.openapitools.model.RunStepStreamEvent;
import org.openapitools.model.RunStreamEvent;
import org.openapitools.model.ThreadStreamEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantStreamEvent   {
  
  private Boolean enabled;

  /**
   * Gets or Sets event
   */
  public enum EventEnum {
    DONE("done");
    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private EventEnum event;

  /**
   * Gets or Sets data
   */
  public enum DataEnum {
    _DONE_("[DONE]");
    private String value;

    DataEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private DataEnum data;

  /**
   * Whether to enable input audio transcription.
   **/
  
  @ApiModelProperty(value = "Whether to enable input audio transcription.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public DataEnum getData() {
    return data;
  }
  public void setData(DataEnum data) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

