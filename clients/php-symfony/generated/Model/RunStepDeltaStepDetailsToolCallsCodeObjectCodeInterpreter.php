<?php
/**
 * RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
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
 * Class representing the RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter model.
 *
 * The Code Interpreter tool call definition.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter 
{
        /**
     * The input to the Code Interpreter tool call.
     *
     * @var string|null
     * @SerializedName("input")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $input = null;

    /**
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
     *
     * @var RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[]|null
     * @SerializedName("outputs")
     * @Type("array<OpenAPI\Server\Model\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner"),
    ])]
    protected ?array $outputs = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->input = array_key_exists('input', $data) ? $data['input'] : $this->input;
            $this->outputs = array_key_exists('outputs', $data) ? $data['outputs'] : $this->outputs;
        }
    }

    /**
     * Gets input.
     *
     * @return string|null
     */
    public function getInput(): ?string
    {
        return $this->input;
    }

    /**
    * Sets input.
    *
    * @param string|null $input  The input to the Code Interpreter tool call.
    *
    * @return $this
    */
    public function setInput(?string $input = null): self
    {
        $this->input = $input;

        return $this;
    }




    /**
     * Gets outputs.
     *
     * @return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[]|null
     */
    public function getOutputs(): ?array
    {
        return $this->outputs;
    }

    /**
    * Sets outputs.
    *
    * @param RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner[]|null $outputs  The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
    *
    * @return $this
    */
    public function setOutputs(?array $outputs = null): self
    {
        $this->outputs = $outputs;

        return $this;
    }



}


