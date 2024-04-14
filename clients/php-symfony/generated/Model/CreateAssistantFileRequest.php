<?php
/**
 * CreateAssistantFileRequest
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
 * Class representing the CreateAssistantFileRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateAssistantFileRequest 
{
        /**
     * A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files.
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
     * @param string|null $fileId  A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
     *
     * @return $this
     */
    public function setFileId(?string $fileId): self
    {
        $this->fileId = $fileId;

        return $this;
    }
}


