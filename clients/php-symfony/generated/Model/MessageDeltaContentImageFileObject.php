<?php
/**
 * MessageDeltaContentImageFileObject
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
 * Class representing the MessageDeltaContentImageFileObject model.
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageDeltaContentImageFileObject 
{
        /**
     * The index of the content part in the message.
     *
     * @var int|null
     * @SerializedName("index")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $index = null;

    /**
     * Always &#x60;image_file&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Choice({ "image_file" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $type = null;

    /**
     * @var MessageDeltaContentImageFileObjectImageFile|null
     * @SerializedName("image_file")
     * @Assert\Type("OpenAPI\Server\Model\MessageDeltaContentImageFileObjectImageFile")
     * @Type("OpenAPI\Server\Model\MessageDeltaContentImageFileObjectImageFile")
     */
    protected ?MessageDeltaContentImageFileObjectImageFile $imageFile = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->index = array_key_exists('index', $data) ? $data['index'] : $this->index;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->imageFile = array_key_exists('imageFile', $data) ? $data['imageFile'] : $this->imageFile;
        }
    }

    /**
     * Gets index.
     *
     * @return int|null
     */
    public function getIndex(): ?int
    {
        return $this->index;
    }



    /**
     * Sets index.
     *
     * @param int|null $index  The index of the content part in the message.
     *
     * @return $this
     */
    public function setIndex(?int $index): self
    {
        $this->index = $index;

        return $this;
    }

    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType(): ?string
    {
        return $this->type;
    }



    /**
     * Sets type.
     *
     * @param string|null $type  Always `image_file`.
     *
     * @return $this
     */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets imageFile.
     *
     * @return MessageDeltaContentImageFileObjectImageFile|null
     */
    public function getImageFile(): ?MessageDeltaContentImageFileObjectImageFile
    {
        return $this->imageFile;
    }



    /**
     * Sets imageFile.
     *
     * @param MessageDeltaContentImageFileObjectImageFile|null $imageFile
     *
     * @return $this
     */
    public function setImageFile(?MessageDeltaContentImageFileObjectImageFile $imageFile = null): self
    {
        $this->imageFile = $imageFile;

        return $this;
    }
}


