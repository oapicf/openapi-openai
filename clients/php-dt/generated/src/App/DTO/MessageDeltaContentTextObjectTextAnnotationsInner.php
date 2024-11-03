<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MessageDeltaContentTextObjectTextAnnotationsInner
{
    /**
     * The index of the annotation in the text content part.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * Always &#x60;file_citation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The text in the message content that needs to be replaced.
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * @DTA\Data(field="file_citation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::class})
     */
    public ?\App\DTO\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation $file_citation = null;

    /**
     * @DTA\Data(field="start_index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $start_index = null;

    /**
     * @DTA\Data(field="end_index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $end_index = null;

    /**
     * @DTA\Data(field="file_path", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentTextAnnotationsFilePathObjectFilePath::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentTextAnnotationsFilePathObjectFilePath::class})
     */
    public ?\App\DTO\MessageDeltaContentTextAnnotationsFilePathObjectFilePath $file_path = null;

}
