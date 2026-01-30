<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateThreadAndRunRequest
{
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @DTA\Data(field="assistant_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $assistant_id;

    /**
     * @DTA\Data(field="thread", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateThreadRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateThreadRequest::class})
     * @var \App\DTO\CreateThreadRequest|null
     */
    public $thread;

    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateRunRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateRunRequestModel::class})
     * @var \App\DTO\CreateRunRequestModel|null
     */
    public $model;

    /**
     * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @DTA\Data(field="instructions", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $instructions;

    /**
     * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @DTA\Data(field="tools", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection132::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection132::class})
     * @var \App\DTO\Collection132|null
     */
    public $tools;

    /**
     * @DTA\Data(field="tool_resources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateThreadAndRunRequestToolResources::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateThreadAndRunRequestToolResources::class})
     * @var \App\DTO\CreateThreadAndRunRequestToolResources|null
     */
    public $tool_resources;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2, "inclusive":true})
     * @var float|null
     */
    public $temperature;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.
     * @DTA\Data(field="top_p", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $top_p;

    /**
     * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.
     * @DTA\Data(field="stream", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $stream;

    /**
     * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.
     * @DTA\Data(field="max_prompt_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":256, "inclusive":true})
     * @var int|null
     */
    public $max_prompt_tokens;

    /**
     * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.
     * @DTA\Data(field="max_completion_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":256, "inclusive":true})
     * @var int|null
     */
    public $max_completion_tokens;

    /**
     * @DTA\Data(field="truncation_strategy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TruncationObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TruncationObject::class})
     * @var \App\DTO\TruncationObject|null
     */
    public $truncation_strategy;

    /**
     * @DTA\Data(field="tool_choice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiToolChoiceOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiToolChoiceOption::class})
     * @var \App\DTO\AssistantsApiToolChoiceOption|null
     */
    public $tool_choice;

    /**
     * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @DTA\Data(field="parallel_tool_calls", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $parallel_tool_calls;

    /**
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     * @var \App\DTO\AssistantsApiResponseFormatOption|null
     */
    public $response_format;

}
