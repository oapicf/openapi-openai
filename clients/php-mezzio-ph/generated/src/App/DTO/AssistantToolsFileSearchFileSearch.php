<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Overrides for the file search tool.
 */
class AssistantToolsFileSearchFileSearch
{
    /**
     * The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
     * @DTA\Data(field="max_num_results", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":50, "inclusive":true})
     * @var int|null
     */
    public $max_num_results;

    /**
     * @DTA\Data(field="ranking_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FileSearchRankingOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FileSearchRankingOptions::class})
     * @var \App\DTO\FileSearchRankingOptions|null
     */
    public $ranking_options;

}
