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
    /// Represents if a given text input is potentially harmful.
    /// </summary>
    [DataContract]
    public partial class CreateModerationResponse : IEquatable<CreateModerationResponse>
    {
        /// <summary>
        /// The unique identifier for the moderation request.
        /// </summary>
        /// <value>The unique identifier for the moderation request.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The model used to generate the moderation results.
        /// </summary>
        /// <value>The model used to generate the moderation results.</value>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public string Model { get; set; }

        /// <summary>
        /// A list of moderation objects.
        /// </summary>
        /// <value>A list of moderation objects.</value>
        [Required]
        [DataMember(Name="results", EmitDefaultValue=false)]
        public List<CreateModerationResponseResultsInner> Results { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateModerationResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Results: ").Append(Results).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateModerationResponse)obj);
        }

        /// <summary>
        /// Returns true if CreateModerationResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateModerationResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateModerationResponse other)
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
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    Results == other.Results ||
                    Results != null &&
                    other.Results != null &&
                    Results.SequenceEqual(other.Results)
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
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (Results != null)
                    hashCode = hashCode * 59 + Results.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateModerationResponse left, CreateModerationResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateModerationResponse left, CreateModerationResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
