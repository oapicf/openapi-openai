<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MessageContentTextAnnotationsFileCitationObjectFileCitation
{
    /**
     * The ID of the specific File the citation is from.
     * @DTA\Data(field="file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file_id = null;

    /**
     * The specific quote in the file.
     * @DTA\Data(field="quote")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $quote = null;

}
