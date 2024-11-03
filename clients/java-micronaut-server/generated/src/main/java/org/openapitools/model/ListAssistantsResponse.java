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
import org.openapitools.model.AssistantObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ListAssistantsResponse
 */
@JsonPropertyOrder({
  ListAssistantsResponse.JSON_PROPERTY_OBJECT,
  ListAssistantsResponse.JSON_PROPERTY_DATA,
  ListAssistantsResponse.JSON_PROPERTY_FIRST_ID,
  ListAssistantsResponse.JSON_PROPERTY_LAST_ID,
  ListAssistantsResponse.JSON_PROPERTY_HAS_MORE
})
@JsonTypeName("ListAssistantsResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class ListAssistantsResponse {
    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public static final String JSON_PROPERTY_DATA = "data";
    private List<@Valid AssistantObject> data = new ArrayList<>();

    public static final String JSON_PROPERTY_FIRST_ID = "first_id";
    private String firstId;

    public static final String JSON_PROPERTY_LAST_ID = "last_id";
    private String lastId;

    public static final String JSON_PROPERTY_HAS_MORE = "has_more";
    private Boolean hasMore;

    public ListAssistantsResponse(String _object, List<@Valid AssistantObject> data, String firstId, String lastId, Boolean hasMore) {
        this._object = _object;
        this.data = data;
        this.firstId = firstId;
        this.lastId = lastId;
        this.hasMore = hasMore;
    }

    public ListAssistantsResponse _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     */
    @NotNull
    @Schema(name = "object", example = "list", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public ListAssistantsResponse data(List<@Valid AssistantObject> data) {
        this.data = data;
        return this;
    }

    public ListAssistantsResponse addDataItem(AssistantObject dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     * @return data
     */
    @NotNull
    @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid AssistantObject> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(List<@Valid AssistantObject> data) {
        this.data = data;
    }

    public ListAssistantsResponse firstId(String firstId) {
        this.firstId = firstId;
        return this;
    }

    /**
     * Get firstId
     * @return firstId
     */
    @NotNull
    @Schema(name = "first_id", example = "asst_abc123", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FIRST_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFirstId() {
        return firstId;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public ListAssistantsResponse lastId(String lastId) {
        this.lastId = lastId;
        return this;
    }

    /**
     * Get lastId
     * @return lastId
     */
    @NotNull
    @Schema(name = "last_id", example = "asst_abc456", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_LAST_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLastId() {
        return lastId;
    }

    @JsonProperty(JSON_PROPERTY_LAST_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public ListAssistantsResponse hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Get hasMore
     * @return hasMore
     */
    @NotNull
    @Schema(name = "has_more", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_HAS_MORE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getHasMore() {
        return hasMore;
    }

    @JsonProperty(JSON_PROPERTY_HAS_MORE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssistantsResponse listAssistantsResponse = (ListAssistantsResponse) o;
        return Objects.equals(this._object, listAssistantsResponse._object) &&
            Objects.equals(this.data, listAssistantsResponse.data) &&
            Objects.equals(this.firstId, listAssistantsResponse.firstId) &&
            Objects.equals(this.lastId, listAssistantsResponse.lastId) &&
            Objects.equals(this.hasMore, listAssistantsResponse.hasMore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, data, firstId, lastId, hasMore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssistantsResponse {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
        sb.append("    lastId: ").append(toIndentedString(lastId)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

