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
    /// Metrics at the step number during the fine-tuning job.
    /// </summary>
    [DataContract]
    public partial class FineTuningJobCheckpointMetrics : IEquatable<FineTuningJobCheckpointMetrics>
    {
        /// <summary>
        /// Gets or Sets Step
        /// </summary>
        [DataMember(Name="step", EmitDefaultValue=true)]
        public decimal Step { get; set; }

        /// <summary>
        /// Gets or Sets TrainLoss
        /// </summary>
        [DataMember(Name="train_loss", EmitDefaultValue=true)]
        public decimal TrainLoss { get; set; }

        /// <summary>
        /// Gets or Sets TrainMeanTokenAccuracy
        /// </summary>
        [DataMember(Name="train_mean_token_accuracy", EmitDefaultValue=true)]
        public decimal TrainMeanTokenAccuracy { get; set; }

        /// <summary>
        /// Gets or Sets ValidLoss
        /// </summary>
        [DataMember(Name="valid_loss", EmitDefaultValue=true)]
        public decimal ValidLoss { get; set; }

        /// <summary>
        /// Gets or Sets ValidMeanTokenAccuracy
        /// </summary>
        [DataMember(Name="valid_mean_token_accuracy", EmitDefaultValue=true)]
        public decimal ValidMeanTokenAccuracy { get; set; }

        /// <summary>
        /// Gets or Sets FullValidLoss
        /// </summary>
        [DataMember(Name="full_valid_loss", EmitDefaultValue=true)]
        public decimal FullValidLoss { get; set; }

        /// <summary>
        /// Gets or Sets FullValidMeanTokenAccuracy
        /// </summary>
        [DataMember(Name="full_valid_mean_token_accuracy", EmitDefaultValue=true)]
        public decimal FullValidMeanTokenAccuracy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FineTuningJobCheckpointMetrics {\n");
            sb.Append("  Step: ").Append(Step).Append("\n");
            sb.Append("  TrainLoss: ").Append(TrainLoss).Append("\n");
            sb.Append("  TrainMeanTokenAccuracy: ").Append(TrainMeanTokenAccuracy).Append("\n");
            sb.Append("  ValidLoss: ").Append(ValidLoss).Append("\n");
            sb.Append("  ValidMeanTokenAccuracy: ").Append(ValidMeanTokenAccuracy).Append("\n");
            sb.Append("  FullValidLoss: ").Append(FullValidLoss).Append("\n");
            sb.Append("  FullValidMeanTokenAccuracy: ").Append(FullValidMeanTokenAccuracy).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FineTuningJobCheckpointMetrics)obj);
        }

        /// <summary>
        /// Returns true if FineTuningJobCheckpointMetrics instances are equal
        /// </summary>
        /// <param name="other">Instance of FineTuningJobCheckpointMetrics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FineTuningJobCheckpointMetrics other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Step == other.Step ||
                    
                    Step.Equals(other.Step)
                ) && 
                (
                    TrainLoss == other.TrainLoss ||
                    
                    TrainLoss.Equals(other.TrainLoss)
                ) && 
                (
                    TrainMeanTokenAccuracy == other.TrainMeanTokenAccuracy ||
                    
                    TrainMeanTokenAccuracy.Equals(other.TrainMeanTokenAccuracy)
                ) && 
                (
                    ValidLoss == other.ValidLoss ||
                    
                    ValidLoss.Equals(other.ValidLoss)
                ) && 
                (
                    ValidMeanTokenAccuracy == other.ValidMeanTokenAccuracy ||
                    
                    ValidMeanTokenAccuracy.Equals(other.ValidMeanTokenAccuracy)
                ) && 
                (
                    FullValidLoss == other.FullValidLoss ||
                    
                    FullValidLoss.Equals(other.FullValidLoss)
                ) && 
                (
                    FullValidMeanTokenAccuracy == other.FullValidMeanTokenAccuracy ||
                    
                    FullValidMeanTokenAccuracy.Equals(other.FullValidMeanTokenAccuracy)
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
                    
                    hashCode = hashCode * 59 + Step.GetHashCode();
                    
                    hashCode = hashCode * 59 + TrainLoss.GetHashCode();
                    
                    hashCode = hashCode * 59 + TrainMeanTokenAccuracy.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValidLoss.GetHashCode();
                    
                    hashCode = hashCode * 59 + ValidMeanTokenAccuracy.GetHashCode();
                    
                    hashCode = hashCode * 59 + FullValidLoss.GetHashCode();
                    
                    hashCode = hashCode * 59 + FullValidMeanTokenAccuracy.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FineTuningJobCheckpointMetrics left, FineTuningJobCheckpointMetrics right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FineTuningJobCheckpointMetrics left, FineTuningJobCheckpointMetrics right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}