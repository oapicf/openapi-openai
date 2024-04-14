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
    /// Log probability information for the choice.
    /// </summary>
    [DataContract(Name = "CreateChatCompletionResponse_choices_inner_logprobs")]
    public partial class CreateChatCompletionResponseChoicesInnerLogprobs : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateChatCompletionResponseChoicesInnerLogprobs" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateChatCompletionResponseChoicesInnerLogprobs() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateChatCompletionResponseChoicesInnerLogprobs" /> class.
        /// </summary>
        /// <param name="content">A list of message content tokens with log probability information. (required).</param>
        public CreateChatCompletionResponseChoicesInnerLogprobs(List<ChatCompletionTokenLogprob> content = default(List<ChatCompletionTokenLogprob>))
        {
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for CreateChatCompletionResponseChoicesInnerLogprobs and cannot be null");
            }
            this.Content = content;
        }

        /// <summary>
        /// A list of message content tokens with log probability information.
        /// </summary>
        /// <value>A list of message content tokens with log probability information.</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public List<ChatCompletionTokenLogprob> Content { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
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
