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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Model;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ListModelsResponse
 */
@JsonPropertyOrder({
  ListModelsResponse.JSON_PROPERTY_OBJECT,
  ListModelsResponse.JSON_PROPERTY_DATA
})
@JsonTypeName("ListModelsResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-16T01:12:32.706318857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class ListModelsResponse {
    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public static final String JSON_PROPERTY_DATA = "data";
    private List<@Valid Model> data = new ArrayList<>();

    public ListModelsResponse(String _object, List<@Valid Model> data) {
        this._object = _object;
        this.data = data;
    }

    public ListModelsResponse _object(String _object) {
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
    public String getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(String _object) {
        this._object = _object;
    }

    public ListModelsResponse data(List<@Valid Model> data) {
        this.data = data;
        return this;
    }

    public ListModelsResponse addDataItem(Model dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid Model> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(List<@Valid Model> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListModelsResponse listModelsResponse = (ListModelsResponse) o;
        return Objects.equals(this._object, listModelsResponse._object) &&
            Objects.equals(this.data, listModelsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListModelsResponse {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
