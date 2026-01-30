<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The details of the run step.
 */
class RunStepObjectStepDetails
{
    /**
     * Always &#x60;message_creation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="message_creation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsMessageCreationObjectMessageCreation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsMessageCreationObjectMessageCreation::class})
     * @var \App\DTO\RunStepDetailsMessageCreationObjectMessageCreation|null
     */
    public $message_creation;

    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.
     * @DTA\Data(field="tool_calls")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\RunStepDetailsToolCallsObjectToolCallsInner[]|null
     */
    public $tool_calls;

}
