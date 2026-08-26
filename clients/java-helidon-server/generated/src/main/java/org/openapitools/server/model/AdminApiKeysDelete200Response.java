package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdminApiKeysDelete200Response   {

    private String id;
    private String _object;
    private Boolean deleted;

    /**
     * Default constructor.
     */
    public AdminApiKeysDelete200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create AdminApiKeysDelete200Response.
     *
     * @param id id
     * @param _object _object
     * @param deleted deleted
     */
    public AdminApiKeysDelete200Response(
        String id, 
        String _object, 
        Boolean deleted
    ) {
        this.id = id;
        this._object = _object;
        this.deleted = deleted;
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
     * Get _object
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
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
        sb.append("class AdminApiKeysDelete200Response {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

