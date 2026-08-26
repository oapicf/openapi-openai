

export interface MessageDeltaContentImageUrlObjectImageUrl { 
  /**
   * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
   */
  url?: string;
  /**
   * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
   */
  detail?: MessageDeltaContentImageUrlObjectImageUrl.DetailEnum;
}
export namespace MessageDeltaContentImageUrlObjectImageUrl {
  export const DetailEnum = {
    Auto: 'auto',
    Low: 'low',
    High: 'high'
  } as const;
  export type DetailEnum = typeof DetailEnum[keyof typeof DetailEnum];
}


