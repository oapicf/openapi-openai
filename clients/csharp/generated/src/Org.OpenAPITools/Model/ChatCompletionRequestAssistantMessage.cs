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
    /// ChatCompletionRequestAssistantMessage
    /// </summary>
    [DataContract(Name = "ChatCompletionRequestAssistantMessage")]
    public partial class ChatCompletionRequestAssistantMessage : IValidatableObject
    {
        /// <summary>
        /// The role of the messages author, in this case &#x60;assistant&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;assistant&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum Assistant for value: assistant
            /// </summary>
            [EnumMember(Value = "assistant")]
            Assistant = 1
        }


        /// <summary>
        /// The role of the messages author, in this case &#x60;assistant&#x60;.
        /// </summary>
        /// <value>The role of the messages author, in this case &#x60;assistant&#x60;.</value>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public RoleEnum Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestAssistantMessage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionRequestAssistantMessage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestAssistantMessage" /> class.
        /// </summary>
        /// <param name="content">The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. .</param>
        /// <param name="role">The role of the messages author, in this case &#x60;assistant&#x60;. (required).</param>
        /// <param name="name">An optional name for the participant. Provides the model information to differentiate between participants of the same role..</param>
        /// <param name="toolCalls">The tool calls generated by the model, such as function calls..</param>
        /// <param name="functionCall">functionCall.</param>
        public ChatCompletionRequestAssistantMessage(string content = default(string), RoleEnum role = default(RoleEnum), string name = default(string), List<ChatCompletionMessageToolCall> toolCalls = default(List<ChatCompletionMessageToolCall>), ChatCompletionRequestAssistantMessageFunctionCall functionCall = default(ChatCompletionRequestAssistantMessageFunctionCall))
        {
            this.Role = role;
            this.Content = content;
            this.Name = name;
            this.ToolCalls = toolCalls;
            this.FunctionCall = functionCall;
        }

        /// <summary>
        /// The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
        /// </summary>
        /// <value>The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. </value>
        [DataMember(Name = "content", EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
        /// </summary>
        /// <value>An optional name for the participant. Provides the model information to differentiate between participants of the same role.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The tool calls generated by the model, such as function calls.
        /// </summary>
        /// <value>The tool calls generated by the model, such as function calls.</value>
        [DataMember(Name = "tool_calls", EmitDefaultValue = false)]
        public List<ChatCompletionMessageToolCall> ToolCalls { get; set; }

        /// <summary>
        /// Gets or Sets FunctionCall
        /// </summary>
        [DataMember(Name = "function_call", EmitDefaultValue = false)]
        [Obsolete]
        public ChatCompletionRequestAssistantMessageFunctionCall FunctionCall { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionRequestAssistantMessage {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ToolCalls: ").Append(ToolCalls).Append("\n");
            sb.Append("  FunctionCall: ").Append(FunctionCall).Append("\n");
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