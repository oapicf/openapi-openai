namespace Org.OpenAPITools.Models;


/// <summary>
/// An object specifying the format that the model must output.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
/// </summary>
public class CreateChatCompletionRequestResponseFormat 
{
    
    /// <summary>
    /// The type of response format being defined: `text`
    /// </summary>
    /// <value>The type of response format being defined: `text`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 1,
        
        /// <summary>
        /// Enum JsonObjectEnum for json_object
        /// </summary>
        JsonObjectEnum = 2,
        
        /// <summary>
        /// Enum JsonSchemaEnum for json_schema
        /// </summary>
        JsonSchemaEnum = 3
    }

    public TypeEnum Type { get; set; }
    public ResponseFormatJsonSchemaJsonSchema JsonSchema { get; set; }
}


