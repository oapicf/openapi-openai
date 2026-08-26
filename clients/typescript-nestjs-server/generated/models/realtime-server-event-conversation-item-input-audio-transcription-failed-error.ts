

/**
 * Details of the transcription error.
 */
export interface RealtimeServerEventConversationItemInputAudioTranscriptionFailedError { 
  /**
   * The type of error.
   */
  type?: string;
  /**
   * Error code, if any.
   */
  code?: string;
  /**
   * A human-readable error message.
   */
  message?: string;
  /**
   * Parameter related to the error, if any.
   */
  param?: string;
}

