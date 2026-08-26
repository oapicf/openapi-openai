package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AuditLogActorApiKey;
import org.openapitools.server.model.AuditLogActorSession;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The actor who performed the audit logged action.
 */
public class AuditLogActor   {


    /**
    * The type of actor. Is either `session` or `api_key`.
    */
    public enum TypeEnum {
        SESSION("session"),
        API_KEY("api_key");

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
    private AuditLogActorSession session;
    private AuditLogActorApiKey apiKey;

    /**
     * Default constructor.
     */
    public AuditLogActor() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogActor.
     *
     * @param type The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
     * @param session session
     * @param apiKey apiKey
     */
    public AuditLogActor(
        TypeEnum type, 
        AuditLogActorSession session, 
        AuditLogActorApiKey apiKey
    ) {
        this.type = type;
        this.session = session;
        this.apiKey = apiKey;
    }



    /**
     * The type of actor. Is either `session` or `api_key`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get session
     * @return session
     */
    public AuditLogActorSession getSession() {
        return session;
    }

    public void setSession(AuditLogActorSession session) {
        this.session = session;
    }

    /**
     * Get apiKey
     * @return apiKey
     */
    public AuditLogActorApiKey getApiKey() {
        return apiKey;
    }

    public void setApiKey(AuditLogActorApiKey apiKey) {
        this.apiKey = apiKey;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogActor {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

