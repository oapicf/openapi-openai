package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The payload used to create the project.
 */

@Schema(name = "AuditLog_project_created_data", description = "The payload used to create the project.")
@JsonTypeName("AuditLog_project_created_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

