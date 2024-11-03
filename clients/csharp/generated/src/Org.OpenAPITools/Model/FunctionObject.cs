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
    /// FunctionObject
    /// </summary>
    [DataContract(Name = "FunctionObject")]
    public partial class FunctionObject : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FunctionObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FunctionObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FunctionObject" /> class.
        /// </summary>
        /// <param name="description">A description of what the function does, used by the model to choose when and how to call the function..</param>
        /// <param name="name">The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. (required).</param>
        /// <param name="parameters">The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list..</param>
        public FunctionObject(string description = default(string), string name = default(string), Dictionary<string, Object> parameters = default(Dictionary<string, Object>))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for FunctionObject and cannot be null");
            }
            this.Name = name;
            this.Description = description;
            this.Parameters = parameters;
        }

        /// <summary>
        /// A description of what the function does, used by the model to choose when and how to call the function.
        /// </summary>
        /// <value>A description of what the function does, used by the model to choose when and how to call the function.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
        /// </summary>
        /// <value>The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
        /// </summary>
        /// <value>The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.</value>
        [DataMember(Name = "parameters", EmitDefaultValue = false)]
        public Dictionary<string, Object> Parameters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FunctionObject {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Parameters: ").Append(Parameters).Append("\n");
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
