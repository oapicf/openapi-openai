/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
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
    /// CreateCompletionResponseChoicesInnerLogprobs
    /// </summary>
    [DataContract(Name = "CreateCompletionResponse_choices_inner_logprobs")]
    public partial class CreateCompletionResponseChoicesInnerLogprobs : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCompletionResponseChoicesInnerLogprobs" /> class.
        /// </summary>
        /// <param name="tokens">tokens.</param>
        /// <param name="tokenLogprobs">tokenLogprobs.</param>
        /// <param name="topLogprobs">topLogprobs.</param>
        /// <param name="textOffset">textOffset.</param>
        public CreateCompletionResponseChoicesInnerLogprobs(List<string> tokens = default(List<string>), List<decimal> tokenLogprobs = default(List<decimal>), List<Object> topLogprobs = default(List<Object>), List<int> textOffset = default(List<int>))
        {
            this.Tokens = tokens;
            this.TokenLogprobs = tokenLogprobs;
            this.TopLogprobs = topLogprobs;
            this.TextOffset = textOffset;
        }

        /// <summary>
        /// Gets or Sets Tokens
        /// </summary>
        [DataMember(Name = "tokens", EmitDefaultValue = false)]
        public List<string> Tokens { get; set; }

        /// <summary>
        /// Gets or Sets TokenLogprobs
        /// </summary>
        [DataMember(Name = "token_logprobs", EmitDefaultValue = false)]
        public List<decimal> TokenLogprobs { get; set; }

        /// <summary>
        /// Gets or Sets TopLogprobs
        /// </summary>
        [DataMember(Name = "top_logprobs", EmitDefaultValue = false)]
        public List<Object> TopLogprobs { get; set; }

        /// <summary>
        /// Gets or Sets TextOffset
        /// </summary>
        [DataMember(Name = "text_offset", EmitDefaultValue = false)]
        public List<int> TextOffset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
            sb.Append("  Tokens: ").Append(Tokens).Append("\n");
            sb.Append("  TokenLogprobs: ").Append(TokenLogprobs).Append("\n");
            sb.Append("  TopLogprobs: ").Append(TopLogprobs).Append("\n");
            sb.Append("  TextOffset: ").Append(TextOffset).Append("\n");
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
