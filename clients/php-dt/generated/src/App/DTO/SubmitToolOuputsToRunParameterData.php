<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for submitToolOuputsToRun
 */
class SubmitToolOuputsToRunParameterData
{
    /**
     * The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @DTA\Data(subset="path", field="thread_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $thread_id = null;

    /**
     * The ID of the run that requires the tool output submission.
     * @DTA\Data(subset="path", field="run_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $run_id = null;

}
