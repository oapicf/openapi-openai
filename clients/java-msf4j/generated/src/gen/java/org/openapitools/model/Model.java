package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes an OpenAI model offering that can be used with the API.
 */
@ApiModel(description = "Describes an OpenAI model offering that can be used with the API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Model   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("created")
  private Integer created;

  /**
   * The object type, which is always \"model\".
   */
  public enum ObjectEnum {
    MODEL("model");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("owned_by")
  private String ownedBy;

  public Model id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The model identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The model identifier, which can be referenced in the API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Model created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) when the model was created.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) when the model was created.")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public Model _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always \"model\".
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "The object type, which is always \"model\".")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Model ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * The organization that owns the model.
   * @return ownedBy
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

