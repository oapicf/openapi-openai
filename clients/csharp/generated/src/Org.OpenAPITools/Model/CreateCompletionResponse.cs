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
    /// Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
    /// </summary>
    [DataContract(Name = "CreateCompletionResponse")]
    public partial class CreateCompletionResponse : IValidatableObject
    {
        /// <summary>
        /// The object type, which is always \&quot;text_completion\&quot;
        /// </summary>
        /// <value>The object type, which is always \&quot;text_completion\&quot;</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ObjectEnum
        {
            /// <summary>
            /// Enum TextCompletion for value: text_completion
            /// </summary>
            [EnumMember(Value = "text_completion")]
            TextCompletion = 1
        }


        /// <summary>
        /// The object type, which is always \&quot;text_completion\&quot;
        /// </summary>
        /// <value>The object type, which is always \&quot;text_completion\&quot;</value>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public ObjectEnum Object { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCompletionResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateCompletionResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCompletionResponse" /> class.
        /// </summary>
        /// <param name="id">A unique identifier for the completion. (required).</param>
        /// <param name="choices">The list of completion choices the model generated for the input prompt. (required).</param>
        /// <param name="created">The Unix timestamp (in seconds) of when the completion was created. (required).</param>
        /// <param name="model">The model used for completion. (required).</param>
        /// <param name="systemFingerprint">This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. .</param>
        /// <param name="varObject">The object type, which is always \&quot;text_completion\&quot; (required).</param>
        /// <param name="usage">usage.</param>
        public CreateCompletionResponse(string id = default(string), List<CreateCompletionResponseChoicesInner> choices = default(List<CreateCompletionResponseChoicesInner>), int created = default(int), string model = default(string), string systemFingerprint = default(string), ObjectEnum varObject = default(ObjectEnum), CompletionUsage usage = default(CompletionUsage))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for CreateCompletionResponse and cannot be null");
            }
            this.Id = id;
            // to ensure "choices" is required (not null)
            if (choices == null)
            {
                throw new ArgumentNullException("choices is a required property for CreateCompletionResponse and cannot be null");
            }
            this.Choices = choices;
            this.Created = created;
            // to ensure "model" is required (not null)
            if (model == null)
            {
                throw new ArgumentNullException("model is a required property for CreateCompletionResponse and cannot be null");
            }
            this.Model = model;
            this.Object = varObject;
            this.SystemFingerprint = systemFingerprint;
            this.Usage = usage;
        }

        /// <summary>
        /// A unique identifier for the completion.
        /// </summary>
        /// <value>A unique identifier for the completion.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// The list of completion choices the model generated for the input prompt.
        /// </summary>
        /// <value>The list of completion choices the model generated for the input prompt.</value>
        [DataMember(Name = "choices", IsRequired = true, EmitDefaultValue = true)]
        public List<CreateCompletionResponseChoicesInner> Choices { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) of when the completion was created.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) of when the completion was created.</value>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public int Created { get; set; }

        /// <summary>
        /// The model used for completion.
        /// </summary>
        /// <value>The model used for completion.</value>
        [DataMember(Name = "model", IsRequired = true, EmitDefaultValue = true)]
        public string Model { get; set; }

        /// <summary>
        /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
        /// </summary>
        /// <value>This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. </value>
        [DataMember(Name = "system_fingerprint", EmitDefaultValue = false)]
        public string SystemFingerprint { get; set; }

        /// <summary>
        /// Gets or Sets Usage
        /// </summary>
        [DataMember(Name = "usage", EmitDefaultValue = false)]
        public CompletionUsage Usage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateCompletionResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Choices: ").Append(Choices).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  SystemFingerprint: ").Append(SystemFingerprint).Append("\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
            sb.Append("  Usage: ").Append(Usage).Append("\n");
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
