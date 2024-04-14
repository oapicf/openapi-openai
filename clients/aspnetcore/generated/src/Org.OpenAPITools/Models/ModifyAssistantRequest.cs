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
    /// 
    /// </summary>
    [DataContract]
    public partial class ModifyAssistantRequest : IEquatable<ModifyAssistantRequest>
    {
        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [DataMember(Name="model", EmitDefaultValue=false)]
        public string Model { get; set; }

        /// <summary>
        /// The name of the assistant. The maximum length is 256 characters. 
        /// </summary>
        /// <value>The name of the assistant. The maximum length is 256 characters. </value>
        [MaxLength(256)]
        [DataMember(Name="name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// The description of the assistant. The maximum length is 512 characters. 
        /// </summary>
        /// <value>The description of the assistant. The maximum length is 512 characters. </value>
        [MaxLength(512)]
        [DataMember(Name="description", EmitDefaultValue=true)]
        public string Description { get; set; }

        /// <summary>
        /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
        /// </summary>
        /// <value>The system instructions that the assistant uses. The maximum length is 256,000 characters. </value>
        [MaxLength(256000)]
        [DataMember(Name="instructions", EmitDefaultValue=true)]
        public string Instructions { get; set; }

        /// <summary>
        /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
        /// </summary>
        /// <value>A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. </value>
        [DataMember(Name="tools", EmitDefaultValue=false)]
        public List<AssistantObjectToolsInner> Tools { get; set; }

        /// <summary>
        /// A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
        /// </summary>
        /// <value>A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. </value>
        [DataMember(Name="file_ids", EmitDefaultValue=false)]
        public List<string> FileIds { get; set; }

        /// <summary>
        /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
        /// </summary>
        /// <value>Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. </value>
        [DataMember(Name="metadata", EmitDefaultValue=true)]
        public Object Metadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModifyAssistantRequest {\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ModifyAssistantRequest)obj);
        }

        /// <summary>
        /// Returns true if ModifyAssistantRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of ModifyAssistantRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModifyAssistantRequest other)
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
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
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

        public static bool operator ==(ModifyAssistantRequest left, ModifyAssistantRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ModifyAssistantRequest left, ModifyAssistantRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
