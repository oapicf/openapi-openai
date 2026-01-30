<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */
class CreateChatCompletionStreamResponse
{
    /**
     * A unique identifier for the chat completion. Each chunk has the same ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;.
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $choices = null;

    /**
     * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created = null;

    /**
     * The model to generate the completion.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request.
     * @DTA\Data(field="service_tier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $service_tier = null;

    /**
     * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.
     * @DTA\Data(field="system_fingerprint", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $system_fingerprint = null;

    /**
     * The object type, which is always &#x60;chat.completion.chunk&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="usage", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateChatCompletionStreamResponseUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateChatCompletionStreamResponseUsage::class})
     */
    public ?\App\DTO\CreateChatCompletionStreamResponseUsage $usage = null;

}
