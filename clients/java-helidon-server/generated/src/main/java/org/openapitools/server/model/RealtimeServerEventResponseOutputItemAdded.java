package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeConversationItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a new Item is created during Response generation.
 */
public class RealtimeServerEventResponseOutputItemAdded   {

    private String eventId;

    /**
    * The event type, must be `response.output_item.added`.
    */
    public enum TypeEnum {
        RESPONSE_OUTPUT_ITEM_ADDED("response.output_item.added");

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
    private Integer outputIndex;
    private RealtimeConversationItem item;

    /**
     * Default constructor.
     */
    public RealtimeServerEventResponseOutputItemAdded() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventResponseOutputItemAdded.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;response.output_item.added&#x60;.
     * @param responseId The ID of the Response to which the item belongs.
     * @param outputIndex The index of the output item in the Response.
     * @param item item
     */
    public RealtimeServerEventResponseOutputItemAdded(
        String eventId, 
        TypeEnum type, 
        String responseId, 
        Integer outputIndex, 
        RealtimeConversationItem item
    ) {
        this.eventId = eventId;
        this.type = type;
        this.responseId = responseId;
        this.outputIndex = outputIndex;
        this.item = item;
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
     * The event type, must be `response.output_item.added`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the Response to which the item belongs.
     * @return responseId
     */
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    /**
     * The index of the output item in the Response.
     * @return outputIndex
     */
    public Integer getOutputIndex() {
        return outputIndex;
    }

    public void setOutputIndex(Integer outputIndex) {
        this.outputIndex = outputIndex;
    }

    /**
     * Get item
     * @return item
     */
    public RealtimeConversationItem getItem() {
        return item;
    }

    public void setItem(RealtimeConversationItem item) {
        this.item = item;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventResponseOutputItemAdded {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
        sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

