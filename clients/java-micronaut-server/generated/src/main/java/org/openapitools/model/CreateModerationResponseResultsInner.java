/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateModerationResponseResultsInnerCategories;
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateModerationResponseResultsInner
 */
@JsonPropertyOrder({
  CreateModerationResponseResultsInner.JSON_PROPERTY_FLAGGED,
  CreateModerationResponseResultsInner.JSON_PROPERTY_CATEGORIES,
  CreateModerationResponseResultsInner.JSON_PROPERTY_CATEGORY_SCORES
})
@JsonTypeName("CreateModerationResponse_results_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateModerationResponseResultsInner {
    public static final String JSON_PROPERTY_FLAGGED = "flagged";
    private Boolean flagged;

    public static final String JSON_PROPERTY_CATEGORIES = "categories";
    private CreateModerationResponseResultsInnerCategories categories;

    public static final String JSON_PROPERTY_CATEGORY_SCORES = "category_scores";
    private CreateModerationResponseResultsInnerCategoryScores categoryScores;

    public CreateModerationResponseResultsInner(Boolean flagged, CreateModerationResponseResultsInnerCategories categories, CreateModerationResponseResultsInnerCategoryScores categoryScores) {
        this.flagged = flagged;
        this.categories = categories;
        this.categoryScores = categoryScores;
    }

    public CreateModerationResponseResultsInner flagged(Boolean flagged) {
        this.flagged = flagged;
        return this;
    }

    /**
     * Whether any of the below categories are flagged.
     * @return flagged
     **/
    @NotNull
    @Schema(name = "flagged", description = "Whether any of the below categories are flagged.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FLAGGED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getFlagged() {
        return flagged;
    }

    @JsonProperty(JSON_PROPERTY_FLAGGED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     **/
    @Valid
    @NotNull
    @Schema(name = "categories", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CATEGORIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateModerationResponseResultsInnerCategories getCategories() {
        return categories;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORIES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     **/
    @Valid
    @NotNull
    @Schema(name = "category_scores", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CATEGORY_SCORES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateModerationResponseResultsInnerCategoryScores getCategoryScores() {
        return categoryScores;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY_SCORES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCategoryScores(CreateModerationResponseResultsInnerCategoryScores categoryScores) {
        this.categoryScores = categoryScores;
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
            Objects.equals(this.categoryScores, createModerationResponseResultsInner.categoryScores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flagged, categories, categoryScores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationResponseResultsInner {\n");
        sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    categoryScores: ").append(toIndentedString(categoryScores)).append("\n");
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

