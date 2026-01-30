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
 * @PHA\Route(pattern="/organization/admin_api_keys/{key_id}")
 */
class OrganizationAdminApiKeysKeyId
{
    /**
     * Delete an organization admin API key
     * @PHA\Delete()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\AdminApiKeysDelete200Response
     */
    public function adminApiKeysDelete(ServerRequestInterface $request): \App\DTO\AdminApiKeysDelete200Response
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Retrieve a single organization API key
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\AdminApiKey
     */
    public function adminApiKeysGet(ServerRequestInterface $request): \App\DTO\AdminApiKey
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
