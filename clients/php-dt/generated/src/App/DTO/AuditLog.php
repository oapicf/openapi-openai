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
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogEventType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogEventType::class})
     */
    public ?\App\DTO\AuditLogEventType $type = null;

    /**
     * The Unix timestamp (in seconds) of the event.
     * @DTA\Data(field="effective_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $effective_at = null;

    /**
     * @DTA\Data(field="project", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProject::class})
     */
    public ?\App\DTO\AuditLogProject $project = null;

    /**
     * @DTA\Data(field="actor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActor::class})
     */
    public ?\App\DTO\AuditLogActor $actor = null;

    /**
     * @DTA\Data(field="api_key.created", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyCreated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyCreated::class})
     */
    public ?\App\DTO\AuditLogApiKeyCreated $api_key_created = null;

    /**
     * @DTA\Data(field="api_key.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyUpdated::class})
     */
    public ?\App\DTO\AuditLogApiKeyUpdated $api_key_updated = null;

    /**
     * @DTA\Data(field="api_key.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyDeleted::class})
     */
    public ?\App\DTO\AuditLogApiKeyDeleted $api_key_deleted = null;

    /**
     * @DTA\Data(field="invite.sent", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogInviteSent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogInviteSent::class})
     */
    public ?\App\DTO\AuditLogInviteSent $invite_sent = null;

    /**
     * @DTA\Data(field="invite.accepted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     */
    public ?\App\DTO\AuditLogInviteAccepted $invite_accepted = null;

    /**
     * @DTA\Data(field="invite.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogInviteAccepted::class})
     */
    public ?\App\DTO\AuditLogInviteAccepted $invite_deleted = null;

    /**
     * @DTA\Data(field="login.failed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogLoginFailed::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogLoginFailed::class})
     */
    public ?\App\DTO\AuditLogLoginFailed $login_failed = null;

    /**
     * @DTA\Data(field="logout.failed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogLoginFailed::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogLoginFailed::class})
     */
    public ?\App\DTO\AuditLogLoginFailed $logout_failed = null;

    /**
     * @DTA\Data(field="organization.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogOrganizationUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogOrganizationUpdated::class})
     */
    public ?\App\DTO\AuditLogOrganizationUpdated $organization_updated = null;

    /**
     * @DTA\Data(field="project.created", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectCreated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectCreated::class})
     */
    public ?\App\DTO\AuditLogProjectCreated $project_created = null;

    /**
     * @DTA\Data(field="project.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectUpdated::class})
     */
    public ?\App\DTO\AuditLogProjectUpdated $project_updated = null;

    /**
     * @DTA\Data(field="project.archived", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectArchived::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectArchived::class})
     */
    public ?\App\DTO\AuditLogProjectArchived $project_archived = null;

    /**
     * @DTA\Data(field="rate_limit.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogRateLimitUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogRateLimitUpdated::class})
     */
    public ?\App\DTO\AuditLogRateLimitUpdated $rate_limit_updated = null;

    /**
     * @DTA\Data(field="rate_limit.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogRateLimitDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogRateLimitDeleted::class})
     */
    public ?\App\DTO\AuditLogRateLimitDeleted $rate_limit_deleted = null;

    /**
     * @DTA\Data(field="service_account.created", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountCreated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountCreated::class})
     */
    public ?\App\DTO\AuditLogServiceAccountCreated $service_account_created = null;

    /**
     * @DTA\Data(field="service_account.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountUpdated::class})
     */
    public ?\App\DTO\AuditLogServiceAccountUpdated $service_account_updated = null;

    /**
     * @DTA\Data(field="service_account.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountDeleted::class})
     */
    public ?\App\DTO\AuditLogServiceAccountDeleted $service_account_deleted = null;

    /**
     * @DTA\Data(field="user.added", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserAdded::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserAdded::class})
     */
    public ?\App\DTO\AuditLogUserAdded $user_added = null;

    /**
     * @DTA\Data(field="user.updated", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserUpdated::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserUpdated::class})
     */
    public ?\App\DTO\AuditLogUserUpdated $user_updated = null;

    /**
     * @DTA\Data(field="user.deleted", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserDeleted::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserDeleted::class})
     */
    public ?\App\DTO\AuditLogUserDeleted $user_deleted = null;

}
