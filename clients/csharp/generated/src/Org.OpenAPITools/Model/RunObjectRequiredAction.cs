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
    /// Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
    /// </summary>
    [DataContract(Name = "RunObject_required_action")]
    public partial class RunObjectRequiredAction : IValidatableObject
    {
        /// <summary>
        /// For now, this is always &#x60;submit_tool_outputs&#x60;.
        /// </summary>
        /// <value>For now, this is always &#x60;submit_tool_outputs&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum SubmitToolOutputs for value: submit_tool_outputs
            /// </summary>
            [EnumMember(Value = "submit_tool_outputs")]
            SubmitToolOutputs = 1
        }


        /// <summary>
        /// For now, this is always &#x60;submit_tool_outputs&#x60;.
        /// </summary>
        /// <value>For now, this is always &#x60;submit_tool_outputs&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunObjectRequiredAction" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunObjectRequiredAction() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunObjectRequiredAction" /> class.
        /// </summary>
        /// <param name="type">For now, this is always &#x60;submit_tool_outputs&#x60;. (required).</param>
        /// <param name="submitToolOutputs">submitToolOutputs (required).</param>
        public RunObjectRequiredAction(TypeEnum type = default(TypeEnum), RunObjectRequiredActionSubmitToolOutputs submitToolOutputs = default(RunObjectRequiredActionSubmitToolOutputs))
        {
            this.Type = type;
            // to ensure "submitToolOutputs" is required (not null)
            if (submitToolOutputs == null)
            {
                throw new ArgumentNullException("submitToolOutputs is a required property for RunObjectRequiredAction and cannot be null");
            }
            this.SubmitToolOutputs = submitToolOutputs;
        }

        /// <summary>
        /// Gets or Sets SubmitToolOutputs
        /// </summary>
        [DataMember(Name = "submit_tool_outputs", IsRequired = true, EmitDefaultValue = true)]
        public RunObjectRequiredActionSubmitToolOutputs SubmitToolOutputs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunObjectRequiredAction {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  SubmitToolOutputs: ").Append(SubmitToolOutputs).Append("\n");
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
