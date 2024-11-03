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
    /// RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
    /// </summary>
    [JsonConverter(typeof(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerJsonConverter))]
    [DataContract(Name = "RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner")]
    public partial class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner" /> class
        /// with the <see cref="RunStepDetailsToolCallsCodeOutputLogsObject" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepDetailsToolCallsCodeOutputLogsObject.</param>
        public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(RunStepDetailsToolCallsCodeOutputLogsObject actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner" /> class
        /// with the <see cref="RunStepDetailsToolCallsCodeOutputImageObject" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepDetailsToolCallsCodeOutputImageObject.</param>
        public RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(RunStepDetailsToolCallsCodeOutputImageObject actualInstance)
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
                if (value.GetType() == typeof(RunStepDetailsToolCallsCodeOutputImageObject) || value is RunStepDetailsToolCallsCodeOutputImageObject)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepDetailsToolCallsCodeOutputLogsObject) || value is RunStepDetailsToolCallsCodeOutputLogsObject)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `RunStepDetailsToolCallsCodeOutputLogsObject`. If the actual instance is not `RunStepDetailsToolCallsCodeOutputLogsObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepDetailsToolCallsCodeOutputLogsObject</returns>
        public RunStepDetailsToolCallsCodeOutputLogsObject GetRunStepDetailsToolCallsCodeOutputLogsObject()
        {
            return (RunStepDetailsToolCallsCodeOutputLogsObject)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepDetailsToolCallsCodeOutputImageObject`. If the actual instance is not `RunStepDetailsToolCallsCodeOutputImageObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepDetailsToolCallsCodeOutputImageObject</returns>
        public RunStepDetailsToolCallsCodeOutputImageObject GetRunStepDetailsToolCallsCodeOutputImageObject()
        {
            return (RunStepDetailsToolCallsCodeOutputImageObject)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner</returns>
        public static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner FromJson(string jsonString)
        {
            RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepDetailsToolCallsCodeOutputImageObject).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = new RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(JsonConvert.DeserializeObject<RunStepDetailsToolCallsCodeOutputImageObject>(jsonString, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.SerializerSettings));
                }
                else
                {
                    newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = new RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(JsonConvert.DeserializeObject<RunStepDetailsToolCallsCodeOutputImageObject>(jsonString, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepDetailsToolCallsCodeOutputImageObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepDetailsToolCallsCodeOutputImageObject: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepDetailsToolCallsCodeOutputLogsObject).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = new RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(JsonConvert.DeserializeObject<RunStepDetailsToolCallsCodeOutputLogsObject>(jsonString, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.SerializerSettings));
                }
                else
                {
                    newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = new RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(JsonConvert.DeserializeObject<RunStepDetailsToolCallsCodeOutputLogsObject>(jsonString, RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepDetailsToolCallsCodeOutputLogsObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepDetailsToolCallsCodeOutputLogsObject: {1}", jsonString, exception.ToString()));
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
            return newRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner;
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
    /// Custom JSON converter for RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
    /// </summary>
    public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner).GetMethod("ToJson").Invoke(value, null)));
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
                    return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
