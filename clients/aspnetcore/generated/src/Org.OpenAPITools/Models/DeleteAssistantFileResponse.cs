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
    /// Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
    /// </summary>
    [DataContract]
    public partial class DeleteAssistantFileResponse : IEquatable<DeleteAssistantFileResponse>
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
        /// Gets or Sets Object
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum AssistantFileDeletedEnum for assistant.file.deleted
            /// </summary>
            [EnumMember(Value = "assistant.file.deleted")]
            AssistantFileDeletedEnum = 1
        }

        /// <summary>
        /// Gets or Sets Object
        /// </summary>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum Object { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeleteAssistantFileResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Deleted: ").Append(Deleted).Append("\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DeleteAssistantFileResponse)obj);
        }

        /// <summary>
        /// Returns true if DeleteAssistantFileResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of DeleteAssistantFileResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeleteAssistantFileResponse other)
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
                    Object == other.Object ||
                    
                    Object.Equals(other.Object)
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
                    
                    hashCode = hashCode * 59 + Object.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DeleteAssistantFileResponse left, DeleteAssistantFileResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DeleteAssistantFileResponse left, DeleteAssistantFileResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
