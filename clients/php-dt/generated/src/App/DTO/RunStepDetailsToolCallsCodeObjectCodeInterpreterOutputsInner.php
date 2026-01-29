<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
{
    /**
     * Always &#x60;logs&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The text output from the Code Interpreter tool call.
     * @DTA\Data(field="logs")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $logs = null;

    /**
     * @DTA\Data(field="image")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsCodeOutputImageObjectImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsCodeOutputImageObjectImage::class})
     */
    public ?\App\DTO\RunStepDetailsToolCallsCodeOutputImageObjectImage $image = null;

}
