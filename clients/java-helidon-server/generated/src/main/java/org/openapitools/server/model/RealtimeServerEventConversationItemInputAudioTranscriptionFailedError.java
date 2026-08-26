package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of the transcription error.
 */
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError   {

    private String type;
    private String code;
    private String message;
    private String param;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.
     *
     * @param type The type of error.
     * @param code Error code, if any.
     * @param message A human-readable error message.
     * @param param Parameter related to the error, if any.
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(
        String type, 
        String code, 
        String message, 
        String param
    ) {
        this.type = type;
        this.code = code;
        this.message = message;
        this.param = param;
    }



    /**
     * The type of error.
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

