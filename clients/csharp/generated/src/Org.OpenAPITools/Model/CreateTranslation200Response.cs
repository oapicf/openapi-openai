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
    /// CreateTranslation200Response
    /// </summary>
    [JsonConverter(typeof(CreateTranslation200ResponseJsonConverter))]
    [DataContract(Name = "createTranslation_200_response")]
    public partial class CreateTranslation200Response : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateTranslation200Response" /> class
        /// with the <see cref="CreateTranslationResponseJson" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CreateTranslationResponseJson.</param>
        public CreateTranslation200Response(CreateTranslationResponseJson actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateTranslation200Response" /> class
        /// with the <see cref="CreateTranslationResponseVerboseJson" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CreateTranslationResponseVerboseJson.</param>
        public CreateTranslation200Response(CreateTranslationResponseVerboseJson actualInstance)
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
                if (value.GetType() == typeof(CreateTranslationResponseJson))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CreateTranslationResponseVerboseJson))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `CreateTranslationResponseJson`. If the actual instance is not `CreateTranslationResponseJson`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CreateTranslationResponseJson</returns>
        public CreateTranslationResponseJson GetCreateTranslationResponseJson()
        {
            return (CreateTranslationResponseJson)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CreateTranslationResponseVerboseJson`. If the actual instance is not `CreateTranslationResponseVerboseJson`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CreateTranslationResponseVerboseJson</returns>
        public CreateTranslationResponseVerboseJson GetCreateTranslationResponseVerboseJson()
        {
            return (CreateTranslationResponseVerboseJson)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateTranslation200Response {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, CreateTranslation200Response.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CreateTranslation200Response
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CreateTranslation200Response</returns>
        public static CreateTranslation200Response FromJson(string jsonString)
        {
            CreateTranslation200Response newCreateTranslation200Response = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCreateTranslation200Response;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CreateTranslationResponseJson).GetProperty("AdditionalProperties") == null)
                {
                    newCreateTranslation200Response = new CreateTranslation200Response(JsonConvert.DeserializeObject<CreateTranslationResponseJson>(jsonString, CreateTranslation200Response.SerializerSettings));
                }
                else
                {
                    newCreateTranslation200Response = new CreateTranslation200Response(JsonConvert.DeserializeObject<CreateTranslationResponseJson>(jsonString, CreateTranslation200Response.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CreateTranslationResponseJson");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CreateTranslationResponseJson: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CreateTranslationResponseVerboseJson).GetProperty("AdditionalProperties") == null)
                {
                    newCreateTranslation200Response = new CreateTranslation200Response(JsonConvert.DeserializeObject<CreateTranslationResponseVerboseJson>(jsonString, CreateTranslation200Response.SerializerSettings));
                }
                else
                {
                    newCreateTranslation200Response = new CreateTranslation200Response(JsonConvert.DeserializeObject<CreateTranslationResponseVerboseJson>(jsonString, CreateTranslation200Response.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CreateTranslationResponseVerboseJson");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CreateTranslationResponseVerboseJson: {1}", jsonString, exception.ToString()));
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
            return newCreateTranslation200Response;
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
    /// Custom JSON converter for CreateTranslation200Response
    /// </summary>
    public class CreateTranslation200ResponseJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CreateTranslation200Response).GetMethod("ToJson").Invoke(value, null)));
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
                case JsonToken.StartObject:
                    return CreateTranslation200Response.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return CreateTranslation200Response.FromJson(JArray.Load(reader).ToString(Formatting.None));
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