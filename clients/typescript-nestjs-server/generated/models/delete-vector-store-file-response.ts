

export interface DeleteVectorStoreFileResponse { 
  id: string;
  deleted: boolean;
  object: DeleteVectorStoreFileResponse.ObjectEnum;
}
export namespace DeleteVectorStoreFileResponse {
  export const ObjectEnum = {
    VectorStoreFileDeleted: 'vector_store.file.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


