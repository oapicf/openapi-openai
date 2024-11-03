<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MessageContentTextObjectTextAnnotationsInner
{
    /**
     * Always &#x60;file_citation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text in the message content that needs to be replaced.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="file_citation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentTextAnnotationsFileCitationObjectFileCitation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentTextAnnotationsFileCitationObjectFileCitation::class})
     * @var \App\DTO\MessageContentTextAnnotationsFileCitationObjectFileCitation|null
     */
    public $file_citation;

    /**
     * @DTA\Data(field="start_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $start_index;

    /**
     * @DTA\Data(field="end_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $end_index;

    /**
     * @DTA\Data(field="file_path")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentTextAnnotationsFilePathObjectFilePath::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentTextAnnotationsFilePathObjectFilePath::class})
     * @var \App\DTO\MessageContentTextAnnotationsFilePathObjectFilePath|null
     */
    public $file_path;

}
