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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Describes an OpenAI model offering that can be used with the API.
 **/
@ApiModel(description = "Describes an OpenAI model offering that can be used with the API.")
public class Model {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("created")
  private Integer created = null;
  public enum _objectEnum {
     model, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("owned_by")
  private String ownedBy = null;

  /**
   * The model identifier, which can be referenced in the API endpoints.
   **/
  @ApiModelProperty(required = true, value = "The model identifier, which can be referenced in the API endpoints.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) when the model was created.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) when the model was created.")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The object type, which is always \"model\".
   **/
  @ApiModelProperty(required = true, value = "The object type, which is always \"model\".")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
    this._object = _object;
  }

  /**
   * The organization that owns the model.
   **/
  @ApiModelProperty(required = true, value = "The organization that owns the model.")
  public String getOwnedBy() {
    return ownedBy;
  }
  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return (this.id == null ? model.id == null : this.id.equals(model.id)) &&
        (this.created == null ? model.created == null : this.created.equals(model.created)) &&
        (this._object == null ? model._object == null : this._object.equals(model._object)) &&
        (this.ownedBy == null ? model.ownedBy == null : this.ownedBy.equals(model.ownedBy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.ownedBy == null ? 0: this.ownedBy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  ownedBy: ").append(ownedBy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
