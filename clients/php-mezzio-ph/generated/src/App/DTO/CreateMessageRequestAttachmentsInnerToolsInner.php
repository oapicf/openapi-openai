<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateMessageRequestAttachmentsInnerToolsInner
{
    /**
     * The type of tool being defined: &#x60;code_interpreter&#x60;
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

}
