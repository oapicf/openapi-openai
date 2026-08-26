

export interface RealtimeConversationItemContentInner { 
  /**
   * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
   */
  type?: RealtimeConversationItemContentInner.TypeEnum;
  /**
   * The text content, used for `input_text` and `text` content types. 
   */
  text?: string;
  /**
   * ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
   */
  id?: string;
  /**
   * Base64-encoded audio bytes, used for `input_audio` content type. 
   */
  audio?: string;
  /**
   * The transcript of the audio, used for `input_audio` content type. 
   */
  transcript?: string;
}
export namespace RealtimeConversationItemContentInner {
  export const TypeEnum = {
    InputAudio: 'input_audio',
    InputText: 'input_text',
    ItemReference: 'item_reference',
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


