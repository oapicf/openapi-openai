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

@ApiModel(description = "")
public class DeleteAssistantResponse {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("deleted")
  private Boolean deleted = null;
  public enum _objectEnum {
     assistant.deleted, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;

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
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAssistantResponse deleteAssistantResponse = (DeleteAssistantResponse) o;
    return (this.id == null ? deleteAssistantResponse.id == null : this.id.equals(deleteAssistantResponse.id)) &&
        (this.deleted == null ? deleteAssistantResponse.deleted == null : this.deleted.equals(deleteAssistantResponse.deleted)) &&
        (this._object == null ? deleteAssistantResponse._object == null : this._object.equals(deleteAssistantResponse._object));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.deleted == null ? 0: this.deleted.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssistantResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  deleted: ").append(deleted).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}