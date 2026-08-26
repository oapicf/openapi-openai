package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of the error.
 */
public class RealtimeServerEventErrorError   {

    private String type;
    private String code;
    private String message;
    private String param;
    private String eventId;

    /**
     * Default constructor.
     */
    public RealtimeServerEventErrorError() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventErrorError.
     *
     * @param type The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;). 
     * @param code Error code, if any.
     * @param message A human-readable error message.
     * @param param Parameter related to the error, if any.
     * @param eventId The event_id of the client event that caused the error, if applicable. 
     */
    public RealtimeServerEventErrorError(
        String type, 
        String code, 
        String message, 
        String param, 
        String eventId
    ) {
        this.type = type;
        this.code = code;
        this.message = message;
        this.param = param;
        this.eventId = eventId;
    }



    /**
     * The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Error code, if any.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * A human-readable error message.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Parameter related to the error, if any.
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    /**
     * The event_id of the client event that caused the error, if applicable. 
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventErrorError {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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

