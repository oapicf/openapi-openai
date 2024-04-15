/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Represents a message within a [thread](/docs/api-reference/threads).
    /// </summary>
    [DataContract(Name = "MessageObject")]
    public partial class MessageObject : IValidatableObject
    {
        /// <summary>
        /// The object type, which is always &#x60;thread.message&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;thread.message&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ObjectEnum
        {
            /// <summary>
            /// Enum ThreadMessage for value: thread.message
            /// </summary>
            [EnumMember(Value = "thread.message")]
            ThreadMessage = 1
        }


        /// <summary>
        /// The object type, which is always &#x60;thread.message&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;thread.message&#x60;.</value>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public ObjectEnum VarObject { get; set; }
        /// <summary>
        /// The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
        /// </summary>
        /// <value>The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum InProgress for value: in_progress
            /// </summary>
            [EnumMember(Value = "in_progress")]
            InProgress = 1,

            /// <summary>
            /// Enum Incomplete for value: incomplete
            /// </summary>
            [EnumMember(Value = "incomplete")]
            Incomplete = 2,

            /// <summary>
            /// Enum Completed for value: completed
            /// </summary>
            [EnumMember(Value = "completed")]
            Completed = 3
        }


        /// <summary>
        /// The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
        /// </summary>
        /// <value>The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public StatusEnum Status { get; set; }
        /// <summary>
        /// The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
        /// </summary>
        /// <value>The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum User for value: user
            /// </summary>
            [EnumMember(Value = "user")]
            User = 1,

            /// <summary>
            /// Enum Assistant for value: assistant
            /// </summary>
            [EnumMember(Value = "assistant")]
            Assistant = 2
        }


        /// <summary>
        /// The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
        /// </summary>
        /// <value>The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.</value>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public RoleEnum Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MessageObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageObject" /> class.
        /// </summary>
        /// <param name="id">The identifier, which can be referenced in API endpoints. (required).</param>
        /// <param name="varObject">The object type, which is always &#x60;thread.message&#x60;. (required).</param>
        /// <param name="createdAt">The Unix timestamp (in seconds) for when the message was created. (required).</param>
        /// <param name="threadId">The [thread](/docs/api-reference/threads) ID that this message belongs to. (required).</param>
        /// <param name="status">The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. (required).</param>
        /// <param name="incompleteDetails">incompleteDetails (required).</param>
        /// <param name="completedAt">The Unix timestamp (in seconds) for when the message was completed. (required).</param>
        /// <param name="incompleteAt">The Unix timestamp (in seconds) for when the message was marked as incomplete. (required).</param>
        /// <param name="role">The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. (required).</param>
        /// <param name="content">The content of the message in array of text and/or images. (required).</param>
        /// <param name="assistantId">If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. (required).</param>
        /// <param name="runId">The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. (required).</param>
        /// <param name="fileIds">A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. (required).</param>
        /// <param name="metadata">Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  (required).</param>
        public MessageObject(string id = default(string), ObjectEnum varObject = default(ObjectEnum), int createdAt = default(int), string threadId = default(string), StatusEnum status = default(StatusEnum), MessageObjectIncompleteDetails incompleteDetails = default(MessageObjectIncompleteDetails), int? completedAt = default(int?), int? incompleteAt = default(int?), RoleEnum role = default(RoleEnum), List<MessageObjectContentInner> content = default(List<MessageObjectContentInner>), string assistantId = default(string), string runId = default(string), List<string> fileIds = default(List<string>), Object metadata = default(Object))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for MessageObject and cannot be null");
            }
            this.Id = id;
            this.VarObject = varObject;
            this.CreatedAt = createdAt;
            // to ensure "threadId" is required (not null)
            if (threadId == null)
            {
                throw new ArgumentNullException("threadId is a required property for MessageObject and cannot be null");
            }
            this.ThreadId = threadId;
            this.Status = status;
            // to ensure "incompleteDetails" is required (not null)
            if (incompleteDetails == null)
            {
                throw new ArgumentNullException("incompleteDetails is a required property for MessageObject and cannot be null");
            }
            this.IncompleteDetails = incompleteDetails;
            // to ensure "completedAt" is required (not null)
            if (completedAt == null)
            {
                throw new ArgumentNullException("completedAt is a required property for MessageObject and cannot be null");
            }
            this.CompletedAt = completedAt;
            // to ensure "incompleteAt" is required (not null)
            if (incompleteAt == null)
            {
                throw new ArgumentNullException("incompleteAt is a required property for MessageObject and cannot be null");
            }
            this.IncompleteAt = incompleteAt;
            this.Role = role;
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for MessageObject and cannot be null");
            }
            this.Content = content;
            // to ensure "assistantId" is required (not null)
            if (assistantId == null)
            {
                throw new ArgumentNullException("assistantId is a required property for MessageObject and cannot be null");
            }
            this.AssistantId = assistantId;
            // to ensure "runId" is required (not null)
            if (runId == null)
            {
                throw new ArgumentNullException("runId is a required property for MessageObject and cannot be null");
            }
            this.RunId = runId;
            // to ensure "fileIds" is required (not null)
            if (fileIds == null)
            {
                throw new ArgumentNullException("fileIds is a required property for MessageObject and cannot be null");
            }
            this.FileIds = fileIds;
            // to ensure "metadata" is required (not null)
            if (metadata == null)
            {
                throw new ArgumentNullException("metadata is a required property for MessageObject and cannot be null");
            }
            this.Metadata = metadata;
        }

        /// <summary>
        /// The identifier, which can be referenced in API endpoints.
        /// </summary>
        /// <value>The identifier, which can be referenced in API endpoints.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the message was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the message was created.</value>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// The [thread](/docs/api-reference/threads) ID that this message belongs to.
        /// </summary>
        /// <value>The [thread](/docs/api-reference/threads) ID that this message belongs to.</value>
        [DataMember(Name = "thread_id", IsRequired = true, EmitDefaultValue = true)]
        public string ThreadId { get; set; }

        /// <summary>
        /// Gets or Sets IncompleteDetails
        /// </summary>
        [DataMember(Name = "incomplete_details", IsRequired = true, EmitDefaultValue = true)]
        public MessageObjectIncompleteDetails IncompleteDetails { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the message was completed.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the message was completed.</value>
        [DataMember(Name = "completed_at", IsRequired = true, EmitDefaultValue = true)]
        public int? CompletedAt { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the message was marked as incomplete.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the message was marked as incomplete.</value>
        [DataMember(Name = "incomplete_at", IsRequired = true, EmitDefaultValue = true)]
        public int? IncompleteAt { get; set; }

        /// <summary>
        /// The content of the message in array of text and/or images.
        /// </summary>
        /// <value>The content of the message in array of text and/or images.</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public List<MessageObjectContentInner> Content { get; set; }

        /// <summary>
        /// If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
        /// </summary>
        /// <value>If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.</value>
        [DataMember(Name = "assistant_id", IsRequired = true, EmitDefaultValue = true)]
        public string AssistantId { get; set; }

        /// <summary>
        /// The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
        /// </summary>
        /// <value>The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.</value>
        [DataMember(Name = "run_id", IsRequired = true, EmitDefaultValue = true)]
        public string RunId { get; set; }

        /// <summary>
        /// A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
        /// </summary>
        /// <value>A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.</value>
        [DataMember(Name = "file_ids", IsRequired = true, EmitDefaultValue = true)]
        public List<string> FileIds { get; set; }

        /// <summary>
        /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
        /// </summary>
        /// <value>Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. </value>
        [DataMember(Name = "metadata", IsRequired = true, EmitDefaultValue = true)]
        public Object Metadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessageObject {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  ThreadId: ").Append(ThreadId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  IncompleteDetails: ").Append(IncompleteDetails).Append("\n");
            sb.Append("  CompletedAt: ").Append(CompletedAt).Append("\n");
            sb.Append("  IncompleteAt: ").Append(IncompleteAt).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  AssistantId: ").Append(AssistantId).Append("\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
            sb.Append("  FileIds: ").Append(FileIds).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}