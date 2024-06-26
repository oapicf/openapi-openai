/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
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
    public partial class SubmitToolOutputsRunRequestToolOutputsInner : IEquatable<SubmitToolOutputsRunRequestToolOutputsInner>
    {
        /// <summary>
        /// The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
        /// </summary>
        /// <value>The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.</value>
        [DataMember(Name="tool_call_id", EmitDefaultValue=false)]
        public string ToolCallId { get; set; }

        /// <summary>
        /// The output of the tool call to be submitted to continue the run.
        /// </summary>
        /// <value>The output of the tool call to be submitted to continue the run.</value>
        [DataMember(Name="output", EmitDefaultValue=false)]
        public string Output { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SubmitToolOutputsRunRequestToolOutputsInner {\n");
            sb.Append("  ToolCallId: ").Append(ToolCallId).Append("\n");
            sb.Append("  Output: ").Append(Output).Append("\n");
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
            return obj.GetType() == GetType() && Equals((SubmitToolOutputsRunRequestToolOutputsInner)obj);
        }

        /// <summary>
        /// Returns true if SubmitToolOutputsRunRequestToolOutputsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of SubmitToolOutputsRunRequestToolOutputsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SubmitToolOutputsRunRequestToolOutputsInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ToolCallId == other.ToolCallId ||
                    ToolCallId != null &&
                    ToolCallId.Equals(other.ToolCallId)
                ) && 
                (
                    Output == other.Output ||
                    Output != null &&
                    Output.Equals(other.Output)
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
                    if (ToolCallId != null)
                    hashCode = hashCode * 59 + ToolCallId.GetHashCode();
                    if (Output != null)
                    hashCode = hashCode * 59 + Output.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SubmitToolOutputsRunRequestToolOutputsInner left, SubmitToolOutputsRunRequestToolOutputsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SubmitToolOutputsRunRequestToolOutputsInner left, SubmitToolOutputsRunRequestToolOutputsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
