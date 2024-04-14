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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DeleteModelResponse
 */
@JsonPropertyOrder({
  DeleteModelResponse.JSON_PROPERTY_ID,
  DeleteModelResponse.JSON_PROPERTY_DELETED,
  DeleteModelResponse.JSON_PROPERTY_OBJECT
})
@JsonTypeName("DeleteModelResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class DeleteModelResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_DELETED = "deleted";
    private Boolean deleted;

    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public DeleteModelResponse(String id, Boolean deleted, String _object) {
        this.id = id;
        this.deleted = deleted;
        this._object = _object;
    }

    public DeleteModelResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public DeleteModelResponse deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     **/
    @NotNull
    @Schema(name = "deleted", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty(JSON_PROPERTY_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public DeleteModelResponse _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
    @NotNull
    @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(String _object) {
        this._object = _object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteModelResponse deleteModelResponse = (DeleteModelResponse) o;
        return Objects.equals(this.id, deleteModelResponse.id) &&
            Objects.equals(this.deleted, deleteModelResponse.deleted) &&
            Objects.equals(this._object, deleteModelResponse._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleted, _object);
    }

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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

