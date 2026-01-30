<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CompleteUploadRequest
{
    /**
     * The ordered list of Part IDs.
     * @DTA\Data(field="part_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection146::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection146::class})
     */
    public ?\App\DTO\Collection146 $part_ids = null;

    /**
     * The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.
     * @DTA\Data(field="md5", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $md5 = null;

}
