

export interface DeleteVectorStoreResponse { 
  id: string;
  deleted: boolean;
  object: DeleteVectorStoreResponse.ObjectEnum;
}
export namespace DeleteVectorStoreResponse {
  export const ObjectEnum = {
    VectorStoreDeleted: 'vector_store.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


