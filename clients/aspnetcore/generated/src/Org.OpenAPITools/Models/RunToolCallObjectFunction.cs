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
    /// The function definition.
    /// </summary>
    [DataContract]
    public partial class RunToolCallObjectFunction : IEquatable<RunToolCallObjectFunction>
    {
        /// <summary>
        /// The name of the function.
        /// </summary>
        /// <value>The name of the function.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// The arguments that the model expects you to pass to the function.
        /// </summary>
        /// <value>The arguments that the model expects you to pass to the function.</value>
        [Required]
        [DataMember(Name="arguments", EmitDefaultValue=false)]
        public string Arguments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunToolCallObjectFunction {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Arguments: ").Append(Arguments).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunToolCallObjectFunction)obj);
        }

        /// <summary>
        /// Returns true if RunToolCallObjectFunction instances are equal
        /// </summary>
        /// <param name="other">Instance of RunToolCallObjectFunction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunToolCallObjectFunction other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Arguments == other.Arguments ||
                    Arguments != null &&
                    Arguments.Equals(other.Arguments)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Arguments != null)
                    hashCode = hashCode * 59 + Arguments.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunToolCallObjectFunction left, RunToolCallObjectFunction right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunToolCallObjectFunction left, RunToolCallObjectFunction right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
