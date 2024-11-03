<?php
/**
 * Model
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
 * Class representing the Model model.
 *
 * Describes an OpenAI model offering that can be used with the API.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Model 
{
        /**
     * The model identifier, which can be referenced in the API endpoints.
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $id = null;

    /**
     * The Unix timestamp (in seconds) when the model was created.
     *
     * @var int|null
     * @SerializedName("created")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $created = null;

    /**
     * The object type, which is always \&quot;model\&quot;.
     *
     * @var string|null
     * @SerializedName("object")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["model"])]
    #[Assert\Type("string")]
    protected ?string $object = null;

    /**
     * The organization that owns the model.
     *
     * @var string|null
     * @SerializedName("owned_by")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $ownedBy = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->created = array_key_exists('created', $data) ? $data['created'] : $this->created;
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
            $this->ownedBy = array_key_exists('ownedBy', $data) ? $data['ownedBy'] : $this->ownedBy;
        }
    }

    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param string|null $id  The model identifier, which can be referenced in the API endpoints.
    *
    * @return $this
    */
    public function setId(?string $id): self
    {
        $this->id = $id;

        return $this;
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
    * @param int|null $created  The Unix timestamp (in seconds) when the model was created.
    *
    * @return $this
    */
    public function setCreated(?int $created): self
    {
        $this->created = $created;

        return $this;
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
    * @param string|null $object  The object type, which is always \"model\".
    *
    * @return $this
    */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }




    /**
     * Gets ownedBy.
     *
     * @return string|null
     */
    public function getOwnedBy(): ?string
    {
        return $this->ownedBy;
    }

    /**
    * Sets ownedBy.
    *
    * @param string|null $ownedBy  The organization that owns the model.
    *
    * @return $this
    */
    public function setOwnedBy(?string $ownedBy): self
    {
        $this->ownedBy = $ownedBy;

        return $this;
    }



}


