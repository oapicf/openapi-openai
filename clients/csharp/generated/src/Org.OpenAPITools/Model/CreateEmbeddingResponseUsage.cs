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
    /// The usage information for the request.
    /// </summary>
    [DataContract(Name = "CreateEmbeddingResponse_usage")]
    public partial class CreateEmbeddingResponseUsage : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingResponseUsage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateEmbeddingResponseUsage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingResponseUsage" /> class.
        /// </summary>
        /// <param name="promptTokens">The number of tokens used by the prompt. (required).</param>
        /// <param name="totalTokens">The total number of tokens used by the request. (required).</param>
        public CreateEmbeddingResponseUsage(int promptTokens = default(int), int totalTokens = default(int))
        {
            this.PromptTokens = promptTokens;
            this.TotalTokens = totalTokens;
        }

        /// <summary>
        /// The number of tokens used by the prompt.
        /// </summary>
        /// <value>The number of tokens used by the prompt.</value>
        [DataMember(Name = "prompt_tokens", IsRequired = true, EmitDefaultValue = true)]
        public int PromptTokens { get; set; }

        /// <summary>
        /// The total number of tokens used by the request.
        /// </summary>
        /// <value>The total number of tokens used by the request.</value>
        [DataMember(Name = "total_tokens", IsRequired = true, EmitDefaultValue = true)]
        public int TotalTokens { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateEmbeddingResponseUsage {\n");
            sb.Append("  PromptTokens: ").Append(PromptTokens).Append("\n");
            sb.Append("  TotalTokens: ").Append(TotalTokens).Append("\n");
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
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
