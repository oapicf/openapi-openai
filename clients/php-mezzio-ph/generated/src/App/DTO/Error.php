<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Error
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

    /**
     * @DTA\Data(field="param")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $param;

    /**
     * @DTA\Data(field="code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code;

}
