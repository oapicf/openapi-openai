/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class CreateEditRequest : IEquatable<CreateEditRequest>
    {
        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public CreateEditRequestModel Model { get; set; }

        /// <summary>
        /// The input text to use as a starting point for the edit.
        /// </summary>
        /// <value>The input text to use as a starting point for the edit.</value>
        /// <example>What day of the wek is it?</example>
        [DataMember(Name="input", EmitDefaultValue=true)]
        public string Input { get; set; } = "";

        /// <summary>
        /// The instruction that tells the model how to edit the prompt.
        /// </summary>
        /// <value>The instruction that tells the model how to edit the prompt.</value>
        /// <example>Fix the spelling mistakes.</example>
        [Required]
        [DataMember(Name="instruction", EmitDefaultValue=false)]
        public string Instruction { get; set; }

        /// <summary>
        /// How many edits to generate for the input and instruction.
        /// </summary>
        /// <value>How many edits to generate for the input and instruction.</value>
        /// <example>1</example>
        [Range(1, 20)]
        [DataMember(Name="n", EmitDefaultValue=true)]
        public int? N { get; set; } = 1;

        /// <summary>
        /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
        /// </summary>
        /// <value>What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. </value>
        /// <example>1</example>
        [Range(0, 2)]
        [DataMember(Name="temperature", EmitDefaultValue=true)]
        public decimal? Temperature { get; set; } = 1M;

        /// <summary>
        /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
        /// </summary>
        /// <value>An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. </value>
        /// <example>1</example>
        [Range(0, 1)]
        [DataMember(Name="top_p", EmitDefaultValue=true)]
        public decimal? TopP { get; set; } = 1M;

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((CreateEditRequest)obj);
        }

        /// <summary>
        /// Returns true if CreateEditRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateEditRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateEditRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    Input == other.Input ||
                    Input != null &&
                    Input.Equals(other.Input)
                ) && 
                (
                    Instruction == other.Instruction ||
                    Instruction != null &&
                    Instruction.Equals(other.Instruction)
                ) && 
                (
                    N == other.N ||
                    N != null &&
                    N.Equals(other.N)
                ) && 
                (
                    Temperature == other.Temperature ||
                    Temperature != null &&
                    Temperature.Equals(other.Temperature)
                ) && 
                (
                    TopP == other.TopP ||
                    TopP != null &&
                    TopP.Equals(other.TopP)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (Input != null)
                    hashCode = hashCode * 59 + Input.GetHashCode();
                    if (Instruction != null)
                    hashCode = hashCode * 59 + Instruction.GetHashCode();
                    if (N != null)
                    hashCode = hashCode * 59 + N.GetHashCode();
                    if (Temperature != null)
                    hashCode = hashCode * 59 + Temperature.GetHashCode();
                    if (TopP != null)
                    hashCode = hashCode * 59 + TopP.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateEditRequest left, CreateEditRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateEditRequest left, CreateEditRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}