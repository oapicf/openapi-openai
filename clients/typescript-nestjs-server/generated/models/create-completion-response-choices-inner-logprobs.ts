

export interface CreateCompletionResponseChoicesInnerLogprobs { 
  text_offset?: Array<number>;
  token_logprobs?: Array<number>;
  tokens?: Array<string>;
  top_logprobs?: Array<{ [key: string]: number; }>;
}

