<?php
/**
 * MessageContentTextAnnotationsFilePathObjectFilePath
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
 * Class representing the MessageContentTextAnnotationsFilePathObjectFilePath model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageContentTextAnnotationsFilePathObjectFilePath 
{
        /**
     * The ID of the file that was generated.
     *
     * @var string|null
     * @SerializedName("file_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $fileId = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->fileId = array_key_exists('fileId', $data) ? $data['fileId'] : $this->fileId;
        }
    }

    /**
     * Gets fileId.
     *
     * @return string|null
     */
    public function getFileId(): ?string
    {
        return $this->fileId;
    }



    /**
     * Sets fileId.
     *
     * @param string|null $fileId  The ID of the file that was generated.
     *
     * @return $this
     */
    public function setFileId(?string $fileId): self
    {
        $this->fileId = $fileId;

        return $this;
    }
}


