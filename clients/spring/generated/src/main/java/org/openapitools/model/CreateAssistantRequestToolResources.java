package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearch;
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
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

@Schema(name = "CreateAssistantRequest_tool_resources", description = "A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. ")
@JsonTypeName("CreateAssistantRequest_tool_resources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateAssistantRequestToolResources {

  private @Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  private JsonNullable<CreateAssistantRequestToolResourcesFileSearch> fileSearch = JsonNullable.<CreateAssistantRequestToolResourcesFileSearch>undefined();

  public CreateAssistantRequestToolResources codeInterpreter(@Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

  /**
   * Get codeInterpreter
   * @return codeInterpreter
   */
  @Valid 
  @Schema(name = "code_interpreter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_interpreter")
  public @Nullable CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(@Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public CreateAssistantRequestToolResources fileSearch(CreateAssistantRequestToolResourcesFileSearch fileSearch) {
    this.fileSearch = JsonNullable.of(fileSearch);
    return this;
  }

  /**
   * Get fileSearch
   * @return fileSearch
   */
  @Valid 
  @Schema(name = "file_search", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_search")
  public JsonNullable<CreateAssistantRequestToolResourcesFileSearch> getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(JsonNullable<CreateAssistantRequestToolResourcesFileSearch> fileSearch) {
    this.fileSearch = fileSearch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssistantRequestToolResources createAssistantRequestToolResources = (CreateAssistantRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, createAssistantRequestToolResources.codeInterpreter) &&
        equalsNullable(this.fileSearch, createAssistantRequestToolResources.fileSearch);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, hashCodeNullable(fileSearch));
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
    sb.append("class CreateAssistantRequestToolResources {\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

