<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */
class MessageContentTextAnnotationsFilePathObject
{
    /**
     * Always &#x60;file_path&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text in the message content that needs to be replaced.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="file_path")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentTextAnnotationsFilePathObjectFilePath::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentTextAnnotationsFilePathObjectFilePath::class})
     * @var \App\DTO\MessageContentTextAnnotationsFilePathObjectFilePath|null
     */
    public $file_path;

    /**
     * @DTA\Data(field="start_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $start_index;

    /**
     * @DTA\Data(field="end_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $end_index;

}
