<?php
/**
 * ChatCompletionRequestMessageContentPart
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
 * Class representing the ChatCompletionRequestMessageContentPart model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ChatCompletionRequestMessageContentPart 
{
        /**
     * The type of the content part.
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Choice({ "text", "image_url" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $type = null;

    /**
     * The text content.
     *
     * @var string|null
     * @SerializedName("text")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $text = null;

    /**
     * @var ChatCompletionRequestMessageContentPartImageImageUrl|null
     * @SerializedName("image_url")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\ChatCompletionRequestMessageContentPartImageImageUrl")
     * @Type("OpenAPI\Server\Model\ChatCompletionRequestMessageContentPartImageImageUrl")
     */
    protected ?ChatCompletionRequestMessageContentPartImageImageUrl $imageUrl = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->text = array_key_exists('text', $data) ? $data['text'] : $this->text;
            $this->imageUrl = array_key_exists('imageUrl', $data) ? $data['imageUrl'] : $this->imageUrl;
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
     * @param string|null $type  The type of the content part.
     *
     * @return $this
     */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets text.
     *
     * @return string|null
     */
    public function getText(): ?string
    {
        return $this->text;
    }



    /**
     * Sets text.
     *
     * @param string|null $text  The text content.
     *
     * @return $this
     */
    public function setText(?string $text): self
    {
        $this->text = $text;

        return $this;
    }

    /**
     * Gets imageUrl.
     *
     * @return ChatCompletionRequestMessageContentPartImageImageUrl|null
     */
    public function getImageUrl(): ?ChatCompletionRequestMessageContentPartImageImageUrl
    {
        return $this->imageUrl;
    }



    /**
     * Sets imageUrl.
     *
     * @param ChatCompletionRequestMessageContentPartImageImageUrl|null $imageUrl
     *
     * @return $this
     */
    public function setImageUrl(?ChatCompletionRequestMessageContentPartImageImageUrl $imageUrl): self
    {
        $this->imageUrl = $imageUrl;

        return $this;
    }
}


