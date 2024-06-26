/**
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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.Model;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ListModelsResponse {
  
  public enum _objectEnum {
     list, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("data")
  private List<Model> data = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Model> getData() {
    return data;
  }
  public void setData(List<Model> data) {
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
    ListModelsResponse listModelsResponse = (ListModelsResponse) o;
    return (this._object == null ? listModelsResponse._object == null : this._object.equals(listModelsResponse._object)) &&
        (this.data == null ? listModelsResponse.data == null : this.data.equals(listModelsResponse.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsResponse {\n");
    
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
