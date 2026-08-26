package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProjectServiceAccountCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-26T05:15:44.940200602Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProjectServiceAccountCreateRequest   {
  @JsonProperty("name")
  @NotNull

  private String name;

  public ProjectServiceAccountCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the service account being created.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest = (ProjectServiceAccountCreateRequest) o;
    return Objects.equals(name, projectServiceAccountCreateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectServiceAccountCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

