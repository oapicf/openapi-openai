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
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
    /// </summary>
    [JsonConverter(typeof(AssistantsApiResponseFormatOptionJsonConverter))]
    [DataContract(Name = "AssistantsApiResponseFormatOption")]
    public partial class AssistantsApiResponseFormatOption : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AssistantsApiResponseFormatOption" /> class
        /// with the <see cref="string" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of string.</param>
        public AssistantsApiResponseFormatOption(string actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AssistantsApiResponseFormatOption" /> class
        /// with the <see cref="AssistantsApiResponseFormat" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AssistantsApiResponseFormat.</param>
        public AssistantsApiResponseFormatOption(AssistantsApiResponseFormat actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(AssistantsApiResponseFormat) || value is AssistantsApiResponseFormat)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(string) || value is string)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: AssistantsApiResponseFormat, string");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `string`. If the actual instance is not `string`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of string</returns>
        public string GetString()
        {
            return (string)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AssistantsApiResponseFormat`. If the actual instance is not `AssistantsApiResponseFormat`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AssistantsApiResponseFormat</returns>
        public AssistantsApiResponseFormat GetAssistantsApiResponseFormat()
        {
            return (AssistantsApiResponseFormat)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AssistantsApiResponseFormatOption {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, AssistantsApiResponseFormatOption.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of AssistantsApiResponseFormatOption
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of AssistantsApiResponseFormatOption</returns>
        public static AssistantsApiResponseFormatOption FromJson(string jsonString)
        {
            AssistantsApiResponseFormatOption newAssistantsApiResponseFormatOption = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newAssistantsApiResponseFormatOption;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(AssistantsApiResponseFormat).GetProperty("AdditionalProperties") == null)
                {
                    newAssistantsApiResponseFormatOption = new AssistantsApiResponseFormatOption(JsonConvert.DeserializeObject<AssistantsApiResponseFormat>(jsonString, AssistantsApiResponseFormatOption.SerializerSettings));
                }
                else
                {
                    newAssistantsApiResponseFormatOption = new AssistantsApiResponseFormatOption(JsonConvert.DeserializeObject<AssistantsApiResponseFormat>(jsonString, AssistantsApiResponseFormatOption.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("AssistantsApiResponseFormat");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AssistantsApiResponseFormat: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(string).GetProperty("AdditionalProperties") == null)
                {
                    newAssistantsApiResponseFormatOption = new AssistantsApiResponseFormatOption(JsonConvert.DeserializeObject<string>(jsonString, AssistantsApiResponseFormatOption.SerializerSettings));
                }
                else
                {
                    newAssistantsApiResponseFormatOption = new AssistantsApiResponseFormatOption(JsonConvert.DeserializeObject<string>(jsonString, AssistantsApiResponseFormatOption.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("string");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into string: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + String.Join(",", matchedTypes));
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newAssistantsApiResponseFormatOption;
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

    /// <summary>
    /// Custom JSON converter for AssistantsApiResponseFormatOption
    /// </summary>
    public class AssistantsApiResponseFormatOptionJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(AssistantsApiResponseFormatOption).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            switch(reader.TokenType) 
            {
                case JsonToken.String: 
                    return new AssistantsApiResponseFormatOption(Convert.ToString(reader.Value));
                case JsonToken.StartObject:
                    return AssistantsApiResponseFormatOption.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return AssistantsApiResponseFormatOption.FromJson(JArray.Load(reader).ToString(Formatting.None));
                default:
                    return null;
            }
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
