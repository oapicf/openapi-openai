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
    /// CreateThreadAndRunRequestToolsInner
    /// </summary>
    [JsonConverter(typeof(CreateThreadAndRunRequestToolsInnerJsonConverter))]
    [DataContract(Name = "CreateThreadAndRunRequest_tools_inner")]
    public partial class CreateThreadAndRunRequestToolsInner : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateThreadAndRunRequestToolsInner" /> class
        /// with the <see cref="AssistantToolsCode" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AssistantToolsCode.</param>
        public CreateThreadAndRunRequestToolsInner(AssistantToolsCode actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateThreadAndRunRequestToolsInner" /> class
        /// with the <see cref="AssistantToolsRetrieval" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AssistantToolsRetrieval.</param>
        public CreateThreadAndRunRequestToolsInner(AssistantToolsRetrieval actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateThreadAndRunRequestToolsInner" /> class
        /// with the <see cref="AssistantToolsFunction" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AssistantToolsFunction.</param>
        public CreateThreadAndRunRequestToolsInner(AssistantToolsFunction actualInstance)
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
                if (value.GetType() == typeof(AssistantToolsCode) || value is AssistantToolsCode)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(AssistantToolsFunction) || value is AssistantToolsFunction)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(AssistantToolsRetrieval) || value is AssistantToolsRetrieval)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `AssistantToolsCode`. If the actual instance is not `AssistantToolsCode`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AssistantToolsCode</returns>
        public AssistantToolsCode GetAssistantToolsCode()
        {
            return (AssistantToolsCode)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AssistantToolsRetrieval`. If the actual instance is not `AssistantToolsRetrieval`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AssistantToolsRetrieval</returns>
        public AssistantToolsRetrieval GetAssistantToolsRetrieval()
        {
            return (AssistantToolsRetrieval)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AssistantToolsFunction`. If the actual instance is not `AssistantToolsFunction`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AssistantToolsFunction</returns>
        public AssistantToolsFunction GetAssistantToolsFunction()
        {
            return (AssistantToolsFunction)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateThreadAndRunRequestToolsInner {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, CreateThreadAndRunRequestToolsInner.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CreateThreadAndRunRequestToolsInner
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CreateThreadAndRunRequestToolsInner</returns>
        public static CreateThreadAndRunRequestToolsInner FromJson(string jsonString)
        {
            CreateThreadAndRunRequestToolsInner newCreateThreadAndRunRequestToolsInner = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCreateThreadAndRunRequestToolsInner;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(AssistantToolsCode).GetProperty("AdditionalProperties") == null)
                {
                    newCreateThreadAndRunRequestToolsInner = new CreateThreadAndRunRequestToolsInner(JsonConvert.DeserializeObject<AssistantToolsCode>(jsonString, CreateThreadAndRunRequestToolsInner.SerializerSettings));
                }
                else
                {
                    newCreateThreadAndRunRequestToolsInner = new CreateThreadAndRunRequestToolsInner(JsonConvert.DeserializeObject<AssistantToolsCode>(jsonString, CreateThreadAndRunRequestToolsInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("AssistantToolsCode");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AssistantToolsCode: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(AssistantToolsFunction).GetProperty("AdditionalProperties") == null)
                {
                    newCreateThreadAndRunRequestToolsInner = new CreateThreadAndRunRequestToolsInner(JsonConvert.DeserializeObject<AssistantToolsFunction>(jsonString, CreateThreadAndRunRequestToolsInner.SerializerSettings));
                }
                else
                {
                    newCreateThreadAndRunRequestToolsInner = new CreateThreadAndRunRequestToolsInner(JsonConvert.DeserializeObject<AssistantToolsFunction>(jsonString, CreateThreadAndRunRequestToolsInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("AssistantToolsFunction");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AssistantToolsFunction: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(AssistantToolsRetrieval).GetProperty("AdditionalProperties") == null)
                {
                    newCreateThreadAndRunRequestToolsInner = new CreateThreadAndRunRequestToolsInner(JsonConvert.DeserializeObject<AssistantToolsRetrieval>(jsonString, CreateThreadAndRunRequestToolsInner.SerializerSettings));
                }
                else
                {
                    newCreateThreadAndRunRequestToolsInner = new CreateThreadAndRunRequestToolsInner(JsonConvert.DeserializeObject<AssistantToolsRetrieval>(jsonString, CreateThreadAndRunRequestToolsInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("AssistantToolsRetrieval");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AssistantToolsRetrieval: {1}", jsonString, exception.ToString()));
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
            return newCreateThreadAndRunRequestToolsInner;
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
    /// Custom JSON converter for CreateThreadAndRunRequestToolsInner
    /// </summary>
    public class CreateThreadAndRunRequestToolsInnerJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CreateThreadAndRunRequestToolsInner).GetMethod("ToJson").Invoke(value, null)));
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
                    return CreateThreadAndRunRequestToolsInner.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return CreateThreadAndRunRequestToolsInner.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
