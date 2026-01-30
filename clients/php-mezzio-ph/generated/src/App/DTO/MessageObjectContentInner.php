<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MessageObjectContentInner
{
    /**
     * Always &#x60;image_file&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="image_file")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentImageFileObjectImageFile::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentImageFileObjectImageFile::class})
     * @var \App\DTO\MessageContentImageFileObjectImageFile|null
     */
    public $image_file;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentImageUrlObjectImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentImageUrlObjectImageUrl::class})
     * @var \App\DTO\MessageContentImageUrlObjectImageUrl|null
     */
    public $image_url;

    /**
     * @DTA\Data(field="text")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentTextObjectText::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentTextObjectText::class})
     * @var \App\DTO\MessageContentTextObjectText|null
     */
    public $text;

    /**
     * @DTA\Data(field="refusal")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $refusal;

}
