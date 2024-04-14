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
    /// Occurs when a stream ends.
    /// </summary>
    [DataContract]
    public partial class DoneEvent : IEquatable<DoneEvent>
    {

        /// <summary>
        /// Gets or Sets VarEvent
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<EventEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EventEnum
        {
            
            /// <summary>
            /// Enum DoneEnum for done
            /// </summary>
            [EnumMember(Value = "done")]
            DoneEnum = 1
        }

        /// <summary>
        /// Gets or Sets VarEvent
        /// </summary>
        [Required]
        [DataMember(Name="event", EmitDefaultValue=true)]
        public EventEnum VarEvent { get; set; }


        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<DataEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum DataEnum
        {
            
            /// <summary>
            /// Enum DONEEnum for [DONE]
            /// </summary>
            [EnumMember(Value = "[DONE]")]
            DONEEnum = 1
        }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [Required]
        [DataMember(Name="data", EmitDefaultValue=true)]
        public DataEnum Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DoneEvent {\n");
            sb.Append("  VarEvent: ").Append(VarEvent).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DoneEvent)obj);
        }

        /// <summary>
        /// Returns true if DoneEvent instances are equal
        /// </summary>
        /// <param name="other">Instance of DoneEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DoneEvent other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VarEvent == other.VarEvent ||
                    
                    VarEvent.Equals(other.VarEvent)
                ) && 
                (
                    Data == other.Data ||
                    
                    Data.Equals(other.Data)
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
                    
                    hashCode = hashCode * 59 + VarEvent.GetHashCode();
                    
                    hashCode = hashCode * 59 + Data.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DoneEvent left, DoneEvent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DoneEvent left, DoneEvent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
