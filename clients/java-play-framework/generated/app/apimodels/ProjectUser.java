package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents an individual user in a project.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProjectUser   {
  /**
   * The object type, which is always `organization.project.user`
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT_USER("organization.project.user");

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

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("email")
  @NotNull

  private String email;

  /**
   * `owner` or `member`
   */
  public enum RoleEnum {
    OWNER("owner"),
    
    MEMBER("member");

    private final String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("role")
  @NotNull

  private RoleEnum role;

  @JsonProperty("added_at")
  @NotNull

  private Integer addedAt;

  public ProjectUser _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `organization.project.user`
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectUser id(String id) {
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

  public ProjectUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the user
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ProjectUser role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * `owner` or `member`
   * @return role
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ProjectUser addedAt(Integer addedAt) {
    this.addedAt = addedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the project was added.
   * @return addedAt
  **/
  public Integer getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(Integer addedAt) {
    this.addedAt = addedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUser projectUser = (ProjectUser) o;
    return Objects.equals(_object, projectUser._object) &&
        Objects.equals(id, projectUser.id) &&
        Objects.equals(name, projectUser.name) &&
        Objects.equals(email, projectUser.email) &&
        Objects.equals(role, projectUser.role) &&
        Objects.equals(addedAt, projectUser.addedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, name, email, role, addedAt);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUser {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
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

