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
    /// ChatCompletionRequestSystemMessage
    /// </summary>
    [DataContract(Name = "ChatCompletionRequestSystemMessage")]
    public partial class ChatCompletionRequestSystemMessage : IValidatableObject
    {
        /// <summary>
        /// The role of the messages author, in this case &#x60;system&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;system&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum System for value: system
            /// </summary>
            [EnumMember(Value = "system")]
            System = 1
        }


        /// <summary>
        /// The role of the messages author, in this case &#x60;system&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;system&#x60;.</value>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public RoleEnum Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestSystemMessage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionRequestSystemMessage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestSystemMessage" /> class.
        /// </summary>
        /// <param name="content">The contents of the system message. (required).</param>
        /// <param name="role">The role of the messages author, in this case &#x60;system&#x60;. (required).</param>
        /// <param name="name">An optional name for the participant. Provides the model information to differentiate between participants of the same role..</param>
        public ChatCompletionRequestSystemMessage(string content = default(string), RoleEnum role = default(RoleEnum), string name = default(string))
        {
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for ChatCompletionRequestSystemMessage and cannot be null");
            }
            this.Content = content;
            this.Role = role;
            this.Name = name;
        }

        /// <summary>
        /// The contents of the system message.
        /// </summary>
        /// <value>The contents of the system message.</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
        /// </summary>
        /// <value>An optional name for the participant. Provides the model information to differentiate between participants of the same role.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionRequestSystemMessage {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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