<?php
/**
 * DeleteAssistantFileResponse
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
 * Class representing the DeleteAssistantFileResponse model.
 *
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class DeleteAssistantFileResponse 
{
        /**
     * @var string|null
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $id = null;

    /**
     * @var bool|null
     * @SerializedName("deleted")
     * @Assert\NotNull()
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $deleted = null;

    /**
     * @var string|null
     * @SerializedName("object")
     * @Assert\NotNull()
     * @Assert\Choice({ "assistant.file.deleted" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $object = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->deleted = array_key_exists('deleted', $data) ? $data['deleted'] : $this->deleted;
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
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
     * @param string|null $id
     *
     * @return $this
     */
    public function setId(?string $id): self
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets deleted.
     *
     * @return bool|null
     */
    public function isDeleted(): ?bool
    {
        return $this->deleted;
    }



    /**
     * Sets deleted.
     *
     * @param bool|null $deleted
     *
     * @return $this
     */
    public function setDeleted(?bool $deleted): self
    {
        $this->deleted = $deleted;

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
     * @param string|null $object
     *
     * @return $this
     */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }
}

