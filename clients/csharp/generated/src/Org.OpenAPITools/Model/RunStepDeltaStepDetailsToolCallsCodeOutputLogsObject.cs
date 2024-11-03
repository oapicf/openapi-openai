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
    /// Text output from the Code Interpreter tool call as part of a run step.
    /// </summary>
    [DataContract(Name = "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject")]
    public partial class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject : IValidatableObject
    {
        /// <summary>
        /// Always &#x60;logs&#x60;.
        /// </summary>
        /// <value>Always &#x60;logs&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Logs for value: logs
            /// </summary>
            [EnumMember(Value = "logs")]
            Logs = 1
        }


        /// <summary>
        /// Always &#x60;logs&#x60;.
        /// </summary>
        /// <value>Always &#x60;logs&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject" /> class.
        /// </summary>
        /// <param name="index">The index of the output in the outputs array. (required).</param>
        /// <param name="type">Always &#x60;logs&#x60;. (required).</param>
        /// <param name="logs">The text output from the Code Interpreter tool call..</param>
        public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(int index = default(int), TypeEnum type = default(TypeEnum), string logs = default(string))
        {
            this.Index = index;
            this.Type = type;
            this.Logs = logs;
        }

        /// <summary>
        /// The index of the output in the outputs array.
        /// </summary>
        /// <value>The index of the output in the outputs array.</value>
        [DataMember(Name = "index", IsRequired = true, EmitDefaultValue = true)]
        public int Index { get; set; }

        /// <summary>
        /// The text output from the Code Interpreter tool call.
        /// </summary>
        /// <value>The text output from the Code Interpreter tool call.</value>
        [DataMember(Name = "logs", EmitDefaultValue = false)]
        public string Logs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Logs: ").Append(Logs).Append("\n");
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
