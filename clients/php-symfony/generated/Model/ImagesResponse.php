<?php
/**
 * ImagesResponse
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
 * Class representing the ImagesResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ImagesResponse 
{
        /**
     * @var int|null
     * @SerializedName("created")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $created = null;

    /**
     * @var Image[]|null
     * @SerializedName("data")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\Image")
     * })
     * @Type("array<OpenAPI\Server\Model\Image>")
     */
    protected ?array $data = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->created = array_key_exists('created', $data) ? $data['created'] : $this->created;
            $this->data = array_key_exists('data', $data) ? $data['data'] : $this->data;
        }
    }

    /**
     * Gets created.
     *
     * @return int|null
     */
    public function getCreated(): ?int
    {
        return $this->created;
    }



    /**
     * Sets created.
     *
     * @param int|null $created
     *
     * @return $this
     */
    public function setCreated(?int $created): self
    {
        $this->created = $created;

        return $this;
    }

    /**
     * Gets data.
     *
     * @return Image[]|null
     */
    public function getData(): ?array
    {
        return $this->data;
    }



    /**
     * Sets data.
     *
     * @param Image[]|null $data
     *
     * @return $this
     */
    public function setData(?array $data): self
    {
        $this->data = $data;

        return $this;
    }
}

