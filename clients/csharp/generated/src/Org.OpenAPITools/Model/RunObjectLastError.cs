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
    /// The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
    /// </summary>
    [DataContract(Name = "RunObject_last_error")]
    public partial class RunObjectLastError : IValidatableObject
    {
        /// <summary>
        /// One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
        /// </summary>
        /// <value>One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CodeEnum
        {
            /// <summary>
            /// Enum ServerError for value: server_error
            /// </summary>
            [EnumMember(Value = "server_error")]
            ServerError = 1,

            /// <summary>
            /// Enum RateLimitExceeded for value: rate_limit_exceeded
            /// </summary>
            [EnumMember(Value = "rate_limit_exceeded")]
            RateLimitExceeded = 2,

            /// <summary>
            /// Enum InvalidPrompt for value: invalid_prompt
            /// </summary>
            [EnumMember(Value = "invalid_prompt")]
            InvalidPrompt = 3
        }


        /// <summary>
        /// One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
        /// </summary>
        /// <value>One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.</value>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = true)]
        public CodeEnum Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunObjectLastError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunObjectLastError() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunObjectLastError" /> class.
        /// </summary>
        /// <param name="code">One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. (required).</param>
        /// <param name="message">A human-readable description of the error. (required).</param>
        public RunObjectLastError(CodeEnum code = default(CodeEnum), string message = default(string))
        {
            this.Code = code;
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for RunObjectLastError and cannot be null");
            }
            this.Message = message;
        }

        /// <summary>
        /// A human-readable description of the error.
        /// </summary>
        /// <value>A human-readable description of the error.</value>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
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
