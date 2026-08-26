package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.VectorStoreExpirationAfter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateVectorStoreRequest   {

    private String name;
    private VectorStoreExpirationAfter expiresAfter;
    private Object metadata;

    /**
     * Default constructor.
     */
    public UpdateVectorStoreRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateVectorStoreRequest.
     *
     * @param name The name of the vector store.
     * @param expiresAfter expiresAfter
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public UpdateVectorStoreRequest(
        String name, 
        VectorStoreExpirationAfter expiresAfter, 
        Object metadata
    ) {
        this.name = name;
        this.expiresAfter = expiresAfter;
        this.metadata = metadata;
    }



    /**
     * The name of the vector store.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get expiresAfter
     * @return expiresAfter
     */
    public VectorStoreExpirationAfter getExpiresAfter() {
        return expiresAfter;
    }

    public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVectorStoreRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

