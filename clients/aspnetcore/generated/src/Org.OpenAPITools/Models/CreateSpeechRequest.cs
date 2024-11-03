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
    public partial class CreateSpeechRequest : IEquatable<CreateSpeechRequest>
    {
        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public CreateSpeechRequestModel Model { get; set; }

        /// <summary>
        /// The text to generate audio for. The maximum length is 4096 characters.
        /// </summary>
        /// <value>The text to generate audio for. The maximum length is 4096 characters.</value>
        [Required]
        [MaxLength(4096)]
        [DataMember(Name="input", EmitDefaultValue=false)]
        public string Input { get; set; }


        /// <summary>
        /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
        /// </summary>
        /// <value>The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).</value>
        [TypeConverter(typeof(CustomEnumConverter<VoiceEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum VoiceEnum
        {
            
            /// <summary>
            /// Enum AlloyEnum for alloy
            /// </summary>
            [EnumMember(Value = "alloy")]
            AlloyEnum = 1,
            
            /// <summary>
            /// Enum EchoEnum for echo
            /// </summary>
            [EnumMember(Value = "echo")]
            EchoEnum = 2,
            
            /// <summary>
            /// Enum FableEnum for fable
            /// </summary>
            [EnumMember(Value = "fable")]
            FableEnum = 3,
            
            /// <summary>
            /// Enum OnyxEnum for onyx
            /// </summary>
            [EnumMember(Value = "onyx")]
            OnyxEnum = 4,
            
            /// <summary>
            /// Enum NovaEnum for nova
            /// </summary>
            [EnumMember(Value = "nova")]
            NovaEnum = 5,
            
            /// <summary>
            /// Enum ShimmerEnum for shimmer
            /// </summary>
            [EnumMember(Value = "shimmer")]
            ShimmerEnum = 6
        }

        /// <summary>
        /// The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
        /// </summary>
        /// <value>The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).</value>
        [Required]
        [DataMember(Name="voice", EmitDefaultValue=true)]
        public VoiceEnum Voice { get; set; }


        /// <summary>
        /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
        /// </summary>
        /// <value>The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.</value>
        [TypeConverter(typeof(CustomEnumConverter<ResponseFormatEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ResponseFormatEnum
        {
            
            /// <summary>
            /// Enum Mp3Enum for mp3
            /// </summary>
            [EnumMember(Value = "mp3")]
            Mp3Enum = 1,
            
            /// <summary>
            /// Enum OpusEnum for opus
            /// </summary>
            [EnumMember(Value = "opus")]
            OpusEnum = 2,
            
            /// <summary>
            /// Enum AacEnum for aac
            /// </summary>
            [EnumMember(Value = "aac")]
            AacEnum = 3,
            
            /// <summary>
            /// Enum FlacEnum for flac
            /// </summary>
            [EnumMember(Value = "flac")]
            FlacEnum = 4,
            
            /// <summary>
            /// Enum WavEnum for wav
            /// </summary>
            [EnumMember(Value = "wav")]
            WavEnum = 5,
            
            /// <summary>
            /// Enum PcmEnum for pcm
            /// </summary>
            [EnumMember(Value = "pcm")]
            PcmEnum = 6
        }

        /// <summary>
        /// The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
        /// </summary>
        /// <value>The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.</value>
        [DataMember(Name="response_format", EmitDefaultValue=true)]
        public ResponseFormatEnum ResponseFormat { get; set; } = ResponseFormatEnum.Mp3Enum;

        /// <summary>
        /// The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
        /// </summary>
        /// <value>The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.</value>
        [Range(0.25, 4.0)]
        [DataMember(Name="speed", EmitDefaultValue=true)]
        public decimal Speed { get; set; } = 1.0M;

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateSpeechRequest {\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  Input: ").Append(Input).Append("\n");
            sb.Append("  Voice: ").Append(Voice).Append("\n");
            sb.Append("  ResponseFormat: ").Append(ResponseFormat).Append("\n");
            sb.Append("  Speed: ").Append(Speed).Append("\n");
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
            return obj.GetType() == GetType() && Equals((CreateSpeechRequest)obj);
        }

        /// <summary>
        /// Returns true if CreateSpeechRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateSpeechRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateSpeechRequest other)
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
                    Voice == other.Voice ||
                    
                    Voice.Equals(other.Voice)
                ) && 
                (
                    ResponseFormat == other.ResponseFormat ||
                    
                    ResponseFormat.Equals(other.ResponseFormat)
                ) && 
                (
                    Speed == other.Speed ||
                    
                    Speed.Equals(other.Speed)
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
                    
                    hashCode = hashCode * 59 + Voice.GetHashCode();
                    
                    hashCode = hashCode * 59 + ResponseFormat.GetHashCode();
                    
                    hashCode = hashCode * 59 + Speed.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateSpeechRequest left, CreateSpeechRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateSpeechRequest left, CreateSpeechRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
