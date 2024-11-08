<?php
/**
 * AssistantsApiResponseFormat
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
 * Class representing the AssistantsApiResponseFormat model.
 *
 * An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AssistantsApiResponseFormat 
{
        /**
     * Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\Choice(["text", "json_object"])]
    #[Assert\Type("string")]
    protected ?string $type = 'text';

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
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
    * @param string|null $type  Must be one of `text` or `json_object`.
    *
    * @return $this
    */
    public function setType(?string $type = null): self
    {
        $this->type = $type;

        return $this;
    }



}


