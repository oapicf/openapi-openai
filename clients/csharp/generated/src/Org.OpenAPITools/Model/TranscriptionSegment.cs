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
    /// TranscriptionSegment
    /// </summary>
    [DataContract(Name = "TranscriptionSegment")]
    public partial class TranscriptionSegment : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscriptionSegment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TranscriptionSegment() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TranscriptionSegment" /> class.
        /// </summary>
        /// <param name="id">Unique identifier of the segment. (required).</param>
        /// <param name="seek">Seek offset of the segment. (required).</param>
        /// <param name="start">Start time of the segment in seconds. (required).</param>
        /// <param name="end">End time of the segment in seconds. (required).</param>
        /// <param name="text">Text content of the segment. (required).</param>
        /// <param name="tokens">Array of token IDs for the text content. (required).</param>
        /// <param name="temperature">Temperature parameter used for generating the segment. (required).</param>
        /// <param name="avgLogprob">Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. (required).</param>
        /// <param name="compressionRatio">Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. (required).</param>
        /// <param name="noSpeechProb">Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. (required).</param>
        public TranscriptionSegment(int id = default(int), int seek = default(int), float start = default(float), float end = default(float), string text = default(string), List<int> tokens = default(List<int>), float temperature = default(float), float avgLogprob = default(float), float compressionRatio = default(float), float noSpeechProb = default(float))
        {
            this.Id = id;
            this.Seek = seek;
            this.Start = start;
            this.End = end;
            // to ensure "text" is required (not null)
            if (text == null)
            {
                throw new ArgumentNullException("text is a required property for TranscriptionSegment and cannot be null");
            }
            this.Text = text;
            // to ensure "tokens" is required (not null)
            if (tokens == null)
            {
                throw new ArgumentNullException("tokens is a required property for TranscriptionSegment and cannot be null");
            }
            this.Tokens = tokens;
            this.Temperature = temperature;
            this.AvgLogprob = avgLogprob;
            this.CompressionRatio = compressionRatio;
            this.NoSpeechProb = noSpeechProb;
        }

        /// <summary>
        /// Unique identifier of the segment.
        /// </summary>
        /// <value>Unique identifier of the segment.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Seek offset of the segment.
        /// </summary>
        /// <value>Seek offset of the segment.</value>
        [DataMember(Name = "seek", IsRequired = true, EmitDefaultValue = true)]
        public int Seek { get; set; }

        /// <summary>
        /// Start time of the segment in seconds.
        /// </summary>
        /// <value>Start time of the segment in seconds.</value>
        [DataMember(Name = "start", IsRequired = true, EmitDefaultValue = true)]
        public float Start { get; set; }

        /// <summary>
        /// End time of the segment in seconds.
        /// </summary>
        /// <value>End time of the segment in seconds.</value>
        [DataMember(Name = "end", IsRequired = true, EmitDefaultValue = true)]
        public float End { get; set; }

        /// <summary>
        /// Text content of the segment.
        /// </summary>
        /// <value>Text content of the segment.</value>
        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = true)]
        public string Text { get; set; }

        /// <summary>
        /// Array of token IDs for the text content.
        /// </summary>
        /// <value>Array of token IDs for the text content.</value>
        [DataMember(Name = "tokens", IsRequired = true, EmitDefaultValue = true)]
        public List<int> Tokens { get; set; }

        /// <summary>
        /// Temperature parameter used for generating the segment.
        /// </summary>
        /// <value>Temperature parameter used for generating the segment.</value>
        [DataMember(Name = "temperature", IsRequired = true, EmitDefaultValue = true)]
        public float Temperature { get; set; }

        /// <summary>
        /// Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
        /// </summary>
        /// <value>Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.</value>
        [DataMember(Name = "avg_logprob", IsRequired = true, EmitDefaultValue = true)]
        public float AvgLogprob { get; set; }

        /// <summary>
        /// Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
        /// </summary>
        /// <value>Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.</value>
        [DataMember(Name = "compression_ratio", IsRequired = true, EmitDefaultValue = true)]
        public float CompressionRatio { get; set; }

        /// <summary>
        /// Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
        /// </summary>
        /// <value>Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.</value>
        [DataMember(Name = "no_speech_prob", IsRequired = true, EmitDefaultValue = true)]
        public float NoSpeechProb { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TranscriptionSegment {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Seek: ").Append(Seek).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Tokens: ").Append(Tokens).Append("\n");
            sb.Append("  Temperature: ").Append(Temperature).Append("\n");
            sb.Append("  AvgLogprob: ").Append(AvgLogprob).Append("\n");
            sb.Append("  CompressionRatio: ").Append(CompressionRatio).Append("\n");
            sb.Append("  NoSpeechProb: ").Append(NoSpeechProb).Append("\n");
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