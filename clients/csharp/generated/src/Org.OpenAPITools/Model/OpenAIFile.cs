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
    /// The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
    /// </summary>
    [DataContract(Name = "OpenAIFile")]
    public partial class OpenAIFile : IValidatableObject
    {
        /// <summary>
        /// The object type, which is always &#x60;file&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;file&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ObjectEnum
        {
            /// <summary>
            /// Enum File for value: file
            /// </summary>
            [EnumMember(Value = "file")]
            File = 1
        }


        /// <summary>
        /// The object type, which is always &#x60;file&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;file&#x60;.</value>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public ObjectEnum VarObject { get; set; }
        /// <summary>
        /// The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.
        /// </summary>
        /// <value>The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PurposeEnum
        {
            /// <summary>
            /// Enum FineTune for value: fine-tune
            /// </summary>
            [EnumMember(Value = "fine-tune")]
            FineTune = 1,

            /// <summary>
            /// Enum FineTuneResults for value: fine-tune-results
            /// </summary>
            [EnumMember(Value = "fine-tune-results")]
            FineTuneResults = 2,

            /// <summary>
            /// Enum Assistants for value: assistants
            /// </summary>
            [EnumMember(Value = "assistants")]
            Assistants = 3,

            /// <summary>
            /// Enum AssistantsOutput for value: assistants_output
            /// </summary>
            [EnumMember(Value = "assistants_output")]
            AssistantsOutput = 4
        }


        /// <summary>
        /// The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.
        /// </summary>
        /// <value>The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.</value>
        [DataMember(Name = "purpose", IsRequired = true, EmitDefaultValue = true)]
        public PurposeEnum Purpose { get; set; }
        /// <summary>
        /// Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
        /// </summary>
        /// <value>Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Uploaded for value: uploaded
            /// </summary>
            [EnumMember(Value = "uploaded")]
            Uploaded = 1,

            /// <summary>
            /// Enum Processed for value: processed
            /// </summary>
            [EnumMember(Value = "processed")]
            Processed = 2,

            /// <summary>
            /// Enum Error for value: error
            /// </summary>
            [EnumMember(Value = "error")]
            Error = 3
        }


        /// <summary>
        /// Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
        /// </summary>
        /// <value>Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        [Obsolete]
        public StatusEnum Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenAIFile" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OpenAIFile() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenAIFile" /> class.
        /// </summary>
        /// <param name="id">The file identifier, which can be referenced in the API endpoints. (required).</param>
        /// <param name="bytes">The size of the file, in bytes. (required).</param>
        /// <param name="createdAt">The Unix timestamp (in seconds) for when the file was created. (required).</param>
        /// <param name="filename">The name of the file. (required).</param>
        /// <param name="varObject">The object type, which is always &#x60;file&#x60;. (required).</param>
        /// <param name="purpose">The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;. (required).</param>
        /// <param name="status">Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. (required).</param>
        /// <param name="statusDetails">Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;..</param>
        public OpenAIFile(string id = default(string), int bytes = default(int), int createdAt = default(int), string filename = default(string), ObjectEnum varObject = default(ObjectEnum), PurposeEnum purpose = default(PurposeEnum), StatusEnum status = default(StatusEnum), string statusDetails = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for OpenAIFile and cannot be null");
            }
            this.Id = id;
            this.Bytes = bytes;
            this.CreatedAt = createdAt;
            // to ensure "filename" is required (not null)
            if (filename == null)
            {
                throw new ArgumentNullException("filename is a required property for OpenAIFile and cannot be null");
            }
            this.Filename = filename;
            this.VarObject = varObject;
            this.Purpose = purpose;
            this.Status = status;
            this.StatusDetails = statusDetails;
        }

        /// <summary>
        /// The file identifier, which can be referenced in the API endpoints.
        /// </summary>
        /// <value>The file identifier, which can be referenced in the API endpoints.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// The size of the file, in bytes.
        /// </summary>
        /// <value>The size of the file, in bytes.</value>
        [DataMember(Name = "bytes", IsRequired = true, EmitDefaultValue = true)]
        public int Bytes { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) for when the file was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) for when the file was created.</value>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = true)]
        public int CreatedAt { get; set; }

        /// <summary>
        /// The name of the file.
        /// </summary>
        /// <value>The name of the file.</value>
        [DataMember(Name = "filename", IsRequired = true, EmitDefaultValue = true)]
        public string Filename { get; set; }

        /// <summary>
        /// Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
        /// </summary>
        /// <value>Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.</value>
        [DataMember(Name = "status_details", EmitDefaultValue = false)]
        [Obsolete]
        public string StatusDetails { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenAIFile {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Bytes: ").Append(Bytes).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  StatusDetails: ").Append(StatusDetails).Append("\n");
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
