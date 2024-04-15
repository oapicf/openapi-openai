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
    /// Fine-tuning job event object
    /// </summary>
    [DataContract(Name = "FineTuningJobEvent")]
    public partial class FineTuningJobEvent : IValidatableObject
    {
        /// <summary>
        /// Defines Level
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LevelEnum
        {
            /// <summary>
            /// Enum Info for value: info
            /// </summary>
            [EnumMember(Value = "info")]
            Info = 1,

            /// <summary>
            /// Enum Warn for value: warn
            /// </summary>
            [EnumMember(Value = "warn")]
            Warn = 2,

            /// <summary>
            /// Enum Error for value: error
            /// </summary>
            [EnumMember(Value = "error")]
            Error = 3
        }


        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", IsRequired = true, EmitDefaultValue = true)]
        public LevelEnum Level { get; set; }
        /// <summary>
        /// Defines VarObject
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ObjectEnum
        {
            /// <summary>
            /// Enum FineTuningJobEvent for value: fine_tuning.job.event
            /// </summary>
            [EnumMember(Value = "fine_tuning.job.event")]
            FineTuningJobEvent = 1
        }


        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public ObjectEnum VarObject { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FineTuningJobEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FineTuningJobEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FineTuningJobEvent" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="createdAt">createdAt (required).</param>
        /// <param name="level">level (required).</param>
        /// <param name="message">message (required).</param>
        /// <param name="varObject">varObject (required).</param>
        public FineTuningJobEvent(string id = default(string), int createdAt = default(int), LevelEnum level = default(LevelEnum), string message = default(string), ObjectEnum varObject = default(ObjectEnum))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for FineTuningJobEvent and cannot be null");
            }
            this.Id = id;
            this.CreatedAt = createdAt;
            this.Level = level;
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for FineTuningJobEvent and cannot be null");
            }
            this.Message = message;
            this.VarObject = varObject;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FineTuningJobEvent {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
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