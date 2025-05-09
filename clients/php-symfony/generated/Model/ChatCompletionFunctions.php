<?php
/**
 * ChatCompletionFunctions
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
 * Class representing the ChatCompletionFunctions model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ChatCompletionFunctions 
{
        /**
     * A description of what the function does, used by the model to choose when and how to call the function.
     *
     * @var string|null
     * @SerializedName("description")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $description = null;

    /**
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
     *
     * @var []|null
     * @SerializedName("parameters")
     * @Type("array<string, AnyType>")
    */
    #[Assert\All([
        new Assert\Type("AnyType"),
    ])]
    protected ?array $parameters = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->description = array_key_exists('description', $data) ? $data['description'] : $this->description;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->parameters = array_key_exists('parameters', $data) ? $data['parameters'] : $this->parameters;
        }
    }

    /**
     * Gets description.
     *
     * @return string|null
     */
    public function getDescription(): ?string
    {
        return $this->description;
    }

    /**
    * Sets description.
    *
    * @param string|null $description  A description of what the function does, used by the model to choose when and how to call the function.
    *
    * @return $this
    */
    public function setDescription(?string $description = null): self
    {
        $this->description = $description;

        return $this;
    }




    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name  The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    *
    * @return $this
    */
    public function setName(?string $name): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets parameters.
     *
     * @return []|null
     */
    public function getParameters(): ?array
    {
        return $this->parameters;
    }

    /**
    * Sets parameters.
    *
    * @param []|null $parameters  The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
    *
    * @return $this
    */
    public function setParameters(?array $parameters = null): self
    {
        $this->parameters = $parameters;

        return $this;
    }



}


