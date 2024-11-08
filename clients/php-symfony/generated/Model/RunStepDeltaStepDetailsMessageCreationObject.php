<?php
/**
 * RunStepDeltaStepDetailsMessageCreationObject
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
 * Class representing the RunStepDeltaStepDetailsMessageCreationObject model.
 *
 * Details of the message creation by the run step.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepDeltaStepDetailsMessageCreationObject 
{
        /**
     * Always &#x60;message_creation&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["message_creation"])]
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * @var RunStepDeltaStepDetailsMessageCreationObjectMessageCreation|null
     * @SerializedName("message_creation")
     * @Type("OpenAPI\Server\Model\RunStepDeltaStepDetailsMessageCreationObjectMessageCreation")
    */
    #[Assert\Type("OpenAPI\Server\Model\RunStepDeltaStepDetailsMessageCreationObjectMessageCreation")]
    protected ?RunStepDeltaStepDetailsMessageCreationObjectMessageCreation $messageCreation = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->messageCreation = array_key_exists('messageCreation', $data) ? $data['messageCreation'] : $this->messageCreation;
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
    * @param string|null $type  Always `message_creation`.
    *
    * @return $this
    */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }




    /**
     * Gets messageCreation.
     *
     * @return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation|null
     */
    public function getMessageCreation(): ?RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
    {
        return $this->messageCreation;
    }

    /**
    * Sets messageCreation.
    *
    * @param RunStepDeltaStepDetailsMessageCreationObjectMessageCreation|null $messageCreation
    *
    * @return $this
    */
    public function setMessageCreation(?RunStepDeltaStepDetailsMessageCreationObjectMessageCreation $messageCreation = null): self
    {
        $this->messageCreation = $messageCreation;

        return $this;
    }



}


