package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTune;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListFineTunesResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid FineTune> data = new ArrayList<>();
 /**
  * Get _object
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public ListFineTunesResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  @NotNull
  public List<@Valid FineTune> getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(List<@Valid FineTune> data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public ListFineTunesResponse data(List<@Valid FineTune> data) {
    this.data = data;
    return this;
  }

  /**
   * Adds a new item to the <code>data</code> list.
   */
  public ListFineTunesResponse addDataItem(FineTune dataItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

