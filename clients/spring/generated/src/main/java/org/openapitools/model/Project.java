package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an individual project.
 */

@Schema(name = "Project", description = "Represents an individual project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Project {

  private String id;

  /**
   * The object type, which is always `organization.project`
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT("organization.project");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  private String name;

  private Integer createdAt;

  private JsonNullable<Integer> archivedAt = JsonNullable.<Integer>undefined();

  /**
   * `active` or `archived`
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    ARCHIVED("archived");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public Project() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Project(String id, ObjectEnum _object, String name, Integer createdAt, StatusEnum status) {
    this.id = id;
    this._object = _object;
    this.name = name;
    this.createdAt = createdAt;
    this.status = status;
  }

  public Project id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The identifier, which can be referenced in API endpoints", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Project _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.project`
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `organization.project`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project. This appears in reporting.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "The name of the project. This appears in reporting.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was created.
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) of when the project was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Project archivedAt(Integer archivedAt) {
    this.archivedAt = JsonNullable.of(archivedAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was archived or `null`.
   * @return archivedAt
   */
  
  @Schema(name = "archived_at", description = "The Unix timestamp (in seconds) of when the project was archived or `null`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived_at")
  public JsonNullable<Integer> getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(JsonNullable<Integer> archivedAt) {
    this.archivedAt = archivedAt;
  }

  public Project status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * `active` or `archived`
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "`active` or `archived`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this._object, project._object) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        equalsNullable(this.archivedAt, project.archivedAt) &&
        Objects.equals(this.status, project.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, name, createdAt, hashCodeNullable(archivedAt), status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

