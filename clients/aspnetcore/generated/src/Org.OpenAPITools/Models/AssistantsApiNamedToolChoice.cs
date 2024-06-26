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
    /// Specifies a tool the model should use. Use to force the model to call a specific tool.
    /// </summary>
    [DataContract]
    public partial class AssistantsApiNamedToolChoice : IEquatable<AssistantsApiNamedToolChoice>
    {

        /// <summary>
        /// The type of the tool. If type is `function`, the function name must be set
        /// </summary>
        /// <value>The type of the tool. If type is `function`, the function name must be set</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum FunctionEnum for function
            /// </summary>
            [EnumMember(Value = "function")]
            FunctionEnum = 1,
            
            /// <summary>
            /// Enum CodeInterpreterEnum for code_interpreter
            /// </summary>
            [EnumMember(Value = "code_interpreter")]
            CodeInterpreterEnum = 2,
            
            /// <summary>
            /// Enum RetrievalEnum for retrieval
            /// </summary>
            [EnumMember(Value = "retrieval")]
            RetrievalEnum = 3
        }

        /// <summary>
        /// The type of the tool. If type is &#x60;function&#x60;, the function name must be set
        /// </summary>
        /// <value>The type of the tool. If type is &#x60;function&#x60;, the function name must be set</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets Function
        /// </summary>
        [DataMember(Name="function", EmitDefaultValue=false)]
        public ChatCompletionNamedToolChoiceFunction Function { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AssistantsApiNamedToolChoice {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Function: ").Append(Function).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AssistantsApiNamedToolChoice)obj);
        }

        /// <summary>
        /// Returns true if AssistantsApiNamedToolChoice instances are equal
        /// </summary>
        /// <param name="other">Instance of AssistantsApiNamedToolChoice to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AssistantsApiNamedToolChoice other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Function == other.Function ||
                    Function != null &&
                    Function.Equals(other.Function)
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
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Function != null)
                    hashCode = hashCode * 59 + Function.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AssistantsApiNamedToolChoice left, AssistantsApiNamedToolChoice right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AssistantsApiNamedToolChoice left, AssistantsApiNamedToolChoice right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
