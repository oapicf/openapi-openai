package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.BatchErrorsDataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BatchErrors
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchErrors   {
  @JsonProperty("object")
  private String _object;

  @JsonProperty("data")
  
  private List<BatchErrorsDataInner> data = null;

  public BatchErrors _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `list`.
   * @return _object
   */
  @ApiModelProperty(value = "The object type, which is always `list`.")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public BatchErrors data(List<BatchErrorsDataInner> data) {
    this.data = data;
    return this;
  }

  public BatchErrors addDataItem(BatchErrorsDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(value = "")
  public List<BatchErrorsDataInner> getData() {
    return data;
  }

  public void setData(List<BatchErrorsDataInner> data) {
    this.data = data;
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

