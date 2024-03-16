<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateModerationResponseResultsInner
{
    /**
     * @DTA\Data(field="flagged")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $flagged = null;

    /**
     * @DTA\Data(field="categories")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategories::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategories::class})
     */
    public ?\App\DTO\CreateModerationResponseResultsInnerCategories $categories = null;

    /**
     * @DTA\Data(field="category_scores")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategoryScores::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationResponseResultsInnerCategoryScores::class})
     */
    public ?\App\DTO\CreateModerationResponseResultsInnerCategoryScores $category_scores = null;

}
