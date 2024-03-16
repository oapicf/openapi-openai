<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OpenAIFile
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bytes = null;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="filename")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $filename = null;

    /**
     * @DTA\Data(field="purpose")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purpose = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * @DTA\Data(field="status_details", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $status_details = null;

}
