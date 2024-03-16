package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class Model   {
  
  private String id;

  private String _object;

  private Integer created;

  private String ownedBy;

  /**
   **/
  public Model id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public Model _object(String _object) {
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
  public Model created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }


  /**
   **/
  public Model ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("owned_by")
  @NotNull
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
    return Objects.equals(this.id, model.id) &&
        Objects.equals(this._object, model._object) &&
        Objects.equals(this.created, model.created) &&
        Objects.equals(this.ownedBy, model.ownedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, created, ownedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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

