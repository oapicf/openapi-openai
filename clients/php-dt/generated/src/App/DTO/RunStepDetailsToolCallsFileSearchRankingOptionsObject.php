<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The ranking options for the file search.
 */
class RunStepDetailsToolCallsFileSearchRankingOptionsObject
{
    /**
     * The ranker used for the file search.
     * @DTA\Data(field="ranker")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ranker = null;

    /**
     * The score threshold for the file search. All values must be a floating point number between 0 and 1.
     * @DTA\Data(field="score_threshold")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1})
     */
    public ?float $score_threshold = null;

}
