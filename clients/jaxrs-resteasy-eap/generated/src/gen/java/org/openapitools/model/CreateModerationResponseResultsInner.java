package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponseResultsInner   {
  
  private Boolean flagged;
  private CreateModerationResponseResultsInnerCategories categories;
  private CreateModerationResponseResultsInnerCategoryScores categoryScores;
  private CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

  /**
   * Whether any of the below categories are flagged.
   **/
  
  @ApiModelProperty(required = true, value = "Whether any of the below categories are flagged.")
  @JsonProperty("flagged")
  @NotNull
  public Boolean getFlagged() {
    return flagged;
  }
  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("categories")
  @NotNull
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }
  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("category_scores")
  @NotNull
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }
  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("category_applied_input_types")
  @NotNull
  public CreateModerationResponseResultsInnerCategoryAppliedInputTypes getCategoryAppliedInputTypes() {
    return categoryAppliedInputTypes;
  }
  public void setCategoryAppliedInputTypes(CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
    this.categoryAppliedInputTypes = categoryAppliedInputTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInner createModerationResponseResultsInner = (CreateModerationResponseResultsInner) o;
    return Objects.equals(this.flagged, createModerationResponseResultsInner.flagged) &&
        Objects.equals(this.categories, createModerationResponseResultsInner.categories) &&
        Objects.equals(this.categoryScores, createModerationResponseResultsInner.categoryScores) &&
        Objects.equals(this.categoryAppliedInputTypes, createModerationResponseResultsInner.categoryAppliedInputTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagged, categories, categoryScores, categoryAppliedInputTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInner {\n");
    
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
    sb.append("    categoryAppliedInputTypes: ").append(toIndentedString(categoryAppliedInputTypes)).append("\n");
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

