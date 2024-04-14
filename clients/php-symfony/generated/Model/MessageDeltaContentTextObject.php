<?php
/**
 * MessageDeltaContentTextObject
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
 * Class representing the MessageDeltaContentTextObject model.
 *
 * The text content that is part of a message.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageDeltaContentTextObject 
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
     * Always &#x60;text&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Choice({ "text" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $type = null;

    /**
     * @var MessageDeltaContentTextObjectText|null
     * @SerializedName("text")
     * @Assert\Type("OpenAPI\Server\Model\MessageDeltaContentTextObjectText")
     * @Type("OpenAPI\Server\Model\MessageDeltaContentTextObjectText")
     */
    protected ?MessageDeltaContentTextObjectText $text = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->index = array_key_exists('index', $data) ? $data['index'] : $this->index;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->text = array_key_exists('text', $data) ? $data['text'] : $this->text;
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
     * @param string|null $type  Always `text`.
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
     * @return MessageDeltaContentTextObjectText|null
     */
    public function getText(): ?MessageDeltaContentTextObjectText
    {
        return $this->text;
    }



    /**
     * Sets text.
     *
     * @param MessageDeltaContentTextObjectText|null $text
     *
     * @return $this
     */
    public function setText(?MessageDeltaContentTextObjectText $text = null): self
    {
        $this->text = $text;

        return $this;
    }
}


