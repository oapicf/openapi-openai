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
    /// Log probability information for the choice.
    /// </summary>
    [DataContract]
    public partial class CreateChatCompletionResponseChoicesInnerLogprobs : IEquatable<CreateChatCompletionResponseChoicesInnerLogprobs>
    {
        /// <summary>
        /// A list of message content tokens with log probability information.
        /// </summary>
        /// <value>A list of message content tokens with log probability information.</value>
        [Required]
        [DataMember(Name="content", EmitDefaultValue=true)]
        public List<ChatCompletionTokenLogprob> Content { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateChatCompletionResponseChoicesInnerLogprobs)obj);
        }

        /// <summary>
        /// Returns true if CreateChatCompletionResponseChoicesInnerLogprobs instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateChatCompletionResponseChoicesInnerLogprobs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateChatCompletionResponseChoicesInnerLogprobs other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Content == other.Content ||
                    Content != null &&
                    other.Content != null &&
                    Content.SequenceEqual(other.Content)
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
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateChatCompletionResponseChoicesInnerLogprobs left, CreateChatCompletionResponseChoicesInnerLogprobs right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateChatCompletionResponseChoicesInnerLogprobs left, CreateChatCompletionResponseChoicesInnerLogprobs right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
