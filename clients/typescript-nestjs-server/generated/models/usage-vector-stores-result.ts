

/**
 * The aggregated vector stores usage details of the specific time bucket.
 */
export interface UsageVectorStoresResult { 
  object: UsageVectorStoresResult.ObjectEnum;
  /**
   * The vector stores usage in bytes.
   */
  usage_bytes: number;
  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
   */
  project_id?: string | null;
}
export namespace UsageVectorStoresResult {
  export const ObjectEnum = {
    OrganizationUsageVectorStoresResult: 'organization.usage.vector_stores.result'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


