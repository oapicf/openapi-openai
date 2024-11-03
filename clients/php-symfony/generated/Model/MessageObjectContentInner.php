<?php
/**
 * MessageObjectContentInner
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
 * Class representing the MessageObjectContentInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageObjectContentInner 
{
        /**
     * Always &#x60;image_file&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["image_file", "text"])]
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * @var MessageContentImageFileObjectImageFile|null
     * @SerializedName("image_file")
     * @Type("OpenAPI\Server\Model\MessageContentImageFileObjectImageFile")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\MessageContentImageFileObjectImageFile")]
    protected ?MessageContentImageFileObjectImageFile $imageFile = null;

    /**
     * @var MessageContentTextObjectText|null
     * @SerializedName("text")
     * @Type("OpenAPI\Server\Model\MessageContentTextObjectText")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\MessageContentTextObjectText")]
    protected ?MessageContentTextObjectText $text = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->imageFile = array_key_exists('imageFile', $data) ? $data['imageFile'] : $this->imageFile;
            $this->text = array_key_exists('text', $data) ? $data['text'] : $this->text;
        }
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
     * @return MessageContentImageFileObjectImageFile|null
     */
    public function getImageFile(): ?MessageContentImageFileObjectImageFile
    {
        return $this->imageFile;
    }

    /**
    * Sets imageFile.
    *
    * @param MessageContentImageFileObjectImageFile|null $imageFile
    *
    * @return $this
    */
    public function setImageFile(?MessageContentImageFileObjectImageFile $imageFile): self
    {
        $this->imageFile = $imageFile;

        return $this;
    }




    /**
     * Gets text.
     *
     * @return MessageContentTextObjectText|null
     */
    public function getText(): ?MessageContentTextObjectText
    {
        return $this->text;
    }

    /**
    * Sets text.
    *
    * @param MessageContentTextObjectText|null $text
    *
    * @return $this
    */
    public function setText(?MessageContentTextObjectText $text): self
    {
        $this->text = $text;

        return $this;
    }



}


