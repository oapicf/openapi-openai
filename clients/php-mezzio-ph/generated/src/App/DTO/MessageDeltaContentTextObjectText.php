<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MessageDeltaContentTextObjectText
{
    /**
     * The data that makes up the text.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

    /**
     * @DTA\Data(field="annotations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\MessageDeltaContentTextObjectTextAnnotationsInner[]|null
     */
    public $annotations;

}
