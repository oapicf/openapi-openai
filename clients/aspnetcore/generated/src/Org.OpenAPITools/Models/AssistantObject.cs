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
    /// Represents an &#x60;assistant&#x60; that can call the model and use tools.
    /// </summary>
    [DataContract]
    public partial class AssistantObject : IEquatable<AssistantObject>
    {
        /// <summary>
        /// The identifier, which can be referenced in API endpoints.
        /// </summary>
        /// <value>The identifier, which can be referenced in API endpoints.</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }


        /// <summary>
        /// The object type, which is always `assistant`.
        /// </summary>
        /// <value>The object type, which is always `assistant`.</value>
        [TypeConverter(typeof(CustomEnumConverter<ObjectEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ObjectEnum
        {
            
            /// <summary>
            /// Enum AssistantEnum for assistant
            /// </summary>
            [EnumMember(Value = "assistant")]
            AssistantEnum = 1
        }

        /// <summary>
        /// The object type, which is always &#x60;assistant&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;assistant&#x60;.</value>
        [Required]
        [DataMember(Name="object", EmitDefaultValue=true)]
        public ObjectEnum VarObject { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the assistant was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the assistant was created.</value>
        [Required]
        [DataMember(Name="created_at", EmitDefaultValue=true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// The name of the assistant. The maximum length is 256 characters. 
        /// </summary>
        /// <value>The name of the assistant. The maximum length is 256 characters. </value>
        [Required]
        [MaxLength(256)]
        [DataMember(Name="name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// The description of the assistant. The maximum length is 512 characters. 
        /// </summary>
        /// <value>The description of the assistant. The maximum length is 512 characters. </value>
        [Required]
        [MaxLength(512)]
        [DataMember(Name="description", EmitDefaultValue=true)]
        public string Description { get; set; }

        /// <summary>
        /// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
        /// </summary>
        /// <value>ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. </value>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public string Model { get; set; }

        /// <summary>
        /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
        /// </summary>
        /// <value>The system instructions that the assistant uses. The maximum length is 256,000 characters. </value>
        [Required]
        [MaxLength(256000)]
        [DataMember(Name="instructions", EmitDefaultValue=true)]
        public string Instructions { get; set; }

        /// <summary>
        /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
        /// </summary>
        /// <value>A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. </value>
        [Required]
        [DataMember(Name="tools", EmitDefaultValue=false)]
        public List<AssistantObjectToolsInner> Tools { get; set; }

        /// <summary>
        /// A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
        /// </summary>
        /// <value>A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. </value>
        [Required]
        [DataMember(Name="file_ids", EmitDefaultValue=false)]
        public List<string> FileIds { get; set; }

        /// <summary>
        /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
        /// </summary>
        /// <value>Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. </value>
        [Required]
        [DataMember(Name="metadata", EmitDefaultValue=true)]
        public Object Metadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AssistantObject {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Instructions: ").Append(Instructions).Append("\n");
            sb.Append("  Tools: ").Append(Tools).Append("\n");
            sb.Append("  FileIds: ").Append(FileIds).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AssistantObject)obj);
        }

        /// <summary>
        /// Returns true if AssistantObject instances are equal
        /// </summary>
        /// <param name="other">Instance of AssistantObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AssistantObject other)
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
                    VarObject == other.VarObject ||
                    
                    VarObject.Equals(other.VarObject)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    Instructions == other.Instructions ||
                    Instructions != null &&
                    Instructions.Equals(other.Instructions)
                ) && 
                (
                    Tools == other.Tools ||
                    Tools != null &&
                    other.Tools != null &&
                    Tools.SequenceEqual(other.Tools)
                ) && 
                (
                    FileIds == other.FileIds ||
                    FileIds != null &&
                    other.FileIds != null &&
                    FileIds.SequenceEqual(other.FileIds)
                ) && 
                (
                    Metadata == other.Metadata ||
                    Metadata != null &&
                    Metadata.Equals(other.Metadata)
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
                    
                    hashCode = hashCode * 59 + VarObject.GetHashCode();
                    
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (Instructions != null)
                    hashCode = hashCode * 59 + Instructions.GetHashCode();
                    if (Tools != null)
                    hashCode = hashCode * 59 + Tools.GetHashCode();
                    if (FileIds != null)
                    hashCode = hashCode * 59 + FileIds.GetHashCode();
                    if (Metadata != null)
                    hashCode = hashCode * 59 + Metadata.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AssistantObject left, AssistantObject right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AssistantObject left, AssistantObject right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
