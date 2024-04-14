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
    /// ListRunsResponse
    /// </summary>
    [DataContract(Name = "ListRunsResponse")]
    public partial class ListRunsResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ListRunsResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ListRunsResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ListRunsResponse" /> class.
        /// </summary>
        /// <param name="varObject">varObject (required).</param>
        /// <param name="data">data (required).</param>
        /// <param name="firstId">firstId (required).</param>
        /// <param name="lastId">lastId (required).</param>
        /// <param name="hasMore">hasMore (required).</param>
        public ListRunsResponse(string varObject = default(string), List<RunObject> data = default(List<RunObject>), string firstId = default(string), string lastId = default(string), bool hasMore = default(bool))
        {
            // to ensure "varObject" is required (not null)
            if (varObject == null)
            {
                throw new ArgumentNullException("varObject is a required property for ListRunsResponse and cannot be null");
            }
            this.VarObject = varObject;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for ListRunsResponse and cannot be null");
            }
            this.Data = data;
            // to ensure "firstId" is required (not null)
            if (firstId == null)
            {
                throw new ArgumentNullException("firstId is a required property for ListRunsResponse and cannot be null");
            }
            this.FirstId = firstId;
            // to ensure "lastId" is required (not null)
            if (lastId == null)
            {
                throw new ArgumentNullException("lastId is a required property for ListRunsResponse and cannot be null");
            }
            this.LastId = lastId;
            this.HasMore = hasMore;
        }

        /// <summary>
        /// Gets or Sets VarObject
        /// </summary>
        /// <example>list</example>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public string VarObject { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public List<RunObject> Data { get; set; }

        /// <summary>
        /// Gets or Sets FirstId
        /// </summary>
        /// <example>run_abc123</example>
        [DataMember(Name = "first_id", IsRequired = true, EmitDefaultValue = true)]
        public string FirstId { get; set; }

        /// <summary>
        /// Gets or Sets LastId
        /// </summary>
        /// <example>run_abc456</example>
        [DataMember(Name = "last_id", IsRequired = true, EmitDefaultValue = true)]
        public string LastId { get; set; }

        /// <summary>
        /// Gets or Sets HasMore
        /// </summary>
        /// <example>false</example>
        [DataMember(Name = "has_more", IsRequired = true, EmitDefaultValue = true)]
        public bool HasMore { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ListRunsResponse {\n");
            sb.Append("  VarObject: ").Append(VarObject).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  FirstId: ").Append(FirstId).Append("\n");
            sb.Append("  LastId: ").Append(LastId).Append("\n");
            sb.Append("  HasMore: ").Append(HasMore).Append("\n");
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
