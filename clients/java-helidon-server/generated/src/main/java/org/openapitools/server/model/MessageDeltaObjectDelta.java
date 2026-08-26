package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MessageDeltaObjectDeltaContentInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The delta containing the fields that have changed on the Message.
 */
public class MessageDeltaObjectDelta   {


    /**
    * The entity that produced the message. One of `user` or `assistant`.
    */
    public enum RoleEnum {
        USER("user"),
        ASSISTANT("assistant");

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String text) {
            for (RoleEnum b : RoleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private RoleEnum role;
    private List<MessageDeltaObjectDeltaContentInner> content = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MessageDeltaObjectDelta() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaObjectDelta.
     *
     * @param role The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     * @param content The content of the message in array of text and/or images.
     */
    public MessageDeltaObjectDelta(
        RoleEnum role, 
        List<MessageDeltaObjectDeltaContentInner> content
    ) {
        this.role = role;
        this.content = content;
    }



    /**
     * The entity that produced the message. One of `user` or `assistant`.
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * The content of the message in array of text and/or images.
     * @return content
     */
    public List<MessageDeltaObjectDeltaContentInner> getContent() {
        return content;
    }

    public void setContent(List<MessageDeltaObjectDeltaContentInner> content) {
        this.content = content;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaObjectDelta {\n");
        
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

