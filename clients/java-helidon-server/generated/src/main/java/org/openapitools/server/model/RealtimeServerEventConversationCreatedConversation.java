package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The conversation resource.
 */
public class RealtimeServerEventConversationCreatedConversation   {

    private String id;
    private String _object;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationCreatedConversation() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationCreatedConversation.
     *
     * @param id The unique ID of the conversation.
     * @param _object The object type, must be &#x60;realtime.conversation&#x60;.
     */
    public RealtimeServerEventConversationCreatedConversation(
        String id, 
        String _object
    ) {
        this.id = id;
        this._object = _object;
    }



    /**
     * The unique ID of the conversation.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, must be `realtime.conversation`.
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventConversationCreatedConversation {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

