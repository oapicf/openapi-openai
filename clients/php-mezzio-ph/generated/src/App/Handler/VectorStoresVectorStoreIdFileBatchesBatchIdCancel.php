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
 * @PHA\Route(pattern="/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel")
 */
class VectorStoresVectorStoreIdFileBatchesBatchIdCancel
{
    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @PHA\Post()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\VectorStoreFileBatchObject
     */
    public function cancelVectorStoreFileBatch(ServerRequestInterface $request): \App\DTO\VectorStoreFileBatchObject
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
