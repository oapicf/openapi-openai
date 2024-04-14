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
import org.openapitools.model.ThreadObject;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ListThreadsResponse
 */
@JsonPropertyOrder({
  ListThreadsResponse.JSON_PROPERTY_OBJECT,
  ListThreadsResponse.JSON_PROPERTY_DATA,
  ListThreadsResponse.JSON_PROPERTY_FIRST_ID,
  ListThreadsResponse.JSON_PROPERTY_LAST_ID,
  ListThreadsResponse.JSON_PROPERTY_HAS_MORE
})
@JsonTypeName("ListThreadsResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class ListThreadsResponse {
    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public static final String JSON_PROPERTY_DATA = "data";
    private List<@Valid ThreadObject> data = new ArrayList<>();

    public static final String JSON_PROPERTY_FIRST_ID = "first_id";
    private String firstId;

    public static final String JSON_PROPERTY_LAST_ID = "last_id";
    private String lastId;

    public static final String JSON_PROPERTY_HAS_MORE = "has_more";
    private Boolean hasMore;

    public ListThreadsResponse(String _object, List<@Valid ThreadObject> data, String firstId, String lastId, Boolean hasMore) {
        this._object = _object;
        this.data = data;
        this.firstId = firstId;
        this.lastId = lastId;
        this.hasMore = hasMore;
    }

    public ListThreadsResponse _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
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

    public ListThreadsResponse data(List<@Valid ThreadObject> data) {
        this.data = data;
        return this;
    }

    public ListThreadsResponse addDataItem(ThreadObject dataItem) {
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
    public List<@Valid ThreadObject> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(List<@Valid ThreadObject> data) {
        this.data = data;
    }

    public ListThreadsResponse firstId(String firstId) {
        this.firstId = firstId;
        return this;
    }

    /**
     * Get firstId
     * @return firstId
     **/
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

    public ListThreadsResponse lastId(String lastId) {
        this.lastId = lastId;
        return this;
    }

    /**
     * Get lastId
     * @return lastId
     **/
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

    public ListThreadsResponse hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Get hasMore
     * @return hasMore
     **/
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
        ListThreadsResponse listThreadsResponse = (ListThreadsResponse) o;
        return Objects.equals(this._object, listThreadsResponse._object) &&
            Objects.equals(this.data, listThreadsResponse.data) &&
            Objects.equals(this.firstId, listThreadsResponse.firstId) &&
            Objects.equals(this.lastId, listThreadsResponse.lastId) &&
            Objects.equals(this.hasMore, listThreadsResponse.hasMore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, data, firstId, lastId, hasMore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListThreadsResponse {\n");
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

