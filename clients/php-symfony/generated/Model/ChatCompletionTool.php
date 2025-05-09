<?php
/**
 * ChatCompletionTool
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
 * Class representing the ChatCompletionTool model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ChatCompletionTool 
{
        /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["function"])]
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * @var FunctionObject|null
     * @SerializedName("function")
     * @Type("OpenAPI\Server\Model\FunctionObject")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\FunctionObject")]
    protected ?FunctionObject $function = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->function = array_key_exists('function', $data) ? $data['function'] : $this->function;
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
    * @param string|null $type  The type of the tool. Currently, only `function` is supported.
    *
    * @return $this
    */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }




    /**
     * Gets function.
     *
     * @return FunctionObject|null
     */
    public function getFunction(): ?FunctionObject
    {
        return $this->function;
    }

    /**
    * Sets function.
    *
    * @param FunctionObject|null $function
    *
    * @return $this
    */
    public function setFunction(?FunctionObject $function): self
    {
        $this->function = $function;

        return $this;
    }



}


