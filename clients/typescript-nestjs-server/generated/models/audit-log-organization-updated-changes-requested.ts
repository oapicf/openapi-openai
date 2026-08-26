import { AuditLogOrganizationUpdatedChangesRequestedSettings } from './audit-log-organization-updated-changes-requested-settings';


/**
 * The payload used to update the organization settings.
 */
export interface AuditLogOrganizationUpdatedChangesRequested { 
  /**
   * The organization title.
   */
  title?: string;
  /**
   * The organization description.
   */
  description?: string;
  /**
   * The organization name.
   */
  name?: string;
  settings?: AuditLogOrganizationUpdatedChangesRequestedSettings;
}

