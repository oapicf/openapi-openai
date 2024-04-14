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
    /// Represents if a given text input is potentially harmful.
    /// </summary>
    [DataContract(Name = "CreateModerationResponse")]
    public partial class CreateModerationResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateModerationResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateModerationResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateModerationResponse" /> class.
        /// </summary>
        /// <param name="id">The unique identifier for the moderation request. (required).</param>
        /// <param name="model">The model used to generate the moderation results. (required).</param>
        /// <param name="results">A list of moderation objects. (required).</param>
        public CreateModerationResponse(string id = default(string), string model = default(string), List<CreateModerationResponseResultsInner> results = default(List<CreateModerationResponseResultsInner>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for CreateModerationResponse and cannot be null");
            }
            this.Id = id;
            // to ensure "model" is required (not null)
            if (model == null)
            {
                throw new ArgumentNullException("model is a required property for CreateModerationResponse and cannot be null");
            }
            this.Model = model;
            // to ensure "results" is required (not null)
            if (results == null)
            {
                throw new ArgumentNullException("results is a required property for CreateModerationResponse and cannot be null");
            }
            this.Results = results;
        }

        /// <summary>
        /// The unique identifier for the moderation request.
        /// </summary>
        /// <value>The unique identifier for the moderation request.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// The model used to generate the moderation results.
        /// </summary>
        /// <value>The model used to generate the moderation results.</value>
        [DataMember(Name = "model", IsRequired = true, EmitDefaultValue = true)]
        public string Model { get; set; }

        /// <summary>
        /// A list of moderation objects.
        /// </summary>
        /// <value>A list of moderation objects.</value>
        [DataMember(Name = "results", IsRequired = true, EmitDefaultValue = true)]
        public List<CreateModerationResponseResultsInner> Results { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateModerationResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Results: ").Append(Results).Append("\n");
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
