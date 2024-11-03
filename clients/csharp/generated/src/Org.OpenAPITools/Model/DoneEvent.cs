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
    /// Occurs when a stream ends.
    /// </summary>
    [DataContract(Name = "DoneEvent")]
    public partial class DoneEvent : IValidatableObject
    {
        /// <summary>
        /// Defines Event
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventEnum
        {
            /// <summary>
            /// Enum Done for value: done
            /// </summary>
            [EnumMember(Value = "done")]
            Done = 1
        }


        /// <summary>
        /// Gets or Sets Event
        /// </summary>
        [DataMember(Name = "event", IsRequired = true, EmitDefaultValue = true)]
        public EventEnum Event { get; set; }
        /// <summary>
        /// Defines Data
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DataEnum
        {
            /// <summary>
            /// Enum DONE for value: [DONE]
            /// </summary>
            [EnumMember(Value = "[DONE]")]
            DONE = 1
        }


        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public DataEnum Data { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DoneEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DoneEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DoneEvent" /> class.
        /// </summary>
        /// <param name="varEvent">varEvent (required).</param>
        /// <param name="data">data (required).</param>
        public DoneEvent(EventEnum varEvent = default(EventEnum), DataEnum data = default(DataEnum))
        {
            this.Event = varEvent;
            this.Data = data;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DoneEvent {\n");
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
