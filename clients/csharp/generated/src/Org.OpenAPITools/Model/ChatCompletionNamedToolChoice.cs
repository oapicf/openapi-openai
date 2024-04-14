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
    /// Specifies a tool the model should use. Use to force the model to call a specific function.
    /// </summary>
    [DataContract(Name = "ChatCompletionNamedToolChoice")]
    public partial class ChatCompletionNamedToolChoice : IValidatableObject
    {
        /// <summary>
        /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
        /// </summary>
        /// <value>The type of the tool. Currently, only &#x60;function&#x60; is supported.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Function for value: function
            /// </summary>
            [EnumMember(Value = "function")]
            Function = 1
        }


        /// <summary>
        /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
        /// </summary>
        /// <value>The type of the tool. Currently, only &#x60;function&#x60; is supported.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionNamedToolChoice" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionNamedToolChoice() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionNamedToolChoice" /> class.
        /// </summary>
        /// <param name="type">The type of the tool. Currently, only &#x60;function&#x60; is supported. (required).</param>
        /// <param name="function">function (required).</param>
        public ChatCompletionNamedToolChoice(TypeEnum type = default(TypeEnum), ChatCompletionNamedToolChoiceFunction function = default(ChatCompletionNamedToolChoiceFunction))
        {
            this.Type = type;
            // to ensure "function" is required (not null)
            if (function == null)
            {
                throw new ArgumentNullException("function is a required property for ChatCompletionNamedToolChoice and cannot be null");
            }
            this.Function = function;
        }

        /// <summary>
        /// Gets or Sets Function
        /// </summary>
        [DataMember(Name = "function", IsRequired = true, EmitDefaultValue = true)]
        public ChatCompletionNamedToolChoiceFunction Function { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionNamedToolChoice {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Function: ").Append(Function).Append("\n");
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
