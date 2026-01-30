<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
class RunObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;thread.run&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the run was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @DTA\Data(field="thread_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $thread_id = null;

    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @DTA\Data(field="assistant_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $assistant_id = null;

    /**
     * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * @DTA\Data(field="required_action")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectRequiredAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectRequiredAction::class})
     */
    public ?\App\DTO\RunObjectRequiredAction $required_action = null;

    /**
     * @DTA\Data(field="last_error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectLastError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectLastError::class})
     */
    public ?\App\DTO\RunObjectLastError $last_error = null;

    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     * @DTA\Data(field="expires_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $expires_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run was started.
     * @DTA\Data(field="started_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $started_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     * @DTA\Data(field="cancelled_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $cancelled_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run failed.
     * @DTA\Data(field="failed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $failed_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     * @DTA\Data(field="completed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completed_at = null;

    /**
     * @DTA\Data(field="incomplete_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectIncompleteDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectIncompleteDetails::class})
     */
    public ?\App\DTO\RunObjectIncompleteDetails $incomplete_details = null;

    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="instructions")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $instructions = null;

    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="tools")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection134::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection134::class})
     */
    public ?\App\DTO\Collection134 $tools = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metadata = null;

    /**
     * @DTA\Data(field="usage")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunCompletionUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunCompletionUsage::class})
     */
    public ?\App\DTO\RunCompletionUsage $usage = null;

    /**
     * The sampling temperature used for this run. If not set, defaults to 1.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $temperature = null;

    /**
     * The nucleus sampling value used for this run. If not set, defaults to 1.
     * @DTA\Data(field="top_p", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $top_p = null;

    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run.
     * @DTA\Data(field="max_prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":256})
     */
    public ?int $max_prompt_tokens = null;

    /**
     * The maximum number of completion tokens specified to have been used over the course of the run.
     * @DTA\Data(field="max_completion_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":256})
     */
    public ?int $max_completion_tokens = null;

    /**
     * @DTA\Data(field="truncation_strategy")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TruncationObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TruncationObject::class})
     */
    public ?\App\DTO\TruncationObject $truncation_strategy = null;

    /**
     * @DTA\Data(field="tool_choice")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiToolChoiceOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiToolChoiceOption::class})
     */
    public ?\App\DTO\AssistantsApiToolChoiceOption $tool_choice = null;

    /**
     * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @DTA\Data(field="parallel_tool_calls")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $parallel_tool_calls = null;

    /**
     * @DTA\Data(field="response_format")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     */
    public ?\App\DTO\AssistantsApiResponseFormatOption $response_format = null;

}
