package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BatchErrorsDataInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Batch_errors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchErrors   {
  private String _object;
  private @Valid List<@Valid BatchErrorsDataInner> data = new ArrayList<>();

  public BatchErrors() {
  }

  /**
   * The object type, which is always &#x60;list&#x60;.
   **/
  public BatchErrors _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(value = "The object type, which is always `list`.")
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public BatchErrors data(List<@Valid BatchErrorsDataInner> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public List<@Valid BatchErrorsDataInner> getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(List<@Valid BatchErrorsDataInner> data) {
    this.data = data;
  }

  public BatchErrors addDataItem(BatchErrorsDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }

    this.data.add(dataItem);
    return this;
  }

  public BatchErrors removeDataItem(BatchErrorsDataInner dataItem) {
    if (dataItem != null && this.data != null) {
      this.data.remove(dataItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

