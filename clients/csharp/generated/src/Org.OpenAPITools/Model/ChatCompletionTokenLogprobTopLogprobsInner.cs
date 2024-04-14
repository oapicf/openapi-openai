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
    /// ChatCompletionTokenLogprobTopLogprobsInner
    /// </summary>
    [DataContract(Name = "ChatCompletionTokenLogprob_top_logprobs_inner")]
    public partial class ChatCompletionTokenLogprobTopLogprobsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionTokenLogprobTopLogprobsInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionTokenLogprobTopLogprobsInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionTokenLogprobTopLogprobsInner" /> class.
        /// </summary>
        /// <param name="token">The token. (required).</param>
        /// <param name="logprob">The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. (required).</param>
        /// <param name="bytes">A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. (required).</param>
        public ChatCompletionTokenLogprobTopLogprobsInner(string token = default(string), decimal logprob = default(decimal), List<int> bytes = default(List<int>))
        {
            // to ensure "token" is required (not null)
            if (token == null)
            {
                throw new ArgumentNullException("token is a required property for ChatCompletionTokenLogprobTopLogprobsInner and cannot be null");
            }
            this.Token = token;
            this.Logprob = logprob;
            // to ensure "bytes" is required (not null)
            if (bytes == null)
            {
                throw new ArgumentNullException("bytes is a required property for ChatCompletionTokenLogprobTopLogprobsInner and cannot be null");
            }
            this.Bytes = bytes;
        }

        /// <summary>
        /// The token.
        /// </summary>
        /// <value>The token.</value>
        [DataMember(Name = "token", IsRequired = true, EmitDefaultValue = true)]
        public string Token { get; set; }

        /// <summary>
        /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
        /// </summary>
        /// <value>The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.</value>
        [DataMember(Name = "logprob", IsRequired = true, EmitDefaultValue = true)]
        public decimal Logprob { get; set; }

        /// <summary>
        /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
        /// </summary>
        /// <value>A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.</value>
        [DataMember(Name = "bytes", IsRequired = true, EmitDefaultValue = true)]
        public List<int> Bytes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionTokenLogprobTopLogprobsInner {\n");
            sb.Append("  Token: ").Append(Token).Append("\n");
            sb.Append("  Logprob: ").Append(Logprob).Append("\n");
            sb.Append("  Bytes: ").Append(Bytes).Append("\n");
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
