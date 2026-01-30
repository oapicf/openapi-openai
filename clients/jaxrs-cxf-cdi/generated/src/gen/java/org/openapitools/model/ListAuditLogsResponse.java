package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuditLog;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ListAuditLogsResponse   {
  

public enum ObjectEnum {

    @JsonProperty("list") LIST(String.valueOf("list"));


    private String value;

    ObjectEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;

  private List<@Valid AuditLog> data = new ArrayList<>();

  private String firstId;

  private String lastId;

  private Boolean hasMore;

  /**
   **/
  public ListAuditLogsResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  /**
   **/
  public ListAuditLogsResponse data(List<@Valid AuditLog> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public List<@Valid AuditLog> getData() {
    return data;
  }
  public void setData(List<@Valid AuditLog> data) {
    this.data = data;
  }

  public ListAuditLogsResponse addDataItem(AuditLog dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }


  /**
   **/
  public ListAuditLogsResponse firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  
  @ApiModelProperty(example = "audit_log-defb456h8dks", required = true, value = "")
  @JsonProperty("first_id")
  @NotNull
  public String getFirstId() {
    return firstId;
  }
  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }


  /**
   **/
  public ListAuditLogsResponse lastId(String lastId) {
    this.lastId = lastId;
    return this;
  }

  
  @ApiModelProperty(example = "audit_log-hnbkd8s93s", required = true, value = "")
  @JsonProperty("last_id")
  @NotNull
  public String getLastId() {
    return lastId;
  }
  public void setLastId(String lastId) {
    this.lastId = lastId;
  }


  /**
   **/
  public ListAuditLogsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("has_more")
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
    ListAuditLogsResponse listAuditLogsResponse = (ListAuditLogsResponse) o;
    return Objects.equals(this._object, listAuditLogsResponse._object) &&
        Objects.equals(this.data, listAuditLogsResponse.data) &&
        Objects.equals(this.firstId, listAuditLogsResponse.firstId) &&
        Objects.equals(this.lastId, listAuditLogsResponse.lastId) &&
        Objects.equals(this.hasMore, listAuditLogsResponse.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data, firstId, lastId, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAuditLogsResponse {\n");
    
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

