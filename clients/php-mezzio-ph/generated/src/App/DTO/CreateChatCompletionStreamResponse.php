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
     * @var string|null
     */
    public $id;

    /**
     * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CreateChatCompletionStreamResponseChoicesInner[]|null
     */
    public $choices;

    /**
     * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created;

    /**
     * The model to generate the completion.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.
     * @DTA\Data(field="system_fingerprint", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $system_fingerprint;

    /**
     * The object type, which is always &#x60;chat.completion.chunk&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

}
