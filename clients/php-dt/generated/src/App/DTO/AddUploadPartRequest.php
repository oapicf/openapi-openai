<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AddUploadPartRequest
{
    /**
     * The chunk of bytes for this Part.
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $data = null;

}
