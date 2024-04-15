<?php
/**
 * MessageObject
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the MessageObject model.
 *
 * Represents a message within a [thread](/docs/api-reference/threads).
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageObject 
{
        /**
     * The identifier, which can be referenced in API endpoints.
     *
     * @var string|null
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $id = null;

    /**
     * The object type, which is always &#x60;thread.message&#x60;.
     *
     * @var string|null
     * @SerializedName("object")
     * @Assert\NotNull()
     * @Assert\Choice({ "thread.message" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the message was created.
     *
     * @var int|null
     * @SerializedName("created_at")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $createdAt = null;

    /**
     * The [thread](/docs/api-reference/threads) ID that this message belongs to.
     *
     * @var string|null
     * @SerializedName("thread_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $threadId = null;

    /**
     * The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;.
     *
     * @var string|null
     * @SerializedName("status")
     * @Assert\NotNull()
     * @Assert\Choice({ "in_progress", "incomplete", "completed" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $status = null;

    /**
     * @var MessageObjectIncompleteDetails|null
     * @SerializedName("incomplete_details")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\MessageObjectIncompleteDetails")
     * @Type("OpenAPI\Server\Model\MessageObjectIncompleteDetails")
     */
    protected ?MessageObjectIncompleteDetails $incompleteDetails = null;

    /**
     * The Unix timestamp (in seconds) for when the message was completed.
     *
     * @var int|null
     * @SerializedName("completed_at")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $completedAt = null;

    /**
     * The Unix timestamp (in seconds) for when the message was marked as incomplete.
     *
     * @var int|null
     * @SerializedName("incomplete_at")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $incompleteAt = null;

    /**
     * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     *
     * @var string|null
     * @SerializedName("role")
     * @Assert\NotNull()
     * @Assert\Choice({ "user", "assistant" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $role = null;

    /**
     * The content of the message in array of text and/or images.
     *
     * @var MessageObjectContentInner[]|null
     * @SerializedName("content")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\MessageObjectContentInner")
     * })
     * @Type("array<OpenAPI\Server\Model\MessageObjectContentInner>")
     */
    protected ?array $content = null;

    /**
     * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     *
     * @var string|null
     * @SerializedName("assistant_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $assistantId = null;

    /**
     * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints.
     *
     * @var string|null
     * @SerializedName("run_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $runId = null;

    /**
     * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     *
     * @var string[]|null
     * @SerializedName("file_ids")
     * @Assert\NotNull()
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     * @Assert\Count(
     *   max = 10
     * )
     */
    protected ?array $fileIds = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     *
     * @var array|null
     * @SerializedName("metadata")
     * @Assert\NotNull()
     * @Assert\Type("array")
     * @Type("array")
     */
    protected ?array $metadata = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
            $this->createdAt = array_key_exists('createdAt', $data) ? $data['createdAt'] : $this->createdAt;
            $this->threadId = array_key_exists('threadId', $data) ? $data['threadId'] : $this->threadId;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->incompleteDetails = array_key_exists('incompleteDetails', $data) ? $data['incompleteDetails'] : $this->incompleteDetails;
            $this->completedAt = array_key_exists('completedAt', $data) ? $data['completedAt'] : $this->completedAt;
            $this->incompleteAt = array_key_exists('incompleteAt', $data) ? $data['incompleteAt'] : $this->incompleteAt;
            $this->role = array_key_exists('role', $data) ? $data['role'] : $this->role;
            $this->content = array_key_exists('content', $data) ? $data['content'] : $this->content;
            $this->assistantId = array_key_exists('assistantId', $data) ? $data['assistantId'] : $this->assistantId;
            $this->runId = array_key_exists('runId', $data) ? $data['runId'] : $this->runId;
            $this->fileIds = array_key_exists('fileIds', $data) ? $data['fileIds'] : $this->fileIds;
            $this->metadata = array_key_exists('metadata', $data) ? $data['metadata'] : $this->metadata;
        }
    }

    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }



    /**
     * Sets id.
     *
     * @param string|null $id  The identifier, which can be referenced in API endpoints.
     *
     * @return $this
     */
    public function setId(?string $id): self
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets object.
     *
     * @return string|null
     */
    public function getObject(): ?string
    {
        return $this->object;
    }



    /**
     * Sets object.
     *
     * @param string|null $object  The object type, which is always `thread.message`.
     *
     * @return $this
     */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }

    /**
     * Gets createdAt.
     *
     * @return int|null
     */
    public function getCreatedAt(): ?int
    {
        return $this->createdAt;
    }



    /**
     * Sets createdAt.
     *
     * @param int|null $createdAt  The Unix timestamp (in seconds) for when the message was created.
     *
     * @return $this
     */
    public function setCreatedAt(?int $createdAt): self
    {
        $this->createdAt = $createdAt;

        return $this;
    }

    /**
     * Gets threadId.
     *
     * @return string|null
     */
    public function getThreadId(): ?string
    {
        return $this->threadId;
    }



    /**
     * Sets threadId.
     *
     * @param string|null $threadId  The [thread](/docs/api-reference/threads) ID that this message belongs to.
     *
     * @return $this
     */
    public function setThreadId(?string $threadId): self
    {
        $this->threadId = $threadId;

        return $this;
    }

    /**
     * Gets status.
     *
     * @return string|null
     */
    public function getStatus(): ?string
    {
        return $this->status;
    }



    /**
     * Sets status.
     *
     * @param string|null $status  The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
     *
     * @return $this
     */
    public function setStatus(?string $status): self
    {
        $this->status = $status;

        return $this;
    }

    /**
     * Gets incompleteDetails.
     *
     * @return MessageObjectIncompleteDetails|null
     */
    public function getIncompleteDetails(): ?MessageObjectIncompleteDetails
    {
        return $this->incompleteDetails;
    }



    /**
     * Sets incompleteDetails.
     *
     * @param MessageObjectIncompleteDetails|null $incompleteDetails
     *
     * @return $this
     */
    public function setIncompleteDetails(?MessageObjectIncompleteDetails $incompleteDetails): self
    {
        $this->incompleteDetails = $incompleteDetails;

        return $this;
    }

    /**
     * Gets completedAt.
     *
     * @return int|null
     */
    public function getCompletedAt(): ?int
    {
        return $this->completedAt;
    }



    /**
     * Sets completedAt.
     *
     * @param int|null $completedAt  The Unix timestamp (in seconds) for when the message was completed.
     *
     * @return $this
     */
    public function setCompletedAt(?int $completedAt): self
    {
        $this->completedAt = $completedAt;

        return $this;
    }

    /**
     * Gets incompleteAt.
     *
     * @return int|null
     */
    public function getIncompleteAt(): ?int
    {
        return $this->incompleteAt;
    }



    /**
     * Sets incompleteAt.
     *
     * @param int|null $incompleteAt  The Unix timestamp (in seconds) for when the message was marked as incomplete.
     *
     * @return $this
     */
    public function setIncompleteAt(?int $incompleteAt): self
    {
        $this->incompleteAt = $incompleteAt;

        return $this;
    }

    /**
     * Gets role.
     *
     * @return string|null
     */
    public function getRole(): ?string
    {
        return $this->role;
    }



    /**
     * Sets role.
     *
     * @param string|null $role  The entity that produced the message. One of `user` or `assistant`.
     *
     * @return $this
     */
    public function setRole(?string $role): self
    {
        $this->role = $role;

        return $this;
    }

    /**
     * Gets content.
     *
     * @return MessageObjectContentInner[]|null
     */
    public function getContent(): ?array
    {
        return $this->content;
    }



    /**
     * Sets content.
     *
     * @param MessageObjectContentInner[]|null $content  The content of the message in array of text and/or images.
     *
     * @return $this
     */
    public function setContent(?array $content): self
    {
        $this->content = $content;

        return $this;
    }

    /**
     * Gets assistantId.
     *
     * @return string|null
     */
    public function getAssistantId(): ?string
    {
        return $this->assistantId;
    }



    /**
     * Sets assistantId.
     *
     * @param string|null $assistantId  If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     *
     * @return $this
     */
    public function setAssistantId(?string $assistantId): self
    {
        $this->assistantId = $assistantId;

        return $this;
    }

    /**
     * Gets runId.
     *
     * @return string|null
     */
    public function getRunId(): ?string
    {
        return $this->runId;
    }



    /**
     * Sets runId.
     *
     * @param string|null $runId  The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
     *
     * @return $this
     */
    public function setRunId(?string $runId): self
    {
        $this->runId = $runId;

        return $this;
    }

    /**
     * Gets fileIds.
     *
     * @return string[]|null
     */
    public function getFileIds(): ?array
    {
        return $this->fileIds;
    }



    /**
     * Sets fileIds.
     *
     * @param string[]|null $fileIds  A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     *
     * @return $this
     */
    public function setFileIds(?array $fileIds): self
    {
        $this->fileIds = $fileIds;

        return $this;
    }

    /**
     * Gets metadata.
     *
     * @return array|null
     */
    public function getMetadata(): ?array
    {
        return $this->metadata;
    }



    /**
     * Sets metadata.
     *
     * @param array|null $metadata  Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     *
     * @return $this
     */
    public function setMetadata(?array $metadata): self
    {
        $this->metadata = $metadata;

        return $this;
    }
}

