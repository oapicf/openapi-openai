

export interface TranscriptionWord { 
  /**
   * The text content of the word.
   */
  word: string;
  /**
   * Start time of the word in seconds.
   */
  start: number;
  /**
   * End time of the word in seconds.
   */
  end: number;
}

