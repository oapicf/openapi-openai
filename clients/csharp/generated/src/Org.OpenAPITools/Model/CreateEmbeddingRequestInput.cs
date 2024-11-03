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
    /// Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
    /// </summary>
    [JsonConverter(typeof(CreateEmbeddingRequestInputJsonConverter))]
    [DataContract(Name = "CreateEmbeddingRequest_input")]
    public partial class CreateEmbeddingRequestInput : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingRequestInput" /> class
        /// with the <see cref="string" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of string.</param>
        public CreateEmbeddingRequestInput(string actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingRequestInput" /> class
        /// with the <see cref="List{String}" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of List&lt;string&gt;.</param>
        public CreateEmbeddingRequestInput(List<string> actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingRequestInput" /> class
        /// with the <see cref="List{int}" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of List&lt;int&gt;.</param>
        public CreateEmbeddingRequestInput(List<int> actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateEmbeddingRequestInput" /> class
        /// with the <see cref="List{List{int}}" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of List&lt;List&lt;int&gt;&gt;.</param>
        public CreateEmbeddingRequestInput(List<List<int>> actualInstance)
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
                if (value.GetType() == typeof(List<List<int>>) || value is List<List<int>>)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(List<int>) || value is List<int>)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(List<string>) || value is List<string>)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(string) || value is string)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: List<List<int>>, List<int>, List<string>, string");
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
        /// Get the actual instance of `List&lt;string&gt;`. If the actual instance is not `List&lt;string&gt;`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of List&lt;string&gt;</returns>
        public List<string> GetList()
        {
            return (List<string>)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `List&lt;int&gt;`. If the actual instance is not `List&lt;int&gt;`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of List&lt;int&gt;</returns>
        public List<int> GetList()
        {
            return (List<int>)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `List&lt;List&lt;int&gt;&gt;`. If the actual instance is not `List&lt;List&lt;int&gt;&gt;`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of List&lt;List&lt;int&gt;&gt;</returns>
        public List<List<int>> GetList()
        {
            return (List<List<int>>)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateEmbeddingRequestInput {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, CreateEmbeddingRequestInput.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CreateEmbeddingRequestInput
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CreateEmbeddingRequestInput</returns>
        public static CreateEmbeddingRequestInput FromJson(string jsonString)
        {
            CreateEmbeddingRequestInput newCreateEmbeddingRequestInput = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCreateEmbeddingRequestInput;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(List<List<int>>).GetProperty("AdditionalProperties") == null)
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<List<List<int>>>(jsonString, CreateEmbeddingRequestInput.SerializerSettings));
                }
                else
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<List<List<int>>>(jsonString, CreateEmbeddingRequestInput.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("List<List<int>>");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into List<List<int>>: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(List<int>).GetProperty("AdditionalProperties") == null)
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<List<int>>(jsonString, CreateEmbeddingRequestInput.SerializerSettings));
                }
                else
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<List<int>>(jsonString, CreateEmbeddingRequestInput.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("List<int>");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into List<int>: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(List<string>).GetProperty("AdditionalProperties") == null)
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<List<string>>(jsonString, CreateEmbeddingRequestInput.SerializerSettings));
                }
                else
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<List<string>>(jsonString, CreateEmbeddingRequestInput.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("List<string>");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into List<string>: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(string).GetProperty("AdditionalProperties") == null)
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<string>(jsonString, CreateEmbeddingRequestInput.SerializerSettings));
                }
                else
                {
                    newCreateEmbeddingRequestInput = new CreateEmbeddingRequestInput(JsonConvert.DeserializeObject<string>(jsonString, CreateEmbeddingRequestInput.AdditionalPropertiesSerializerSettings));
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
            return newCreateEmbeddingRequestInput;
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
    /// Custom JSON converter for CreateEmbeddingRequestInput
    /// </summary>
    public class CreateEmbeddingRequestInputJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CreateEmbeddingRequestInput).GetMethod("ToJson").Invoke(value, null)));
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
                    return new CreateEmbeddingRequestInput(Convert.ToString(reader.Value));
                case JsonToken.StartObject:
                    return CreateEmbeddingRequestInput.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return CreateEmbeddingRequestInput.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
