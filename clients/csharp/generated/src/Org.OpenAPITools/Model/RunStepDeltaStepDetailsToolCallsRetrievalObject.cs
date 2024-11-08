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
    /// RunStepDeltaStepDetailsToolCallsRetrievalObject
    /// </summary>
    [DataContract(Name = "RunStepDeltaStepDetailsToolCallsRetrievalObject")]
    public partial class RunStepDeltaStepDetailsToolCallsRetrievalObject : IValidatableObject
    {
        /// <summary>
        /// The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
        /// </summary>
        /// <value>The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Retrieval for value: retrieval
            /// </summary>
            [EnumMember(Value = "retrieval")]
            Retrieval = 1
        }


        /// <summary>
        /// The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.
        /// </summary>
        /// <value>The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaStepDetailsToolCallsRetrievalObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepDeltaStepDetailsToolCallsRetrievalObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaStepDetailsToolCallsRetrievalObject" /> class.
        /// </summary>
        /// <param name="index">The index of the tool call in the tool calls array. (required).</param>
        /// <param name="id">The ID of the tool call object..</param>
        /// <param name="type">The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. (required).</param>
        /// <param name="retrieval">For now, this is always going to be an empty object..</param>
        public RunStepDeltaStepDetailsToolCallsRetrievalObject(int index = default(int), string id = default(string), TypeEnum type = default(TypeEnum), Object retrieval = default(Object))
        {
            this.Index = index;
            this.Type = type;
            this.Id = id;
            this.Retrieval = retrieval;
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
        /// For now, this is always going to be an empty object.
        /// </summary>
        /// <value>For now, this is always going to be an empty object.</value>
        [DataMember(Name = "retrieval", EmitDefaultValue = false)]
        public Object Retrieval { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepDeltaStepDetailsToolCallsRetrievalObject {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Retrieval: ").Append(Retrieval).Append("\n");
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
