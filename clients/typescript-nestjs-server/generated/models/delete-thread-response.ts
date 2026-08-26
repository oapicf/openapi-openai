

export interface DeleteThreadResponse { 
  id: string;
  deleted: boolean;
  object: DeleteThreadResponse.ObjectEnum;
}
export namespace DeleteThreadResponse {
  export const ObjectEnum = {
    ThreadDeleted: 'thread.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


