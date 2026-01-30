<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */
class AssistantObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;assistant&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the assistant was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The name of the assistant. The maximum length is 256 characters.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $name = null;

    /**
     * The description of the assistant. The maximum length is 512 characters.
     * @DTA\Data(field="description")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":512})
     */
    public ?string $description = null;

    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters.
     * @DTA\Data(field="instructions")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256000})
     */
    public ?string $instructions = null;

    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.
     * @DTA\Data(field="tools")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     */
    public ?\App\DTO\Collection $tools = null;

    /**
     * @DTA\Data(field="tool_resources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantObjectToolResources::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantObjectToolResources::class})
     */
    public ?\App\DTO\AssistantObjectToolResources $tool_resources = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata")
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
