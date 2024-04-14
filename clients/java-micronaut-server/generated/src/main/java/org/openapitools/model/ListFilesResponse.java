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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OpenAIFile;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ListFilesResponse
 */
@JsonPropertyOrder({
  ListFilesResponse.JSON_PROPERTY_DATA,
  ListFilesResponse.JSON_PROPERTY_OBJECT
})
@JsonTypeName("ListFilesResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class ListFilesResponse {
    public static final String JSON_PROPERTY_DATA = "data";
    private List<@Valid OpenAIFile> data = new ArrayList<>();

    /**
     * Gets or Sets _object
     */
    public enum ObjectEnum {
        LIST("list");

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

    public ListFilesResponse(List<@Valid OpenAIFile> data, ObjectEnum _object) {
        this.data = data;
        this._object = _object;
    }

    public ListFilesResponse data(List<@Valid OpenAIFile> data) {
        this.data = data;
        return this;
    }

    public ListFilesResponse addDataItem(OpenAIFile dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @NotNull
    @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid OpenAIFile> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(List<@Valid OpenAIFile> data) {
        this.data = data;
    }

    public ListFilesResponse _object(ObjectEnum _object) {
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
        ListFilesResponse listFilesResponse = (ListFilesResponse) o;
        return Objects.equals(this.data, listFilesResponse.data) &&
            Objects.equals(this._object, listFilesResponse._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFilesResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

