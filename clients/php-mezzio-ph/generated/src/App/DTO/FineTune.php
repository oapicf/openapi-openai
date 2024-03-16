<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class FineTune
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * @DTA\Data(field="updated_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_at;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * @DTA\Data(field="fine_tuned_model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $fine_tuned_model;

    /**
     * @DTA\Data(field="organization_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $organization_id;

    /**
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * @DTA\Data(field="hyperparams")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $hyperparams;

    /**
     * @DTA\Data(field="training_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection14::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection14::class})
     * @var \App\DTO\Collection14|null
     */
    public $training_files;

    /**
     * @DTA\Data(field="validation_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection15::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection15::class})
     * @var \App\DTO\Collection15|null
     */
    public $validation_files;

    /**
     * @DTA\Data(field="result_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     * @var \App\DTO\Collection16|null
     */
    public $result_files;

    /**
     * @DTA\Data(field="events", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     * @var \App\DTO\Collection17|null
     */
    public $events;

}
