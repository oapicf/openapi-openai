<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DefaultProjectErrorResponse
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $code = null;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
