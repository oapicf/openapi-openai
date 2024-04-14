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
    public partial class ListMessagesResponse : IEquatable<ListMessagesResponse>
    {
        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        /// <example>list</example>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=false)]
        public string VarObject { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [Required]
        [DataMember(Name="data", EmitDefaultValue=false)]
        public List<MessageObject> Data { get; set; }

        /// <summary>
        /// Gets or Sets FirstId
        /// </summary>
        /// <example>msg_abc123</example>
        [Required]
        [DataMember(Name="first_id", EmitDefaultValue=false)]
        public string FirstId { get; set; }

        /// <summary>
        /// Gets or Sets LastId
        /// </summary>
        /// <example>msg_abc123</example>
        [Required]
        [DataMember(Name="last_id", EmitDefaultValue=false)]
        public string LastId { get; set; }

        /// <summary>
        /// Gets or Sets HasMore
        /// </summary>
        /// <example>false</example>
        [Required]
        [DataMember(Name="has_more", EmitDefaultValue=true)]
        public bool HasMore { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ListMessagesResponse {\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  FirstId: ").Append(FirstId).Append("\n");
            sb.Append("  LastId: ").Append(LastId).Append("\n");
            sb.Append("  HasMore: ").Append(HasMore).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ListMessagesResponse)obj);
        }

        /// <summary>
        /// Returns true if ListMessagesResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of ListMessagesResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListMessagesResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarObject == other.VarObject ||
                    VarObject != null &&
                    VarObject.Equals(other.VarObject)
                ) && 
                (
                    Data == other.Data ||
                    Data != null &&
                    other.Data != null &&
                    Data.SequenceEqual(other.Data)
                ) && 
                (
                    FirstId == other.FirstId ||
                    FirstId != null &&
                    FirstId.Equals(other.FirstId)
                ) && 
                (
                    LastId == other.LastId ||
                    LastId != null &&
                    LastId.Equals(other.LastId)
                ) && 
                (
                    HasMore == other.HasMore ||
                    
                    HasMore.Equals(other.HasMore)
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
                    if (VarObject != null)
                    hashCode = hashCode * 59 + VarObject.GetHashCode();
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    if (FirstId != null)
                    hashCode = hashCode * 59 + FirstId.GetHashCode();
                    if (LastId != null)
                    hashCode = hashCode * 59 + LastId.GetHashCode();
                    
                    hashCode = hashCode * 59 + HasMore.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ListMessagesResponse left, ListMessagesResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ListMessagesResponse left, ListMessagesResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
