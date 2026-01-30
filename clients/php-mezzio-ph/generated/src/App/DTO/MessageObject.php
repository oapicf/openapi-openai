<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
class MessageObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The object type, which is always &#x60;thread.message&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The Unix timestamp (in seconds) for when the message was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The [thread](/docs/api-reference/threads) ID that this message belongs to.
     * @DTA\Data(field="thread_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $thread_id;

    /**
     * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * @DTA\Data(field="incomplete_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageObjectIncompleteDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageObjectIncompleteDetails::class})
     * @var \App\DTO\MessageObjectIncompleteDetails|null
     */
    public $incomplete_details;

    /**
     * The Unix timestamp (in seconds) for when the message was completed.
     * @DTA\Data(field="completed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $completed_at;

    /**
     * The Unix timestamp (in seconds) for when the message was marked as incomplete.
     * @DTA\Data(field="incomplete_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $incomplete_at;

    /**
     * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * The content of the message in array of text and/or images.
     * @DTA\Data(field="content")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection135::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection135::class})
     * @var \App\DTO\Collection135|null
     */
    public $content;

    /**
     * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     * @DTA\Data(field="assistant_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $assistant_id;

    /**
     * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
     * @DTA\Data(field="run_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $run_id;

    /**
     * A list of files attached to the message, and the tools they were added to.
     * @DTA\Data(field="attachments")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection136::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection136::class})
     * @var \App\DTO\Collection136|null
     */
    public $attachments;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

}
