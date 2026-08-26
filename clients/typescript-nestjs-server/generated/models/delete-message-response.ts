

export interface DeleteMessageResponse { 
  id: string;
  deleted: boolean;
  object: DeleteMessageResponse.ObjectEnum;
}
export namespace DeleteMessageResponse {
  export const ObjectEnum = {
    ThreadMessageDeleted: 'thread.message.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


