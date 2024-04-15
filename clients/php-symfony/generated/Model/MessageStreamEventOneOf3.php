<?php
/**
 * MessageStreamEventOneOf3
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
 * Class representing the MessageStreamEventOneOf3 model.
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageStreamEventOneOf3 
{
        /**
     * @var string|null
     * @SerializedName("event")
     * @Assert\NotNull()
     * @Assert\Choice({ "thread.message.completed" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $event = null;

    /**
     * @var MessageObject|null
     * @SerializedName("data")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\MessageObject")
     * @Type("OpenAPI\Server\Model\MessageObject")
     */
    protected ?MessageObject $data = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->event = array_key_exists('event', $data) ? $data['event'] : $this->event;
            $this->data = array_key_exists('data', $data) ? $data['data'] : $this->data;
        }
    }

    /**
     * Gets event.
     *
     * @return string|null
     */
    public function getEvent(): ?string
    {
        return $this->event;
    }



    /**
     * Sets event.
     *
     * @param string|null $event
     *
     * @return $this
     */
    public function setEvent(?string $event): self
    {
        $this->event = $event;

        return $this;
    }

    /**
     * Gets data.
     *
     * @return MessageObject|null
     */
    public function getData(): ?MessageObject
    {
        return $this->data;
    }



    /**
     * Sets data.
     *
     * @param MessageObject|null $data
     *
     * @return $this
     */
    public function setData(?MessageObject $data): self
    {
        $this->data = $data;

        return $this;
    }
}

