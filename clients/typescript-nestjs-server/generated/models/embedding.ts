

/**
 * Represents an embedding vector returned by embedding endpoint. 
 */
export interface Embedding { 
  /**
   * The index of the embedding in the list of embeddings.
   */
  index: number;
  /**
   * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
   */
  embedding: Array<number>;
  /**
   * The object type, which is always \"embedding\".
   */
  object: Embedding.ObjectEnum;
}
export namespace Embedding {
  export const ObjectEnum = {
    Embedding: 'embedding'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


