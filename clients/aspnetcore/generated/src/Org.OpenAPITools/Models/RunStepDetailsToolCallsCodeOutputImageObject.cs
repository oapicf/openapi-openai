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
    public partial class RunStepDetailsToolCallsCodeOutputImageObject : IEquatable<RunStepDetailsToolCallsCodeOutputImageObject>
    {

        /// <summary>
        /// Always `image`.
        /// </summary>
        /// <value>Always `image`.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum ImageEnum for image
            /// </summary>
            [EnumMember(Value = "image")]
            ImageEnum = 1
        }

        /// <summary>
        /// Always &#x60;image&#x60;.
        /// </summary>
        /// <value>Always &#x60;image&#x60;.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets Image
        /// </summary>
        [Required]
        [DataMember(Name="image", EmitDefaultValue=false)]
        public RunStepDetailsToolCallsCodeOutputImageObjectImage Image { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepDetailsToolCallsCodeOutputImageObject {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunStepDetailsToolCallsCodeOutputImageObject)obj);
        }

        /// <summary>
        /// Returns true if RunStepDetailsToolCallsCodeOutputImageObject instances are equal
        /// </summary>
        /// <param name="other">Instance of RunStepDetailsToolCallsCodeOutputImageObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunStepDetailsToolCallsCodeOutputImageObject other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
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
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Image != null)
                    hashCode = hashCode * 59 + Image.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunStepDetailsToolCallsCodeOutputImageObject left, RunStepDetailsToolCallsCodeOutputImageObject right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunStepDetailsToolCallsCodeOutputImageObject left, RunStepDetailsToolCallsCodeOutputImageObject right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
