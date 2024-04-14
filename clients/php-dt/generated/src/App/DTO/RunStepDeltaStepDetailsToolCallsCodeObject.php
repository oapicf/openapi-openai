<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
class RunStepDeltaStepDetailsToolCallsCodeObject
{
    /**
     * The index of the tool call in the tool calls array.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * The ID of the tool call.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="code_interpreter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter::class})
     */
    public ?\App\DTO\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter $code_interpreter = null;

}
