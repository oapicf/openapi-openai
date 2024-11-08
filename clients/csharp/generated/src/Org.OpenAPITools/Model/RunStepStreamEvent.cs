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
    /// RunStepStreamEvent
    /// </summary>
    [JsonConverter(typeof(RunStepStreamEventJsonConverter))]
    [DataContract(Name = "RunStepStreamEvent")]
    public partial class RunStepStreamEvent : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf1" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf1.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf1 actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf2" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf2.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf2 actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf3" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf3.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf3 actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf4" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf4.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf4 actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf5" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf5.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf5 actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunStepStreamEvent" /> class
        /// with the <see cref="RunStepStreamEventOneOf6" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RunStepStreamEventOneOf6.</param>
        public RunStepStreamEvent(RunStepStreamEventOneOf6 actualInstance)
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
                if (value.GetType() == typeof(RunStepStreamEventOneOf) || value is RunStepStreamEventOneOf)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepStreamEventOneOf1) || value is RunStepStreamEventOneOf1)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepStreamEventOneOf2) || value is RunStepStreamEventOneOf2)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepStreamEventOneOf3) || value is RunStepStreamEventOneOf3)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepStreamEventOneOf4) || value is RunStepStreamEventOneOf4)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepStreamEventOneOf5) || value is RunStepStreamEventOneOf5)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(RunStepStreamEventOneOf6) || value is RunStepStreamEventOneOf6)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf`. If the actual instance is not `RunStepStreamEventOneOf`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf</returns>
        public RunStepStreamEventOneOf GetRunStepStreamEventOneOf()
        {
            return (RunStepStreamEventOneOf)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf1`. If the actual instance is not `RunStepStreamEventOneOf1`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf1</returns>
        public RunStepStreamEventOneOf1 GetRunStepStreamEventOneOf1()
        {
            return (RunStepStreamEventOneOf1)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf2`. If the actual instance is not `RunStepStreamEventOneOf2`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf2</returns>
        public RunStepStreamEventOneOf2 GetRunStepStreamEventOneOf2()
        {
            return (RunStepStreamEventOneOf2)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf3`. If the actual instance is not `RunStepStreamEventOneOf3`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf3</returns>
        public RunStepStreamEventOneOf3 GetRunStepStreamEventOneOf3()
        {
            return (RunStepStreamEventOneOf3)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf4`. If the actual instance is not `RunStepStreamEventOneOf4`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf4</returns>
        public RunStepStreamEventOneOf4 GetRunStepStreamEventOneOf4()
        {
            return (RunStepStreamEventOneOf4)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf5`. If the actual instance is not `RunStepStreamEventOneOf5`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf5</returns>
        public RunStepStreamEventOneOf5 GetRunStepStreamEventOneOf5()
        {
            return (RunStepStreamEventOneOf5)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RunStepStreamEventOneOf6`. If the actual instance is not `RunStepStreamEventOneOf6`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RunStepStreamEventOneOf6</returns>
        public RunStepStreamEventOneOf6 GetRunStepStreamEventOneOf6()
        {
            return (RunStepStreamEventOneOf6)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RunStepStreamEvent {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, RunStepStreamEvent.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of RunStepStreamEvent
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of RunStepStreamEvent</returns>
        public static RunStepStreamEvent FromJson(string jsonString)
        {
            RunStepStreamEvent newRunStepStreamEvent = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newRunStepStreamEvent;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf1).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf1>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf1>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf1");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf1: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf2).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf2>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf2>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf2");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf2: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf3).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf3>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf3>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf3");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf3: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf4).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf4>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf4>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf4");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf4: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf5).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf5>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf5>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf5");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf5: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(RunStepStreamEventOneOf6).GetProperty("AdditionalProperties") == null)
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf6>(jsonString, RunStepStreamEvent.SerializerSettings));
                }
                else
                {
                    newRunStepStreamEvent = new RunStepStreamEvent(JsonConvert.DeserializeObject<RunStepStreamEventOneOf6>(jsonString, RunStepStreamEvent.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("RunStepStreamEventOneOf6");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RunStepStreamEventOneOf6: {1}", jsonString, exception.ToString()));
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
            return newRunStepStreamEvent;
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
    /// Custom JSON converter for RunStepStreamEvent
    /// </summary>
    public class RunStepStreamEventJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(RunStepStreamEvent).GetMethod("ToJson").Invoke(value, null)));
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
                    return RunStepStreamEvent.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return RunStepStreamEvent.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
