package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Describes an OpenAI model offering that can be used with the API.
 **/
@ApiModel(description="Describes an OpenAI model offering that can be used with the API.")

public class Model  {
  
  @ApiModelProperty(required = true, value = "The model identifier, which can be referenced in the API endpoints.")
 /**
   * The model identifier, which can be referenced in the API endpoints.
  **/
  private String id;

  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) when the model was created.")
 /**
   * The Unix timestamp (in seconds) when the model was created.
  **/
  private Integer created;

public enum ObjectEnum {

MODEL(String.valueOf("model"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "The object type, which is always \"model\".")
 /**
   * The object type, which is always \"model\".
  **/
  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "The organization that owns the model.")
 /**
   * The organization that owns the model.
  **/
  private String ownedBy;
 /**
   * The model identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Model id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) when the model was created.
   * @return created
  **/
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public Model created(Integer created) {
    this.created = created;
    return this;
  }

 /**
   * The object type, which is always \&quot;model\&quot;.
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Model _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The organization that owns the model.
   * @return ownedBy
  **/
  @JsonProperty("owned_by")
  public String getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

