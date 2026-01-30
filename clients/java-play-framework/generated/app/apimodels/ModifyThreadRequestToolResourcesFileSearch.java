package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ModifyThreadRequestToolResourcesFileSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ModifyThreadRequestToolResourcesFileSearch   {
  @JsonProperty("vector_store_ids")
  @Size(max=1)

  private List<String> vectorStoreIds = null;

  public ModifyThreadRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  public ModifyThreadRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

   /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
   * @return vectorStoreIds
  **/
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyThreadRequestToolResourcesFileSearch modifyThreadRequestToolResourcesFileSearch = (ModifyThreadRequestToolResourcesFileSearch) o;
    return Objects.equals(vectorStoreIds, modifyThreadRequestToolResourcesFileSearch.vectorStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyThreadRequestToolResourcesFileSearch {\n");
    
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
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

