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
    /// The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
    /// </summary>
    [DataContract]
    public partial class FineTuningJobCheckpoint : IEquatable<FineTuningJobCheckpoint>
    {
        /// <summary>
        /// The checkpoint identifier, which can be referenced in the API endpoints.
        /// </summary>
        /// <value>The checkpoint identifier, which can be referenced in the API endpoints.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the checkpoint was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the checkpoint was created.</value>
        [Required]
        [DataMember(Name="created_at", EmitDefaultValue=true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// The name of the fine-tuned checkpoint model that is created.
        /// </summary>
        /// <value>The name of the fine-tuned checkpoint model that is created.</value>
        [Required]
        [DataMember(Name="fine_tuned_model_checkpoint", EmitDefaultValue=false)]
        public string FineTunedModelCheckpoint { get; set; }

        /// <summary>
        /// The step number that the checkpoint was created at.
        /// </summary>
        /// <value>The step number that the checkpoint was created at.</value>
        [Required]
        [DataMember(Name="step_number", EmitDefaultValue=true)]
        public int StepNumber { get; set; }

        /// <summary>
        /// Gets or Sets Metrics
        /// </summary>
        [Required]
        [DataMember(Name="metrics", EmitDefaultValue=false)]
        public FineTuningJobCheckpointMetrics Metrics { get; set; }

        /// <summary>
        /// The name of the fine-tuning job that this checkpoint was created from.
        /// </summary>
        /// <value>The name of the fine-tuning job that this checkpoint was created from.</value>
        [Required]
        [DataMember(Name="fine_tuning_job_id", EmitDefaultValue=false)]
        public string FineTuningJobId { get; set; }


        /// <summary>
        /// The object type, which is always \"fine_tuning.job.checkpoint\".
        /// </summary>
        /// <value>The object type, which is always \"fine_tuning.job.checkpoint\".</value>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum FineTuningJobCheckpointEnum for fine_tuning.job.checkpoint
            /// </summary>
            [EnumMember(Value = "fine_tuning.job.checkpoint")]
            FineTuningJobCheckpointEnum = 1
        }

        /// <summary>
        /// The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
        /// </summary>
        /// <value>The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.</value>
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
            sb.Append("class FineTuningJobCheckpoint {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  FineTunedModelCheckpoint: ").Append(FineTunedModelCheckpoint).Append("\n");
            sb.Append("  StepNumber: ").Append(StepNumber).Append("\n");
            sb.Append("  Metrics: ").Append(Metrics).Append("\n");
            sb.Append("  FineTuningJobId: ").Append(FineTuningJobId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FineTuningJobCheckpoint)obj);
        }

        /// <summary>
        /// Returns true if FineTuningJobCheckpoint instances are equal
        /// </summary>
        /// <param name="other">Instance of FineTuningJobCheckpoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FineTuningJobCheckpoint other)
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
                    CreatedAt == other.CreatedAt ||
                    
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    FineTunedModelCheckpoint == other.FineTunedModelCheckpoint ||
                    FineTunedModelCheckpoint != null &&
                    FineTunedModelCheckpoint.Equals(other.FineTunedModelCheckpoint)
                ) && 
                (
                    StepNumber == other.StepNumber ||
                    
                    StepNumber.Equals(other.StepNumber)
                ) && 
                (
                    Metrics == other.Metrics ||
                    Metrics != null &&
                    Metrics.Equals(other.Metrics)
                ) && 
                (
                    FineTuningJobId == other.FineTuningJobId ||
                    FineTuningJobId != null &&
                    FineTuningJobId.Equals(other.FineTuningJobId)
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
                    
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (FineTunedModelCheckpoint != null)
                    hashCode = hashCode * 59 + FineTunedModelCheckpoint.GetHashCode();
                    
                    hashCode = hashCode * 59 + StepNumber.GetHashCode();
                    if (Metrics != null)
                    hashCode = hashCode * 59 + Metrics.GetHashCode();
                    if (FineTuningJobId != null)
                    hashCode = hashCode * 59 + FineTuningJobId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Object.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FineTuningJobCheckpoint left, FineTuningJobCheckpoint right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FineTuningJobCheckpoint left, FineTuningJobCheckpoint right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
