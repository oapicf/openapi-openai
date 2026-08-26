

/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */
export interface UsageCodeInterpreterSessionsResult { 
  object: UsageCodeInterpreterSessionsResult.ObjectEnum;
  /**
   * The number of code interpreter sessions.
   */
  sessions: number;
  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   */
  project_id?: string | null;
}
export namespace UsageCodeInterpreterSessionsResult {
  export const ObjectEnum = {
    OrganizationUsageCodeInterpreterSessionsResult: 'organization.usage.code_interpreter_sessions.result'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


