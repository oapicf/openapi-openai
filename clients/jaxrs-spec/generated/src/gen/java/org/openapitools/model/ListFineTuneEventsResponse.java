package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FineTuneEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ListFineTuneEventsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListFineTuneEventsResponse   {
  private @Valid String _object;
  private @Valid List<@Valid FineTuneEvent> data = new ArrayList<>();

  /**
   **/
  public ListFineTuneEventsResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public ListFineTuneEventsResponse data(List<@Valid FineTuneEvent> data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public List<FineTuneEvent> getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(List<@Valid FineTuneEvent> data) {
    this.data = data;
  }

  public ListFineTuneEventsResponse addDataItem(FineTuneEvent dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }

    this.data.add(dataItem);
    return this;
  }

  public ListFineTuneEventsResponse removeDataItem(FineTuneEvent dataItem) {
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
    ListFineTuneEventsResponse listFineTuneEventsResponse = (ListFineTuneEventsResponse) o;
    return Objects.equals(this._object, listFineTuneEventsResponse._object) &&
        Objects.equals(this.data, listFineTuneEventsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFineTuneEventsResponse {\n");
    
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

