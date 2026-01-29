<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateModerationResponseResultsInner
{
    /**
     * Whether any of the below categories are flagged.
     * @DTA\Data(field="flagged")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $flagged;

    /**
     * @DTA\Data(field="categories")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategories::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategories::class})
     * @var \App\DTO\CreateModerationResponseResultsInnerCategories|null
     */
    public $categories;

    /**
     * @DTA\Data(field="category_scores")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategoryScores::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategoryScores::class})
     * @var \App\DTO\CreateModerationResponseResultsInnerCategoryScores|null
     */
    public $category_scores;

}
