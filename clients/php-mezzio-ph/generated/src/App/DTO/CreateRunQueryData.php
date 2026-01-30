<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for createRun
 */
class CreateRunQueryData
{
    /**
     * A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.
     * @DTA\Data(field="include[]", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $include;

}
