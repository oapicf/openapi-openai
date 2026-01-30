<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
 */
class FileSearchRankingOptions
{
    /**
     * The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
     * @DTA\Data(field="ranker", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ranker;

    /**
     * The score threshold for the file search. All values must be a floating point number between 0 and 1.
     * @DTA\Data(field="score_threshold")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $score_threshold;

}
