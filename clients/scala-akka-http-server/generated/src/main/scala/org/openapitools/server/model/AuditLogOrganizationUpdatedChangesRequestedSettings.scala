package org.openapitools.server.model


/**
 * @param threadsUiVisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`. for example: ''null''
 * @param usageDashboardVisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`. for example: ''null''
*/
final case class AuditLogOrganizationUpdatedChangesRequestedSettings (
  threadsUiVisibility: Option[String] = None,
  usageDashboardVisibility: Option[String] = None
)

