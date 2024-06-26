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
    /// The role of the author of a message
    /// </summary>
    /// <value>The role of the author of a message</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ChatCompletionRole
    {
        /// <summary>
        /// Enum System for value: system
        /// </summary>
        [EnumMember(Value = "system")]
        System = 1,

        /// <summary>
        /// Enum User for value: user
        /// </summary>
        [EnumMember(Value = "user")]
        User = 2,

        /// <summary>
        /// Enum Assistant for value: assistant
        /// </summary>
        [EnumMember(Value = "assistant")]
        Assistant = 3,

        /// <summary>
        /// Enum Tool for value: tool
        /// </summary>
        [EnumMember(Value = "tool")]
        Tool = 4,

        /// <summary>
        /// Enum Function for value: function
        /// </summary>
        [EnumMember(Value = "function")]
        Function = 5
    }

}
