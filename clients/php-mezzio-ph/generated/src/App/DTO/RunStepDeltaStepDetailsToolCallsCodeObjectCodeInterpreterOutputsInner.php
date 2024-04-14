<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
{
    /**
     * The index of the output in the outputs array.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * Always &#x60;logs&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text output from the Code Interpreter tool call.
     * @DTA\Data(field="logs", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $logs;

    /**
     * @DTA\Data(field="image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::class})
     * @var \App\DTO\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage|null
     */
    public $image;

}
