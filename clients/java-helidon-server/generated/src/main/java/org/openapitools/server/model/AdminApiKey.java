package org.openapitools.server.model;

import org.openapitools.server.model.AdminApiKeyOwner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdminApiKey   {

    private String _object;
    private String id;
    private String name;
    private String redactedValue;
    private String value;
    private Long createdAt;
    private AdminApiKeyOwner owner;

    /**
     * Default constructor.
     */
    public AdminApiKey() {
    // JSON-B / Jackson
    }

    /**
     * Create AdminApiKey.
     *
     * @param _object _object
     * @param id id
     * @param name name
     * @param redactedValue redactedValue
     * @param value value
     * @param createdAt createdAt
     * @param owner owner
     */
    public AdminApiKey(
        String _object, 
        String id, 
        String name, 
        String redactedValue, 
        String value, 
        Long createdAt, 
        AdminApiKeyOwner owner
    ) {
        this._object = _object;
        this.id = id;
        this.name = name;
        this.redactedValue = redactedValue;
        this.value = value;
        this.createdAt = createdAt;
        this.owner = owner;
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
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get redactedValue
     * @return redactedValue
     */
    public String getRedactedValue() {
        return redactedValue;
    }

    public void setRedactedValue(String redactedValue) {
        this.redactedValue = redactedValue;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get owner
     * @return owner
     */
    public AdminApiKeyOwner getOwner() {
        return owner;
    }

    public void setOwner(AdminApiKeyOwner owner) {
        this.owner = owner;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminApiKey {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    redactedValue: ").append(toIndentedString(redactedValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

