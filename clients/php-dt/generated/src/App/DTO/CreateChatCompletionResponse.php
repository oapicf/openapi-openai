<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
class CreateChatCompletionResponse
{
    /**
     * A unique identifier for the chat completion.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection10::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection10::class})
     */
    public ?\App\DTO\Collection10 $choices = null;

    /**
     * The Unix timestamp (in seconds) of when the chat completion was created.
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created = null;

    /**
     * The model used for the chat completion.
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
     * The object type, which is always &#x60;chat.completion&#x60;.
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
