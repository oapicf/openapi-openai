import { ChatCompletionRequestMessageContentPartAudioInputAudio } from './chat-completion-request-message-content-part-audio-input-audio';


/**
 * Learn about [audio inputs](/docs/guides/audio). 
 */
export interface ChatCompletionRequestMessageContentPartAudio { 
  /**
   * The type of the content part. Always `input_audio`.
   */
  type: ChatCompletionRequestMessageContentPartAudio.TypeEnum;
  input_audio: ChatCompletionRequestMessageContentPartAudioInputAudio;
}
export namespace ChatCompletionRequestMessageContentPartAudio {
  export const TypeEnum = {
    InputAudio: 'input_audio'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


