import { ProjectApiKeyOwner } from './project-api-key-owner';


/**
 * Represents an individual API key in a project.
 */
export interface ProjectApiKey { 
  /**
   * The object type, which is always `organization.project.api_key`
   */
  object: ProjectApiKey.ObjectEnum;
  /**
   * The redacted value of the API key
   */
  redacted_value: string;
  /**
   * The name of the API key
   */
  name: string;
  /**
   * The Unix timestamp (in seconds) of when the API key was created
   */
  created_at: number;
  /**
   * The identifier, which can be referenced in API endpoints
   */
  id: string;
  owner: ProjectApiKeyOwner;
}
export namespace ProjectApiKey {
  export const ObjectEnum = {
    OrganizationProjectApiKey: 'organization.project.api_key'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


