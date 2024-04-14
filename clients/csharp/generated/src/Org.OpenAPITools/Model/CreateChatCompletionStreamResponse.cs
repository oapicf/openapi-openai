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
    /// Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
    /// </summary>
    [DataContract(Name = "CreateChatCompletionStreamResponse")]
    public partial class CreateChatCompletionStreamResponse : IValidatableObject
    {
        /// <summary>
        /// The object type, which is always &#x60;chat.completion.chunk&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;chat.completion.chunk&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ObjectEnum
        {
            /// <summary>
            /// Enum ChatCompletionChunk for value: chat.completion.chunk
            /// </summary>
            [EnumMember(Value = "chat.completion.chunk")]
            ChatCompletionChunk = 1
        }


        /// <summary>
        /// The object type, which is always &#x60;chat.completion.chunk&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;chat.completion.chunk&#x60;.</value>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public ObjectEnum VarObject { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateChatCompletionStreamResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateChatCompletionStreamResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateChatCompletionStreamResponse" /> class.
        /// </summary>
        /// <param name="id">A unique identifier for the chat completion. Each chunk has the same ID. (required).</param>
        /// <param name="choices">A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. (required).</param>
        /// <param name="created">The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. (required).</param>
        /// <param name="model">The model to generate the completion. (required).</param>
        /// <param name="systemFingerprint">This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. .</param>
        /// <param name="varObject">The object type, which is always &#x60;chat.completion.chunk&#x60;. (required).</param>
        public CreateChatCompletionStreamResponse(string id = default(string), List<CreateChatCompletionStreamResponseChoicesInner> choices = default(List<CreateChatCompletionStreamResponseChoicesInner>), int created = default(int), string model = default(string), string systemFingerprint = default(string), ObjectEnum varObject = default(ObjectEnum))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for CreateChatCompletionStreamResponse and cannot be null");
            }
            this.Id = id;
            // to ensure "choices" is required (not null)
            if (choices == null)
            {
                throw new ArgumentNullException("choices is a required property for CreateChatCompletionStreamResponse and cannot be null");
            }
            this.Choices = choices;
            this.Created = created;
            // to ensure "model" is required (not null)
            if (model == null)
            {
                throw new ArgumentNullException("model is a required property for CreateChatCompletionStreamResponse and cannot be null");
            }
            this.Model = model;
            this.VarObject = varObject;
            this.SystemFingerprint = systemFingerprint;
        }

        /// <summary>
        /// A unique identifier for the chat completion. Each chunk has the same ID.
        /// </summary>
        /// <value>A unique identifier for the chat completion. Each chunk has the same ID.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
        /// </summary>
        /// <value>A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.</value>
        [DataMember(Name = "choices", IsRequired = true, EmitDefaultValue = true)]
        public List<CreateChatCompletionStreamResponseChoicesInner> Choices { get; set; }

        /// <summary>
        /// The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
        /// </summary>
        /// <value>The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.</value>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public int Created { get; set; }

        /// <summary>
        /// The model to generate the completion.
        /// </summary>
        /// <value>The model to generate the completion.</value>
        [DataMember(Name = "model", IsRequired = true, EmitDefaultValue = true)]
        public string Model { get; set; }

        /// <summary>
        /// This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
        /// </summary>
        /// <value>This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. </value>
        [DataMember(Name = "system_fingerprint", EmitDefaultValue = false)]
        public string SystemFingerprint { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateChatCompletionStreamResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Choices: ").Append(Choices).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  SystemFingerprint: ").Append(SystemFingerprint).Append("\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
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
