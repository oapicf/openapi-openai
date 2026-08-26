import { CreateFineTuningJobRequestIntegrationsInnerWandb } from './create-fine-tuning-job-request-integrations-inner-wandb';


export interface CreateFineTuningJobRequestIntegrationsInner { 
  /**
   * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
   */
  type: CreateFineTuningJobRequestIntegrationsInner.TypeEnum;
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb;
}
export namespace CreateFineTuningJobRequestIntegrationsInner {
  export const TypeEnum = {
    Wandb: 'wandb'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


