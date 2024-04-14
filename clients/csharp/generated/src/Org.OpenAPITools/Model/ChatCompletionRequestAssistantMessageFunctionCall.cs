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
    /// Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
    /// </summary>
    [DataContract(Name = "ChatCompletionRequestAssistantMessage_function_call")]
    public partial class ChatCompletionRequestAssistantMessageFunctionCall : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestAssistantMessageFunctionCall" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionRequestAssistantMessageFunctionCall() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestAssistantMessageFunctionCall" /> class.
        /// </summary>
        /// <param name="arguments">The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. (required).</param>
        /// <param name="name">The name of the function to call. (required).</param>
        public ChatCompletionRequestAssistantMessageFunctionCall(string arguments = default(string), string name = default(string))
        {
            // to ensure "arguments" is required (not null)
            if (arguments == null)
            {
                throw new ArgumentNullException("arguments is a required property for ChatCompletionRequestAssistantMessageFunctionCall and cannot be null");
            }
            this.Arguments = arguments;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ChatCompletionRequestAssistantMessageFunctionCall and cannot be null");
            }
            this.Name = name;
        }

        /// <summary>
        /// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
        /// </summary>
        /// <value>The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.</value>
        [DataMember(Name = "arguments", IsRequired = true, EmitDefaultValue = true)]
        public string Arguments { get; set; }

        /// <summary>
        /// The name of the function to call.
        /// </summary>
        /// <value>The name of the function to call.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionRequestAssistantMessageFunctionCall {\n");
            sb.Append("  Arguments: ").Append(Arguments).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
