

/**
 * Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 */
export interface RealtimeServerEventInputAudioBufferCleared { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `input_audio_buffer.cleared`.
   */
  type: RealtimeServerEventInputAudioBufferCleared.TypeEnum;
}
export namespace RealtimeServerEventInputAudioBufferCleared {
  export const TypeEnum = {
    InputAudioBufferCleared: 'input_audio_buffer.cleared'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


