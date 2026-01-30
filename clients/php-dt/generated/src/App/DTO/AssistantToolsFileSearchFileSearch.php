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
     * @DTA\Validator(name="Range", options={"min":1, "max":50})
     */
    public ?int $max_num_results = null;

    /**
     * @DTA\Data(field="ranking_options", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FileSearchRankingOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FileSearchRankingOptions::class})
     */
    public ?\App\DTO\FileSearchRankingOptions $ranking_options = null;

}
