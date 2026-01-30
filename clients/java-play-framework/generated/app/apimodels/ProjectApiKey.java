package apimodels;

import apimodels.ProjectApiKeyOwner;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents an individual API key in a project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProjectApiKey   {
  /**
   * The object type, which is always `organization.project.api_key`
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT_API_KEY("organization.project.api_key");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("redacted_value")
  @NotNull

  private String redactedValue;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("owner")
  @NotNull
@Valid

  private ProjectApiKeyOwner owner;

  public ProjectApiKey _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `organization.project.api_key`
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectApiKey redactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
    return this;
  }

   /**
   * The redacted value of the API key
   * @return redactedValue
  **/
  public String getRedactedValue() {
    return redactedValue;
  }

  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }

  public ProjectApiKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the API key
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectApiKey createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the API key was created
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectApiKey id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectApiKey owner(ProjectApiKeyOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public ProjectApiKeyOwner getOwner() {
    return owner;
  }

  public void setOwner(ProjectApiKeyOwner owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectApiKey projectApiKey = (ProjectApiKey) o;
    return Objects.equals(_object, projectApiKey._object) &&
        Objects.equals(redactedValue, projectApiKey.redactedValue) &&
        Objects.equals(name, projectApiKey.name) &&
        Objects.equals(createdAt, projectApiKey.createdAt) &&
        Objects.equals(id, projectApiKey.id) &&
        Objects.equals(owner, projectApiKey.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, redactedValue, name, createdAt, id, owner);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKey {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    redactedValue: ").append(toIndentedString(redactedValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

