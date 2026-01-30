package apimodels;

import apimodels.AuditLogProjectUpdatedChangesRequested;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The details for events with this &#x60;type&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLogProjectUpdated   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("changes_requested")
  @Valid

  private AuditLogProjectUpdatedChangesRequested changesRequested;

  public AuditLogProjectUpdated id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The project ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogProjectUpdated changesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

   /**
   * Get changesRequested
   * @return changesRequested
  **/
  public AuditLogProjectUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  public void setChangesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogProjectUpdated auditLogProjectUpdated = (AuditLogProjectUpdated) o;
    return Objects.equals(id, auditLogProjectUpdated.id) &&
        Objects.equals(changesRequested, auditLogProjectUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProjectUpdated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    changesRequested: ").append(toIndentedString(changesRequested)).append("\n");
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

