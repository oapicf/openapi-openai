

export interface ChatCompletionRequestMessageContentPartAudioInputAudio { 
  /**
   * Base64 encoded audio data.
   */
  data: string;
  /**
   * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
   */
  format: ChatCompletionRequestMessageContentPartAudioInputAudio.FormatEnum;
}
export namespace ChatCompletionRequestMessageContentPartAudioInputAudio {
  export const FormatEnum = {
    Wav: 'wav',
    Mp3: 'mp3'
  } as const;
  export type FormatEnum = typeof FormatEnum[keyof typeof FormatEnum];
}


