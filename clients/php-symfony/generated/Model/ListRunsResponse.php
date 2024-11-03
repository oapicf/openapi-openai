<?php
/**
 * ListRunsResponse
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
 * Class representing the ListRunsResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ListRunsResponse 
{
        /**
     * @var string|null
     * @SerializedName("object")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $object = null;

    /**
     * @var RunObject[]|null
     * @SerializedName("data")
     * @Type("array<OpenAPI\Server\Model\RunObject>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\RunObject"),
    ])]
    protected ?array $data = null;

    /**
     * @var string|null
     * @SerializedName("first_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $firstId = null;

    /**
     * @var string|null
     * @SerializedName("last_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $lastId = null;

    /**
     * @var bool|null
     * @SerializedName("has_more")
     * @Type("bool")
    */
    #[Assert\NotNull]
    #[Assert\Type("bool")]
    protected ?bool $hasMore = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
            $this->data = array_key_exists('data', $data) ? $data['data'] : $this->data;
            $this->firstId = array_key_exists('firstId', $data) ? $data['firstId'] : $this->firstId;
            $this->lastId = array_key_exists('lastId', $data) ? $data['lastId'] : $this->lastId;
            $this->hasMore = array_key_exists('hasMore', $data) ? $data['hasMore'] : $this->hasMore;
        }
    }

    /**
     * Gets object.
     *
     * @return string|null
     */
    public function getObject(): ?string
    {
        return $this->object;
    }

    /**
    * Sets object.
    *
    * @param string|null $object
    *
    * @return $this
    */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }




    /**
     * Gets data.
     *
     * @return RunObject[]|null
     */
    public function getData(): ?array
    {
        return $this->data;
    }

    /**
    * Sets data.
    *
    * @param RunObject[]|null $data
    *
    * @return $this
    */
    public function setData(?array $data): self
    {
        $this->data = $data;

        return $this;
    }




    /**
     * Gets firstId.
     *
     * @return string|null
     */
    public function getFirstId(): ?string
    {
        return $this->firstId;
    }

    /**
    * Sets firstId.
    *
    * @param string|null $firstId
    *
    * @return $this
    */
    public function setFirstId(?string $firstId): self
    {
        $this->firstId = $firstId;

        return $this;
    }




    /**
     * Gets lastId.
     *
     * @return string|null
     */
    public function getLastId(): ?string
    {
        return $this->lastId;
    }

    /**
    * Sets lastId.
    *
    * @param string|null $lastId
    *
    * @return $this
    */
    public function setLastId(?string $lastId): self
    {
        $this->lastId = $lastId;

        return $this;
    }




    /**
     * Gets hasMore.
     *
     * @return bool|null
     */
    public function isHasMore(): ?bool
    {
        return $this->hasMore;
    }

    /**
    * Sets hasMore.
    *
    * @param bool|null $hasMore
    *
    * @return $this
    */
    public function setHasMore(?bool $hasMore): self
    {
        $this->hasMore = $hasMore;

        return $this;
    }



}


