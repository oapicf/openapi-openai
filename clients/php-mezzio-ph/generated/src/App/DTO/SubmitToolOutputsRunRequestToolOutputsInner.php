<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SubmitToolOutputsRunRequestToolOutputsInner
{
    /**
     * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
     * @DTA\Data(field="tool_call_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $tool_call_id;

    /**
     * The output of the tool call to be submitted to continue the run.
     * @DTA\Data(field="output", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $output;

}
