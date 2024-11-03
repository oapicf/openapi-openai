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
    /// ModifyAssistantRequest
    /// </summary>
    [DataContract(Name = "ModifyAssistantRequest")]
    public partial class ModifyAssistantRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModifyAssistantRequest" /> class.
        /// </summary>
        /// <param name="model">model.</param>
        /// <param name="name">The name of the assistant. The maximum length is 256 characters. .</param>
        /// <param name="description">The description of the assistant. The maximum length is 512 characters. .</param>
        /// <param name="instructions">The system instructions that the assistant uses. The maximum length is 256,000 characters. .</param>
        /// <param name="tools">A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. .</param>
        /// <param name="fileIds">A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. .</param>
        /// <param name="metadata">Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. .</param>
        public ModifyAssistantRequest(string model = default(string), string name = default(string), string description = default(string), string instructions = default(string), List<AssistantObjectToolsInner> tools = default(List<AssistantObjectToolsInner>), List<string> fileIds = default(List<string>), Object metadata = default(Object))
        {
            this.Model = model;
            this.Name = name;
            this.Description = description;
            this.Instructions = instructions;
            this.Tools = tools;
            this.FileIds = fileIds;
            this.Metadata = metadata;
        }

        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [DataMember(Name = "model", EmitDefaultValue = false)]
        public string Model { get; set; }

        /// <summary>
        /// The name of the assistant. The maximum length is 256 characters. 
        /// </summary>
        /// <value>The name of the assistant. The maximum length is 256 characters. </value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The description of the assistant. The maximum length is 512 characters. 
        /// </summary>
        /// <value>The description of the assistant. The maximum length is 512 characters. </value>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
        /// </summary>
        /// <value>The system instructions that the assistant uses. The maximum length is 256,000 characters. </value>
        [DataMember(Name = "instructions", EmitDefaultValue = true)]
        public string Instructions { get; set; }

        /// <summary>
        /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
        /// </summary>
        /// <value>A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. </value>
        [DataMember(Name = "tools", EmitDefaultValue = false)]
        public List<AssistantObjectToolsInner> Tools { get; set; }

        /// <summary>
        /// A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
        /// </summary>
        /// <value>A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. </value>
        [DataMember(Name = "file_ids", EmitDefaultValue = false)]
        public List<string> FileIds { get; set; }

        /// <summary>
        /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
        /// </summary>
        /// <value>Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. </value>
        [DataMember(Name = "metadata", EmitDefaultValue = true)]
        public Object Metadata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
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
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Name (string) maxLength
            if (this.Name != null && this.Name.Length > 256)
            {
                yield return new ValidationResult("Invalid value for Name, length must be less than 256.", new [] { "Name" });
            }

            // Description (string) maxLength
            if (this.Description != null && this.Description.Length > 512)
            {
                yield return new ValidationResult("Invalid value for Description, length must be less than 512.", new [] { "Description" });
            }

            // Instructions (string) maxLength
            if (this.Instructions != null && this.Instructions.Length > 256000)
            {
                yield return new ValidationResult("Invalid value for Instructions, length must be less than 256000.", new [] { "Instructions" });
            }

            yield break;
        }
    }

}
