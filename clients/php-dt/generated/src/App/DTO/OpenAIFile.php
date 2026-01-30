<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */
class OpenAIFile
{
    /**
     * The file identifier, which can be referenced in the API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The size of the file, in bytes.
     * @DTA\Data(field="bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bytes = null;

    /**
     * The Unix timestamp (in seconds) for when the file was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The name of the file.
     * @DTA\Data(field="filename")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $filename = null;

    /**
     * The object type, which is always &#x60;file&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
     * @DTA\Data(field="purpose")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purpose = null;

    /**
     * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
     * @DTA\Data(field="status_details", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status_details = null;

}
