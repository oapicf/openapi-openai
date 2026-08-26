

export interface DeleteAssistantResponse { 
  id: string;
  deleted: boolean;
  object: DeleteAssistantResponse.ObjectEnum;
}
export namespace DeleteAssistantResponse {
  export const ObjectEnum = {
    AssistantDeleted: 'assistant.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


