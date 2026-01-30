<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ModifyAssistantRequest
{
    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * The name of the assistant. The maximum length is 256 characters.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $name = null;

    /**
     * The description of the assistant. The maximum length is 512 characters.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":512})
     */
    public ?string $description = null;

    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters.
     * @DTA\Data(field="instructions", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256000})
     */
    public ?string $instructions = null;

    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.
     * @DTA\Data(field="tools", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection9::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection9::class})
     */
    public ?\App\DTO\Collection9 $tools = null;

    /**
     * @DTA\Data(field="tool_resources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModifyAssistantRequestToolResources::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModifyAssistantRequestToolResources::class})
     */
    public ?\App\DTO\ModifyAssistantRequestToolResources $tool_resources = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metadata = null;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":2})
     */
    public ?float $temperature = null;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.
     * @DTA\Data(field="top_p", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1})
     */
    public ?float $top_p = null;

    /**
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     */
    public ?\App\DTO\AssistantsApiResponseFormatOption $response_format = null;

}
