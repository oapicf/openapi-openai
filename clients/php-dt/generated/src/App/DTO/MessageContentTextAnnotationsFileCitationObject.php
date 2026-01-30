<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
 */
class MessageContentTextAnnotationsFileCitationObject
{
    /**
     * Always &#x60;file_citation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The text in the message content that needs to be replaced.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * @DTA\Data(field="file_citation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentTextAnnotationsFileCitationObjectFileCitation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentTextAnnotationsFileCitationObjectFileCitation::class})
     */
    public ?\App\DTO\MessageContentTextAnnotationsFileCitationObjectFileCitation $file_citation = null;

    /**
     * @DTA\Data(field="start_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $start_index = null;

    /**
     * @DTA\Data(field="end_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $end_index = null;

}
