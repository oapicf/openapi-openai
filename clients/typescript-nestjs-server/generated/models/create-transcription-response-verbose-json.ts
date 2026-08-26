import { TranscriptionSegment } from './transcription-segment';
import { TranscriptionWord } from './transcription-word';


/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
export interface CreateTranscriptionResponseVerboseJson { 
  /**
   * The language of the input audio.
   */
  language: string;
  /**
   * The duration of the input audio.
   */
  duration: string;
  /**
   * The transcribed text.
   */
  text: string;
  /**
   * Extracted words and their corresponding timestamps.
   */
  words?: Array<TranscriptionWord>;
  /**
   * Segments of the transcribed text and their corresponding details.
   */
  segments?: Array<TranscriptionSegment>;
}

