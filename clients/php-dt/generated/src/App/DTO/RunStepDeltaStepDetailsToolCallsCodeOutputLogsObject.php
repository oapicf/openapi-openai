<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
{
    /**
     * The index of the output in the outputs array.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * Always &#x60;logs&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The text output from the Code Interpreter tool call.
     * @DTA\Data(field="logs", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $logs = null;

}
