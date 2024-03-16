package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTune;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ListFineTunesResponse   {
  
  private String _object;

  private List<@Valid FineTune> data = new ArrayList<>();

  /**
   **/
  public ListFineTunesResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }


  /**
   **/
  public ListFineTunesResponse data(List<@Valid FineTune> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public List<@Valid FineTune> getData() {
    return data;
  }
  public void setData(List<@Valid FineTune> data) {
    this.data = data;
  }

  public ListFineTunesResponse addDataItem(FineTune dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
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
    ListFineTunesResponse listFineTunesResponse = (ListFineTunesResponse) o;
    return Objects.equals(this._object, listFineTunesResponse._object) &&
        Objects.equals(this.data, listFineTunesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFineTunesResponse {\n");
    
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

