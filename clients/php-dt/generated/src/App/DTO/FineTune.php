<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class FineTune
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="updated_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_at = null;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * @DTA\Data(field="fine_tuned_model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $fine_tuned_model = null;

    /**
     * @DTA\Data(field="organization_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $organization_id = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * @DTA\Data(field="hyperparams")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $hyperparams = null;

    /**
     * @DTA\Data(field="training_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection14::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection14::class})
     */
    public ?\App\DTO\Collection14 $training_files = null;

    /**
     * @DTA\Data(field="validation_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection15::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection15::class})
     */
    public ?\App\DTO\Collection15 $validation_files = null;

    /**
     * @DTA\Data(field="result_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     */
    public ?\App\DTO\Collection16 $result_files = null;

    /**
     * @DTA\Data(field="events", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     */
    public ?\App\DTO\Collection17 $events = null;

}
