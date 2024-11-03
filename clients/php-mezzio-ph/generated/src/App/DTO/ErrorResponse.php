<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ErrorResponse
{
    /**
     * @DTA\Data(field="error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Error::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Error::class})
     * @var \App\DTO\Error|null
     */
    public $error;

}
