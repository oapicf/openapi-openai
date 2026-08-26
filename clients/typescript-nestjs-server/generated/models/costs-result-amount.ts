

/**
 * The monetary value in its associated currency.
 */
export interface CostsResultAmount { 
  /**
   * The numeric value of the cost.
   */
  value?: number;
  /**
   * Lowercase ISO-4217 currency e.g. \"usd\"
   */
  currency?: string;
}

