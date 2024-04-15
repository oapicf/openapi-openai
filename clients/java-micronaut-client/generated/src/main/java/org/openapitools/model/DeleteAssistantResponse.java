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

/**
 * DeleteAssistantResponse
 */
@JsonPropertyOrder({
  DeleteAssistantResponse.JSON_PROPERTY_ID,
  DeleteAssistantResponse.JSON_PROPERTY_DELETED,
  DeleteAssistantResponse.JSON_PROPERTY_OBJECT
})
@JsonTypeName("DeleteAssistantResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class DeleteAssistantResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_DELETED = "deleted";
    private Boolean deleted;

    /**
     * Gets or Sets _object
     */
    public enum ObjectEnum {
        ASSISTANT_DELETED("assistant.deleted");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ObjectEnum fromValue(String value) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_OBJECT = "object";
    private ObjectEnum _object;

    public DeleteAssistantResponse(String id, Boolean deleted, ObjectEnum _object) {
        this.id = id;
        this.deleted = deleted;
        this._object = _object;
    }

    public DeleteAssistantResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @NotNull
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

    public DeleteAssistantResponse deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     **/
    @NotNull
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

    public DeleteAssistantResponse _object(ObjectEnum _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ObjectEnum getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(ObjectEnum _object) {
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
        DeleteAssistantResponse deleteAssistantResponse = (DeleteAssistantResponse) o;
        return Objects.equals(this.id, deleteAssistantResponse.id) &&
            Objects.equals(this.deleted, deleteAssistantResponse.deleted) &&
            Objects.equals(this._object, deleteAssistantResponse._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleted, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAssistantResponse {\n");
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
