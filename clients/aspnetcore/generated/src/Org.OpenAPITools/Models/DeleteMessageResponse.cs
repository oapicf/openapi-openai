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
    public partial class DeleteMessageResponse : IEquatable<DeleteMessageResponse>
    {
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Deleted
        /// </summary>
        [Required]
        [DataMember(Name="deleted", EmitDefaultValue=true)]
        public bool Deleted { get; set; }


        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum ThreadMessageDeletedEnum for thread.message.deleted
            /// </summary>
            [EnumMember(Value = "thread.message.deleted")]
            ThreadMessageDeletedEnum = 1
        }

        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum VarObject { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeleteMessageResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Deleted: ").Append(Deleted).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DeleteMessageResponse)obj);
        }

        /// <summary>
        /// Returns true if DeleteMessageResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of DeleteMessageResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeleteMessageResponse other)
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
                    Deleted == other.Deleted ||
                    
                    Deleted.Equals(other.Deleted)
                ) && 
                (
                    VarObject == other.VarObject ||
                    
                    VarObject.Equals(other.VarObject)
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
                    
                    hashCode = hashCode * 59 + Deleted.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarObject.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DeleteMessageResponse left, DeleteMessageResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DeleteMessageResponse left, DeleteMessageResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
