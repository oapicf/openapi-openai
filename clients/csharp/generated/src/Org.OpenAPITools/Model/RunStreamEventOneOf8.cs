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
    /// Occurs when a [run](/docs/api-reference/runs/object) expires.
    /// </summary>
    [DataContract(Name = "RunStreamEvent_oneOf_8")]
    public partial class RunStreamEventOneOf8 : IValidatableObject
    {
        /// <summary>
        /// Defines VarEvent
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventEnum
        {
            /// <summary>
            /// Enum ThreadRunExpired for value: thread.run.expired
            /// </summary>
            [EnumMember(Value = "thread.run.expired")]
            ThreadRunExpired = 1
        }


        /// <summary>
        /// Gets or Sets VarEvent
        /// </summary>
        [DataMember(Name = "event", IsRequired = true, EmitDefaultValue = true)]
        public EventEnum VarEvent { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStreamEventOneOf8" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStreamEventOneOf8() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStreamEventOneOf8" /> class.
        /// </summary>
        /// <param name="varEvent">varEvent (required).</param>
        /// <param name="data">data (required).</param>
        public RunStreamEventOneOf8(EventEnum varEvent = default(EventEnum), RunObject data = default(RunObject))
        {
            this.VarEvent = varEvent;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for RunStreamEventOneOf8 and cannot be null");
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
            sb.Append("class RunStreamEventOneOf8 {\n");
            sb.Append("  VarEvent: ").Append(VarEvent).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
