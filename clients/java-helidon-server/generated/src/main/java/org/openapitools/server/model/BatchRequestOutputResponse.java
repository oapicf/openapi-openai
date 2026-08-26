package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BatchRequestOutputResponse   {

    private Integer statusCode;
    private String requestId;
    private Object body;

    /**
     * Default constructor.
     */
    public BatchRequestOutputResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchRequestOutputResponse.
     *
     * @param statusCode The HTTP status code of the response
     * @param requestId An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
     * @param body The JSON body of the response
     */
    public BatchRequestOutputResponse(
        Integer statusCode, 
        String requestId, 
        Object body
    ) {
        this.statusCode = statusCode;
        this.requestId = requestId;
        this.body = body;
    }



    /**
     * The HTTP status code of the response
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * The JSON body of the response
     * @return body
     */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRequestOutputResponse {\n");
        
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

