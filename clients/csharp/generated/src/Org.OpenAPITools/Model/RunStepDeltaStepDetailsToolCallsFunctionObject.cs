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
    /// RunStepDeltaStepDetailsToolCallsFunctionObject
    /// </summary>
    [DataContract(Name = "RunStepDeltaStepDetailsToolCallsFunctionObject")]
    public partial class RunStepDeltaStepDetailsToolCallsFunctionObject : IValidatableObject
    {
        /// <summary>
        /// The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
        /// </summary>
        /// <value>The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.</value>
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
        /// The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
        /// </summary>
        /// <value>The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaStepDetailsToolCallsFunctionObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepDeltaStepDetailsToolCallsFunctionObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaStepDetailsToolCallsFunctionObject" /> class.
        /// </summary>
        /// <param name="index">The index of the tool call in the tool calls array. (required).</param>
        /// <param name="id">The ID of the tool call object..</param>
        /// <param name="type">The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. (required).</param>
        /// <param name="function">function.</param>
        public RunStepDeltaStepDetailsToolCallsFunctionObject(int index = default(int), string id = default(string), TypeEnum type = default(TypeEnum), RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function = default(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction))
        {
            this.Index = index;
            this.Type = type;
            this.Id = id;
            this.Function = function;
        }

        /// <summary>
        /// The index of the tool call in the tool calls array.
        /// </summary>
        /// <value>The index of the tool call in the tool calls array.</value>
        [DataMember(Name = "index", IsRequired = true, EmitDefaultValue = true)]
        public int Index { get; set; }

        /// <summary>
        /// The ID of the tool call object.
        /// </summary>
        /// <value>The ID of the tool call object.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Function
        /// </summary>
        [DataMember(Name = "function", EmitDefaultValue = false)]
        public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction Function { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepDeltaStepDetailsToolCallsFunctionObject {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
