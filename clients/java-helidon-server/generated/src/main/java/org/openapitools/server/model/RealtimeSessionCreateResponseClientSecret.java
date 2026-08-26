package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ephemeral key returned by the API.
 */
public class RealtimeSessionCreateResponseClientSecret   {

    private String value;
    private Integer expiresAt;

    /**
     * Default constructor.
     */
    public RealtimeSessionCreateResponseClientSecret() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeSessionCreateResponseClientSecret.
     *
     * @param value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
     * @param expiresAt Timestamp for when the token expires. Currently, all tokens expire after one minute. 
     */
    public RealtimeSessionCreateResponseClientSecret(
        String value, 
        Integer expiresAt
    ) {
        this.value = value;
        this.expiresAt = expiresAt;
    }



    /**
     * Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Timestamp for when the token expires. Currently, all tokens expire after one minute. 
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeSessionCreateResponseClientSecret {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

