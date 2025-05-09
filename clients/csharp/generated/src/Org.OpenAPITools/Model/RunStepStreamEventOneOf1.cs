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
    /// Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
    /// </summary>
    [DataContract(Name = "RunStepStreamEvent_oneOf_1")]
    public partial class RunStepStreamEventOneOf1 : IValidatableObject
    {
        /// <summary>
        /// Defines Event
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventEnum
        {
            /// <summary>
            /// Enum ThreadRunStepInProgress for value: thread.run.step.in_progress
            /// </summary>
            [EnumMember(Value = "thread.run.step.in_progress")]
            ThreadRunStepInProgress = 1
        }


        /// <summary>
        /// Gets or Sets Event
        /// </summary>
        [DataMember(Name = "event", IsRequired = true, EmitDefaultValue = true)]
        public EventEnum Event { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEventOneOf1" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepStreamEventOneOf1() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEventOneOf1" /> class.
        /// </summary>
        /// <param name="varEvent">varEvent (required).</param>
        /// <param name="data">data (required).</param>
        public RunStepStreamEventOneOf1(EventEnum varEvent = default(EventEnum), RunStepObject data = default(RunStepObject))
        {
            this.Event = varEvent;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for RunStepStreamEventOneOf1 and cannot be null");
            }
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public RunStepObject Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepStreamEventOneOf1 {\n");
            sb.Append("  Event: ").Append(Event).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
