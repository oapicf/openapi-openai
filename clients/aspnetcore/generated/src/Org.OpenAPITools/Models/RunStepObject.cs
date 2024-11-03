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
    /// Represents a step in execution of a run. 
    /// </summary>
    [DataContract]
    public partial class RunStepObject : IEquatable<RunStepObject>
    {
        /// <summary>
        /// The identifier of the run step, which can be referenced in API endpoints.
        /// </summary>
        /// <value>The identifier of the run step, which can be referenced in API endpoints.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }


        /// <summary>
        /// The object type, which is always `thread.run.step`.
        /// </summary>
        /// <value>The object type, which is always `thread.run.step`.</value>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum ThreadRunStepEnum for thread.run.step
            /// </summary>
            [EnumMember(Value = "thread.run.step")]
            ThreadRunStepEnum = 1
        }

        /// <summary>
        /// The object type, which is always &#x60;thread.run.step&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;thread.run.step&#x60;.</value>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum Object { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the run step was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the run step was created.</value>
        [Required]
        [DataMember(Name="created_at", EmitDefaultValue=true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
        /// </summary>
        /// <value>The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.</value>
        [Required]
        [DataMember(Name="assistant_id", EmitDefaultValue=false)]
        public string AssistantId { get; set; }

        /// <summary>
        /// The ID of the [thread](/docs/api-reference/threads) that was run.
        /// </summary>
        /// <value>The ID of the [thread](/docs/api-reference/threads) that was run.</value>
        [Required]
        [DataMember(Name="thread_id", EmitDefaultValue=false)]
        public string ThreadId { get; set; }

        /// <summary>
        /// The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
        /// </summary>
        /// <value>The ID of the [run](/docs/api-reference/runs) that this run step is a part of.</value>
        [Required]
        [DataMember(Name="run_id", EmitDefaultValue=false)]
        public string RunId { get; set; }


        /// <summary>
        /// The type of run step, which can be either `message_creation` or `tool_calls`.
        /// </summary>
        /// <value>The type of run step, which can be either `message_creation` or `tool_calls`.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum MessageCreationEnum for message_creation
            /// </summary>
            [EnumMember(Value = "message_creation")]
            MessageCreationEnum = 1,
            
            /// <summary>
            /// Enum ToolCallsEnum for tool_calls
            /// </summary>
            [EnumMember(Value = "tool_calls")]
            ToolCallsEnum = 2
        }

        /// <summary>
        /// The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
        /// </summary>
        /// <value>The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }


        /// <summary>
        /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
        /// </summary>
        /// <value>The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.</value>
        [TypeConverter(typeof(CustomEnumConverter<StatusEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum InProgressEnum for in_progress
            /// </summary>
            [EnumMember(Value = "in_progress")]
            InProgressEnum = 1,
            
            /// <summary>
            /// Enum CancelledEnum for cancelled
            /// </summary>
            [EnumMember(Value = "cancelled")]
            CancelledEnum = 2,
            
            /// <summary>
            /// Enum FailedEnum for failed
            /// </summary>
            [EnumMember(Value = "failed")]
            FailedEnum = 3,
            
            /// <summary>
            /// Enum CompletedEnum for completed
            /// </summary>
            [EnumMember(Value = "completed")]
            CompletedEnum = 4,
            
            /// <summary>
            /// Enum ExpiredEnum for expired
            /// </summary>
            [EnumMember(Value = "expired")]
            ExpiredEnum = 5
        }

        /// <summary>
        /// The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
        /// </summary>
        /// <value>The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.</value>
        [Required]
        [DataMember(Name="status", EmitDefaultValue=true)]
        public StatusEnum Status { get; set; }

        /// <summary>
        /// Gets or Sets StepDetails
        /// </summary>
        [Required]
        [DataMember(Name="step_details", EmitDefaultValue=false)]
        public RunStepObjectStepDetails StepDetails { get; set; }

        /// <summary>
        /// Gets or Sets LastError
        /// </summary>
        [Required]
        [DataMember(Name="last_error", EmitDefaultValue=true)]
        public RunStepObjectLastError LastError { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.</value>
        [Required]
        [DataMember(Name="expired_at", EmitDefaultValue=true)]
        public int? ExpiredAt { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the run step was cancelled.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the run step was cancelled.</value>
        [Required]
        [DataMember(Name="cancelled_at", EmitDefaultValue=true)]
        public int? CancelledAt { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the run step failed.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the run step failed.</value>
        [Required]
        [DataMember(Name="failed_at", EmitDefaultValue=true)]
        public int? FailedAt { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the run step completed.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the run step completed.</value>
        [Required]
        [DataMember(Name="completed_at", EmitDefaultValue=true)]
        public int? CompletedAt { get; set; }

        /// <summary>
        /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
        /// </summary>
        /// <value>Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. </value>
        [Required]
        [DataMember(Name="metadata", EmitDefaultValue=true)]
        public Object Metadata { get; set; }

        /// <summary>
        /// Gets or Sets Usage
        /// </summary>
        [Required]
        [DataMember(Name="usage", EmitDefaultValue=true)]
        public RunStepCompletionUsage Usage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepObject {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  AssistantId: ").Append(AssistantId).Append("\n");
            sb.Append("  ThreadId: ").Append(ThreadId).Append("\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  StepDetails: ").Append(StepDetails).Append("\n");
            sb.Append("  LastError: ").Append(LastError).Append("\n");
            sb.Append("  ExpiredAt: ").Append(ExpiredAt).Append("\n");
            sb.Append("  CancelledAt: ").Append(CancelledAt).Append("\n");
            sb.Append("  FailedAt: ").Append(FailedAt).Append("\n");
            sb.Append("  CompletedAt: ").Append(CompletedAt).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Usage: ").Append(Usage).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RunStepObject)obj);
        }

        /// <summary>
        /// Returns true if RunStepObject instances are equal
        /// </summary>
        /// <param name="other">Instance of RunStepObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RunStepObject other)
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
                    Object == other.Object ||
                    
                    Object.Equals(other.Object)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    AssistantId == other.AssistantId ||
                    AssistantId != null &&
                    AssistantId.Equals(other.AssistantId)
                ) && 
                (
                    ThreadId == other.ThreadId ||
                    ThreadId != null &&
                    ThreadId.Equals(other.ThreadId)
                ) && 
                (
                    RunId == other.RunId ||
                    RunId != null &&
                    RunId.Equals(other.RunId)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    StepDetails == other.StepDetails ||
                    StepDetails != null &&
                    StepDetails.Equals(other.StepDetails)
                ) && 
                (
                    LastError == other.LastError ||
                    LastError != null &&
                    LastError.Equals(other.LastError)
                ) && 
                (
                    ExpiredAt == other.ExpiredAt ||
                    ExpiredAt != null &&
                    ExpiredAt.Equals(other.ExpiredAt)
                ) && 
                (
                    CancelledAt == other.CancelledAt ||
                    CancelledAt != null &&
                    CancelledAt.Equals(other.CancelledAt)
                ) && 
                (
                    FailedAt == other.FailedAt ||
                    FailedAt != null &&
                    FailedAt.Equals(other.FailedAt)
                ) && 
                (
                    CompletedAt == other.CompletedAt ||
                    CompletedAt != null &&
                    CompletedAt.Equals(other.CompletedAt)
                ) && 
                (
                    Metadata == other.Metadata ||
                    Metadata != null &&
                    Metadata.Equals(other.Metadata)
                ) && 
                (
                    Usage == other.Usage ||
                    Usage != null &&
                    Usage.Equals(other.Usage)
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
                    
                    hashCode = hashCode * 59 + Object.GetHashCode();
                    
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (AssistantId != null)
                    hashCode = hashCode * 59 + AssistantId.GetHashCode();
                    if (ThreadId != null)
                    hashCode = hashCode * 59 + ThreadId.GetHashCode();
                    if (RunId != null)
                    hashCode = hashCode * 59 + RunId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (StepDetails != null)
                    hashCode = hashCode * 59 + StepDetails.GetHashCode();
                    if (LastError != null)
                    hashCode = hashCode * 59 + LastError.GetHashCode();
                    if (ExpiredAt != null)
                    hashCode = hashCode * 59 + ExpiredAt.GetHashCode();
                    if (CancelledAt != null)
                    hashCode = hashCode * 59 + CancelledAt.GetHashCode();
                    if (FailedAt != null)
                    hashCode = hashCode * 59 + FailedAt.GetHashCode();
                    if (CompletedAt != null)
                    hashCode = hashCode * 59 + CompletedAt.GetHashCode();
                    if (Metadata != null)
                    hashCode = hashCode * 59 + Metadata.GetHashCode();
                    if (Usage != null)
                    hashCode = hashCode * 59 + Usage.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RunStepObject left, RunStepObject right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RunStepObject left, RunStepObject right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
