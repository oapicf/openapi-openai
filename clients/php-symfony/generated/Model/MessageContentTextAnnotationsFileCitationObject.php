<?php
/**
 * MessageContentTextAnnotationsFileCitationObject
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
 * Class representing the MessageContentTextAnnotationsFileCitationObject model.
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class MessageContentTextAnnotationsFileCitationObject 
{
        /**
     * Always &#x60;file_citation&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["file_citation"])]
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * The text in the message content that needs to be replaced.
     *
     * @var string|null
     * @SerializedName("text")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $text = null;

    /**
     * @var MessageContentTextAnnotationsFileCitationObjectFileCitation|null
     * @SerializedName("file_citation")
     * @Type("OpenAPI\Server\Model\MessageContentTextAnnotationsFileCitationObjectFileCitation")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\MessageContentTextAnnotationsFileCitationObjectFileCitation")]
    protected ?MessageContentTextAnnotationsFileCitationObjectFileCitation $fileCitation = null;

    /**
     * @var int|null
     * @SerializedName("start_index")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    #[Assert\GreaterThanOrEqual(0)]
    protected ?int $startIndex = null;

    /**
     * @var int|null
     * @SerializedName("end_index")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    #[Assert\GreaterThanOrEqual(0)]
    protected ?int $endIndex = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->text = array_key_exists('text', $data) ? $data['text'] : $this->text;
            $this->fileCitation = array_key_exists('fileCitation', $data) ? $data['fileCitation'] : $this->fileCitation;
            $this->startIndex = array_key_exists('startIndex', $data) ? $data['startIndex'] : $this->startIndex;
            $this->endIndex = array_key_exists('endIndex', $data) ? $data['endIndex'] : $this->endIndex;
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
    * @param string|null $type  Always `file_citation`.
    *
    * @return $this
    */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }




    /**
     * Gets text.
     *
     * @return string|null
     */
    public function getText(): ?string
    {
        return $this->text;
    }

    /**
    * Sets text.
    *
    * @param string|null $text  The text in the message content that needs to be replaced.
    *
    * @return $this
    */
    public function setText(?string $text): self
    {
        $this->text = $text;

        return $this;
    }




    /**
     * Gets fileCitation.
     *
     * @return MessageContentTextAnnotationsFileCitationObjectFileCitation|null
     */
    public function getFileCitation(): ?MessageContentTextAnnotationsFileCitationObjectFileCitation
    {
        return $this->fileCitation;
    }

    /**
    * Sets fileCitation.
    *
    * @param MessageContentTextAnnotationsFileCitationObjectFileCitation|null $fileCitation
    *
    * @return $this
    */
    public function setFileCitation(?MessageContentTextAnnotationsFileCitationObjectFileCitation $fileCitation): self
    {
        $this->fileCitation = $fileCitation;

        return $this;
    }




    /**
     * Gets startIndex.
     *
     * @return int|null
     */
    public function getStartIndex(): ?int
    {
        return $this->startIndex;
    }

    /**
    * Sets startIndex.
    *
    * @param int|null $startIndex
    *
    * @return $this
    */
    public function setStartIndex(?int $startIndex): self
    {
        $this->startIndex = $startIndex;

        return $this;
    }




    /**
     * Gets endIndex.
     *
     * @return int|null
     */
    public function getEndIndex(): ?int
    {
        return $this->endIndex;
    }

    /**
    * Sets endIndex.
    *
    * @param int|null $endIndex
    *
    * @return $this
    */
    public function setEndIndex(?int $endIndex): self
    {
        $this->endIndex = $endIndex;

        return $this;
    }



}


