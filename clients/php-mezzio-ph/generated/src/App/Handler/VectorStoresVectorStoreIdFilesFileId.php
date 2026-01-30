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
 * @PHA\Route(pattern="/vector_stores/{vector_store_id}/files/{file_id}")
 */
class VectorStoresVectorStoreIdFilesFileId
{
    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @PHA\Delete()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\DeleteVectorStoreFileResponse
     */
    public function deleteVectorStoreFile(ServerRequestInterface $request): \App\DTO\DeleteVectorStoreFileResponse
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Retrieves a vector store file.
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\VectorStoreFileObject
     */
    public function getVectorStoreFile(ServerRequestInterface $request): \App\DTO\VectorStoreFileObject
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
