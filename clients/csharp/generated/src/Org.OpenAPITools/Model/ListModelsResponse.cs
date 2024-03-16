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
    /// ListModelsResponse
    /// </summary>
    [DataContract(Name = "ListModelsResponse")]
    public partial class ListModelsResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ListModelsResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ListModelsResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ListModelsResponse" /> class.
        /// </summary>
        /// <param name="varObject">varObject (required).</param>
        /// <param name="data">data (required).</param>
        public ListModelsResponse(string varObject = default(string), List<Model> data = default(List<Model>))
        {
            // to ensure "varObject" is required (not null)
            if (varObject == null)
            {
                throw new ArgumentNullException("varObject is a required property for ListModelsResponse and cannot be null");
            }
            this.VarObject = varObject;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for ListModelsResponse and cannot be null");
            }
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public string VarObject { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public List<Model> Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ListModelsResponse {\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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