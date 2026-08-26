import { ResponseFormatJsonSchemaJsonSchema } from './response-format-json-schema-json-schema';


export interface ResponseFormatJsonSchema { 
  /**
   * The type of response format being defined: `json_schema`
   */
  type: ResponseFormatJsonSchema.TypeEnum;
  json_schema: ResponseFormatJsonSchemaJsonSchema;
}
export namespace ResponseFormatJsonSchema {
  export const TypeEnum = {
    JsonSchema: 'json_schema'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


