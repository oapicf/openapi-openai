/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
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
    /// CreateEmbeddingResponse
    /// </summary>
    [DataContract(Name = "CreateEmbeddingResponse")]
    public partial class CreateEmbeddingResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateEmbeddingResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingResponse" /> class.
        /// </summary>
        /// <param name="varObject">varObject (required).</param>
        /// <param name="model">model (required).</param>
        /// <param name="data">data (required).</param>
        /// <param name="usage">usage (required).</param>
        public CreateEmbeddingResponse(string varObject = default(string), string model = default(string), List<CreateEmbeddingResponseDataInner> data = default(List<CreateEmbeddingResponseDataInner>), CreateEmbeddingResponseUsage usage = default(CreateEmbeddingResponseUsage))
        {
            // to ensure "varObject" is required (not null)
            if (varObject == null)
            {
                throw new ArgumentNullException("varObject is a required property for CreateEmbeddingResponse and cannot be null");
            }
            this.VarObject = varObject;
            // to ensure "model" is required (not null)
            if (model == null)
            {
                throw new ArgumentNullException("model is a required property for CreateEmbeddingResponse and cannot be null");
            }
            this.Model = model;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for CreateEmbeddingResponse and cannot be null");
            }
            this.Data = data;
            // to ensure "usage" is required (not null)
            if (usage == null)
            {
                throw new ArgumentNullException("usage is a required property for CreateEmbeddingResponse and cannot be null");
            }
            this.Usage = usage;
        }

        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public string VarObject { get; set; }

        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [DataMember(Name = "model", IsRequired = true, EmitDefaultValue = true)]
        public string Model { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public List<CreateEmbeddingResponseDataInner> Data { get; set; }

        /// <summary>
        /// Gets or Sets Usage
        /// </summary>
        [DataMember(Name = "usage", IsRequired = true, EmitDefaultValue = true)]
        public CreateEmbeddingResponseUsage Usage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateEmbeddingResponse {\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
