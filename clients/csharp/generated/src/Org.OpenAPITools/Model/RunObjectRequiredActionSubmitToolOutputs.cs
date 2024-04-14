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
    /// Details on the tool outputs needed for this run to continue.
    /// </summary>
    [DataContract(Name = "RunObject_required_action_submit_tool_outputs")]
    public partial class RunObjectRequiredActionSubmitToolOutputs : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RunObjectRequiredActionSubmitToolOutputs" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunObjectRequiredActionSubmitToolOutputs() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunObjectRequiredActionSubmitToolOutputs" /> class.
        /// </summary>
        /// <param name="toolCalls">A list of the relevant tool calls. (required).</param>
        public RunObjectRequiredActionSubmitToolOutputs(List<RunToolCallObject> toolCalls = default(List<RunToolCallObject>))
        {
            // to ensure "toolCalls" is required (not null)
            if (toolCalls == null)
            {
                throw new ArgumentNullException("toolCalls is a required property for RunObjectRequiredActionSubmitToolOutputs and cannot be null");
            }
            this.ToolCalls = toolCalls;
        }

        /// <summary>
        /// A list of the relevant tool calls.
        /// </summary>
        /// <value>A list of the relevant tool calls.</value>
        [DataMember(Name = "tool_calls", IsRequired = true, EmitDefaultValue = true)]
        public List<RunToolCallObject> ToolCalls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunObjectRequiredActionSubmitToolOutputs {\n");
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
