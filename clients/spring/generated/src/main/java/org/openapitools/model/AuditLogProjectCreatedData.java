package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The payload used to create the project.
 */

@Schema(name = "AuditLog_project_created_data", description = "The payload used to create the project.")
@JsonTypeName("AuditLog_project_created_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-03T06:38:48.434581935Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AuditLogProjectCreatedData {

  private @Nullable String name;

  private @Nullable String title;

  public AuditLogProjectCreatedData name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The project name.
   * @return name
   */
  
  @Schema(name = "name", description = "The project name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AuditLogProjectCreatedData title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the project as seen on the dashboard.
   * @return title
   */
  
  @Schema(name = "title", description = "The title of the project as seen on the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogProjectCreatedData auditLogProjectCreatedData = (AuditLogProjectCreatedData) o;
    return Objects.equals(this.name, auditLogProjectCreatedData.name) &&
        Objects.equals(this.title, auditLogProjectCreatedData.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProjectCreatedData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

