package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeServerEventResponseContentPartDonePart;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
public class RealtimeServerEventResponseContentPartDone   {

    private String eventId;

    /**
    * The event type, must be `response.content_part.done`.
    */
    public enum TypeEnum {
        RESPONSE_CONTENT_PART_DONE("response.content_part.done");

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
    private RealtimeServerEventResponseContentPartDonePart part;

    /**
     * Default constructor.
     */
    public RealtimeServerEventResponseContentPartDone() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventResponseContentPartDone.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;response.content_part.done&#x60;.
     * @param responseId The ID of the response.
     * @param itemId The ID of the item.
     * @param outputIndex The index of the output item in the response.
     * @param contentIndex The index of the content part in the item&#39;s content array.
     * @param part part
     */
    public RealtimeServerEventResponseContentPartDone(
        String eventId, 
        TypeEnum type, 
        String responseId, 
        String itemId, 
        Integer outputIndex, 
        Integer contentIndex, 
        RealtimeServerEventResponseContentPartDonePart part
    ) {
        this.eventId = eventId;
        this.type = type;
        this.responseId = responseId;
        this.itemId = itemId;
        this.outputIndex = outputIndex;
        this.contentIndex = contentIndex;
        this.part = part;
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
     * The event type, must be `response.content_part.done`.
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
     * Get part
     * @return part
     */
    public RealtimeServerEventResponseContentPartDonePart getPart() {
        return part;
    }

    public void setPart(RealtimeServerEventResponseContentPartDonePart part) {
        this.part = part;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventResponseContentPartDone {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
        sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
        sb.append("    part: ").append(toIndentedString(part)).append("\n");
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

