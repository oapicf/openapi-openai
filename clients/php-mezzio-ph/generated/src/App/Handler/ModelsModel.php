<?php
declare(strict_types=1);

namespace App\Handler;

use Articus\PathHandler\Annotation as PHA;
use Articus\PathHandler\Consumer as PHConsumer;
use Articus\PathHandler\Producer as PHProducer;
use Articus\PathHandler\Attribute as PHAttribute;
use Articus\PathHandler\Exception as PHException;
use Psr\Http\Message\ServerRequestInterface;

/**
 * @PHA\Route(pattern="/models/{model}")
 */
class ModelsModel
{
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @PHA\Delete()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\DeleteModelResponse
     */
    public function deleteModel(ServerRequestInterface $request): \App\DTO\DeleteModelResponse
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\Model
     */
    public function retrieveModel(ServerRequestInterface $request): \App\DTO\Model
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
