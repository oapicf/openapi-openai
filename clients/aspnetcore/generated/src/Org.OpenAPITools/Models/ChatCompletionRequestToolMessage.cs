/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class ChatCompletionRequestToolMessage : IEquatable<ChatCompletionRequestToolMessage>
    {

        /// <summary>
        /// The role of the messages author, in this case `tool`.
        /// </summary>
        /// <value>The role of the messages author, in this case `tool`.</value>
        [TypeConverter(typeof(CustomEnumConverter<RoleEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum RoleEnum
        {
            
            /// <summary>
            /// Enum ToolEnum for tool
            /// </summary>
            [EnumMember(Value = "tool")]
            ToolEnum = 1
        }

        /// <summary>
        /// The role of the messages author, in this case &#x60;tool&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;tool&#x60;.</value>
        [Required]
        [DataMember(Name="role", EmitDefaultValue=true)]
        public RoleEnum Role { get; set; }

        /// <summary>
        /// The contents of the tool message.
        /// </summary>
        /// <value>The contents of the tool message.</value>
        [Required]
        [DataMember(Name="content", EmitDefaultValue=false)]
        public string Content { get; set; }

        /// <summary>
        /// Tool call that this message is responding to.
        /// </summary>
        /// <value>Tool call that this message is responding to.</value>
        [Required]
        [DataMember(Name="tool_call_id", EmitDefaultValue=false)]
        public string ToolCallId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((ChatCompletionRequestToolMessage)obj);
        }

        /// <summary>
        /// Returns true if ChatCompletionRequestToolMessage instances are equal
        /// </summary>
        /// <param name="other">Instance of ChatCompletionRequestToolMessage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChatCompletionRequestToolMessage other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Role == other.Role ||
                    
                    Role.Equals(other.Role)
                ) && 
                (
                    Content == other.Content ||
                    Content != null &&
                    Content.Equals(other.Content)
                ) && 
                (
                    ToolCallId == other.ToolCallId ||
                    ToolCallId != null &&
                    ToolCallId.Equals(other.ToolCallId)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + Role.GetHashCode();
                    if (Content != null)
                    hashCode = hashCode * 59 + Content.GetHashCode();
                    if (ToolCallId != null)
                    hashCode = hashCode * 59 + ToolCallId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ChatCompletionRequestToolMessage left, ChatCompletionRequestToolMessage right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ChatCompletionRequestToolMessage left, ChatCompletionRequestToolMessage right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
