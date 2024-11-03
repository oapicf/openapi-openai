<?php
/**
 * OpenAIFile
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
 * Class representing the OpenAIFile model.
 *
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OpenAIFile 
{
        /**
     * The file identifier, which can be referenced in the API endpoints.
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $id = null;

    /**
     * The size of the file, in bytes.
     *
     * @var int|null
     * @SerializedName("bytes")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $bytes = null;

    /**
     * The Unix timestamp (in seconds) for when the file was created.
     *
     * @var int|null
     * @SerializedName("created_at")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $createdAt = null;

    /**
     * The name of the file.
     *
     * @var string|null
     * @SerializedName("filename")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $filename = null;

    /**
     * The object type, which is always &#x60;file&#x60;.
     *
     * @var string|null
     * @SerializedName("object")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["file"])]
    #[Assert\Type("string")]
    protected ?string $object = null;

    /**
     * The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;.
     *
     * @var string|null
     * @SerializedName("purpose")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["fine-tune", "fine-tune-results", "assistants", "assistants_output"])]
    #[Assert\Type("string")]
    protected ?string $purpose = null;

    /**
     * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
     *
     * @var string|null
     * @SerializedName("status")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["uploaded", "processed", "error"])]
    #[Assert\Type("string")]
    protected ?string $status = null;

    /**
     * Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
     *
     * @var string|null
     * @SerializedName("status_details")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $statusDetails = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->bytes = array_key_exists('bytes', $data) ? $data['bytes'] : $this->bytes;
            $this->createdAt = array_key_exists('createdAt', $data) ? $data['createdAt'] : $this->createdAt;
            $this->filename = array_key_exists('filename', $data) ? $data['filename'] : $this->filename;
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
            $this->purpose = array_key_exists('purpose', $data) ? $data['purpose'] : $this->purpose;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->statusDetails = array_key_exists('statusDetails', $data) ? $data['statusDetails'] : $this->statusDetails;
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
    * @param string|null $id  The file identifier, which can be referenced in the API endpoints.
    *
    * @return $this
    */
    public function setId(?string $id): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets bytes.
     *
     * @return int|null
     */
    public function getBytes(): ?int
    {
        return $this->bytes;
    }

    /**
    * Sets bytes.
    *
    * @param int|null $bytes  The size of the file, in bytes.
    *
    * @return $this
    */
    public function setBytes(?int $bytes): self
    {
        $this->bytes = $bytes;

        return $this;
    }




    /**
     * Gets createdAt.
     *
     * @return int|null
     */
    public function getCreatedAt(): ?int
    {
        return $this->createdAt;
    }

    /**
    * Sets createdAt.
    *
    * @param int|null $createdAt  The Unix timestamp (in seconds) for when the file was created.
    *
    * @return $this
    */
    public function setCreatedAt(?int $createdAt): self
    {
        $this->createdAt = $createdAt;

        return $this;
    }




    /**
     * Gets filename.
     *
     * @return string|null
     */
    public function getFilename(): ?string
    {
        return $this->filename;
    }

    /**
    * Sets filename.
    *
    * @param string|null $filename  The name of the file.
    *
    * @return $this
    */
    public function setFilename(?string $filename): self
    {
        $this->filename = $filename;

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
    * @param string|null $object  The object type, which is always `file`.
    *
    * @return $this
    */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }




    /**
     * Gets purpose.
     *
     * @return string|null
     */
    public function getPurpose(): ?string
    {
        return $this->purpose;
    }

    /**
    * Sets purpose.
    *
    * @param string|null $purpose  The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
    *
    * @return $this
    */
    public function setPurpose(?string $purpose): self
    {
        $this->purpose = $purpose;

        return $this;
    }




    /**
     * Gets status.
     *
     * @return string|null
     */
    public function getStatus(): ?string
    {
        return $this->status;
    }

    /**
    * Sets status.
    *
    * @param string|null $status  Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
    *
    * @return $this
    */
    public function setStatus(?string $status): self
    {
        $this->status = $status;

        return $this;
    }




    /**
     * Gets statusDetails.
     *
     * @return string|null
     */
    public function getStatusDetails(): ?string
    {
        return $this->statusDetails;
    }

    /**
    * Sets statusDetails.
    *
    * @param string|null $statusDetails  Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
    *
    * @return $this
    */
    public function setStatusDetails(?string $statusDetails = null): self
    {
        $this->statusDetails = $statusDetails;

        return $this;
    }



}


