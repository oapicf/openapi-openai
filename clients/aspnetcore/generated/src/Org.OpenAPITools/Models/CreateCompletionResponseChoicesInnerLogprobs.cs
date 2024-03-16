/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
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
    public partial class CreateCompletionResponseChoicesInnerLogprobs : IEquatable<CreateCompletionResponseChoicesInnerLogprobs>
    {
        /// <summary>
        /// Gets or Sets Tokens
        /// </summary>
        [DataMember(Name="tokens", EmitDefaultValue=false)]
        public List<string> Tokens { get; set; }

        /// <summary>
        /// Gets or Sets TokenLogprobs
        /// </summary>
        [DataMember(Name="token_logprobs", EmitDefaultValue=false)]
        public List<decimal> TokenLogprobs { get; set; }

        /// <summary>
        /// Gets or Sets TopLogprobs
        /// </summary>
        [DataMember(Name="top_logprobs", EmitDefaultValue=false)]
        public List<Object> TopLogprobs { get; set; }

        /// <summary>
        /// Gets or Sets TextOffset
        /// </summary>
        [DataMember(Name="text_offset", EmitDefaultValue=false)]
        public List<int> TextOffset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
            sb.Append("  Tokens: ").Append(Tokens).Append("\n");
            sb.Append("  TokenLogprobs: ").Append(TokenLogprobs).Append("\n");
            sb.Append("  TopLogprobs: ").Append(TopLogprobs).Append("\n");
            sb.Append("  TextOffset: ").Append(TextOffset).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateCompletionResponseChoicesInnerLogprobs)obj);
        }

        /// <summary>
        /// Returns true if CreateCompletionResponseChoicesInnerLogprobs instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateCompletionResponseChoicesInnerLogprobs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateCompletionResponseChoicesInnerLogprobs other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Tokens == other.Tokens ||
                    Tokens != null &&
                    other.Tokens != null &&
                    Tokens.SequenceEqual(other.Tokens)
                ) && 
                (
                    TokenLogprobs == other.TokenLogprobs ||
                    TokenLogprobs != null &&
                    other.TokenLogprobs != null &&
                    TokenLogprobs.SequenceEqual(other.TokenLogprobs)
                ) && 
                (
                    TopLogprobs == other.TopLogprobs ||
                    TopLogprobs != null &&
                    other.TopLogprobs != null &&
                    TopLogprobs.SequenceEqual(other.TopLogprobs)
                ) && 
                (
                    TextOffset == other.TextOffset ||
                    TextOffset != null &&
                    other.TextOffset != null &&
                    TextOffset.SequenceEqual(other.TextOffset)
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
                    if (Tokens != null)
                    hashCode = hashCode * 59 + Tokens.GetHashCode();
                    if (TokenLogprobs != null)
                    hashCode = hashCode * 59 + TokenLogprobs.GetHashCode();
                    if (TopLogprobs != null)
                    hashCode = hashCode * 59 + TopLogprobs.GetHashCode();
                    if (TextOffset != null)
                    hashCode = hashCode * 59 + TextOffset.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateCompletionResponseChoicesInnerLogprobs left, CreateCompletionResponseChoicesInnerLogprobs right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateCompletionResponseChoicesInnerLogprobs left, CreateCompletionResponseChoicesInnerLogprobs right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}