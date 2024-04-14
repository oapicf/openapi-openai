<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
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

    /**
     * @DTA\Data(field="image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::class})
     */
    public ?\App\DTO\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage $image = null;

}
