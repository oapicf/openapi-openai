package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Model
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Model   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("object")
  private String _object;

  @JsonProperty("created")
  private Integer created;

  @JsonProperty("owned_by")
  private String ownedBy;

  public Model id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Model _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public Model created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public Model ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
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

