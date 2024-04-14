<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
class RunStepDetailsToolCallsCodeOutputLogsObject
{
    /**
     * Always &#x60;logs&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text output from the Code Interpreter tool call.
     * @DTA\Data(field="logs")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $logs;

}
