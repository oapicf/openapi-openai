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
    /// MessageContentTextAnnotationsFileCitationObjectFileCitation
    /// </summary>
    [DataContract(Name = "MessageContentTextAnnotationsFileCitationObject_file_citation")]
    public partial class MessageContentTextAnnotationsFileCitationObjectFileCitation : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageContentTextAnnotationsFileCitationObjectFileCitation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MessageContentTextAnnotationsFileCitationObjectFileCitation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageContentTextAnnotationsFileCitationObjectFileCitation" /> class.
        /// </summary>
        /// <param name="fileId">The ID of the specific File the citation is from. (required).</param>
        /// <param name="quote">The specific quote in the file. (required).</param>
        public MessageContentTextAnnotationsFileCitationObjectFileCitation(string fileId = default(string), string quote = default(string))
        {
            // to ensure "fileId" is required (not null)
            if (fileId == null)
            {
                throw new ArgumentNullException("fileId is a required property for MessageContentTextAnnotationsFileCitationObjectFileCitation and cannot be null");
            }
            this.FileId = fileId;
            // to ensure "quote" is required (not null)
            if (quote == null)
            {
                throw new ArgumentNullException("quote is a required property for MessageContentTextAnnotationsFileCitationObjectFileCitation and cannot be null");
            }
            this.Quote = quote;
        }

        /// <summary>
        /// The ID of the specific File the citation is from.
        /// </summary>
        /// <value>The ID of the specific File the citation is from.</value>
        [DataMember(Name = "file_id", IsRequired = true, EmitDefaultValue = true)]
        public string FileId { get; set; }

        /// <summary>
        /// The specific quote in the file.
        /// </summary>
        /// <value>The specific quote in the file.</value>
        [DataMember(Name = "quote", IsRequired = true, EmitDefaultValue = true)]
        public string Quote { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessageContentTextAnnotationsFileCitationObjectFileCitation {\n");
            sb.Append("  FileId: ").Append(FileId).Append("\n");
            sb.Append("  Quote: ").Append(Quote).Append("\n");
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
            yield break;
        }
    }

}
