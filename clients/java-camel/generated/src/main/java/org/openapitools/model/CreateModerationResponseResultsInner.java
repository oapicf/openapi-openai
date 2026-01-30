package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateModerationResponseResultsInner
 */

@JsonTypeName("CreateModerationResponse_results_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateModerationResponseResultsInner {

  private Boolean flagged;

  private CreateModerationResponseResultsInnerCategories categories;

  private CreateModerationResponseResultsInnerCategoryScores categoryScores;

  private CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

  public CreateModerationResponseResultsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateModerationResponseResultsInner(Boolean flagged, CreateModerationResponseResultsInnerCategories categories, CreateModerationResponseResultsInnerCategoryScores categoryScores, CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
    this.flagged = flagged;
    this.categories = categories;
    this.categoryScores = categoryScores;
    this.categoryAppliedInputTypes = categoryAppliedInputTypes;
  }

  public CreateModerationResponseResultsInner flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

  /**
   * Whether any of the below categories are flagged.
   * @return flagged
   */
  @NotNull 
  @Schema(name = "flagged", description = "Whether any of the below categories are flagged.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flagged")
  public Boolean getFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public CreateModerationResponseResultsInner categories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @NotNull @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categories")
  public CreateModerationResponseResultsInnerCategories getCategories() {
    return categories;
  }

  public void setCategories(CreateModerationResponseResultsInnerCategories categories) {
    this.categories = categories;
  }

  public CreateModerationResponseResultsInner categoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
    return this;
  }

  /**
   * Get categoryScores
   * @return categoryScores
   */
  @NotNull @Valid 
  @Schema(name = "category_scores", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category_scores")
  public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
    return categoryScores;
  }

  public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
    this.categoryScores = categoryScores;
  }

  public CreateModerationResponseResultsInner categoryAppliedInputTypes(CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes) {
    this.categoryAppliedInputTypes = categoryAppliedInputTypes;
    return this;
  }

  /**
   * Get categoryAppliedInputTypes
   * @return categoryAppliedInputTypes
   */
  @NotNull @Valid 
  @Schema(name = "category_applied_input_types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category_applied_input_types")
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

