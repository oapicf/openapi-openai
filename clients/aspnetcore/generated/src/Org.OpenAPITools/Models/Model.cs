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
    /// Describes an OpenAI model offering that can be used with the API.
    /// </summary>
    [DataContract]
    public partial class Model : IEquatable<Model>
    {
        /// <summary>
        /// The model identifier, which can be referenced in the API endpoints.
        /// </summary>
        /// <value>The model identifier, which can be referenced in the API endpoints.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) when the model was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) when the model was created.</value>
        [Required]
        [DataMember(Name="created", EmitDefaultValue=true)]
        public int Created { get; set; }


        /// <summary>
        /// The object type, which is always \"model\".
        /// </summary>
        /// <value>The object type, which is always \"model\".</value>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum ModelEnum for model
            /// </summary>
            [EnumMember(Value = "model")]
            ModelEnum = 1
        }

        /// <summary>
        /// The object type, which is always \&quot;model\&quot;.
        /// </summary>
        /// <value>The object type, which is always \&quot;model\&quot;.</value>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum VarObject { get; set; }

        /// <summary>
        /// The organization that owns the model.
        /// </summary>
        /// <value>The organization that owns the model.</value>
        [Required]
        [DataMember(Name="owned_by", EmitDefaultValue=false)]
        public string OwnedBy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Model {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  OwnedBy: ").Append(OwnedBy).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Model)obj);
        }

        /// <summary>
        /// Returns true if Model instances are equal
        /// </summary>
        /// <param name="other">Instance of Model to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Model other)
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
                    Created == other.Created ||
                    
                    Created.Equals(other.Created)
                ) && 
                (
                    VarObject == other.VarObject ||
                    
                    VarObject.Equals(other.VarObject)
                ) && 
                (
                    OwnedBy == other.OwnedBy ||
                    OwnedBy != null &&
                    OwnedBy.Equals(other.OwnedBy)
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
                    
                    hashCode = hashCode * 59 + Created.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarObject.GetHashCode();
                    if (OwnedBy != null)
                    hashCode = hashCode * 59 + OwnedBy.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Model left, Model right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Model left, Model right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
