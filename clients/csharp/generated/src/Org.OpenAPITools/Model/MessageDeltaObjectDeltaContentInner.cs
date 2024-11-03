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
    /// MessageDeltaObjectDeltaContentInner
    /// </summary>
    [JsonConverter(typeof(MessageDeltaObjectDeltaContentInnerJsonConverter))]
    [DataContract(Name = "MessageDeltaObject_delta_content_inner")]
    public partial class MessageDeltaObjectDeltaContentInner : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageDeltaObjectDeltaContentInner" /> class
        /// with the <see cref="MessageDeltaContentImageFileObject" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of MessageDeltaContentImageFileObject.</param>
        public MessageDeltaObjectDeltaContentInner(MessageDeltaContentImageFileObject actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MessageDeltaObjectDeltaContentInner" /> class
        /// with the <see cref="MessageDeltaContentTextObject" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of MessageDeltaContentTextObject.</param>
        public MessageDeltaObjectDeltaContentInner(MessageDeltaContentTextObject actualInstance)
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
                if (value.GetType() == typeof(MessageDeltaContentImageFileObject) || value is MessageDeltaContentImageFileObject)
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(MessageDeltaContentTextObject) || value is MessageDeltaContentTextObject)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: MessageDeltaContentImageFileObject, MessageDeltaContentTextObject");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `MessageDeltaContentImageFileObject`. If the actual instance is not `MessageDeltaContentImageFileObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of MessageDeltaContentImageFileObject</returns>
        public MessageDeltaContentImageFileObject GetMessageDeltaContentImageFileObject()
        {
            return (MessageDeltaContentImageFileObject)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `MessageDeltaContentTextObject`. If the actual instance is not `MessageDeltaContentTextObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of MessageDeltaContentTextObject</returns>
        public MessageDeltaContentTextObject GetMessageDeltaContentTextObject()
        {
            return (MessageDeltaContentTextObject)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MessageDeltaObjectDeltaContentInner {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, MessageDeltaObjectDeltaContentInner.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of MessageDeltaObjectDeltaContentInner
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of MessageDeltaObjectDeltaContentInner</returns>
        public static MessageDeltaObjectDeltaContentInner FromJson(string jsonString)
        {
            MessageDeltaObjectDeltaContentInner newMessageDeltaObjectDeltaContentInner = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newMessageDeltaObjectDeltaContentInner;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(MessageDeltaContentImageFileObject).GetProperty("AdditionalProperties") == null)
                {
                    newMessageDeltaObjectDeltaContentInner = new MessageDeltaObjectDeltaContentInner(JsonConvert.DeserializeObject<MessageDeltaContentImageFileObject>(jsonString, MessageDeltaObjectDeltaContentInner.SerializerSettings));
                }
                else
                {
                    newMessageDeltaObjectDeltaContentInner = new MessageDeltaObjectDeltaContentInner(JsonConvert.DeserializeObject<MessageDeltaContentImageFileObject>(jsonString, MessageDeltaObjectDeltaContentInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("MessageDeltaContentImageFileObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into MessageDeltaContentImageFileObject: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(MessageDeltaContentTextObject).GetProperty("AdditionalProperties") == null)
                {
                    newMessageDeltaObjectDeltaContentInner = new MessageDeltaObjectDeltaContentInner(JsonConvert.DeserializeObject<MessageDeltaContentTextObject>(jsonString, MessageDeltaObjectDeltaContentInner.SerializerSettings));
                }
                else
                {
                    newMessageDeltaObjectDeltaContentInner = new MessageDeltaObjectDeltaContentInner(JsonConvert.DeserializeObject<MessageDeltaContentTextObject>(jsonString, MessageDeltaObjectDeltaContentInner.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("MessageDeltaContentTextObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into MessageDeltaContentTextObject: {1}", jsonString, exception.ToString()));
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
            return newMessageDeltaObjectDeltaContentInner;
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
    /// Custom JSON converter for MessageDeltaObjectDeltaContentInner
    /// </summary>
    public class MessageDeltaObjectDeltaContentInnerJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(MessageDeltaObjectDeltaContentInner).GetMethod("ToJson").Invoke(value, null)));
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
                    return MessageDeltaObjectDeltaContentInner.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return MessageDeltaObjectDeltaContentInner.FromJson(JArray.Load(reader).ToString(Formatting.None));
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
