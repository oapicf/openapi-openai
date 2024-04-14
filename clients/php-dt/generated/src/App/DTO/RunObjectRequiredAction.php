<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */
class RunObjectRequiredAction
{
    /**
     * For now, this is always &#x60;submit_tool_outputs&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="submit_tool_outputs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObjectRequiredActionSubmitToolOutputs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObjectRequiredActionSubmitToolOutputs::class})
     */
    public ?\App\DTO\RunObjectRequiredActionSubmitToolOutputs $submit_tool_outputs = null;

}
