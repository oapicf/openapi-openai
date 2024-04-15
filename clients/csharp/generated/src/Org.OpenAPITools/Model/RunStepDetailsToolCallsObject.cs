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
    /// Details of the tool call.
    /// </summary>
    [DataContract(Name = "RunStepDetailsToolCallsObject")]
    public partial class RunStepDetailsToolCallsObject : IValidatableObject
    {
        /// <summary>
        /// Always &#x60;tool_calls&#x60;.
        /// </summary>
        /// <value>Always &#x60;tool_calls&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum ToolCalls for value: tool_calls
            /// </summary>
            [EnumMember(Value = "tool_calls")]
            ToolCalls = 1
        }


        /// <summary>
        /// Always &#x60;tool_calls&#x60;.
        /// </summary>
        /// <value>Always &#x60;tool_calls&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDetailsToolCallsObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepDetailsToolCallsObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDetailsToolCallsObject" /> class.
        /// </summary>
        /// <param name="type">Always &#x60;tool_calls&#x60;. (required).</param>
        /// <param name="toolCalls">An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  (required).</param>
        public RunStepDetailsToolCallsObject(TypeEnum type = default(TypeEnum), List<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls = default(List<RunStepDetailsToolCallsObjectToolCallsInner>))
        {
            this.Type = type;
            // to ensure "toolCalls" is required (not null)
            if (toolCalls == null)
            {
                throw new ArgumentNullException("toolCalls is a required property for RunStepDetailsToolCallsObject and cannot be null");
            }
            this.ToolCalls = toolCalls;
        }

        /// <summary>
        /// An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
        /// </summary>
        /// <value>An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. </value>
        [DataMember(Name = "tool_calls", IsRequired = true, EmitDefaultValue = true)]
        public List<RunStepDetailsToolCallsObjectToolCallsInner> ToolCalls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepDetailsToolCallsObject {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ToolCalls: ").Append(ToolCalls).Append("\n");
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