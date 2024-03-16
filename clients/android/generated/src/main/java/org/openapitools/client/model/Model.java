/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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

@ApiModel(description = "")
public class Model {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created")
  private Integer created = null;
  @SerializedName("owned_by")
  private String ownedBy = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
        (this._object == null ? model._object == null : this._object.equals(model._object)) &&
        (this.created == null ? model.created == null : this.created.equals(model.created)) &&
        (this.ownedBy == null ? model.ownedBy == null : this.ownedBy.equals(model.ownedBy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    result = 31 * result + (this.ownedBy == null ? 0: this.ownedBy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  ownedBy: ").append(ownedBy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}