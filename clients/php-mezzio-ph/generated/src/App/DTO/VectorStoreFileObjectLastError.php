<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The last error associated with this vector store file. Will be &#x60;null&#x60; if there are no errors.
 */
class VectorStoreFileObjectLastError
{
    /**
     * One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code;

    /**
     * A human-readable description of the error.
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
