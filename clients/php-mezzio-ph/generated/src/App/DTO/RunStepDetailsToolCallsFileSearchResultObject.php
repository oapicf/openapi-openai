<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A result instance of the file search.
 */
class RunStepDetailsToolCallsFileSearchResultObject
{
    /**
     * The ID of the file that result was found in.
     * @DTA\Data(field="file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $file_id;

    /**
     * The name of the file that result was found in.
     * @DTA\Data(field="file_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $file_name;

    /**
     * The score of the result. All values must be a floating point number between 0 and 1.
     * @DTA\Data(field="score")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $score;

    /**
     * The content of the result that was found. The content is only included if requested via the include query parameter.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\RunStepDetailsToolCallsFileSearchResultObjectContentInner[]|null
     */
    public $content;

}
