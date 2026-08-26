

/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 */
export interface RealtimeClientEventInputAudioBufferClear { 
  /**
   * Optional client-generated ID used to identify this event.
   */
  event_id?: string;
  /**
   * The event type, must be `input_audio_buffer.clear`.
   */
  type: RealtimeClientEventInputAudioBufferClear.TypeEnum;
}
export namespace RealtimeClientEventInputAudioBufferClear {
  export const TypeEnum = {
    InputAudioBufferClear: 'input_audio_buffer.clear'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


