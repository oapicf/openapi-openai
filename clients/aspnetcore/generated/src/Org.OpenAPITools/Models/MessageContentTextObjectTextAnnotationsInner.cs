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
    public partial class MessageContentTextObjectTextAnnotationsInner : IEquatable<MessageContentTextObjectTextAnnotationsInner>
    {

        /// <summary>
        /// Always `file_citation`.
        /// </summary>
        /// <value>Always `file_citation`.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum CitationEnum for file_citation
            /// </summary>
            [EnumMember(Value = "file_citation")]
            CitationEnum = 1,
            
            /// <summary>
            /// Enum PathEnum for file_path
            /// </summary>
            [EnumMember(Value = "file_path")]
            PathEnum = 2
        }

        /// <summary>
        /// Always &#x60;file_citation&#x60;.
        /// </summary>
        /// <value>Always &#x60;file_citation&#x60;.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// The text in the message content that needs to be replaced.
        /// </summary>
        /// <value>The text in the message content that needs to be replaced.</value>
        [Required]
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; set; }

        /// <summary>
        /// Gets or Sets FileCitation
        /// </summary>
        [Required]
        [DataMember(Name="file_citation", EmitDefaultValue=false)]
        public MessageContentTextAnnotationsFileCitationObjectFileCitation FileCitation { get; set; }

        /// <summary>
        /// Gets or Sets StartIndex
        /// </summary>
        [Required]
        [DataMember(Name="start_index", EmitDefaultValue=true)]
        public int StartIndex { get; set; }

        /// <summary>
        /// Gets or Sets EndIndex
        /// </summary>
        [Required]
        [DataMember(Name="end_index", EmitDefaultValue=true)]
        public int EndIndex { get; set; }

        /// <summary>
        /// Gets or Sets FilePath
        /// </summary>
        [Required]
        [DataMember(Name="file_path", EmitDefaultValue=false)]
        public MessageContentTextAnnotationsFilePathObjectFilePath FilePath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MessageContentTextObjectTextAnnotationsInner {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  FileCitation: ").Append(FileCitation).Append("\n");
            sb.Append("  StartIndex: ").Append(StartIndex).Append("\n");
            sb.Append("  EndIndex: ").Append(EndIndex).Append("\n");
            sb.Append("  FilePath: ").Append(FilePath).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MessageContentTextObjectTextAnnotationsInner)obj);
        }

        /// <summary>
        /// Returns true if MessageContentTextObjectTextAnnotationsInner instances are equal
        /// </summary>
        /// <param name="other">Instance of MessageContentTextObjectTextAnnotationsInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MessageContentTextObjectTextAnnotationsInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
                ) && 
                (
                    FileCitation == other.FileCitation ||
                    FileCitation != null &&
                    FileCitation.Equals(other.FileCitation)
                ) && 
                (
                    StartIndex == other.StartIndex ||
                    
                    StartIndex.Equals(other.StartIndex)
                ) && 
                (
                    EndIndex == other.EndIndex ||
                    
                    EndIndex.Equals(other.EndIndex)
                ) && 
                (
                    FilePath == other.FilePath ||
                    FilePath != null &&
                    FilePath.Equals(other.FilePath)
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
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                    if (FileCitation != null)
                    hashCode = hashCode * 59 + FileCitation.GetHashCode();
                    
                    hashCode = hashCode * 59 + StartIndex.GetHashCode();
                    
                    hashCode = hashCode * 59 + EndIndex.GetHashCode();
                    if (FilePath != null)
                    hashCode = hashCode * 59 + FilePath.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MessageContentTextObjectTextAnnotationsInner left, MessageContentTextObjectTextAnnotationsInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MessageContentTextObjectTextAnnotationsInner left, MessageContentTextObjectTextAnnotationsInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
