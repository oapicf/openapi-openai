package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Describes an OpenAI model offering that can be used with the API.
 */
public class Model implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The model identifier, which can be referenced in the API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The Unix timestamp (in seconds) when the model was created.
   */
  @JsonProperty("created")
  private Integer created;

  /**
   * The object type, which is always \&quot;model\&quot;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The organization that owns the model.
   */
  @JsonProperty("owned_by")
  private String ownedBy;

  /**
   * The model identifier, which can be referenced in the API endpoints.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The Unix timestamp (in seconds) when the model was created.
   * @return created
   */
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The object type, which is always \&quot;model\&quot;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The organization that owns the model.
   * @return ownedBy
   */
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
        Objects.equals(this.created, model.created) &&
        Objects.equals(this._object, model._object) &&
        Objects.equals(this.ownedBy, model.ownedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, _object, ownedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
