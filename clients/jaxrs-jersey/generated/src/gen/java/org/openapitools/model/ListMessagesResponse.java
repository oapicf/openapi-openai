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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MessageObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ListMessagesResponse
 */
@JsonPropertyOrder({
  ListMessagesResponse.JSON_PROPERTY_OBJECT,
  ListMessagesResponse.JSON_PROPERTY_DATA,
  ListMessagesResponse.JSON_PROPERTY_FIRST_ID,
  ListMessagesResponse.JSON_PROPERTY_LAST_ID,
  ListMessagesResponse.JSON_PROPERTY_HAS_MORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ListMessagesResponse   {
  public static final String JSON_PROPERTY_OBJECT = "object";
  @JsonProperty(JSON_PROPERTY_OBJECT)
  private String _object;

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private List<@Valid MessageObject> data = new ArrayList<>();

  public static final String JSON_PROPERTY_FIRST_ID = "first_id";
  @JsonProperty(JSON_PROPERTY_FIRST_ID)
  private String firstId;

  public static final String JSON_PROPERTY_LAST_ID = "last_id";
  @JsonProperty(JSON_PROPERTY_LAST_ID)
  private String lastId;

  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  private Boolean hasMore;

  public ListMessagesResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   **/
  @JsonProperty(value = "object")
  @ApiModelProperty(example = "list", required = true, value = "")
  @NotNull 
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ListMessagesResponse data(List<@Valid MessageObject> data) {
    this.data = data;
    return this;
  }

  public ListMessagesResponse addDataItem(MessageObject dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty(value = "data")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public List<@Valid MessageObject> getData() {
    return data;
  }

  public void setData(List<@Valid MessageObject> data) {
    this.data = data;
  }

  public ListMessagesResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * Get firstId
   * @return firstId
   **/
  @JsonProperty(value = "first_id")
  @ApiModelProperty(example = "msg_abc123", required = true, value = "")
  @NotNull 
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public ListMessagesResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  /**
   * Get lastId
   * @return lastId
   **/
  @JsonProperty(value = "last_id")
  @ApiModelProperty(example = "msg_abc123", required = true, value = "")
  @NotNull 
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public ListMessagesResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Get hasMore
   * @return hasMore
   **/
  @JsonProperty(value = "has_more")
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull 
  public Boolean getHasMore() {
    return hasMore;
  }

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
    ListMessagesResponse listMessagesResponse = (ListMessagesResponse) o;
    return Objects.equals(this._object, listMessagesResponse._object) &&
        Objects.equals(this.data, listMessagesResponse.data) &&
        Objects.equals(this.firstId, listMessagesResponse.firstId) &&
        Objects.equals(this.lastId, listMessagesResponse.lastId) &&
        Objects.equals(this.hasMore, listMessagesResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessagesResponse {\n");
    
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

