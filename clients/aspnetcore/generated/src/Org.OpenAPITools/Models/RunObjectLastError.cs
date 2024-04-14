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
    /// The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
    /// </summary>
    [DataContract]
    public partial class RunObjectLastError : IEquatable<RunObjectLastError>
    {

        /// <summary>
        /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
        /// </summary>
        /// <value>One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.</value>
        [TypeConverter(typeof(CustomEnumConverter<CodeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CodeEnum
        {
            
            /// <summary>
            /// Enum ServerErrorEnum for server_error
            /// </summary>
            [EnumMember(Value = "server_error")]
            ServerErrorEnum = 1,
            
            /// <summary>
            /// Enum RateLimitExceededEnum for rate_limit_exceeded
            /// </summary>
            [EnumMember(Value = "rate_limit_exceeded")]
            RateLimitExceededEnum = 2,
            
            /// <summary>
            /// Enum InvalidPromptEnum for invalid_prompt
            /// </summary>
            [EnumMember(Value = "invalid_prompt")]
            InvalidPromptEnum = 3
        }

        /// <summary>
        /// One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
        /// </summary>
        /// <value>One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.</value>
        [Required]
        [DataMember(Name="code", EmitDefaultValue=true)]
        public CodeEnum Code { get; set; }

        /// <summary>
        /// A human-readable description of the error.
        /// </summary>
        /// <value>A human-readable description of the error.</value>
        [Required]
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunObjectLastError {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunObjectLastError)obj);
        }

        /// <summary>
        /// Returns true if RunObjectLastError instances are equal
        /// </summary>
        /// <param name="other">Instance of RunObjectLastError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunObjectLastError other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Code == other.Code ||
                    
                    Code.Equals(other.Code)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
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
                    
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunObjectLastError left, RunObjectLastError right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunObjectLastError left, RunObjectLastError right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
