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
    /// ChatCompletionRequestToolMessage
    /// </summary>
    [DataContract(Name = "ChatCompletionRequestToolMessage")]
    public partial class ChatCompletionRequestToolMessage : IValidatableObject
    {
        /// <summary>
        /// The role of the messages author, in this case &#x60;tool&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;tool&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum Tool for value: tool
            /// </summary>
            [EnumMember(Value = "tool")]
            Tool = 1
        }


        /// <summary>
        /// The role of the messages author, in this case &#x60;tool&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;tool&#x60;.</value>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public RoleEnum Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestToolMessage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionRequestToolMessage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestToolMessage" /> class.
        /// </summary>
        /// <param name="role">The role of the messages author, in this case &#x60;tool&#x60;. (required).</param>
        /// <param name="content">The contents of the tool message. (required).</param>
        /// <param name="toolCallId">Tool call that this message is responding to. (required).</param>
        public ChatCompletionRequestToolMessage(RoleEnum role = default(RoleEnum), string content = default(string), string toolCallId = default(string))
        {
            this.Role = role;
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for ChatCompletionRequestToolMessage and cannot be null");
            }
            this.Content = content;
            // to ensure "toolCallId" is required (not null)
            if (toolCallId == null)
            {
                throw new ArgumentNullException("toolCallId is a required property for ChatCompletionRequestToolMessage and cannot be null");
            }
            this.ToolCallId = toolCallId;
        }

        /// <summary>
        /// The contents of the tool message.
        /// </summary>
        /// <value>The contents of the tool message.</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// Tool call that this message is responding to.
        /// </summary>
        /// <value>Tool call that this message is responding to.</value>
        [DataMember(Name = "tool_call_id", IsRequired = true, EmitDefaultValue = true)]
        public string ToolCallId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionRequestToolMessage {\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  ToolCallId: ").Append(ToolCallId).Append("\n");
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
