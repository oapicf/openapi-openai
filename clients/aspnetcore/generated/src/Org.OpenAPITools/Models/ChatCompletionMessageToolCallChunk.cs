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
    public partial class ChatCompletionMessageToolCallChunk : IEquatable<ChatCompletionMessageToolCallChunk>
    {
        /// <summary>
        /// Gets or Sets Index
        /// </summary>
        [Required]
        [DataMember(Name="index", EmitDefaultValue=true)]
        public int Index { get; set; }

        /// <summary>
        /// The ID of the tool call.
        /// </summary>
        /// <value>The ID of the tool call.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }


        /// <summary>
        /// The type of the tool. Currently, only `function` is supported.
        /// </summary>
        /// <value>The type of the tool. Currently, only `function` is supported.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum FunctionEnum for function
            /// </summary>
            [EnumMember(Value = "function")]
            FunctionEnum = 1
        }

        /// <summary>
        /// The type of the tool. Currently, only &#x60;function&#x60; is supported.
        /// </summary>
        /// <value>The type of the tool. Currently, only &#x60;function&#x60; is supported.</value>
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets Function
        /// </summary>
        [DataMember(Name="function", EmitDefaultValue=false)]
        public ChatCompletionMessageToolCallChunkFunction Function { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ChatCompletionMessageToolCallChunk {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ChatCompletionMessageToolCallChunk)obj);
        }

        /// <summary>
        /// Returns true if ChatCompletionMessageToolCallChunk instances are equal
        /// </summary>
        /// <param name="other">Instance of ChatCompletionMessageToolCallChunk to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChatCompletionMessageToolCallChunk other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Index == other.Index ||
                    
                    Index.Equals(other.Index)
                ) && 
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
                    
                    hashCode = hashCode * 59 + Index.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Function != null)
                    hashCode = hashCode * 59 + Function.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ChatCompletionMessageToolCallChunk left, ChatCompletionMessageToolCallChunk right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ChatCompletionMessageToolCallChunk left, ChatCompletionMessageToolCallChunk right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
