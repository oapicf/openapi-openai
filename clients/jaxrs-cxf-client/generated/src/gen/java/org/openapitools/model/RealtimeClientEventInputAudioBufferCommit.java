package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 */
@ApiModel(description="Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. ")

public class RealtimeClientEventInputAudioBufferCommit  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")

  private String eventId;

public enum TypeEnum {

INPUT_AUDIO_BUFFER_COMMIT(String.valueOf("input_audio_buffer.commit"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The event type, must be `input_audio_buffer.commit`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `input_audio_buffer.commit`.")

  private TypeEnum type;
 /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventInputAudioBufferCommit eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;input_audio_buffer.commit&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventInputAudioBufferCommit type(TypeEnum type) {
    this.type = type;
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
    RealtimeClientEventInputAudioBufferCommit realtimeClientEventInputAudioBufferCommit = (RealtimeClientEventInputAudioBufferCommit) o;
    return Objects.equals(this.eventId, realtimeClientEventInputAudioBufferCommit.eventId) &&
        Objects.equals(this.type, realtimeClientEventInputAudioBufferCommit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventInputAudioBufferCommit {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

