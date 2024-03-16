package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Model  {
  
  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private Integer created;

  @ApiModelProperty(required = true, value = "")
  private String ownedBy;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Model id(String id) {
    this.id = id;
    return this;
  }

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
  public Model _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get created
  * @return created
  */
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }

  /**
   * Sets the <code>created</code> property.
   */
 public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * Sets the <code>created</code> property.
   */
  public Model created(Integer created) {
    this.created = created;
    return this;
  }

 /**
  * Get ownedBy
  * @return ownedBy
  */
  @JsonProperty("owned_by")
  @NotNull
  public String getOwnedBy() {
    return ownedBy;
  }

  /**
   * Sets the <code>ownedBy</code> property.
   */
 public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }

  /**
   * Sets the <code>ownedBy</code> property.
   */
  public Model ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

