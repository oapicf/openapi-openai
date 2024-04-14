<?php
/**
 * ModifyThreadRequest
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
 * Class representing the ModifyThreadRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ModifyThreadRequest 
{
        /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     *
     * @var array|null
     * @SerializedName("metadata")
     * @Assert\Type("array")
     * @Type("array")
     */
    protected ?array $metadata = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->metadata = array_key_exists('metadata', $data) ? $data['metadata'] : $this->metadata;
        }
    }

    /**
     * Gets metadata.
     *
     * @return array|null
     */
    public function getMetadata(): ?array
    {
        return $this->metadata;
    }



    /**
     * Sets metadata.
     *
     * @param array|null $metadata  Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     *
     * @return $this
     */
    public function setMetadata(?array $metadata = null): self
    {
        $this->metadata = $metadata;

        return $this;
    }
}


