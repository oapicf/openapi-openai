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
    /// ChatCompletionRequestMessageContentPartImage
    /// </summary>
    [DataContract(Name = "ChatCompletionRequestMessageContentPartImage")]
    public partial class ChatCompletionRequestMessageContentPartImage : IValidatableObject
    {
        /// <summary>
        /// The type of the content part.
        /// </summary>
        /// <value>The type of the content part.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum ImageUrl for value: image_url
            /// </summary>
            [EnumMember(Value = "image_url")]
            ImageUrl = 1
        }


        /// <summary>
        /// The type of the content part.
        /// </summary>
        /// <value>The type of the content part.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestMessageContentPartImage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChatCompletionRequestMessageContentPartImage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatCompletionRequestMessageContentPartImage" /> class.
        /// </summary>
        /// <param name="type">The type of the content part. (required).</param>
        /// <param name="imageUrl">imageUrl (required).</param>
        public ChatCompletionRequestMessageContentPartImage(TypeEnum type = default(TypeEnum), ChatCompletionRequestMessageContentPartImageImageUrl imageUrl = default(ChatCompletionRequestMessageContentPartImageImageUrl))
        {
            this.Type = type;
            // to ensure "imageUrl" is required (not null)
            if (imageUrl == null)
            {
                throw new ArgumentNullException("imageUrl is a required property for ChatCompletionRequestMessageContentPartImage and cannot be null");
            }
            this.ImageUrl = imageUrl;
        }

        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [DataMember(Name = "image_url", IsRequired = true, EmitDefaultValue = true)]
        public ChatCompletionRequestMessageContentPartImageImageUrl ImageUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChatCompletionRequestMessageContentPartImage {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
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
