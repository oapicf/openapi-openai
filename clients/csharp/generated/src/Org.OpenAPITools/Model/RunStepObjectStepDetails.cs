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
    /// The details of the run step.
    /// </summary>
    [JsonConverter(typeof(RunStepObjectStepDetailsJsonConverter))]
    [DataContract(Name = "RunStepObject_step_details")]
    public partial class RunStepObjectStepDetails : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepObjectStepDetails" /> class
        /// with the <see cref="RunStepDetailsMessageCreationObject" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepDetailsMessageCreationObject.</param>
        public RunStepObjectStepDetails(RunStepDetailsMessageCreationObject actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepObjectStepDetails" /> class
        /// with the <see cref="RunStepDetailsToolCallsObject" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepDetailsToolCallsObject.</param>
        public RunStepObjectStepDetails(RunStepDetailsToolCallsObject actualInstance)
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
                if (value.GetType() == typeof(RunStepDetailsMessageCreationObject))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepDetailsToolCallsObject))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `RunStepDetailsMessageCreationObject`. If the actual instance is not `RunStepDetailsMessageCreationObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepDetailsMessageCreationObject</returns>
        public RunStepDetailsMessageCreationObject GetRunStepDetailsMessageCreationObject()
        {
            return (RunStepDetailsMessageCreationObject)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepDetailsToolCallsObject`. If the actual instance is not `RunStepDetailsToolCallsObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepDetailsToolCallsObject</returns>
        public RunStepDetailsToolCallsObject GetRunStepDetailsToolCallsObject()
        {
            return (RunStepDetailsToolCallsObject)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepObjectStepDetails {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, RunStepObjectStepDetails.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of RunStepObjectStepDetails
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of RunStepObjectStepDetails</returns>
        public static RunStepObjectStepDetails FromJson(string jsonString)
        {
            RunStepObjectStepDetails newRunStepObjectStepDetails = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newRunStepObjectStepDetails;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepDetailsMessageCreationObject).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepObjectStepDetails = new RunStepObjectStepDetails(JsonConvert.DeserializeObject<RunStepDetailsMessageCreationObject>(jsonString, RunStepObjectStepDetails.SerializerSettings));
                }
                else
                {
                    newRunStepObjectStepDetails = new RunStepObjectStepDetails(JsonConvert.DeserializeObject<RunStepDetailsMessageCreationObject>(jsonString, RunStepObjectStepDetails.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepDetailsMessageCreationObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepDetailsMessageCreationObject: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepDetailsToolCallsObject).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepObjectStepDetails = new RunStepObjectStepDetails(JsonConvert.DeserializeObject<RunStepDetailsToolCallsObject>(jsonString, RunStepObjectStepDetails.SerializerSettings));
                }
                else
                {
                    newRunStepObjectStepDetails = new RunStepObjectStepDetails(JsonConvert.DeserializeObject<RunStepDetailsToolCallsObject>(jsonString, RunStepObjectStepDetails.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepDetailsToolCallsObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepDetailsToolCallsObject: {1}", jsonString, exception.ToString()));
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
            return newRunStepObjectStepDetails;
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
    /// Custom JSON converter for RunStepObjectStepDetails
    /// </summary>
    public class RunStepObjectStepDetailsJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(RunStepObjectStepDetails).GetMethod("ToJson").Invoke(value, null)));
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
                    return RunStepObjectStepDetails.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return RunStepObjectStepDetails.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
