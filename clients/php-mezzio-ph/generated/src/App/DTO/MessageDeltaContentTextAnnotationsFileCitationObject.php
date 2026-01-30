<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
 */
class MessageDeltaContentTextAnnotationsFileCitationObject
{
    /**
     * The index of the annotation in the text content part.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * Always &#x60;file_citation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text in the message content that needs to be replaced.
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="file_citation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::class})
     * @var \App\DTO\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation|null
     */
    public $file_citation;

    /**
     * @DTA\Data(field="start_index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $start_index;

    /**
     * @DTA\Data(field="end_index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $end_index;

}
