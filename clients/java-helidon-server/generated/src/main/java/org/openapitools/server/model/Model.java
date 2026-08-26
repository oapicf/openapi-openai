package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Describes an OpenAI model offering that can be used with the API.
 */
public class Model   {

    private String id;
    private Integer created;

    /**
    * The object type, which is always \"model\".
    */
    public enum ObjectEnum {
        MODEL("model");

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
    private String ownedBy;

    /**
     * Default constructor.
     */
    public Model() {
    // JSON-B / Jackson
    }

    /**
     * Create Model.
     *
     * @param id The model identifier, which can be referenced in the API endpoints.
     * @param created The Unix timestamp (in seconds) when the model was created.
     * @param _object The object type, which is always \&quot;model\&quot;.
     * @param ownedBy The organization that owns the model.
     */
    public Model(
        String id, 
        Integer created, 
        ObjectEnum _object, 
        String ownedBy
    ) {
        this.id = id;
        this.created = created;
        this._object = _object;
        this.ownedBy = ownedBy;
    }



    /**
     * The model identifier, which can be referenced in the API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Unix timestamp (in seconds) when the model was created.
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * The object type, which is always \"model\".
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The organization that owns the model.
     * @return ownedBy
     */
    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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

