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
    /// The text content that is part of a message.
    /// </summary>
    [DataContract(Name = "MessageDeltaContentTextObject")]
    public partial class MessageDeltaContentTextObject : IValidatableObject
    {
        /// <summary>
        /// Always &#x60;text&#x60;.
        /// </summary>
        /// <value>Always &#x60;text&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Text for value: text
            /// </summary>
            [EnumMember(Value = "text")]
            Text = 1
        }


        /// <summary>
        /// Always &#x60;text&#x60;.
        /// </summary>
        /// <value>Always &#x60;text&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageDeltaContentTextObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MessageDeltaContentTextObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageDeltaContentTextObject" /> class.
        /// </summary>
        /// <param name="index">The index of the content part in the message. (required).</param>
        /// <param name="type">Always &#x60;text&#x60;. (required).</param>
        /// <param name="text">text.</param>
        public MessageDeltaContentTextObject(int index = default(int), TypeEnum type = default(TypeEnum), MessageDeltaContentTextObjectText text = default(MessageDeltaContentTextObjectText))
        {
            this.Index = index;
            this.Type = type;
            this.Text = text;
        }

        /// <summary>
        /// The index of the content part in the message.
        /// </summary>
        /// <value>The index of the content part in the message.</value>
        [DataMember(Name = "index", IsRequired = true, EmitDefaultValue = true)]
        public int Index { get; set; }

        /// <summary>
        /// Gets or Sets Text
        /// </summary>
        [DataMember(Name = "text", EmitDefaultValue = false)]
        public MessageDeltaContentTextObjectText Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessageDeltaContentTextObject {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
