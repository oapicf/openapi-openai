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
    /// Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
    /// </summary>
    [DataContract]
    public partial class RunCompletionUsage : IEquatable<RunCompletionUsage>
    {
        /// <summary>
        /// Number of completion tokens used over the course of the run.
        /// </summary>
        /// <value>Number of completion tokens used over the course of the run.</value>
        [Required]
        [DataMember(Name="completion_tokens", EmitDefaultValue=true)]
        public int CompletionTokens { get; set; }

        /// <summary>
        /// Number of prompt tokens used over the course of the run.
        /// </summary>
        /// <value>Number of prompt tokens used over the course of the run.</value>
        [Required]
        [DataMember(Name="prompt_tokens", EmitDefaultValue=true)]
        public int PromptTokens { get; set; }

        /// <summary>
        /// Total number of tokens used (prompt + completion).
        /// </summary>
        /// <value>Total number of tokens used (prompt + completion).</value>
        [Required]
        [DataMember(Name="total_tokens", EmitDefaultValue=true)]
        public int TotalTokens { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunCompletionUsage {\n");
            sb.Append("  CompletionTokens: ").Append(CompletionTokens).Append("\n");
            sb.Append("  PromptTokens: ").Append(PromptTokens).Append("\n");
            sb.Append("  TotalTokens: ").Append(TotalTokens).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunCompletionUsage)obj);
        }

        /// <summary>
        /// Returns true if RunCompletionUsage instances are equal
        /// </summary>
        /// <param name="other">Instance of RunCompletionUsage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunCompletionUsage other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CompletionTokens == other.CompletionTokens ||
                    
                    CompletionTokens.Equals(other.CompletionTokens)
                ) && 
                (
                    PromptTokens == other.PromptTokens ||
                    
                    PromptTokens.Equals(other.PromptTokens)
                ) && 
                (
                    TotalTokens == other.TotalTokens ||
                    
                    TotalTokens.Equals(other.TotalTokens)
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
                    
                    hashCode = hashCode * 59 + CompletionTokens.GetHashCode();
                    
                    hashCode = hashCode * 59 + PromptTokens.GetHashCode();
                    
                    hashCode = hashCode * 59 + TotalTokens.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunCompletionUsage left, RunCompletionUsage right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunCompletionUsage left, RunCompletionUsage right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}