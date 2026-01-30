package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchErrorsDataInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BatchErrors  {
  
 /**
  * The object type, which is always `list`.
  */
  @ApiModelProperty(value = "The object type, which is always `list`.")

  private String _object;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid BatchErrorsDataInner> data = new ArrayList<>();
 /**
   * The object type, which is always &#x60;list&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public BatchErrors _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<@Valid BatchErrorsDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid BatchErrorsDataInner> data) {
    this.data = data;
  }

  public BatchErrors data(List<@Valid BatchErrorsDataInner> data) {
    this.data = data;
    return this;
  }

  public BatchErrors addDataItem(BatchErrorsDataInner dataItem) {
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
    BatchErrors batchErrors = (BatchErrors) o;
    return Objects.equals(this._object, batchErrors._object) &&
        Objects.equals(this.data, batchErrors.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchErrors {\n");
    
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

