<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length.
 */
class AssistantsApiResponseFormatOption
{
    /**
     * The type of response format being defined: &#x60;text&#x60;
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="json_schema")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ResponseFormatJsonSchemaJsonSchema::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ResponseFormatJsonSchemaJsonSchema::class})
     * @var \App\DTO\ResponseFormatJsonSchemaJsonSchema|null
     */
    public $json_schema;

}
