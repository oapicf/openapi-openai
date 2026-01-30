package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CompleteUploadRequest  {
  
 /**
  * The ordered list of Part IDs. 
  */
  @ApiModelProperty(required = true, value = "The ordered list of Part IDs. ")

  private List<String> partIds = new ArrayList<>();

 /**
  * The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
  */
  @ApiModelProperty(value = "The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. ")

  private String md5;
 /**
   * The ordered list of Part IDs. 
   * @return partIds
  **/
  @JsonProperty("part_ids")
  @NotNull
  public List<String> getPartIds() {
    return partIds;
  }

  public void setPartIds(List<String> partIds) {
    this.partIds = partIds;
  }

  public CompleteUploadRequest partIds(List<String> partIds) {
    this.partIds = partIds;
    return this;
  }

  public CompleteUploadRequest addPartIdsItem(String partIdsItem) {
    this.partIds.add(partIdsItem);
    return this;
  }

 /**
   * The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
   * @return md5
  **/
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public CompleteUploadRequest md5(String md5) {
    this.md5 = md5;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

