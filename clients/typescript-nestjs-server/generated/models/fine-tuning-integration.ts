import { CreateFineTuningJobRequestIntegrationsInnerWandb } from './create-fine-tuning-job-request-integrations-inner-wandb';


export interface FineTuningIntegration { 
  /**
   * The type of the integration being enabled for the fine-tuning job
   */
  type: FineTuningIntegration.TypeEnum;
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb;
}
export namespace FineTuningIntegration {
  export const TypeEnum = {
    Wandb: 'wandb'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


