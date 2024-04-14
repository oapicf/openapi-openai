<?php
/**
 * RunStepDetailsToolCallsObject
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
 * Class representing the RunStepDetailsToolCallsObject model.
 *
 * Details of the tool call.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepDetailsToolCallsObject 
{
        /**
     * Always &#x60;tool_calls&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Choice({ "tool_calls" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $type = null;

    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.
     *
     * @var RunStepDetailsToolCallsObjectToolCallsInner[]|null
     * @SerializedName("tool_calls")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\RunStepDetailsToolCallsObjectToolCallsInner")
     * })
     * @Type("array<OpenAPI\Server\Model\RunStepDetailsToolCallsObjectToolCallsInner>")
     */
    protected ?array $toolCalls = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
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
     * @param string|null $type  Always `tool_calls`.
     *
     * @return $this
     */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets toolCalls.
     *
     * @return RunStepDetailsToolCallsObjectToolCallsInner[]|null
     */
    public function getToolCalls(): ?array
    {
        return $this->toolCalls;
    }



    /**
     * Sets toolCalls.
     *
     * @param RunStepDetailsToolCallsObjectToolCallsInner[]|null $toolCalls  An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.
     *
     * @return $this
     */
    public function setToolCalls(?array $toolCalls): self
    {
        $this->toolCalls = $toolCalls;

        return $this;
    }
}


