package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to create the API key.
 */
public class AuditLogApiKeyCreatedData   {

    private List<String> scopes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AuditLogApiKeyCreatedData() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogApiKeyCreatedData.
     *
     * @param scopes A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60;
     */
    public AuditLogApiKeyCreatedData(
        List<String> scopes
    ) {
        this.scopes = scopes;
    }



    /**
     * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogApiKeyCreatedData {\n");
        
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

