<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * For now, this is always going to be an empty object.
 */
class RunStepDetailsToolCallsFileSearchObjectFileSearch
{
    /**
     * @DTA\Data(field="ranking_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchRankingOptionsObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchRankingOptionsObject::class})
     */
    public ?\App\DTO\RunStepDetailsToolCallsFileSearchRankingOptionsObject $ranking_options = null;

    /**
     * The results of the file search.
     * @DTA\Data(field="results", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $results = null;

}
