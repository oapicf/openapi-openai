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
    /// Represents a run step delta i.e. any changed fields on a run step during streaming. 
    /// </summary>
    [DataContract(Name = "RunStepDeltaObject")]
    public partial class RunStepDeltaObject : IValidatableObject
    {
        /// <summary>
        /// The object type, which is always &#x60;thread.run.step.delta&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;thread.run.step.delta&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ObjectEnum
        {
            /// <summary>
            /// Enum ThreadRunStepDelta for value: thread.run.step.delta
            /// </summary>
            [EnumMember(Value = "thread.run.step.delta")]
            ThreadRunStepDelta = 1
        }


        /// <summary>
        /// The object type, which is always &#x60;thread.run.step.delta&#x60;.
        /// </summary>
        /// <value>The object type, which is always &#x60;thread.run.step.delta&#x60;.</value>
        [DataMember(Name = "object", IsRequired = true, EmitDefaultValue = true)]
        public ObjectEnum Object { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RunStepDeltaObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDeltaObject" /> class.
        /// </summary>
        /// <param name="id">The identifier of the run step, which can be referenced in API endpoints. (required).</param>
        /// <param name="varObject">The object type, which is always &#x60;thread.run.step.delta&#x60;. (required).</param>
        /// <param name="delta">delta (required).</param>
        public RunStepDeltaObject(string id = default(string), ObjectEnum varObject = default(ObjectEnum), RunStepDeltaObjectDelta delta = default(RunStepDeltaObjectDelta))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for RunStepDeltaObject and cannot be null");
            }
            this.Id = id;
            this.Object = varObject;
            // to ensure "delta" is required (not null)
            if (delta == null)
            {
                throw new ArgumentNullException("delta is a required property for RunStepDeltaObject and cannot be null");
            }
            this.Delta = delta;
        }

        /// <summary>
        /// The identifier of the run step, which can be referenced in API endpoints.
        /// </summary>
        /// <value>The identifier of the run step, which can be referenced in API endpoints.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Delta
        /// </summary>
        [DataMember(Name = "delta", IsRequired = true, EmitDefaultValue = true)]
        public RunStepDeltaObjectDelta Delta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RunStepDeltaObject {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
            sb.Append("  Delta: ").Append(Delta).Append("\n");
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
