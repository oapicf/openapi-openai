

export interface DeleteFileResponse { 
  id: string;
  object: DeleteFileResponse.ObjectEnum;
  deleted: boolean;
}
export namespace DeleteFileResponse {
  export const ObjectEnum = {
    File: 'file'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


