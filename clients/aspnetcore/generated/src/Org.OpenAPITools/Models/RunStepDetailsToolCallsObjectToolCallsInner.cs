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
    public partial class RunStepDetailsToolCallsObjectToolCallsInner : IEquatable<RunStepDetailsToolCallsObjectToolCallsInner>
    {
        /// <summary>
        /// The ID of the tool call object.
        /// </summary>
        /// <value>The ID of the tool call object.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }


        /// <summary>
        /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
        /// </summary>
        /// <value>The type of tool call. This is always going to be `code_interpreter` for this type of tool call.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum CodeInterpreterEnum for code_interpreter
            /// </summary>
            [EnumMember(Value = "code_interpreter")]
            CodeInterpreterEnum = 1,
            
            /// <summary>
            /// Enum RetrievalEnum for retrieval
            /// </summary>
            [EnumMember(Value = "retrieval")]
            RetrievalEnum = 2,
            
            /// <summary>
            /// Enum FunctionEnum for function
            /// </summary>
            [EnumMember(Value = "function")]
            FunctionEnum = 3
        }

        /// <summary>
        /// The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
        /// </summary>
        /// <value>The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets CodeInterpreter
        /// </summary>
        [Required]
        [DataMember(Name="code_interpreter", EmitDefaultValue=false)]
        public RunStepDetailsToolCallsCodeObjectCodeInterpreter CodeInterpreter { get; set; }

        /// <summary>
        /// For now, this is always going to be an empty object.
        /// </summary>
        /// <value>For now, this is always going to be an empty object.</value>
        [Required]
        [DataMember(Name="retrieval", EmitDefaultValue=false)]
        public Object Retrieval { get; set; }

        /// <summary>
        /// Gets or Sets Function
        /// </summary>
        [Required]
        [DataMember(Name="function", EmitDefaultValue=false)]
        public RunStepDetailsToolCallsFunctionObjectFunction Function { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepDetailsToolCallsObjectToolCallsInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  CodeInterpreter: ").Append(CodeInterpreter).Append("\n");
            sb.Append("  Retrieval: ").Append(Retrieval).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunStepDetailsToolCallsObjectToolCallsInner)obj);
        }

        /// <summary>
        /// Returns true if RunStepDetailsToolCallsObjectToolCallsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of RunStepDetailsToolCallsObjectToolCallsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunStepDetailsToolCallsObjectToolCallsInner other)
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
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    CodeInterpreter == other.CodeInterpreter ||
                    CodeInterpreter != null &&
                    CodeInterpreter.Equals(other.CodeInterpreter)
                ) && 
                (
                    Retrieval == other.Retrieval ||
                    Retrieval != null &&
                    Retrieval.Equals(other.Retrieval)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (CodeInterpreter != null)
                    hashCode = hashCode * 59 + CodeInterpreter.GetHashCode();
                    if (Retrieval != null)
                    hashCode = hashCode * 59 + Retrieval.GetHashCode();
                    if (Function != null)
                    hashCode = hashCode * 59 + Function.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunStepDetailsToolCallsObjectToolCallsInner left, RunStepDetailsToolCallsObjectToolCallsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunStepDetailsToolCallsObjectToolCallsInner left, RunStepDetailsToolCallsObjectToolCallsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
