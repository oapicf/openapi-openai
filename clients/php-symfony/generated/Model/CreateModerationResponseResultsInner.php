<?php
/**
 * CreateModerationResponseResultsInner
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
 * Class representing the CreateModerationResponseResultsInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateModerationResponseResultsInner 
{
        /**
     * Whether any of the below categories are flagged.
     *
     * @var bool|null
     * @SerializedName("flagged")
     * @Type("bool")
    */
    #[Assert\NotNull]
    #[Assert\Type("bool")]
    protected ?bool $flagged = null;

    /**
     * @var CreateModerationResponseResultsInnerCategories|null
     * @SerializedName("categories")
     * @Type("OpenAPI\Server\Model\CreateModerationResponseResultsInnerCategories")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CreateModerationResponseResultsInnerCategories")]
    protected ?CreateModerationResponseResultsInnerCategories $categories = null;

    /**
     * @var CreateModerationResponseResultsInnerCategoryScores|null
     * @SerializedName("category_scores")
     * @Type("OpenAPI\Server\Model\CreateModerationResponseResultsInnerCategoryScores")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CreateModerationResponseResultsInnerCategoryScores")]
    protected ?CreateModerationResponseResultsInnerCategoryScores $categoryScores = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->flagged = array_key_exists('flagged', $data) ? $data['flagged'] : $this->flagged;
            $this->categories = array_key_exists('categories', $data) ? $data['categories'] : $this->categories;
            $this->categoryScores = array_key_exists('categoryScores', $data) ? $data['categoryScores'] : $this->categoryScores;
        }
    }

    /**
     * Gets flagged.
     *
     * @return bool|null
     */
    public function isFlagged(): ?bool
    {
        return $this->flagged;
    }

    /**
    * Sets flagged.
    *
    * @param bool|null $flagged  Whether any of the below categories are flagged.
    *
    * @return $this
    */
    public function setFlagged(?bool $flagged): self
    {
        $this->flagged = $flagged;

        return $this;
    }




    /**
     * Gets categories.
     *
     * @return CreateModerationResponseResultsInnerCategories|null
     */
    public function getCategories(): ?CreateModerationResponseResultsInnerCategories
    {
        return $this->categories;
    }

    /**
    * Sets categories.
    *
    * @param CreateModerationResponseResultsInnerCategories|null $categories
    *
    * @return $this
    */
    public function setCategories(?CreateModerationResponseResultsInnerCategories $categories): self
    {
        $this->categories = $categories;

        return $this;
    }




    /**
     * Gets categoryScores.
     *
     * @return CreateModerationResponseResultsInnerCategoryScores|null
     */
    public function getCategoryScores(): ?CreateModerationResponseResultsInnerCategoryScores
    {
        return $this->categoryScores;
    }

    /**
    * Sets categoryScores.
    *
    * @param CreateModerationResponseResultsInnerCategoryScores|null $categoryScores
    *
    * @return $this
    */
    public function setCategoryScores(?CreateModerationResponseResultsInnerCategoryScores $categoryScores): self
    {
        $this->categoryScores = $categoryScores;

        return $this;
    }



}


