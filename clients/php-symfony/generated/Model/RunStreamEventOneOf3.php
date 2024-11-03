<?php
/**
 * RunStreamEventOneOf3
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
 * Class representing the RunStreamEventOneOf3 model.
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStreamEventOneOf3 
{
        /**
     * @var string|null
     * @SerializedName("event")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["thread.run.requires_action"])]
    #[Assert\Type("string")]
    protected ?string $event = null;

    /**
     * @var RunObject|null
     * @SerializedName("data")
     * @Type("OpenAPI\Server\Model\RunObject")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\RunObject")]
    protected ?RunObject $data = null;

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
     * @return RunObject|null
     */
    public function getData(): ?RunObject
    {
        return $this->data;
    }

    /**
    * Sets data.
    *
    * @param RunObject|null $data
    *
    * @return $this
    */
    public function setData(?RunObject $data): self
    {
        $this->data = $data;

        return $this;
    }



}


