<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BatchErrorsDataInner
{
    /**
     * An error code identifying the error type.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code;

    /**
     * A human-readable message providing more details about the error.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

    /**
     * The name of the parameter that caused the error, if applicable.
     * @DTA\Data(field="param", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $param;

    /**
     * The line number of the input file where the error occurred, if applicable.
     * @DTA\Data(field="line", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $line;

}
