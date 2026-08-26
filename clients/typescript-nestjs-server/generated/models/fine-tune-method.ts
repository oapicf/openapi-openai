import { FineTuneSupervisedMethod } from './fine-tune-supervised-method';
import { FineTuneDPOMethod } from './fine-tune-dpo-method';


/**
 * The method used for fine-tuning.
 */
export interface FineTuneMethod { 
  /**
   * The type of method. Is either `supervised` or `dpo`.
   */
  type?: FineTuneMethod.TypeEnum;
  supervised?: FineTuneSupervisedMethod;
  dpo?: FineTuneDPOMethod;
}
export namespace FineTuneMethod {
  export const TypeEnum = {
    Supervised: 'supervised',
    Dpo: 'dpo'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


