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
    public partial class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner : IEquatable<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>
    {
        /// <summary>
        /// The index of the output in the outputs array.
        /// </summary>
        /// <value>The index of the output in the outputs array.</value>
        [Required]
        [DataMember(Name="index", EmitDefaultValue=true)]
        public int Index { get; set; }


        /// <summary>
        /// Always `logs`.
        /// </summary>
        /// <value>Always `logs`.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum LogsEnum for logs
            /// </summary>
            [EnumMember(Value = "logs")]
            LogsEnum = 1,
            
            /// <summary>
            /// Enum ImageEnum for image
            /// </summary>
            [EnumMember(Value = "image")]
            ImageEnum = 2
        }

        /// <summary>
        /// Always &#x60;logs&#x60;.
        /// </summary>
        /// <value>Always &#x60;logs&#x60;.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// The text output from the Code Interpreter tool call.
        /// </summary>
        /// <value>The text output from the Code Interpreter tool call.</value>
        [DataMember(Name="logs", EmitDefaultValue=false)]
        public string Logs { get; set; }

        /// <summary>
        /// Gets or Sets Image
        /// </summary>
        [DataMember(Name="image", EmitDefaultValue=false)]
        public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage Image { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Logs: ").Append(Logs).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)obj);
        }

        /// <summary>
        /// Returns true if RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Index == other.Index ||
                    
                    Index.Equals(other.Index)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Logs == other.Logs ||
                    Logs != null &&
                    Logs.Equals(other.Logs)
                ) && 
                (
                    Image == other.Image ||
                    Image != null &&
                    Image.Equals(other.Image)
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
                    
                    hashCode = hashCode * 59 + Index.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Logs != null)
                    hashCode = hashCode * 59 + Logs.GetHashCode();
                    if (Image != null)
                    hashCode = hashCode * 59 + Image.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner left, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner left, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
