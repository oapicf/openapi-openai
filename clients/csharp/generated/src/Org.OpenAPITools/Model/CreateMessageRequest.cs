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
    /// CreateMessageRequest
    /// </summary>
    [DataContract(Name = "CreateMessageRequest")]
    public partial class CreateMessageRequest : IValidatableObject
    {
        /// <summary>
        /// The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
        /// </summary>
        /// <value>The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum User for value: user
            /// </summary>
            [EnumMember(Value = "user")]
            User = 1,

            /// <summary>
            /// Enum Assistant for value: assistant
            /// </summary>
            [EnumMember(Value = "assistant")]
            Assistant = 2
        }


        /// <summary>
        /// The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
        /// </summary>
        /// <value>The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. </value>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public RoleEnum Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateMessageRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateMessageRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateMessageRequest" /> class.
        /// </summary>
        /// <param name="role">The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  (required).</param>
        /// <param name="content">The content of the message. (required).</param>
        /// <param name="fileIds">A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files..</param>
        /// <param name="metadata">Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. .</param>
        public CreateMessageRequest(RoleEnum role = default(RoleEnum), string content = default(string), List<string> fileIds = default(List<string>), Object metadata = default(Object))
        {
            this.Role = role;
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for CreateMessageRequest and cannot be null");
            }
            this.Content = content;
            this.FileIds = fileIds;
            this.Metadata = metadata;
        }

        /// <summary>
        /// The content of the message.
        /// </summary>
        /// <value>The content of the message.</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files.
        /// </summary>
        /// <value>A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files.</value>
        [DataMember(Name = "file_ids", EmitDefaultValue = false)]
        public List<string> FileIds { get; set; }

        /// <summary>
        /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
        /// </summary>
        /// <value>Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. </value>
        [DataMember(Name = "metadata", EmitDefaultValue = true)]
        public Object Metadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateMessageRequest {\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  FileIds: ").Append(FileIds).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
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
            // Content (string) maxLength
            if (this.Content != null && this.Content.Length > 256000)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Content, length must be less than 256000.", new [] { "Content" });
            }

            // Content (string) minLength
            if (this.Content != null && this.Content.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Content, length must be greater than 1.", new [] { "Content" });
            }

            yield break;
        }
    }

}
