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
 * @PHA\Route(pattern="/organization/projects/{project_id}/service_accounts/{service_account_id}")
 */
class OrganizationProjectsProjectIdServiceAccountsServiceAccountId
{
    /**
     * Deletes a service account from the project.
     * @PHA\Delete()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\ProjectServiceAccountDeleteResponse
     */
    public function deleteProjectServiceAccount(ServerRequestInterface $request): \App\DTO\ProjectServiceAccountDeleteResponse
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
    /**
     * Retrieves a service account in the project.
     * @PHA\Get()
     * TODO check if producer is valid, if it has correct priority and if it can be moved to class annotation
     * @PHA\Producer(name=PHProducer\Transfer::class, mediaType="application/json")
     * @param ServerRequestInterface $request
     *
     * @throws PHException\HttpCode 501 if the method is not implemented
     *
     * @return \App\DTO\ProjectServiceAccount
     */
    public function retrieveProjectServiceAccount(ServerRequestInterface $request): \App\DTO\ProjectServiceAccount
    {
        //TODO implement method
        throw new PHException\HttpCode(501, "Not implemented");
    }
}
