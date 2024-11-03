/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ModifyRunRequest
 */
@JsonPropertyOrder({
  ModifyRunRequest.JSON_PROPERTY_METADATA
})
@JsonTypeName("ModifyRunRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class ModifyRunRequest {
    public static final String JSON_PROPERTY_METADATA = "metadata";
    private Object metadata;

    public ModifyRunRequest() {
    }

    public ModifyRunRequest metadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     * @return metadata
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getMetadata() {
        return metadata;
    }

    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyRunRequest modifyRunRequest = (ModifyRunRequest) o;
        return Objects.equals(this.metadata, modifyRunRequest.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyRunRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

