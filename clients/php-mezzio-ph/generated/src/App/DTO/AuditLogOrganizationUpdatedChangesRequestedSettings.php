<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AuditLogOrganizationUpdatedChangesRequestedSettings
{
    /**
     * Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;.
     * @DTA\Data(field="threads_ui_visibility", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $threads_ui_visibility;

    /**
     * Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;.
     * @DTA\Data(field="usage_dashboard_visibility", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $usage_dashboard_visibility;

}
