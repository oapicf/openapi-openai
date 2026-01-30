package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CompleteUploadRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompleteUploadRequest {

  @Valid
  private List<String> partIds = new ArrayList<>();

  private String md5;

  public CompleteUploadRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CompleteUploadRequest(List<String> partIds) {
    this.partIds = partIds;
  }

  public CompleteUploadRequest partIds(List<String> partIds) {
    this.partIds = partIds;
    return this;
  }

  public CompleteUploadRequest addPartIdsItem(String partIdsItem) {
    if (this.partIds == null) {
      this.partIds = new ArrayList<>();
    }
    this.partIds.add(partIdsItem);
    return this;
  }

  /**
   * The ordered list of Part IDs. 
   * @return partIds
   */
  @NotNull 
  @Schema(name = "part_ids", description = "The ordered list of Part IDs. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("part_ids")
  public List<String> getPartIds() {
    return partIds;
  }

  public void setPartIds(List<String> partIds) {
    this.partIds = partIds;
  }

  public CompleteUploadRequest md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
   * @return md5
   */
  
  @Schema(name = "md5", description = "The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteUploadRequest completeUploadRequest = (CompleteUploadRequest) o;
    return Objects.equals(this.partIds, completeUploadRequest.partIds) &&
        Objects.equals(this.md5, completeUploadRequest.md5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partIds, md5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteUploadRequest {\n");
    sb.append("    partIds: ").append(toIndentedString(partIds)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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

