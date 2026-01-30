<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint).
 */
class CreateCompletionResponse
{
    /**
     * A unique identifier for the completion.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The list of completion choices the model generated for the input prompt.
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection36::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection36::class})
     */
    public ?\App\DTO\Collection36 $choices = null;

    /**
     * The Unix timestamp (in seconds) of when the completion was created.
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created = null;

    /**
     * The model used for completion.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.
     * @DTA\Data(field="system_fingerprint", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $system_fingerprint = null;

    /**
     * The object type, which is always \&quot;text_completion\&quot;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="usage", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CompletionUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CompletionUsage::class})
     */
    public ?\App\DTO\CompletionUsage $usage = null;

}
