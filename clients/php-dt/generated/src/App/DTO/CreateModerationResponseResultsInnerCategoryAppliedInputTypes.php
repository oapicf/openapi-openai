<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of the categories along with the input type(s) that the score applies to.
 */
class CreateModerationResponseResultsInnerCategoryAppliedInputTypes
{
    /**
     * The applied input type(s) for the category &#39;hate&#39;.
     * @DTA\Data(field="hate")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection49::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection49::class})
     */
    public ?\App\DTO\Collection49 $hate = null;

    /**
     * The applied input type(s) for the category &#39;hate/threatening&#39;.
     * @DTA\Data(field="hate/threatening")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection50::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection50::class})
     */
    public ?\App\DTO\Collection50 $hate_threatening = null;

    /**
     * The applied input type(s) for the category &#39;harassment&#39;.
     * @DTA\Data(field="harassment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection51::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection51::class})
     */
    public ?\App\DTO\Collection51 $harassment = null;

    /**
     * The applied input type(s) for the category &#39;harassment/threatening&#39;.
     * @DTA\Data(field="harassment/threatening")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     */
    public ?\App\DTO\Collection52 $harassment_threatening = null;

    /**
     * The applied input type(s) for the category &#39;illicit&#39;.
     * @DTA\Data(field="illicit")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     */
    public ?\App\DTO\Collection53 $illicit = null;

    /**
     * The applied input type(s) for the category &#39;illicit/violent&#39;.
     * @DTA\Data(field="illicit/violent")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection54::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection54::class})
     */
    public ?\App\DTO\Collection54 $illicit_violent = null;

    /**
     * The applied input type(s) for the category &#39;self-harm&#39;.
     * @DTA\Data(field="self-harm")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     */
    public ?\App\DTO\Collection55 $self_harm = null;

    /**
     * The applied input type(s) for the category &#39;self-harm/intent&#39;.
     * @DTA\Data(field="self-harm/intent")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     */
    public ?\App\DTO\Collection56 $self_harm_intent = null;

    /**
     * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
     * @DTA\Data(field="self-harm/instructions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     */
    public ?\App\DTO\Collection57 $self_harm_instructions = null;

    /**
     * The applied input type(s) for the category &#39;sexual&#39;.
     * @DTA\Data(field="sexual")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     */
    public ?\App\DTO\Collection58 $sexual = null;

    /**
     * The applied input type(s) for the category &#39;sexual/minors&#39;.
     * @DTA\Data(field="sexual/minors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     */
    public ?\App\DTO\Collection59 $sexual_minors = null;

    /**
     * The applied input type(s) for the category &#39;violence&#39;.
     * @DTA\Data(field="violence")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     */
    public ?\App\DTO\Collection60 $violence = null;

    /**
     * The applied input type(s) for the category &#39;violence/graphic&#39;.
     * @DTA\Data(field="violence/graphic")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     */
    public ?\App\DTO\Collection61 $violence_graphic = null;

}
