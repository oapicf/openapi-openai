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
    /// Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
    /// </summary>
    [DataContract(Name = "RunStreamEvent_oneOf_2")]
    public partial class RunStreamEventOneOf2 : IValidatableObject
    {
        /// <summary>
        /// Defines Event
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventEnum
        {
            /// <summary>
            /// Enum ThreadRunInProgress for value: thread.run.in_progress
            /// </summary>
            [EnumMember(Value = "thread.run.in_progress")]
            ThreadRunInProgress = 1
        }


        /// <summary>
        /// Gets or Sets Event
        /// </summary>
        [DataMember(Name = "event", IsRequired = true, EmitDefaultValue = true)]
        public EventEnum Event { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStreamEventOneOf2" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStreamEventOneOf2() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStreamEventOneOf2" /> class.
        /// </summary>
        /// <param name="varEvent">varEvent (required).</param>
        /// <param name="data">data (required).</param>
        public RunStreamEventOneOf2(EventEnum varEvent = default(EventEnum), RunObject data = default(RunObject))
        {
            this.Event = varEvent;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for RunStreamEventOneOf2 and cannot be null");
            }
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public RunObject Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStreamEventOneOf2 {\n");
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
