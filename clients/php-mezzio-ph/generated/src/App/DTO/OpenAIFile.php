<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OpenAIFile
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bytes;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * @DTA\Data(field="filename")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $filename;

    /**
     * @DTA\Data(field="purpose")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $purpose;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * @DTA\Data(field="status_details", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $status_details;

}
