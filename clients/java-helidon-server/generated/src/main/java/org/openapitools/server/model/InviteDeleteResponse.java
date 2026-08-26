package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class InviteDeleteResponse   {


    /**
    * The object type, which is always `organization.invite.deleted`
    */
    public enum ObjectEnum {
        ORGANIZATION_INVITE_DELETED("organization.invite.deleted");

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
    private String id;
    private Boolean deleted;

    /**
     * Default constructor.
     */
    public InviteDeleteResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteDeleteResponse.
     *
     * @param _object The object type, which is always &#x60;organization.invite.deleted&#x60;
     * @param id id
     * @param deleted deleted
     */
    public InviteDeleteResponse(
        ObjectEnum _object, 
        String id, 
        Boolean deleted
    ) {
        this._object = _object;
        this.id = id;
        this.deleted = deleted;
    }



    /**
     * The object type, which is always `organization.invite.deleted`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get deleted
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteDeleteResponse {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

