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
    /// The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
    /// </summary>
    [DataContract]
    public partial class FineTuningJob : IEquatable<FineTuningJob>
    {
        /// <summary>
        /// The object identifier, which can be referenced in the API endpoints.
        /// </summary>
        /// <value>The object identifier, which can be referenced in the API endpoints.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the fine-tuning job was created.</value>
        [Required]
        [DataMember(Name="created_at", EmitDefaultValue=true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [Required]
        [DataMember(Name="error", EmitDefaultValue=true)]
        public FineTuningJobError Error { get; set; }

        /// <summary>
        /// The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
        /// </summary>
        /// <value>The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.</value>
        [Required]
        [DataMember(Name="fine_tuned_model", EmitDefaultValue=true)]
        public string FineTunedModel { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.</value>
        [Required]
        [DataMember(Name="finished_at", EmitDefaultValue=true)]
        public int? FinishedAt { get; set; }

        /// <summary>
        /// Gets or Sets Hyperparameters
        /// </summary>
        [Required]
        [DataMember(Name="hyperparameters", EmitDefaultValue=false)]
        public FineTuningJobHyperparameters Hyperparameters { get; set; }

        /// <summary>
        /// The base model that is being fine-tuned.
        /// </summary>
        /// <value>The base model that is being fine-tuned.</value>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public string Model { get; set; }


        /// <summary>
        /// The object type, which is always \"fine_tuning.job\".
        /// </summary>
        /// <value>The object type, which is always \"fine_tuning.job\".</value>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum FineTuningJobEnum for fine_tuning.job
            /// </summary>
            [EnumMember(Value = "fine_tuning.job")]
            FineTuningJobEnum = 1
        }

        /// <summary>
        /// The object type, which is always \&quot;fine_tuning.job\&quot;.
        /// </summary>
        /// <value>The object type, which is always \&quot;fine_tuning.job\&quot;.</value>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum VarObject { get; set; }

        /// <summary>
        /// The organization that owns the fine-tuning job.
        /// </summary>
        /// <value>The organization that owns the fine-tuning job.</value>
        [Required]
        [DataMember(Name="organization_id", EmitDefaultValue=false)]
        public string OrganizationId { get; set; }

        /// <summary>
        /// The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
        /// </summary>
        /// <value>The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).</value>
        [Required]
        [DataMember(Name="result_files", EmitDefaultValue=false)]
        public List<string> ResultFiles { get; set; }


        /// <summary>
        /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
        /// </summary>
        /// <value>The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.</value>
        [TypeConverter(typeof(CustomEnumConverter<StatusEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum ValidatingFilesEnum for validating_files
            /// </summary>
            [EnumMember(Value = "validating_files")]
            ValidatingFilesEnum = 1,
            
            /// <summary>
            /// Enum QueuedEnum for queued
            /// </summary>
            [EnumMember(Value = "queued")]
            QueuedEnum = 2,
            
            /// <summary>
            /// Enum RunningEnum for running
            /// </summary>
            [EnumMember(Value = "running")]
            RunningEnum = 3,
            
            /// <summary>
            /// Enum SucceededEnum for succeeded
            /// </summary>
            [EnumMember(Value = "succeeded")]
            SucceededEnum = 4,
            
            /// <summary>
            /// Enum FailedEnum for failed
            /// </summary>
            [EnumMember(Value = "failed")]
            FailedEnum = 5,
            
            /// <summary>
            /// Enum CancelledEnum for cancelled
            /// </summary>
            [EnumMember(Value = "cancelled")]
            CancelledEnum = 6
        }

        /// <summary>
        /// The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
        /// </summary>
        /// <value>The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.</value>
        [Required]
        [DataMember(Name="status", EmitDefaultValue=true)]
        public StatusEnum Status { get; set; }

        /// <summary>
        /// The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
        /// </summary>
        /// <value>The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.</value>
        [Required]
        [DataMember(Name="trained_tokens", EmitDefaultValue=true)]
        public int? TrainedTokens { get; set; }

        /// <summary>
        /// The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
        /// </summary>
        /// <value>The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).</value>
        [Required]
        [DataMember(Name="training_file", EmitDefaultValue=false)]
        public string TrainingFile { get; set; }

        /// <summary>
        /// The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
        /// </summary>
        /// <value>The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).</value>
        [Required]
        [DataMember(Name="validation_file", EmitDefaultValue=true)]
        public string ValidationFile { get; set; }

        /// <summary>
        /// A list of integrations to enable for this fine-tuning job.
        /// </summary>
        /// <value>A list of integrations to enable for this fine-tuning job.</value>
        [DataMember(Name="integrations", EmitDefaultValue=true)]
        public List<FineTuningJobIntegrationsInner> Integrations { get; set; }

        /// <summary>
        /// The seed used for the fine-tuning job.
        /// </summary>
        /// <value>The seed used for the fine-tuning job.</value>
        [Required]
        [DataMember(Name="seed", EmitDefaultValue=true)]
        public int Seed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FineTuningJob {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  FineTunedModel: ").Append(FineTunedModel).Append("\n");
            sb.Append("  FinishedAt: ").Append(FinishedAt).Append("\n");
            sb.Append("  Hyperparameters: ").Append(Hyperparameters).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  OrganizationId: ").Append(OrganizationId).Append("\n");
            sb.Append("  ResultFiles: ").Append(ResultFiles).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  TrainedTokens: ").Append(TrainedTokens).Append("\n");
            sb.Append("  TrainingFile: ").Append(TrainingFile).Append("\n");
            sb.Append("  ValidationFile: ").Append(ValidationFile).Append("\n");
            sb.Append("  Integrations: ").Append(Integrations).Append("\n");
            sb.Append("  Seed: ").Append(Seed).Append("\n");
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
            return obj.GetType() == GetType() && Equals((FineTuningJob)obj);
        }

        /// <summary>
        /// Returns true if FineTuningJob instances are equal
        /// </summary>
        /// <param name="other">Instance of FineTuningJob to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FineTuningJob other)
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
                    Error == other.Error ||
                    Error != null &&
                    Error.Equals(other.Error)
                ) && 
                (
                    FineTunedModel == other.FineTunedModel ||
                    FineTunedModel != null &&
                    FineTunedModel.Equals(other.FineTunedModel)
                ) && 
                (
                    FinishedAt == other.FinishedAt ||
                    FinishedAt != null &&
                    FinishedAt.Equals(other.FinishedAt)
                ) && 
                (
                    Hyperparameters == other.Hyperparameters ||
                    Hyperparameters != null &&
                    Hyperparameters.Equals(other.Hyperparameters)
                ) && 
                (
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    VarObject == other.VarObject ||
                    
                    VarObject.Equals(other.VarObject)
                ) && 
                (
                    OrganizationId == other.OrganizationId ||
                    OrganizationId != null &&
                    OrganizationId.Equals(other.OrganizationId)
                ) && 
                (
                    ResultFiles == other.ResultFiles ||
                    ResultFiles != null &&
                    other.ResultFiles != null &&
                    ResultFiles.SequenceEqual(other.ResultFiles)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    TrainedTokens == other.TrainedTokens ||
                    TrainedTokens != null &&
                    TrainedTokens.Equals(other.TrainedTokens)
                ) && 
                (
                    TrainingFile == other.TrainingFile ||
                    TrainingFile != null &&
                    TrainingFile.Equals(other.TrainingFile)
                ) && 
                (
                    ValidationFile == other.ValidationFile ||
                    ValidationFile != null &&
                    ValidationFile.Equals(other.ValidationFile)
                ) && 
                (
                    Integrations == other.Integrations ||
                    Integrations != null &&
                    other.Integrations != null &&
                    Integrations.SequenceEqual(other.Integrations)
                ) && 
                (
                    Seed == other.Seed ||
                    
                    Seed.Equals(other.Seed)
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
                    if (Error != null)
                    hashCode = hashCode * 59 + Error.GetHashCode();
                    if (FineTunedModel != null)
                    hashCode = hashCode * 59 + FineTunedModel.GetHashCode();
                    if (FinishedAt != null)
                    hashCode = hashCode * 59 + FinishedAt.GetHashCode();
                    if (Hyperparameters != null)
                    hashCode = hashCode * 59 + Hyperparameters.GetHashCode();
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    
                    hashCode = hashCode * 59 + VarObject.GetHashCode();
                    if (OrganizationId != null)
                    hashCode = hashCode * 59 + OrganizationId.GetHashCode();
                    if (ResultFiles != null)
                    hashCode = hashCode * 59 + ResultFiles.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (TrainedTokens != null)
                    hashCode = hashCode * 59 + TrainedTokens.GetHashCode();
                    if (TrainingFile != null)
                    hashCode = hashCode * 59 + TrainingFile.GetHashCode();
                    if (ValidationFile != null)
                    hashCode = hashCode * 59 + ValidationFile.GetHashCode();
                    if (Integrations != null)
                    hashCode = hashCode * 59 + Integrations.GetHashCode();
                    
                    hashCode = hashCode * 59 + Seed.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(FineTuningJob left, FineTuningJob right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(FineTuningJob left, FineTuningJob right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}