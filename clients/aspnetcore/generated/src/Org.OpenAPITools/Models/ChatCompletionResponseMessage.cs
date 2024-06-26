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
    /// A chat completion message generated by the model.
    /// </summary>
    [DataContract]
    public partial class ChatCompletionResponseMessage : IEquatable<ChatCompletionResponseMessage>
    {
        /// <summary>
        /// The contents of the message.
        /// </summary>
        /// <value>The contents of the message.</value>
        [Required]
        [DataMember(Name="content", EmitDefaultValue=true)]
        public string Content { get; set; }

        /// <summary>
        /// The tool calls generated by the model, such as function calls.
        /// </summary>
        /// <value>The tool calls generated by the model, such as function calls.</value>
        [DataMember(Name="tool_calls", EmitDefaultValue=false)]
        public List<ChatCompletionMessageToolCall> ToolCalls { get; set; }


        /// <summary>
        /// The role of the author of this message.
        /// </summary>
        /// <value>The role of the author of this message.</value>
        [TypeConverter(typeof(CustomEnumConverter<RoleEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum RoleEnum
        {
            
            /// <summary>
            /// Enum AssistantEnum for assistant
            /// </summary>
            [EnumMember(Value = "assistant")]
            AssistantEnum = 1
        }

        /// <summary>
        /// The role of the author of this message.
        /// </summary>
        /// <value>The role of the author of this message.</value>
        [Required]
        [DataMember(Name="role", EmitDefaultValue=true)]
        public RoleEnum Role { get; set; }

        /// <summary>
        /// Gets or Sets FunctionCall
        /// </summary>
        [DataMember(Name="function_call", EmitDefaultValue=false)]
        public ChatCompletionRequestAssistantMessageFunctionCall FunctionCall { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ChatCompletionResponseMessage {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  ToolCalls: ").Append(ToolCalls).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  FunctionCall: ").Append(FunctionCall).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ChatCompletionResponseMessage)obj);
        }

        /// <summary>
        /// Returns true if ChatCompletionResponseMessage instances are equal
        /// </summary>
        /// <param name="other">Instance of ChatCompletionResponseMessage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChatCompletionResponseMessage other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Content == other.Content ||
                    Content != null &&
                    Content.Equals(other.Content)
                ) && 
                (
                    ToolCalls == other.ToolCalls ||
                    ToolCalls != null &&
                    other.ToolCalls != null &&
                    ToolCalls.SequenceEqual(other.ToolCalls)
                ) && 
                (
                    Role == other.Role ||
                    
                    Role.Equals(other.Role)
                ) && 
                (
                    FunctionCall == other.FunctionCall ||
                    FunctionCall != null &&
                    FunctionCall.Equals(other.FunctionCall)
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
                    if (Content != null)
                    hashCode = hashCode * 59 + Content.GetHashCode();
                    if (ToolCalls != null)
                    hashCode = hashCode * 59 + ToolCalls.GetHashCode();
                    
                    hashCode = hashCode * 59 + Role.GetHashCode();
                    if (FunctionCall != null)
                    hashCode = hashCode * 59 + FunctionCall.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ChatCompletionResponseMessage left, ChatCompletionResponseMessage right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ChatCompletionResponseMessage left, ChatCompletionResponseMessage right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
