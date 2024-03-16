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
 * @PHA\Route(pattern="/files")
 */
class Files
{
    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
     * @PHA\Post()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\OpenAIFile
     */
    public function createFile(ServerRequestInterface $request): \App\DTO\OpenAIFile
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Returns a list of files that belong to the user&#39;s organization.
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\ListFilesResponse
     */
    public function listFiles(ServerRequestInterface $request): \App\DTO\ListFilesResponse
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
