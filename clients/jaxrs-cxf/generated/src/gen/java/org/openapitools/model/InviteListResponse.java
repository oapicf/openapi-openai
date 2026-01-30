package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Invite;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteListResponse  {
  
public enum ObjectEnum {

LIST(String.valueOf("list"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * The object type, which is always `list`
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `list`")

  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid Invite> data = new ArrayList<>();

 /**
  * The first `invite_id` in the retrieved `list`
  */
  @ApiModelProperty(value = "The first `invite_id` in the retrieved `list`")

  private String firstId;

 /**
  * The last `invite_id` in the retrieved `list`
  */
  @ApiModelProperty(value = "The last `invite_id` in the retrieved `list`")

  private String lastId;

 /**
  * The `has_more` property is used for pagination to indicate there are additional results.
  */
  @ApiModelProperty(value = "The `has_more` property is used for pagination to indicate there are additional results.")

  private Boolean hasMore;
 /**
   * The object type, which is always &#x60;list&#x60;
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public InviteListResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  @NotNull
  public List<@Valid Invite> getData() {
    return data;
  }

  public void setData(List<@Valid Invite> data) {
    this.data = data;
  }

  public InviteListResponse data(List<@Valid Invite> data) {
    this.data = data;
    return this;
  }

  public InviteListResponse addDataItem(Invite dataItem) {
    this.data.add(dataItem);
    return this;
  }

 /**
   * The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   * @return firstId
  **/
  @JsonProperty("first_id")
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public InviteListResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

 /**
   * The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   * @return lastId
  **/
  @JsonProperty("last_id")
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  public InviteListResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

 /**
   * The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results.
   * @return hasMore
  **/
  @JsonProperty("has_more")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public InviteListResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteListResponse inviteListResponse = (InviteListResponse) o;
    return Objects.equals(this._object, inviteListResponse._object) &&
        Objects.equals(this.data, inviteListResponse.data) &&
        Objects.equals(this.firstId, inviteListResponse.firstId) &&
        Objects.equals(this.lastId, inviteListResponse.lastId) &&
        Objects.equals(this.hasMore, inviteListResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteListResponse {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

