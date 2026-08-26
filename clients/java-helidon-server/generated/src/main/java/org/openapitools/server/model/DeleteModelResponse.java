package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeleteModelResponse   {

    private String id;
    private Boolean deleted;
    private String _object;

    /**
     * Default constructor.
     */
    public DeleteModelResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create DeleteModelResponse.
     *
     * @param id id
     * @param deleted deleted
     * @param _object _object
     */
    public DeleteModelResponse(
        String id, 
        Boolean deleted, 
        String _object
    ) {
        this.id = id;
        this.deleted = deleted;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteModelResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

