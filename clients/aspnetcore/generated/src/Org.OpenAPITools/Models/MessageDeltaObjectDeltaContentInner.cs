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
    public partial class MessageDeltaObjectDeltaContentInner : IEquatable<MessageDeltaObjectDeltaContentInner>
    {
        /// <summary>
        /// The index of the content part in the message.
        /// </summary>
        /// <value>The index of the content part in the message.</value>
        [Required]
        [DataMember(Name="index", EmitDefaultValue=true)]
        public int Index { get; set; }


        /// <summary>
        /// Always `image_file`.
        /// </summary>
        /// <value>Always `image_file`.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum ImageFileEnum for image_file
            /// </summary>
            [EnumMember(Value = "image_file")]
            ImageFileEnum = 1,
            
            /// <summary>
            /// Enum TextEnum for text
            /// </summary>
            [EnumMember(Value = "text")]
            TextEnum = 2
        }

        /// <summary>
        /// Always &#x60;image_file&#x60;.
        /// </summary>
        /// <value>Always &#x60;image_file&#x60;.</value>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets ImageFile
        /// </summary>
        [DataMember(Name="image_file", EmitDefaultValue=false)]
        public MessageDeltaContentImageFileObjectImageFile ImageFile { get; set; }

        /// <summary>
        /// Gets or Sets Text
        /// </summary>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public MessageDeltaContentTextObjectText Text { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MessageDeltaObjectDeltaContentInner {\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  ImageFile: ").Append(ImageFile).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MessageDeltaObjectDeltaContentInner)obj);
        }

        /// <summary>
        /// Returns true if MessageDeltaObjectDeltaContentInner instances are equal
        /// </summary>
        /// <param name="other">Instance of MessageDeltaObjectDeltaContentInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MessageDeltaObjectDeltaContentInner other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Index == other.Index ||
                    
                    Index.Equals(other.Index)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    ImageFile == other.ImageFile ||
                    ImageFile != null &&
                    ImageFile.Equals(other.ImageFile)
                ) && 
                (
                    Text == other.Text ||
                    Text != null &&
                    Text.Equals(other.Text)
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
                    
                    hashCode = hashCode * 59 + Index.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (ImageFile != null)
                    hashCode = hashCode * 59 + ImageFile.GetHashCode();
                    if (Text != null)
                    hashCode = hashCode * 59 + Text.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MessageDeltaObjectDeltaContentInner left, MessageDeltaObjectDeltaContentInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MessageDeltaObjectDeltaContentInner left, MessageDeltaObjectDeltaContentInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}