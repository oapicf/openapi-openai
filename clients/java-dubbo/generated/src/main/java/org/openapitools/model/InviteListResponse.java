package org.openapitools.model;

import org.openapitools.model.Invite;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class InviteListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object type, which is always &#x60;list&#x60;
   */
  @JsonProperty("object")
  private String _object;

  @JsonProperty("data")
  private List<Invite> data = new ArrayList<>();

  /**
   * The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   */
  @JsonProperty("first_id")
  private String firstId;

  /**
   * The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   */
  @JsonProperty("last_id")
  private String lastId;

  /**
   * The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results.
   */
  @JsonProperty("has_more")
  private Boolean hasMore;

  /**
   * The object type, which is always &#x60;list&#x60;
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * 
   * @return data
   */
  public List<Invite> getData() {
    return data;
  }

  public void setData(List<Invite> data) {
    this.data = data;
  }

  /**
   * The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   * @return firstId
   */
  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  /**
   * The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
   * @return lastId
   */
  public String getLastId() {
    return lastId;
  }

  public void setLastId(String lastId) {
    this.lastId = lastId;
  }

  /**
   * The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results.
   * @return hasMore
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
