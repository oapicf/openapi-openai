namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ResponseFormatJsonSchema 
{
    
    /// <summary>
    /// The type of response format being defined: `json_schema`
    /// </summary>
    /// <value>The type of response format being defined: `json_schema`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum JsonSchemaEnum for json_schema
        /// </summary>
        JsonSchemaEnum = 1
    }

    public TypeEnum Type { get; set; }
    public ResponseFormatJsonSchemaJsonSchema JsonSchema { get; set; }
}


