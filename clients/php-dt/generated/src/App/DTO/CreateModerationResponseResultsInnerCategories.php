<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of the categories, and whether they are flagged or not.
 */
class CreateModerationResponseResultsInnerCategories
{
    /**
     * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $hate = null;

    /**
     * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $hate_threatening = null;

    /**
     * Content that expresses, incites, or promotes harassing language towards any target.
     * @DTA\Data(field="harassment")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $harassment = null;

    /**
     * Harassment content that also includes violence or serious harm towards any target.
     * @DTA\Data(field="harassment/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $harassment_threatening = null;

    /**
     * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $self_harm = null;

    /**
     * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     * @DTA\Data(field="self-harm/intent")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $self_harm_intent = null;

    /**
     * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     * @DTA\Data(field="self-harm/instructions")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $self_harm_instructions = null;

    /**
     * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $sexual = null;

    /**
     * Sexual content that includes an individual who is under 18 years old.
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $sexual_minors = null;

    /**
     * Content that depicts death, violence, or physical injury.
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $violence = null;

    /**
     * Content that depicts death, violence, or physical injury in graphic detail.
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $violence_graphic = null;

}
