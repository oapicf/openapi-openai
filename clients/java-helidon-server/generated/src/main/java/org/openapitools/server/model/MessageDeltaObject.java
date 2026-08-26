package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageDeltaObjectDelta;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */
public class MessageDeltaObject   {

    private String id;

    /**
    * The object type, which is always `thread.message.delta`.
    */
    public enum ObjectEnum {
        THREAD_MESSAGE_DELTA("thread.message.delta");

        private String value;

        ObjectEnum(String value) {
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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private MessageDeltaObjectDelta delta;

    /**
     * Default constructor.
     */
    public MessageDeltaObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaObject.
     *
     * @param id The identifier of the message, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;thread.message.delta&#x60;.
     * @param delta delta
     */
    public MessageDeltaObject(
        String id, 
        ObjectEnum _object, 
        MessageDeltaObjectDelta delta
    ) {
        this.id = id;
        this._object = _object;
        this.delta = delta;
    }



    /**
     * The identifier of the message, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `thread.message.delta`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get delta
     * @return delta
     */
    public MessageDeltaObjectDelta getDelta() {
        return delta;
    }

    public void setDelta(MessageDeltaObjectDelta delta) {
        this.delta = delta;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

