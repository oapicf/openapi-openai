

export interface ListAuditLogsEffectiveAtParameter { 
  /**
   * Return only events whose `effective_at` (Unix seconds) is greater than this value.
   */
  gt?: number;
  /**
   * Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
   */
  gte?: number;
  /**
   * Return only events whose `effective_at` (Unix seconds) is less than this value.
   */
  lt?: number;
  /**
   * Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
   */
  lte?: number;
}

