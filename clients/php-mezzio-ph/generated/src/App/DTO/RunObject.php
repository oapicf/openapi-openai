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
     * @var string|null
     */
    public $id;

    /**
     * The object type, which is always &#x60;thread.run&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The Unix timestamp (in seconds) for when the run was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @DTA\Data(field="thread_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $thread_id;

    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @DTA\Data(field="assistant_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $assistant_id;

    /**
     * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * @DTA\Data(field="required_action")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectRequiredAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectRequiredAction::class})
     * @var \App\DTO\RunObjectRequiredAction|null
     */
    public $required_action;

    /**
     * @DTA\Data(field="last_error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectLastError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectLastError::class})
     * @var \App\DTO\RunObjectLastError|null
     */
    public $last_error;

    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     * @DTA\Data(field="expires_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_at;

    /**
     * The Unix timestamp (in seconds) for when the run was started.
     * @DTA\Data(field="started_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $started_at;

    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     * @DTA\Data(field="cancelled_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cancelled_at;

    /**
     * The Unix timestamp (in seconds) for when the run failed.
     * @DTA\Data(field="failed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $failed_at;

    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     * @DTA\Data(field="completed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $completed_at;

    /**
     * @DTA\Data(field="incomplete_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectIncompleteDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectIncompleteDetails::class})
     * @var \App\DTO\RunObjectIncompleteDetails|null
     */
    public $incomplete_details;

    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="instructions")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $instructions;

    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="tools")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection46::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection46::class})
     * @var \App\DTO\Collection46|null
     */
    public $tools;

    /**
     * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
     * @DTA\Data(field="file_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection47::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection47::class})
     * @var \App\DTO\Collection47|null
     */
    public $file_ids;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @DTA\Data(field="metadata")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

    /**
     * @DTA\Data(field="usage")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunCompletionUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunCompletionUsage::class})
     * @var \App\DTO\RunCompletionUsage|null
     */
    public $usage;

    /**
     * The sampling temperature used for this run. If not set, defaults to 1.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $temperature;

    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run.
     * @DTA\Data(field="max_prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":256, "inclusive":true})
     * @var int|null
     */
    public $max_prompt_tokens;

    /**
     * The maximum number of completion tokens specified to have been used over the course of the run.
     * @DTA\Data(field="max_completion_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":256, "inclusive":true})
     * @var int|null
     */
    public $max_completion_tokens;

    /**
     * @DTA\Data(field="truncation_strategy")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TruncationObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TruncationObject::class})
     * @var \App\DTO\TruncationObject|null
     */
    public $truncation_strategy;

    /**
     * @DTA\Data(field="tool_choice")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiToolChoiceOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiToolChoiceOption::class})
     * @var \App\DTO\AssistantsApiToolChoiceOption|null
     */
    public $tool_choice;

    /**
     * @DTA\Data(field="response_format")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsApiResponseFormatOption::class})
     * @var \App\DTO\AssistantsApiResponseFormatOption|null
     */
    public $response_format;

}
