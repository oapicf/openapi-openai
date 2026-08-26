import { BatchErrorsDataInner } from './batch-errors-data-inner';


export interface BatchErrors { 
  /**
   * The object type, which is always `list`.
   */
  object?: string;
  data?: Array<BatchErrorsDataInner>;
}

