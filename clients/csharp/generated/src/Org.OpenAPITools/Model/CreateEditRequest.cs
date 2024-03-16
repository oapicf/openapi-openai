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
    /// CreateEditRequest
    /// </summary>
    [DataContract(Name = "CreateEditRequest")]
    public partial class CreateEditRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEditRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateEditRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEditRequest" /> class.
        /// </summary>
        /// <param name="model">model (required).</param>
        /// <param name="input">The input text to use as a starting point for the edit. (default to &quot;&quot;).</param>
        /// <param name="instruction">The instruction that tells the model how to edit the prompt. (required).</param>
        /// <param name="n">How many edits to generate for the input and instruction. (default to 1).</param>
        /// <param name="temperature">What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  (default to 1M).</param>
        /// <param name="topP">An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  (default to 1M).</param>
        public CreateEditRequest(CreateEditRequestModel model = default(CreateEditRequestModel), string input = @"", string instruction = default(string), int? n = 1, decimal? temperature = 1M, decimal? topP = 1M)
        {
            // to ensure "model" is required (not null)
            if (model == null)
            {
                throw new ArgumentNullException("model is a required property for CreateEditRequest and cannot be null");
            }
            this.Model = model;
            // to ensure "instruction" is required (not null)
            if (instruction == null)
            {
                throw new ArgumentNullException("instruction is a required property for CreateEditRequest and cannot be null");
            }
            this.Instruction = instruction;
            // use default value if no "input" provided
            this.Input = input ?? @"";
            // use default value if no "n" provided
            this.N = n ?? 1;
            // use default value if no "temperature" provided
            this.Temperature = temperature ?? 1M;
            // use default value if no "topP" provided
            this.TopP = topP ?? 1M;
        }

        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [DataMember(Name = "model", IsRequired = true, EmitDefaultValue = true)]
        public CreateEditRequestModel Model { get; set; }

        /// <summary>
        /// The input text to use as a starting point for the edit.
        /// </summary>
        /// <value>The input text to use as a starting point for the edit.</value>
        /// <example>What day of the wek is it?</example>
        [DataMember(Name = "input", EmitDefaultValue = true)]
        public string Input { get; set; }

        /// <summary>
        /// The instruction that tells the model how to edit the prompt.
        /// </summary>
        /// <value>The instruction that tells the model how to edit the prompt.</value>
        /// <example>Fix the spelling mistakes.</example>
        [DataMember(Name = "instruction", IsRequired = true, EmitDefaultValue = true)]
        public string Instruction { get; set; }

        /// <summary>
        /// How many edits to generate for the input and instruction.
        /// </summary>
        /// <value>How many edits to generate for the input and instruction.</value>
        /// <example>1</example>
        [DataMember(Name = "n", EmitDefaultValue = true)]
        public int? N { get; set; }

        /// <summary>
        /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
        /// </summary>
        /// <value>What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. </value>
        /// <example>1</example>
        [DataMember(Name = "temperature", EmitDefaultValue = true)]
        public decimal? Temperature { get; set; }

        /// <summary>
        /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
        /// </summary>
        /// <value>An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. </value>
        /// <example>1</example>
        [DataMember(Name = "top_p", EmitDefaultValue = true)]
        public decimal? TopP { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateEditRequest {\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Input: ").Append(Input).Append("\n");
            sb.Append("  Instruction: ").Append(Instruction).Append("\n");
            sb.Append("  N: ").Append(N).Append("\n");
            sb.Append("  Temperature: ").Append(Temperature).Append("\n");
            sb.Append("  TopP: ").Append(TopP).Append("\n");
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
            // N (int?) maximum
            if (this.N > (int?)20)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for N, must be a value less than or equal to 20.", new [] { "N" });
            }

            // N (int?) minimum
            if (this.N < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for N, must be a value greater than or equal to 1.", new [] { "N" });
            }

            // Temperature (decimal?) maximum
            if (this.Temperature > (decimal?)2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Temperature, must be a value less than or equal to 2.", new [] { "Temperature" });
            }

            // Temperature (decimal?) minimum
            if (this.Temperature < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Temperature, must be a value greater than or equal to 0.", new [] { "Temperature" });
            }

            // TopP (decimal?) maximum
            if (this.TopP > (decimal?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TopP, must be a value less than or equal to 1.", new [] { "TopP" });
            }

            // TopP (decimal?) minimum
            if (this.TopP < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TopP, must be a value greater than or equal to 0.", new [] { "TopP" });
            }

            yield break;
        }
    }

}
