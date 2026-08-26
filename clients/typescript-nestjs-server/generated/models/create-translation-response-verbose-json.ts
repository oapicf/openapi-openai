import { TranscriptionSegment } from './transcription-segment';


export interface CreateTranslationResponseVerboseJson { 
  /**
   * The language of the output translation (always `english`).
   */
  language: string;
  /**
   * The duration of the input audio.
   */
  duration: string;
  /**
   * The translated text.
   */
  text: string;
  /**
   * Segments of the translated text and their corresponding details.
   */
  segments?: Array<TranscriptionSegment>;
}

