/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CreateModerationResponseResultsInner
    /// </summary>
    [DataContract(Name = "CreateModerationResponse_results_inner")]
    public partial class CreateModerationResponseResultsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateModerationResponseResultsInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateModerationResponseResultsInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateModerationResponseResultsInner" /> class.
        /// </summary>
        /// <param name="flagged">Whether any of the below categories are flagged. (required).</param>
        /// <param name="categories">categories (required).</param>
        /// <param name="categoryScores">categoryScores (required).</param>
        public CreateModerationResponseResultsInner(bool flagged = default(bool), CreateModerationResponseResultsInnerCategories categories = default(CreateModerationResponseResultsInnerCategories), CreateModerationResponseResultsInnerCategoryScores categoryScores = default(CreateModerationResponseResultsInnerCategoryScores))
        {
            this.Flagged = flagged;
            // to ensure "categories" is required (not null)
            if (categories == null)
            {
                throw new ArgumentNullException("categories is a required property for CreateModerationResponseResultsInner and cannot be null");
            }
            this.Categories = categories;
            // to ensure "categoryScores" is required (not null)
            if (categoryScores == null)
            {
                throw new ArgumentNullException("categoryScores is a required property for CreateModerationResponseResultsInner and cannot be null");
            }
            this.CategoryScores = categoryScores;
        }

        /// <summary>
        /// Whether any of the below categories are flagged.
        /// </summary>
        /// <value>Whether any of the below categories are flagged.</value>
        [DataMember(Name = "flagged", IsRequired = true, EmitDefaultValue = true)]
        public bool Flagged { get; set; }

        /// <summary>
        /// Gets or Sets Categories
        /// </summary>
        [DataMember(Name = "categories", IsRequired = true, EmitDefaultValue = true)]
        public CreateModerationResponseResultsInnerCategories Categories { get; set; }

        /// <summary>
        /// Gets or Sets CategoryScores
        /// </summary>
        [DataMember(Name = "category_scores", IsRequired = true, EmitDefaultValue = true)]
        public CreateModerationResponseResultsInnerCategoryScores CategoryScores { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateModerationResponseResultsInner {\n");
            sb.Append("  Flagged: ").Append(Flagged).Append("\n");
            sb.Append("  Categories: ").Append(Categories).Append("\n");
            sb.Append("  CategoryScores: ").Append(CategoryScores).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
