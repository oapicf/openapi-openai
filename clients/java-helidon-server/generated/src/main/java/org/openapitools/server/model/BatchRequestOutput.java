package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BatchRequestOutputError;
import org.openapitools.server.model.BatchRequestOutputResponse;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The per-line object of the batch output and error files
 */
public class BatchRequestOutput   {

    private String id;
    private String customId;
    private BatchRequestOutputResponse response;
    private BatchRequestOutputError error;

    /**
     * Default constructor.
     */
    public BatchRequestOutput() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchRequestOutput.
     *
     * @param id id
     * @param customId A developer-provided per-request id that will be used to match outputs to inputs.
     * @param response response
     * @param error error
     */
    public BatchRequestOutput(
        String id, 
        String customId, 
        BatchRequestOutputResponse response, 
        BatchRequestOutputError error
    ) {
        this.id = id;
        this.customId = customId;
        this.response = response;
        this.error = error;
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
     * A developer-provided per-request id that will be used to match outputs to inputs.
     * @return customId
     */
    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * Get response
     * @return response
     */
    public BatchRequestOutputResponse getResponse() {
        return response;
    }

    public void setResponse(BatchRequestOutputResponse response) {
        this.response = response;
    }

    /**
     * Get error
     * @return error
     */
    public BatchRequestOutputError getError() {
        return error;
    }

    public void setError(BatchRequestOutputError error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRequestOutput {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

