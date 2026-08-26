

export interface ResponseFormatJsonObject { 
  /**
   * The type of response format being defined: `json_object`
   */
  type: ResponseFormatJsonObject.TypeEnum;
}
export namespace ResponseFormatJsonObject {
  export const TypeEnum = {
    JsonObject: 'json_object'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


