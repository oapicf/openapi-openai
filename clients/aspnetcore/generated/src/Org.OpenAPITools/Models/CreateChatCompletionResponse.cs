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
    /// Represents a chat completion response returned by model, based on the provided input.
    /// </summary>
    [DataContract]
    public partial class CreateChatCompletionResponse : IEquatable<CreateChatCompletionResponse>
    {
        /// <summary>
        /// A unique identifier for the chat completion.
        /// </summary>
        /// <value>A unique identifier for the chat completion.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
        /// </summary>
        /// <value>A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.</value>
        [Required]
        [DataMember(Name="choices", EmitDefaultValue=false)]
        public List<CreateChatCompletionResponseChoicesInner> Choices { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) of when the chat completion was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) of when the chat completion was created.</value>
        [Required]
        [DataMember(Name="created", EmitDefaultValue=true)]
        public int Created { get; set; }

        /// <summary>
        /// The model used for the chat completion.
        /// </summary>
        /// <value>The model used for the chat completion.</value>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public string Model { get; set; }

        /// <summary>
        /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
        /// </summary>
        /// <value>This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. </value>
        [DataMember(Name="system_fingerprint", EmitDefaultValue=false)]
        public string SystemFingerprint { get; set; }


        /// <summary>
        /// The object type, which is always `chat.completion`.
        /// </summary>
        /// <value>The object type, which is always `chat.completion`.</value>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum ChatCompletionEnum for chat.completion
            /// </summary>
            [EnumMember(Value = "chat.completion")]
            ChatCompletionEnum = 1
        }

        /// <summary>
        /// The object type, which is always &#x60;chat.completion&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;chat.completion&#x60;.</value>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum Object { get; set; }

        /// <summary>
        /// Gets or Sets Usage
        /// </summary>
        [DataMember(Name="usage", EmitDefaultValue=false)]
        public CompletionUsage Usage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateChatCompletionResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Choices: ").Append(Choices).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  SystemFingerprint: ").Append(SystemFingerprint).Append("\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
            sb.Append("  Usage: ").Append(Usage).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateChatCompletionResponse)obj);
        }

        /// <summary>
        /// Returns true if CreateChatCompletionResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateChatCompletionResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateChatCompletionResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Choices == other.Choices ||
                    Choices != null &&
                    other.Choices != null &&
                    Choices.SequenceEqual(other.Choices)
                ) && 
                (
                    Created == other.Created ||
                    
                    Created.Equals(other.Created)
                ) && 
                (
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    SystemFingerprint == other.SystemFingerprint ||
                    SystemFingerprint != null &&
                    SystemFingerprint.Equals(other.SystemFingerprint)
                ) && 
                (
                    Object == other.Object ||
                    
                    Object.Equals(other.Object)
                ) && 
                (
                    Usage == other.Usage ||
                    Usage != null &&
                    Usage.Equals(other.Usage)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Choices != null)
                    hashCode = hashCode * 59 + Choices.GetHashCode();
                    
                    hashCode = hashCode * 59 + Created.GetHashCode();
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (SystemFingerprint != null)
                    hashCode = hashCode * 59 + SystemFingerprint.GetHashCode();
                    
                    hashCode = hashCode * 59 + Object.GetHashCode();
                    if (Usage != null)
                    hashCode = hashCode * 59 + Usage.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateChatCompletionResponse left, CreateChatCompletionResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateChatCompletionResponse left, CreateChatCompletionResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
