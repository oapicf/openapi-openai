<?php
/**
 * ThreadObject
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
 * Class representing the ThreadObject model.
 *
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ThreadObject 
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
     * The object type, which is always &#x60;thread&#x60;.
     *
     * @var string|null
     * @SerializedName("object")
     * @Assert\NotNull()
     * @Assert\Choice({ "thread" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the thread was created.
     *
     * @var int|null
     * @SerializedName("created_at")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $createdAt = null;

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
     * @param string|null $object  The object type, which is always `thread`.
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
     * @param int|null $createdAt  The Unix timestamp (in seconds) for when the thread was created.
     *
     * @return $this
     */
    public function setCreatedAt(?int $createdAt): self
    {
        $this->createdAt = $createdAt;

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


