<?php
/**
 * RunStepDeltaObjectDeltaStepDetails
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
 * Class representing the RunStepDeltaObjectDeltaStepDetails model.
 *
 * The details of the run step.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepDeltaObjectDeltaStepDetails 
{
        /**
     * Always &#x60;message_creation&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["message_creation", "tool_calls"])]
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
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.
     *
     * @var RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[]|null
     * @SerializedName("tool_calls")
     * @Type("array<OpenAPI\Server\Model\RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\RunStepDeltaStepDetailsToolCallsObjectToolCallsInner"),
    ])]
    protected ?array $toolCalls = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->messageCreation = array_key_exists('messageCreation', $data) ? $data['messageCreation'] : $this->messageCreation;
            $this->toolCalls = array_key_exists('toolCalls', $data) ? $data['toolCalls'] : $this->toolCalls;
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




    /**
     * Gets toolCalls.
     *
     * @return RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[]|null
     */
    public function getToolCalls(): ?array
    {
        return $this->toolCalls;
    }

    /**
    * Sets toolCalls.
    *
    * @param RunStepDeltaStepDetailsToolCallsObjectToolCallsInner[]|null $toolCalls  An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.
    *
    * @return $this
    */
    public function setToolCalls(?array $toolCalls = null): self
    {
        $this->toolCalls = $toolCalls;

        return $this;
    }



}


