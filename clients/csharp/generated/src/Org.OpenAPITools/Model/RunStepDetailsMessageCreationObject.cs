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
    /// Details of the message creation by the run step.
    /// </summary>
    [DataContract(Name = "RunStepDetailsMessageCreationObject")]
    public partial class RunStepDetailsMessageCreationObject : IValidatableObject
    {
        /// <summary>
        /// Always &#x60;message_creation&#x60;.
        /// </summary>
        /// <value>Always &#x60;message_creation&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum MessageCreation for value: message_creation
            /// </summary>
            [EnumMember(Value = "message_creation")]
            MessageCreation = 1
        }


        /// <summary>
        /// Always &#x60;message_creation&#x60;.
        /// </summary>
        /// <value>Always &#x60;message_creation&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDetailsMessageCreationObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepDetailsMessageCreationObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDetailsMessageCreationObject" /> class.
        /// </summary>
        /// <param name="type">Always &#x60;message_creation&#x60;. (required).</param>
        /// <param name="messageCreation">messageCreation (required).</param>
        public RunStepDetailsMessageCreationObject(TypeEnum type = default(TypeEnum), RunStepDetailsMessageCreationObjectMessageCreation messageCreation = default(RunStepDetailsMessageCreationObjectMessageCreation))
        {
            this.Type = type;
            // to ensure "messageCreation" is required (not null)
            if (messageCreation == null)
            {
                throw new ArgumentNullException("messageCreation is a required property for RunStepDetailsMessageCreationObject and cannot be null");
            }
            this.MessageCreation = messageCreation;
        }

        /// <summary>
        /// Gets or Sets MessageCreation
        /// </summary>
        [DataMember(Name = "message_creation", IsRequired = true, EmitDefaultValue = true)]
        public RunStepDetailsMessageCreationObjectMessageCreation MessageCreation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepDetailsMessageCreationObject {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  MessageCreation: ").Append(MessageCreation).Append("\n");
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
