/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
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
    public partial class CreateEmbeddingRequest : IEquatable<CreateEmbeddingRequest>
    {
        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public CreateEmbeddingRequestModel Model { get; set; }

        /// <summary>
        /// Gets or Sets Input
        /// </summary>
        [Required]
        [DataMember(Name="input", EmitDefaultValue=false)]
        public CreateEmbeddingRequestInput Input { get; set; }

        /// <summary>
        /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
        /// </summary>
        /// <value>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). </value>
        /// <example>user-1234</example>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public string User { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateEmbeddingRequest {\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Input: ").Append(Input).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateEmbeddingRequest)obj);
        }

        /// <summary>
        /// Returns true if CreateEmbeddingRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateEmbeddingRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateEmbeddingRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    Input == other.Input ||
                    Input != null &&
                    Input.Equals(other.Input)
                ) && 
                (
                    User == other.User ||
                    User != null &&
                    User.Equals(other.User)
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
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (Input != null)
                    hashCode = hashCode * 59 + Input.GetHashCode();
                    if (User != null)
                    hashCode = hashCode * 59 + User.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateEmbeddingRequest left, CreateEmbeddingRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateEmbeddingRequest left, CreateEmbeddingRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
