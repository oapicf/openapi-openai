/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
 * Model
 */
@JsonPropertyOrder({
  Model.JSON_PROPERTY_ID,
  Model.JSON_PROPERTY_OBJECT,
  Model.JSON_PROPERTY_CREATED,
  Model.JSON_PROPERTY_OWNED_BY
})
@JsonTypeName("Model")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-16T01:12:38.762786439Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class Model {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public static final String JSON_PROPERTY_CREATED = "created";
    private Integer created;

    public static final String JSON_PROPERTY_OWNED_BY = "owned_by";
    private String ownedBy;

    public Model(String id, String _object, Integer created, String ownedBy) {
        this.id = id;
        this._object = _object;
        this.created = created;
        this.ownedBy = ownedBy;
    }

    public Model id(String id) {
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

    public Model _object(String _object) {
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

    public Model created(Integer created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     * @return created
     **/
    @NotNull
    @Schema(name = "created", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getCreated() {
        return created;
    }

    @JsonProperty(JSON_PROPERTY_CREATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreated(Integer created) {
        this.created = created;
    }

    public Model ownedBy(String ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }

    /**
     * Get ownedBy
     * @return ownedBy
     **/
    @NotNull
    @Schema(name = "owned_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OWNED_BY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOwnedBy() {
        return ownedBy;
    }

    @JsonProperty(JSON_PROPERTY_OWNED_BY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Model model = (Model) o;
        return Objects.equals(this.id, model.id) &&
            Objects.equals(this._object, model._object) &&
            Objects.equals(this.created, model.created) &&
            Objects.equals(this.ownedBy, model.ownedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, _object, created, ownedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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

