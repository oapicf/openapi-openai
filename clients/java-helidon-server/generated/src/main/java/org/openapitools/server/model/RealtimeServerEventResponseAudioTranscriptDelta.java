package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when the model-generated transcription of audio output is updated. 
 */
public class RealtimeServerEventResponseAudioTranscriptDelta   {

    private String eventId;

    /**
    * The event type, must be `response.audio_transcript.delta`.
    */
    public enum TypeEnum {
        RESPONSE_AUDIO_TRANSCRIPT_DELTA("response.audio_transcript.delta");

        private String value;

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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private String responseId;
    private String itemId;
    private Integer outputIndex;
    private Integer contentIndex;
    private String delta;

    /**
     * Default constructor.
     */
    public RealtimeServerEventResponseAudioTranscriptDelta() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventResponseAudioTranscriptDelta.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;response.audio_transcript.delta&#x60;.
     * @param responseId The ID of the response.
     * @param itemId The ID of the item.
     * @param outputIndex The index of the output item in the response.
     * @param contentIndex The index of the content part in the item&#39;s content array.
     * @param delta The transcript delta.
     */
    public RealtimeServerEventResponseAudioTranscriptDelta(
        String eventId, 
        TypeEnum type, 
        String responseId, 
        String itemId, 
        Integer outputIndex, 
        Integer contentIndex, 
        String delta
    ) {
        this.eventId = eventId;
        this.type = type;
        this.responseId = responseId;
        this.itemId = itemId;
        this.outputIndex = outputIndex;
        this.contentIndex = contentIndex;
        this.delta = delta;
    }



    /**
     * The unique ID of the server event.
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * The event type, must be `response.audio_transcript.delta`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the response.
     * @return responseId
     */
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    /**
     * The ID of the item.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * The index of the output item in the response.
     * @return outputIndex
     */
    public Integer getOutputIndex() {
        return outputIndex;
    }

    public void setOutputIndex(Integer outputIndex) {
        this.outputIndex = outputIndex;
    }

    /**
     * The index of the content part in the item's content array.
     * @return contentIndex
     */
    public Integer getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Integer contentIndex) {
        this.contentIndex = contentIndex;
    }

    /**
     * The transcript delta.
     * @return delta
     */
    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventResponseAudioTranscriptDelta {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
        sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
        sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

