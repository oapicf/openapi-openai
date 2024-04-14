<?php
/**
 * MessageDeltaObjectDelta
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
 * Class representing the MessageDeltaObjectDelta model.
 *
 * The delta containing the fields that have changed on the Message.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageDeltaObjectDelta 
{
        /**
     * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     *
     * @var string|null
     * @SerializedName("role")
     * @Assert\Choice({ "user", "assistant" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $role = null;

    /**
     * The content of the message in array of text and/or images.
     *
     * @var MessageDeltaObjectDeltaContentInner[]|null
     * @SerializedName("content")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\MessageDeltaObjectDeltaContentInner")
     * })
     * @Type("array<OpenAPI\Server\Model\MessageDeltaObjectDeltaContentInner>")
     */
    protected ?array $content = null;

    /**
     * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     *
     * @var string[]|null
     * @SerializedName("file_ids")
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
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->role = array_key_exists('role', $data) ? $data['role'] : $this->role;
            $this->content = array_key_exists('content', $data) ? $data['content'] : $this->content;
            $this->fileIds = array_key_exists('fileIds', $data) ? $data['fileIds'] : $this->fileIds;
        }
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
    public function setRole(?string $role = null): self
    {
        $this->role = $role;

        return $this;
    }

    /**
     * Gets content.
     *
     * @return MessageDeltaObjectDeltaContentInner[]|null
     */
    public function getContent(): ?array
    {
        return $this->content;
    }



    /**
     * Sets content.
     *
     * @param MessageDeltaObjectDeltaContentInner[]|null $content  The content of the message in array of text and/or images.
     *
     * @return $this
     */
    public function setContent(?array $content = null): self
    {
        $this->content = $content;

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
    public function setFileIds(?array $fileIds = null): self
    {
        $this->fileIds = $fileIds;

        return $this;
    }
}


