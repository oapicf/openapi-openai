<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A log of a user action or configuration change within this organization.
 */
class AuditLog
{
    /**
     * The ID of this log.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogEventType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogEventType::class})
     * @var \App\DTO\AuditLogEventType|null
     */
    public $type;

    /**
     * The Unix timestamp (in seconds) of the event.
     * @DTA\Data(field="effective_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $effective_at;

    /**
     * @DTA\Data(field="project", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProject::class})
     * @var \App\DTO\AuditLogProject|null
     */
    public $project;

    /**
     * @DTA\Data(field="actor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActor::class})
     * @var \App\DTO\AuditLogActor|null
     */
    public $actor;

    /**
     * @DTA\Data(field="api_key.created", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyCreated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyCreated::class})
     * @var \App\DTO\AuditLogApiKeyCreated|null
     */
    public $api_key_created;

    /**
     * @DTA\Data(field="api_key.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyUpdated::class})
     * @var \App\DTO\AuditLogApiKeyUpdated|null
     */
    public $api_key_updated;

    /**
     * @DTA\Data(field="api_key.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyDeleted::class})
     * @var \App\DTO\AuditLogApiKeyDeleted|null
     */
    public $api_key_deleted;

    /**
     * @DTA\Data(field="invite.sent", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogInviteSent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogInviteSent::class})
     * @var \App\DTO\AuditLogInviteSent|null
     */
    public $invite_sent;

    /**
     * @DTA\Data(field="invite.accepted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     * @var \App\DTO\AuditLogInviteAccepted|null
     */
    public $invite_accepted;

    /**
     * @DTA\Data(field="invite.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     * @var \App\DTO\AuditLogInviteAccepted|null
     */
    public $invite_deleted;

    /**
     * @DTA\Data(field="login.failed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogLoginFailed::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogLoginFailed::class})
     * @var \App\DTO\AuditLogLoginFailed|null
     */
    public $login_failed;

    /**
     * @DTA\Data(field="logout.failed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogLoginFailed::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogLoginFailed::class})
     * @var \App\DTO\AuditLogLoginFailed|null
     */
    public $logout_failed;

    /**
     * @DTA\Data(field="organization.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogOrganizationUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogOrganizationUpdated::class})
     * @var \App\DTO\AuditLogOrganizationUpdated|null
     */
    public $organization_updated;

    /**
     * @DTA\Data(field="project.created", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectCreated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectCreated::class})
     * @var \App\DTO\AuditLogProjectCreated|null
     */
    public $project_created;

    /**
     * @DTA\Data(field="project.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectUpdated::class})
     * @var \App\DTO\AuditLogProjectUpdated|null
     */
    public $project_updated;

    /**
     * @DTA\Data(field="project.archived", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectArchived::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectArchived::class})
     * @var \App\DTO\AuditLogProjectArchived|null
     */
    public $project_archived;

    /**
     * @DTA\Data(field="rate_limit.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogRateLimitUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogRateLimitUpdated::class})
     * @var \App\DTO\AuditLogRateLimitUpdated|null
     */
    public $rate_limit_updated;

    /**
     * @DTA\Data(field="rate_limit.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogRateLimitDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogRateLimitDeleted::class})
     * @var \App\DTO\AuditLogRateLimitDeleted|null
     */
    public $rate_limit_deleted;

    /**
     * @DTA\Data(field="service_account.created", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountCreated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountCreated::class})
     * @var \App\DTO\AuditLogServiceAccountCreated|null
     */
    public $service_account_created;

    /**
     * @DTA\Data(field="service_account.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountUpdated::class})
     * @var \App\DTO\AuditLogServiceAccountUpdated|null
     */
    public $service_account_updated;

    /**
     * @DTA\Data(field="service_account.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountDeleted::class})
     * @var \App\DTO\AuditLogServiceAccountDeleted|null
     */
    public $service_account_deleted;

    /**
     * @DTA\Data(field="user.added", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserAdded::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserAdded::class})
     * @var \App\DTO\AuditLogUserAdded|null
     */
    public $user_added;

    /**
     * @DTA\Data(field="user.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserUpdated::class})
     * @var \App\DTO\AuditLogUserUpdated|null
     */
    public $user_updated;

    /**
     * @DTA\Data(field="user.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserDeleted::class})
     * @var \App\DTO\AuditLogUserDeleted|null
     */
    public $user_deleted;

}
