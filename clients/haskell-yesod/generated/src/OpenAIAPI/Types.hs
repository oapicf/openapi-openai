{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OpenAIAPI.Types (
  ChatCompletionFunctions (..),
  ChatCompletionRequestMessage (..),
  ChatCompletionRequestMessageFunctionCall (..),
  ChatCompletionResponseMessage (..),
  ChatCompletionStreamResponseDelta (..),
  CreateChatCompletionRequest (..),
  CreateChatCompletionRequestFunctionCall (..),
  CreateChatCompletionRequestFunctionCallOneOf (..),
  CreateChatCompletionRequestModel (..),
  CreateChatCompletionRequestStop (..),
  CreateChatCompletionResponse (..),
  CreateChatCompletionResponseChoicesInner (..),
  CreateChatCompletionStreamResponse (..),
  CreateChatCompletionStreamResponseChoicesInner (..),
  CreateCompletionRequest (..),
  CreateCompletionRequestModel (..),
  CreateCompletionRequestPrompt (..),
  CreateCompletionRequestStop (..),
  CreateCompletionResponse (..),
  CreateCompletionResponseChoicesInner (..),
  CreateCompletionResponseChoicesInnerLogprobs (..),
  CreateCompletionResponseUsage (..),
  CreateEditRequest (..),
  CreateEditRequestModel (..),
  CreateEditResponse (..),
  CreateEditResponseChoicesInner (..),
  CreateEmbeddingRequest (..),
  CreateEmbeddingRequestInput (..),
  CreateEmbeddingRequestModel (..),
  CreateEmbeddingResponse (..),
  CreateEmbeddingResponseDataInner (..),
  CreateEmbeddingResponseUsage (..),
  CreateFineTuneRequest (..),
  CreateFineTuneRequestModel (..),
  CreateImageRequest (..),
  CreateModerationRequest (..),
  CreateModerationRequestInput (..),
  CreateModerationRequestModel (..),
  CreateModerationResponse (..),
  CreateModerationResponseResultsInner (..),
  CreateModerationResponseResultsInnerCategories (..),
  CreateModerationResponseResultsInnerCategoryScores (..),
  CreateTranscriptionRequestModel (..),
  CreateTranscriptionResponse (..),
  CreateTranslationResponse (..),
  DeleteFileResponse (..),
  DeleteModelResponse (..),
  Error (..),
  ErrorResponse (..),
  FineTune (..),
  FineTuneEvent (..),
  ImagesResponse (..),
  ImagesResponseDataInner (..),
  ListFilesResponse (..),
  ListFineTuneEventsResponse (..),
  ListFineTunesResponse (..),
  ListModelsResponse (..),
  Model (..),
  OpenAIFile (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data ChatCompletionFunctions = ChatCompletionFunctions
  { chatCompletionFunctionsName :: Text -- ^ The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  , chatCompletionFunctionsDescription :: Maybe Text -- ^ The description of what the function does.
  , chatCompletionFunctionsParameters :: Maybe (Map.Map String Value) -- ^ The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionFunctions where
  parseJSON = genericParseJSON optionsChatCompletionFunctions
instance ToJSON ChatCompletionFunctions where
  toJSON = genericToJSON optionsChatCompletionFunctions

optionsChatCompletionFunctions :: Options
optionsChatCompletionFunctions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionFunctionsName", "name")
      , ("chatCompletionFunctionsDescription", "description")
      , ("chatCompletionFunctionsParameters", "parameters")
      ]


-- | 
data ChatCompletionRequestMessage = ChatCompletionRequestMessage
  { chatCompletionRequestMessageRole :: Text -- ^ The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
  , chatCompletionRequestMessageContent :: Maybe Text -- ^ The contents of the message. `content` is required for all messages except assistant messages with function calls.
  , chatCompletionRequestMessageName :: Maybe Text -- ^ The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
  , chatCompletionRequestMessageFunctionUnderscorecall :: Maybe ChatCompletionRequestMessageFunctionCall -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessage
instance ToJSON ChatCompletionRequestMessage where
  toJSON = genericToJSON optionsChatCompletionRequestMessage

optionsChatCompletionRequestMessage :: Options
optionsChatCompletionRequestMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageRole", "role")
      , ("chatCompletionRequestMessageContent", "content")
      , ("chatCompletionRequestMessageName", "name")
      , ("chatCompletionRequestMessageFunctionUnderscorecall", "function_call")
      ]


-- | The name and arguments of a function that should be called, as generated by the model.
data ChatCompletionRequestMessageFunctionCall = ChatCompletionRequestMessageFunctionCall
  { chatCompletionRequestMessageFunctionCallName :: Maybe Text -- ^ The name of the function to call.
  , chatCompletionRequestMessageFunctionCallArguments :: Maybe Text -- ^ The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageFunctionCall where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageFunctionCall
instance ToJSON ChatCompletionRequestMessageFunctionCall where
  toJSON = genericToJSON optionsChatCompletionRequestMessageFunctionCall

optionsChatCompletionRequestMessageFunctionCall :: Options
optionsChatCompletionRequestMessageFunctionCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageFunctionCallName", "name")
      , ("chatCompletionRequestMessageFunctionCallArguments", "arguments")
      ]


-- | 
data ChatCompletionResponseMessage = ChatCompletionResponseMessage
  { chatCompletionResponseMessageRole :: Text -- ^ The role of the author of this message.
  , chatCompletionResponseMessageContent :: Maybe Text -- ^ The contents of the message.
  , chatCompletionResponseMessageFunctionUnderscorecall :: Maybe ChatCompletionRequestMessageFunctionCall -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionResponseMessage where
  parseJSON = genericParseJSON optionsChatCompletionResponseMessage
instance ToJSON ChatCompletionResponseMessage where
  toJSON = genericToJSON optionsChatCompletionResponseMessage

optionsChatCompletionResponseMessage :: Options
optionsChatCompletionResponseMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionResponseMessageRole", "role")
      , ("chatCompletionResponseMessageContent", "content")
      , ("chatCompletionResponseMessageFunctionUnderscorecall", "function_call")
      ]


-- | 
data ChatCompletionStreamResponseDelta = ChatCompletionStreamResponseDelta
  { chatCompletionStreamResponseDeltaRole :: Maybe Text -- ^ The role of the author of this message.
  , chatCompletionStreamResponseDeltaContent :: Maybe Text -- ^ The contents of the chunk message.
  , chatCompletionStreamResponseDeltaFunctionUnderscorecall :: Maybe ChatCompletionRequestMessageFunctionCall -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionStreamResponseDelta where
  parseJSON = genericParseJSON optionsChatCompletionStreamResponseDelta
instance ToJSON ChatCompletionStreamResponseDelta where
  toJSON = genericToJSON optionsChatCompletionStreamResponseDelta

optionsChatCompletionStreamResponseDelta :: Options
optionsChatCompletionStreamResponseDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionStreamResponseDeltaRole", "role")
      , ("chatCompletionStreamResponseDeltaContent", "content")
      , ("chatCompletionStreamResponseDeltaFunctionUnderscorecall", "function_call")
      ]


-- | 
data CreateChatCompletionRequest = CreateChatCompletionRequest
  { createChatCompletionRequestModel :: CreateChatCompletionRequestModel -- ^ 
  , createChatCompletionRequestMessages :: [ChatCompletionRequestMessage] -- ^ A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
  , createChatCompletionRequestFunctions :: Maybe [ChatCompletionFunctions] -- ^ A list of functions the model may generate JSON inputs for.
  , createChatCompletionRequestFunctionUnderscorecall :: Maybe CreateChatCompletionRequestFunctionCall -- ^ 
  , createChatCompletionRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  , createChatCompletionRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  , createChatCompletionRequestN :: Maybe Int -- ^ How many chat completion choices to generate for each input message.
  , createChatCompletionRequestStream :: Maybe Bool -- ^ If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
  , createChatCompletionRequestStop :: Maybe CreateChatCompletionRequestStop -- ^ 
  , createChatCompletionRequestMaxUnderscoretokens :: Maybe Int -- ^ The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
  , createChatCompletionRequestPresenceUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  , createChatCompletionRequestFrequencyUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  , createChatCompletionRequestLogitUnderscorebias :: Maybe Object -- ^ Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  , createChatCompletionRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequest where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequest
instance ToJSON CreateChatCompletionRequest where
  toJSON = genericToJSON optionsCreateChatCompletionRequest

optionsCreateChatCompletionRequest :: Options
optionsCreateChatCompletionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestModel", "model")
      , ("createChatCompletionRequestMessages", "messages")
      , ("createChatCompletionRequestFunctions", "functions")
      , ("createChatCompletionRequestFunctionUnderscorecall", "function_call")
      , ("createChatCompletionRequestTemperature", "temperature")
      , ("createChatCompletionRequestTopUnderscorep", "top_p")
      , ("createChatCompletionRequestN", "n")
      , ("createChatCompletionRequestStream", "stream")
      , ("createChatCompletionRequestStop", "stop")
      , ("createChatCompletionRequestMaxUnderscoretokens", "max_tokens")
      , ("createChatCompletionRequestPresenceUnderscorepenalty", "presence_penalty")
      , ("createChatCompletionRequestFrequencyUnderscorepenalty", "frequency_penalty")
      , ("createChatCompletionRequestLogitUnderscorebias", "logit_bias")
      , ("createChatCompletionRequestUser", "user")
      ]


-- | Controls how the model responds to function calls. \&quot;none\&quot; means the model does not call a function, and responds to the end-user. \&quot;auto\&quot; means the model can pick between an end-user or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;:\\ \&quot;my_function\&quot;}&#x60; forces the model to call that function. \&quot;none\&quot; is the default when no functions are present. \&quot;auto\&quot; is the default if functions are present.
data CreateChatCompletionRequestFunctionCall = CreateChatCompletionRequestFunctionCall
  { createChatCompletionRequestFunctionCallName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestFunctionCall where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestFunctionCall
instance ToJSON CreateChatCompletionRequestFunctionCall where
  toJSON = genericToJSON optionsCreateChatCompletionRequestFunctionCall

optionsCreateChatCompletionRequestFunctionCall :: Options
optionsCreateChatCompletionRequestFunctionCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestFunctionCallName", "name")
      ]


-- | 
data CreateChatCompletionRequestFunctionCallOneOf = CreateChatCompletionRequestFunctionCallOneOf
  { createChatCompletionRequestFunctionCallOneOfName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestFunctionCallOneOf where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestFunctionCallOneOf
instance ToJSON CreateChatCompletionRequestFunctionCallOneOf where
  toJSON = genericToJSON optionsCreateChatCompletionRequestFunctionCallOneOf

optionsCreateChatCompletionRequestFunctionCallOneOf :: Options
optionsCreateChatCompletionRequestFunctionCallOneOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestFunctionCallOneOfName", "name")
      ]


-- | ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
data CreateChatCompletionRequestModel = CreateChatCompletionRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestModel where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestModel
instance ToJSON CreateChatCompletionRequestModel where
  toJSON = genericToJSON optionsCreateChatCompletionRequestModel

optionsCreateChatCompletionRequestModel :: Options
optionsCreateChatCompletionRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Up to 4 sequences where the API will stop generating further tokens. 
data CreateChatCompletionRequestStop = CreateChatCompletionRequestStop
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestStop where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestStop
instance ToJSON CreateChatCompletionRequestStop where
  toJSON = genericToJSON optionsCreateChatCompletionRequestStop

optionsCreateChatCompletionRequestStop :: Options
optionsCreateChatCompletionRequestStop =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateChatCompletionResponse = CreateChatCompletionResponse
  { createChatCompletionResponseId :: Text -- ^ 
  , createChatCompletionResponseObject :: Text -- ^ 
  , createChatCompletionResponseCreated :: Int -- ^ 
  , createChatCompletionResponseModel :: Text -- ^ 
  , createChatCompletionResponseChoices :: [CreateChatCompletionResponseChoicesInner] -- ^ 
  , createChatCompletionResponseUsage :: Maybe CreateCompletionResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionResponse where
  parseJSON = genericParseJSON optionsCreateChatCompletionResponse
instance ToJSON CreateChatCompletionResponse where
  toJSON = genericToJSON optionsCreateChatCompletionResponse

optionsCreateChatCompletionResponse :: Options
optionsCreateChatCompletionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionResponseId", "id")
      , ("createChatCompletionResponseObject", "object")
      , ("createChatCompletionResponseCreated", "created")
      , ("createChatCompletionResponseModel", "model")
      , ("createChatCompletionResponseChoices", "choices")
      , ("createChatCompletionResponseUsage", "usage")
      ]


-- | 
data CreateChatCompletionResponseChoicesInner = CreateChatCompletionResponseChoicesInner
  { createChatCompletionResponseChoicesInnerIndex :: Maybe Int -- ^ 
  , createChatCompletionResponseChoicesInnerMessage :: Maybe ChatCompletionResponseMessage -- ^ 
  , createChatCompletionResponseChoicesInnerFinishUnderscorereason :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateChatCompletionResponseChoicesInner
instance ToJSON CreateChatCompletionResponseChoicesInner where
  toJSON = genericToJSON optionsCreateChatCompletionResponseChoicesInner

optionsCreateChatCompletionResponseChoicesInner :: Options
optionsCreateChatCompletionResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionResponseChoicesInnerIndex", "index")
      , ("createChatCompletionResponseChoicesInnerMessage", "message")
      , ("createChatCompletionResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      ]


-- | 
data CreateChatCompletionStreamResponse = CreateChatCompletionStreamResponse
  { createChatCompletionStreamResponseId :: Text -- ^ 
  , createChatCompletionStreamResponseObject :: Text -- ^ 
  , createChatCompletionStreamResponseCreated :: Int -- ^ 
  , createChatCompletionStreamResponseModel :: Text -- ^ 
  , createChatCompletionStreamResponseChoices :: [CreateChatCompletionStreamResponseChoicesInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionStreamResponse where
  parseJSON = genericParseJSON optionsCreateChatCompletionStreamResponse
instance ToJSON CreateChatCompletionStreamResponse where
  toJSON = genericToJSON optionsCreateChatCompletionStreamResponse

optionsCreateChatCompletionStreamResponse :: Options
optionsCreateChatCompletionStreamResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionStreamResponseId", "id")
      , ("createChatCompletionStreamResponseObject", "object")
      , ("createChatCompletionStreamResponseCreated", "created")
      , ("createChatCompletionStreamResponseModel", "model")
      , ("createChatCompletionStreamResponseChoices", "choices")
      ]


-- | 
data CreateChatCompletionStreamResponseChoicesInner = CreateChatCompletionStreamResponseChoicesInner
  { createChatCompletionStreamResponseChoicesInnerIndex :: Maybe Int -- ^ 
  , createChatCompletionStreamResponseChoicesInnerDelta :: Maybe ChatCompletionStreamResponseDelta -- ^ 
  , createChatCompletionStreamResponseChoicesInnerFinishUnderscorereason :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionStreamResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateChatCompletionStreamResponseChoicesInner
instance ToJSON CreateChatCompletionStreamResponseChoicesInner where
  toJSON = genericToJSON optionsCreateChatCompletionStreamResponseChoicesInner

optionsCreateChatCompletionStreamResponseChoicesInner :: Options
optionsCreateChatCompletionStreamResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionStreamResponseChoicesInnerIndex", "index")
      , ("createChatCompletionStreamResponseChoicesInnerDelta", "delta")
      , ("createChatCompletionStreamResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      ]


-- | 
data CreateCompletionRequest = CreateCompletionRequest
  { createCompletionRequestModel :: CreateCompletionRequestModel -- ^ 
  , createCompletionRequestPrompt :: CreateCompletionRequestPrompt -- ^ 
  , createCompletionRequestSuffix :: Maybe Text -- ^ The suffix that comes after a completion of inserted text.
  , createCompletionRequestMaxUnderscoretokens :: Maybe Int -- ^ The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
  , createCompletionRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  , createCompletionRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  , createCompletionRequestN :: Maybe Int -- ^ How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  , createCompletionRequestStream :: Maybe Bool -- ^ Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
  , createCompletionRequestLogprobs :: Maybe Int -- ^ Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
  , createCompletionRequestEcho :: Maybe Bool -- ^ Echo back the prompt in addition to the completion 
  , createCompletionRequestStop :: Maybe CreateCompletionRequestStop -- ^ 
  , createCompletionRequestPresenceUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  , createCompletionRequestFrequencyUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  , createCompletionRequestBestUnderscoreof :: Maybe Int -- ^ Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  , createCompletionRequestLogitUnderscorebias :: Maybe Object -- ^ Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
  , createCompletionRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequest where
  parseJSON = genericParseJSON optionsCreateCompletionRequest
instance ToJSON CreateCompletionRequest where
  toJSON = genericToJSON optionsCreateCompletionRequest

optionsCreateCompletionRequest :: Options
optionsCreateCompletionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionRequestModel", "model")
      , ("createCompletionRequestPrompt", "prompt")
      , ("createCompletionRequestSuffix", "suffix")
      , ("createCompletionRequestMaxUnderscoretokens", "max_tokens")
      , ("createCompletionRequestTemperature", "temperature")
      , ("createCompletionRequestTopUnderscorep", "top_p")
      , ("createCompletionRequestN", "n")
      , ("createCompletionRequestStream", "stream")
      , ("createCompletionRequestLogprobs", "logprobs")
      , ("createCompletionRequestEcho", "echo")
      , ("createCompletionRequestStop", "stop")
      , ("createCompletionRequestPresenceUnderscorepenalty", "presence_penalty")
      , ("createCompletionRequestFrequencyUnderscorepenalty", "frequency_penalty")
      , ("createCompletionRequestBestUnderscoreof", "best_of")
      , ("createCompletionRequestLogitUnderscorebias", "logit_bias")
      , ("createCompletionRequestUser", "user")
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
data CreateCompletionRequestModel = CreateCompletionRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequestModel where
  parseJSON = genericParseJSON optionsCreateCompletionRequestModel
instance ToJSON CreateCompletionRequestModel where
  toJSON = genericToJSON optionsCreateCompletionRequestModel

optionsCreateCompletionRequestModel :: Options
optionsCreateCompletionRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
data CreateCompletionRequestPrompt = CreateCompletionRequestPrompt
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequestPrompt where
  parseJSON = genericParseJSON optionsCreateCompletionRequestPrompt
instance ToJSON CreateCompletionRequestPrompt where
  toJSON = genericToJSON optionsCreateCompletionRequestPrompt

optionsCreateCompletionRequestPrompt :: Options
optionsCreateCompletionRequestPrompt =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
data CreateCompletionRequestStop = CreateCompletionRequestStop
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequestStop where
  parseJSON = genericParseJSON optionsCreateCompletionRequestStop
instance ToJSON CreateCompletionRequestStop where
  toJSON = genericToJSON optionsCreateCompletionRequestStop

optionsCreateCompletionRequestStop :: Options
optionsCreateCompletionRequestStop =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateCompletionResponse = CreateCompletionResponse
  { createCompletionResponseId :: Text -- ^ 
  , createCompletionResponseObject :: Text -- ^ 
  , createCompletionResponseCreated :: Int -- ^ 
  , createCompletionResponseModel :: Text -- ^ 
  , createCompletionResponseChoices :: [CreateCompletionResponseChoicesInner] -- ^ 
  , createCompletionResponseUsage :: Maybe CreateCompletionResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponse where
  parseJSON = genericParseJSON optionsCreateCompletionResponse
instance ToJSON CreateCompletionResponse where
  toJSON = genericToJSON optionsCreateCompletionResponse

optionsCreateCompletionResponse :: Options
optionsCreateCompletionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseId", "id")
      , ("createCompletionResponseObject", "object")
      , ("createCompletionResponseCreated", "created")
      , ("createCompletionResponseModel", "model")
      , ("createCompletionResponseChoices", "choices")
      , ("createCompletionResponseUsage", "usage")
      ]


-- | 
data CreateCompletionResponseChoicesInner = CreateCompletionResponseChoicesInner
  { createCompletionResponseChoicesInnerText :: Text -- ^ 
  , createCompletionResponseChoicesInnerIndex :: Int -- ^ 
  , createCompletionResponseChoicesInnerLogprobs :: CreateCompletionResponseChoicesInnerLogprobs -- ^ 
  , createCompletionResponseChoicesInnerFinishUnderscorereason :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateCompletionResponseChoicesInner
instance ToJSON CreateCompletionResponseChoicesInner where
  toJSON = genericToJSON optionsCreateCompletionResponseChoicesInner

optionsCreateCompletionResponseChoicesInner :: Options
optionsCreateCompletionResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseChoicesInnerText", "text")
      , ("createCompletionResponseChoicesInnerIndex", "index")
      , ("createCompletionResponseChoicesInnerLogprobs", "logprobs")
      , ("createCompletionResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      ]


-- | 
data CreateCompletionResponseChoicesInnerLogprobs = CreateCompletionResponseChoicesInnerLogprobs
  { createCompletionResponseChoicesInnerLogprobsTokens :: Maybe [Text] -- ^ 
  , createCompletionResponseChoicesInnerLogprobsTokenUnderscorelogprobs :: Maybe [Double] -- ^ 
  , createCompletionResponseChoicesInnerLogprobsTopUnderscorelogprobs :: Maybe [Object] -- ^ 
  , createCompletionResponseChoicesInnerLogprobsTextUnderscoreoffset :: Maybe [Int] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponseChoicesInnerLogprobs where
  parseJSON = genericParseJSON optionsCreateCompletionResponseChoicesInnerLogprobs
instance ToJSON CreateCompletionResponseChoicesInnerLogprobs where
  toJSON = genericToJSON optionsCreateCompletionResponseChoicesInnerLogprobs

optionsCreateCompletionResponseChoicesInnerLogprobs :: Options
optionsCreateCompletionResponseChoicesInnerLogprobs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseChoicesInnerLogprobsTokens", "tokens")
      , ("createCompletionResponseChoicesInnerLogprobsTokenUnderscorelogprobs", "token_logprobs")
      , ("createCompletionResponseChoicesInnerLogprobsTopUnderscorelogprobs", "top_logprobs")
      , ("createCompletionResponseChoicesInnerLogprobsTextUnderscoreoffset", "text_offset")
      ]


-- | 
data CreateCompletionResponseUsage = CreateCompletionResponseUsage
  { createCompletionResponseUsagePromptUnderscoretokens :: Int -- ^ 
  , createCompletionResponseUsageCompletionUnderscoretokens :: Int -- ^ 
  , createCompletionResponseUsageTotalUnderscoretokens :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponseUsage where
  parseJSON = genericParseJSON optionsCreateCompletionResponseUsage
instance ToJSON CreateCompletionResponseUsage where
  toJSON = genericToJSON optionsCreateCompletionResponseUsage

optionsCreateCompletionResponseUsage :: Options
optionsCreateCompletionResponseUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseUsagePromptUnderscoretokens", "prompt_tokens")
      , ("createCompletionResponseUsageCompletionUnderscoretokens", "completion_tokens")
      , ("createCompletionResponseUsageTotalUnderscoretokens", "total_tokens")
      ]


-- | 
data CreateEditRequest = CreateEditRequest
  { createEditRequestModel :: CreateEditRequestModel -- ^ 
  , createEditRequestInput :: Maybe Text -- ^ The input text to use as a starting point for the edit.
  , createEditRequestInstruction :: Text -- ^ The instruction that tells the model how to edit the prompt.
  , createEditRequestN :: Maybe Int -- ^ How many edits to generate for the input and instruction.
  , createEditRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  , createEditRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEditRequest where
  parseJSON = genericParseJSON optionsCreateEditRequest
instance ToJSON CreateEditRequest where
  toJSON = genericToJSON optionsCreateEditRequest

optionsCreateEditRequest :: Options
optionsCreateEditRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEditRequestModel", "model")
      , ("createEditRequestInput", "input")
      , ("createEditRequestInstruction", "instruction")
      , ("createEditRequestN", "n")
      , ("createEditRequestTemperature", "temperature")
      , ("createEditRequestTopUnderscorep", "top_p")
      ]


-- | ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint.
data CreateEditRequestModel = CreateEditRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEditRequestModel where
  parseJSON = genericParseJSON optionsCreateEditRequestModel
instance ToJSON CreateEditRequestModel where
  toJSON = genericToJSON optionsCreateEditRequestModel

optionsCreateEditRequestModel :: Options
optionsCreateEditRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateEditResponse = CreateEditResponse
  { createEditResponseObject :: Text -- ^ 
  , createEditResponseCreated :: Int -- ^ 
  , createEditResponseChoices :: [CreateEditResponseChoicesInner] -- ^ 
  , createEditResponseUsage :: CreateCompletionResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEditResponse where
  parseJSON = genericParseJSON optionsCreateEditResponse
instance ToJSON CreateEditResponse where
  toJSON = genericToJSON optionsCreateEditResponse

optionsCreateEditResponse :: Options
optionsCreateEditResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEditResponseObject", "object")
      , ("createEditResponseCreated", "created")
      , ("createEditResponseChoices", "choices")
      , ("createEditResponseUsage", "usage")
      ]


-- | 
data CreateEditResponseChoicesInner = CreateEditResponseChoicesInner
  { createEditResponseChoicesInnerText :: Maybe Text -- ^ 
  , createEditResponseChoicesInnerIndex :: Maybe Int -- ^ 
  , createEditResponseChoicesInnerLogprobs :: Maybe CreateCompletionResponseChoicesInnerLogprobs -- ^ 
  , createEditResponseChoicesInnerFinishUnderscorereason :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEditResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateEditResponseChoicesInner
instance ToJSON CreateEditResponseChoicesInner where
  toJSON = genericToJSON optionsCreateEditResponseChoicesInner

optionsCreateEditResponseChoicesInner :: Options
optionsCreateEditResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEditResponseChoicesInnerText", "text")
      , ("createEditResponseChoicesInnerIndex", "index")
      , ("createEditResponseChoicesInnerLogprobs", "logprobs")
      , ("createEditResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      ]


-- | 
data CreateEmbeddingRequest = CreateEmbeddingRequest
  { createEmbeddingRequestModel :: CreateEmbeddingRequestModel -- ^ 
  , createEmbeddingRequestInput :: CreateEmbeddingRequestInput -- ^ 
  , createEmbeddingRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingRequest where
  parseJSON = genericParseJSON optionsCreateEmbeddingRequest
instance ToJSON CreateEmbeddingRequest where
  toJSON = genericToJSON optionsCreateEmbeddingRequest

optionsCreateEmbeddingRequest :: Options
optionsCreateEmbeddingRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingRequestModel", "model")
      , ("createEmbeddingRequestInput", "input")
      , ("createEmbeddingRequestUser", "user")
      ]


-- | Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for &#x60;text-embedding-ada-002&#x60;). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
data CreateEmbeddingRequestInput = CreateEmbeddingRequestInput
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingRequestInput where
  parseJSON = genericParseJSON optionsCreateEmbeddingRequestInput
instance ToJSON CreateEmbeddingRequestInput where
  toJSON = genericToJSON optionsCreateEmbeddingRequestInput

optionsCreateEmbeddingRequestInput :: Options
optionsCreateEmbeddingRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
data CreateEmbeddingRequestModel = CreateEmbeddingRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingRequestModel where
  parseJSON = genericParseJSON optionsCreateEmbeddingRequestModel
instance ToJSON CreateEmbeddingRequestModel where
  toJSON = genericToJSON optionsCreateEmbeddingRequestModel

optionsCreateEmbeddingRequestModel :: Options
optionsCreateEmbeddingRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateEmbeddingResponse = CreateEmbeddingResponse
  { createEmbeddingResponseObject :: Text -- ^ 
  , createEmbeddingResponseModel :: Text -- ^ 
  , createEmbeddingResponseData :: [CreateEmbeddingResponseDataInner] -- ^ 
  , createEmbeddingResponseUsage :: CreateEmbeddingResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingResponse where
  parseJSON = genericParseJSON optionsCreateEmbeddingResponse
instance ToJSON CreateEmbeddingResponse where
  toJSON = genericToJSON optionsCreateEmbeddingResponse

optionsCreateEmbeddingResponse :: Options
optionsCreateEmbeddingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingResponseObject", "object")
      , ("createEmbeddingResponseModel", "model")
      , ("createEmbeddingResponseData", "data")
      , ("createEmbeddingResponseUsage", "usage")
      ]


-- | 
data CreateEmbeddingResponseDataInner = CreateEmbeddingResponseDataInner
  { createEmbeddingResponseDataInnerIndex :: Int -- ^ 
  , createEmbeddingResponseDataInnerObject :: Text -- ^ 
  , createEmbeddingResponseDataInnerEmbedding :: [Double] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingResponseDataInner where
  parseJSON = genericParseJSON optionsCreateEmbeddingResponseDataInner
instance ToJSON CreateEmbeddingResponseDataInner where
  toJSON = genericToJSON optionsCreateEmbeddingResponseDataInner

optionsCreateEmbeddingResponseDataInner :: Options
optionsCreateEmbeddingResponseDataInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingResponseDataInnerIndex", "index")
      , ("createEmbeddingResponseDataInnerObject", "object")
      , ("createEmbeddingResponseDataInnerEmbedding", "embedding")
      ]


-- | 
data CreateEmbeddingResponseUsage = CreateEmbeddingResponseUsage
  { createEmbeddingResponseUsagePromptUnderscoretokens :: Int -- ^ 
  , createEmbeddingResponseUsageTotalUnderscoretokens :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingResponseUsage where
  parseJSON = genericParseJSON optionsCreateEmbeddingResponseUsage
instance ToJSON CreateEmbeddingResponseUsage where
  toJSON = genericToJSON optionsCreateEmbeddingResponseUsage

optionsCreateEmbeddingResponseUsage :: Options
optionsCreateEmbeddingResponseUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingResponseUsagePromptUnderscoretokens", "prompt_tokens")
      , ("createEmbeddingResponseUsageTotalUnderscoretokens", "total_tokens")
      ]


-- | 
data CreateFineTuneRequest = CreateFineTuneRequest
  { createFineTuneRequestTrainingUnderscorefile :: Text -- ^ The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
  , createFineTuneRequestValidationUnderscorefile :: Maybe Text -- ^ The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
  , createFineTuneRequestModel :: Maybe CreateFineTuneRequestModel -- ^ 
  , createFineTuneRequestNUnderscoreepochs :: Maybe Int -- ^ The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
  , createFineTuneRequestBatchUnderscoresize :: Maybe Int -- ^ The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
  , createFineTuneRequestLearningUnderscorerateUnderscoremultiplier :: Maybe Double -- ^ The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
  , createFineTuneRequestPromptUnderscorelossUnderscoreweight :: Maybe Double -- ^ The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
  , createFineTuneRequestComputeUnderscoreclassificationUnderscoremetrics :: Maybe Bool -- ^ If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
  , createFineTuneRequestClassificationUnderscorenUnderscoreclasses :: Maybe Int -- ^ The number of classes in a classification task.  This parameter is required for multiclass classification. 
  , createFineTuneRequestClassificationUnderscorepositiveUnderscoreclass :: Maybe Text -- ^ The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
  , createFineTuneRequestClassificationUnderscorebetas :: Maybe [Double] -- ^ If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
  , createFineTuneRequestSuffix :: Maybe Text -- ^ A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuneRequest where
  parseJSON = genericParseJSON optionsCreateFineTuneRequest
instance ToJSON CreateFineTuneRequest where
  toJSON = genericToJSON optionsCreateFineTuneRequest

optionsCreateFineTuneRequest :: Options
optionsCreateFineTuneRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createFineTuneRequestTrainingUnderscorefile", "training_file")
      , ("createFineTuneRequestValidationUnderscorefile", "validation_file")
      , ("createFineTuneRequestModel", "model")
      , ("createFineTuneRequestNUnderscoreepochs", "n_epochs")
      , ("createFineTuneRequestBatchUnderscoresize", "batch_size")
      , ("createFineTuneRequestLearningUnderscorerateUnderscoremultiplier", "learning_rate_multiplier")
      , ("createFineTuneRequestPromptUnderscorelossUnderscoreweight", "prompt_loss_weight")
      , ("createFineTuneRequestComputeUnderscoreclassificationUnderscoremetrics", "compute_classification_metrics")
      , ("createFineTuneRequestClassificationUnderscorenUnderscoreclasses", "classification_n_classes")
      , ("createFineTuneRequestClassificationUnderscorepositiveUnderscoreclass", "classification_positive_class")
      , ("createFineTuneRequestClassificationUnderscorebetas", "classification_betas")
      , ("createFineTuneRequestSuffix", "suffix")
      ]


-- | The name of the base model to fine-tune. You can select one of \&quot;ada\&quot;, \&quot;babbage\&quot;, \&quot;curie\&quot;, \&quot;davinci\&quot;, or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 
data CreateFineTuneRequestModel = CreateFineTuneRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuneRequestModel where
  parseJSON = genericParseJSON optionsCreateFineTuneRequestModel
instance ToJSON CreateFineTuneRequestModel where
  toJSON = genericToJSON optionsCreateFineTuneRequestModel

optionsCreateFineTuneRequestModel :: Options
optionsCreateFineTuneRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateImageRequest = CreateImageRequest
  { createImageRequestPrompt :: Text -- ^ A text description of the desired image(s). The maximum length is 1000 characters.
  , createImageRequestN :: Maybe Int -- ^ The number of images to generate. Must be between 1 and 10.
  , createImageRequestSize :: Maybe Text -- ^ The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  , createImageRequestResponseUnderscoreformat :: Maybe Text -- ^ The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  , createImageRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateImageRequest where
  parseJSON = genericParseJSON optionsCreateImageRequest
instance ToJSON CreateImageRequest where
  toJSON = genericToJSON optionsCreateImageRequest

optionsCreateImageRequest :: Options
optionsCreateImageRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createImageRequestPrompt", "prompt")
      , ("createImageRequestN", "n")
      , ("createImageRequestSize", "size")
      , ("createImageRequestResponseUnderscoreformat", "response_format")
      , ("createImageRequestUser", "user")
      ]


-- | 
data CreateModerationRequest = CreateModerationRequest
  { createModerationRequestInput :: CreateModerationRequestInput -- ^ 
  , createModerationRequestModel :: Maybe CreateModerationRequestModel -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequest where
  parseJSON = genericParseJSON optionsCreateModerationRequest
instance ToJSON CreateModerationRequest where
  toJSON = genericToJSON optionsCreateModerationRequest

optionsCreateModerationRequest :: Options
optionsCreateModerationRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationRequestInput", "input")
      , ("createModerationRequestModel", "model")
      ]


-- | The input text to classify
data CreateModerationRequestInput = CreateModerationRequestInput
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestInput where
  parseJSON = genericParseJSON optionsCreateModerationRequestInput
instance ToJSON CreateModerationRequestInput where
  toJSON = genericToJSON optionsCreateModerationRequestInput

optionsCreateModerationRequestInput :: Options
optionsCreateModerationRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Two content moderations models are available: &#x60;text-moderation-stable&#x60; and &#x60;text-moderation-latest&#x60;.  The default is &#x60;text-moderation-latest&#x60; which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use &#x60;text-moderation-stable&#x60;, we will provide advanced notice before updating the model. Accuracy of &#x60;text-moderation-stable&#x60; may be slightly lower than for &#x60;text-moderation-latest&#x60;. 
data CreateModerationRequestModel = CreateModerationRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestModel where
  parseJSON = genericParseJSON optionsCreateModerationRequestModel
instance ToJSON CreateModerationRequestModel where
  toJSON = genericToJSON optionsCreateModerationRequestModel

optionsCreateModerationRequestModel :: Options
optionsCreateModerationRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateModerationResponse = CreateModerationResponse
  { createModerationResponseId :: Text -- ^ 
  , createModerationResponseModel :: Text -- ^ 
  , createModerationResponseResults :: [CreateModerationResponseResultsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponse where
  parseJSON = genericParseJSON optionsCreateModerationResponse
instance ToJSON CreateModerationResponse where
  toJSON = genericToJSON optionsCreateModerationResponse

optionsCreateModerationResponse :: Options
optionsCreateModerationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseId", "id")
      , ("createModerationResponseModel", "model")
      , ("createModerationResponseResults", "results")
      ]


-- | 
data CreateModerationResponseResultsInner = CreateModerationResponseResultsInner
  { createModerationResponseResultsInnerFlagged :: Bool -- ^ 
  , createModerationResponseResultsInnerCategories :: CreateModerationResponseResultsInnerCategories -- ^ 
  , createModerationResponseResultsInnerCategoryUnderscorescores :: CreateModerationResponseResultsInnerCategoryScores -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInner where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInner
instance ToJSON CreateModerationResponseResultsInner where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInner

optionsCreateModerationResponseResultsInner :: Options
optionsCreateModerationResponseResultsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerFlagged", "flagged")
      , ("createModerationResponseResultsInnerCategories", "categories")
      , ("createModerationResponseResultsInnerCategoryUnderscorescores", "category_scores")
      ]


-- | 
data CreateModerationResponseResultsInnerCategories = CreateModerationResponseResultsInnerCategories
  { createModerationResponseResultsInnerCategoriesHate :: Bool -- ^ 
  , createModerationResponseResultsInnerCategoriesHateSlashthreatening :: Bool -- ^ 
  , createModerationResponseResultsInnerCategoriesSelfDashharm :: Bool -- ^ 
  , createModerationResponseResultsInnerCategoriesSexual :: Bool -- ^ 
  , createModerationResponseResultsInnerCategoriesSexualSlashminors :: Bool -- ^ 
  , createModerationResponseResultsInnerCategoriesViolence :: Bool -- ^ 
  , createModerationResponseResultsInnerCategoriesViolenceSlashgraphic :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInnerCategories where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInnerCategories
instance ToJSON CreateModerationResponseResultsInnerCategories where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInnerCategories

optionsCreateModerationResponseResultsInnerCategories :: Options
optionsCreateModerationResponseResultsInnerCategories =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerCategoriesHate", "hate")
      , ("createModerationResponseResultsInnerCategoriesHateSlashthreatening", "hate/threatening")
      , ("createModerationResponseResultsInnerCategoriesSelfDashharm", "self-harm")
      , ("createModerationResponseResultsInnerCategoriesSexual", "sexual")
      , ("createModerationResponseResultsInnerCategoriesSexualSlashminors", "sexual/minors")
      , ("createModerationResponseResultsInnerCategoriesViolence", "violence")
      , ("createModerationResponseResultsInnerCategoriesViolenceSlashgraphic", "violence/graphic")
      ]


-- | 
data CreateModerationResponseResultsInnerCategoryScores = CreateModerationResponseResultsInnerCategoryScores
  { createModerationResponseResultsInnerCategoryScoresHate :: Double -- ^ 
  , createModerationResponseResultsInnerCategoryScoresHateSlashthreatening :: Double -- ^ 
  , createModerationResponseResultsInnerCategoryScoresSelfDashharm :: Double -- ^ 
  , createModerationResponseResultsInnerCategoryScoresSexual :: Double -- ^ 
  , createModerationResponseResultsInnerCategoryScoresSexualSlashminors :: Double -- ^ 
  , createModerationResponseResultsInnerCategoryScoresViolence :: Double -- ^ 
  , createModerationResponseResultsInnerCategoryScoresViolenceSlashgraphic :: Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInnerCategoryScores where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInnerCategoryScores
instance ToJSON CreateModerationResponseResultsInnerCategoryScores where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInnerCategoryScores

optionsCreateModerationResponseResultsInnerCategoryScores :: Options
optionsCreateModerationResponseResultsInnerCategoryScores =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerCategoryScoresHate", "hate")
      , ("createModerationResponseResultsInnerCategoryScoresHateSlashthreatening", "hate/threatening")
      , ("createModerationResponseResultsInnerCategoryScoresSelfDashharm", "self-harm")
      , ("createModerationResponseResultsInnerCategoryScoresSexual", "sexual")
      , ("createModerationResponseResultsInnerCategoryScoresSexualSlashminors", "sexual/minors")
      , ("createModerationResponseResultsInnerCategoryScoresViolence", "violence")
      , ("createModerationResponseResultsInnerCategoryScoresViolenceSlashgraphic", "violence/graphic")
      ]


-- | ID of the model to use. Only &#x60;whisper-1&#x60; is currently available. 
data CreateTranscriptionRequestModel = CreateTranscriptionRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranscriptionRequestModel where
  parseJSON = genericParseJSON optionsCreateTranscriptionRequestModel
instance ToJSON CreateTranscriptionRequestModel where
  toJSON = genericToJSON optionsCreateTranscriptionRequestModel

optionsCreateTranscriptionRequestModel :: Options
optionsCreateTranscriptionRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateTranscriptionResponse = CreateTranscriptionResponse
  { createTranscriptionResponseText :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranscriptionResponse where
  parseJSON = genericParseJSON optionsCreateTranscriptionResponse
instance ToJSON CreateTranscriptionResponse where
  toJSON = genericToJSON optionsCreateTranscriptionResponse

optionsCreateTranscriptionResponse :: Options
optionsCreateTranscriptionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranscriptionResponseText", "text")
      ]


-- | 
data CreateTranslationResponse = CreateTranslationResponse
  { createTranslationResponseText :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranslationResponse where
  parseJSON = genericParseJSON optionsCreateTranslationResponse
instance ToJSON CreateTranslationResponse where
  toJSON = genericToJSON optionsCreateTranslationResponse

optionsCreateTranslationResponse :: Options
optionsCreateTranslationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranslationResponseText", "text")
      ]


-- | 
data DeleteFileResponse = DeleteFileResponse
  { deleteFileResponseId :: Text -- ^ 
  , deleteFileResponseObject :: Text -- ^ 
  , deleteFileResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteFileResponse where
  parseJSON = genericParseJSON optionsDeleteFileResponse
instance ToJSON DeleteFileResponse where
  toJSON = genericToJSON optionsDeleteFileResponse

optionsDeleteFileResponse :: Options
optionsDeleteFileResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteFileResponseId", "id")
      , ("deleteFileResponseObject", "object")
      , ("deleteFileResponseDeleted", "deleted")
      ]


-- | 
data DeleteModelResponse = DeleteModelResponse
  { deleteModelResponseId :: Text -- ^ 
  , deleteModelResponseObject :: Text -- ^ 
  , deleteModelResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteModelResponse where
  parseJSON = genericParseJSON optionsDeleteModelResponse
instance ToJSON DeleteModelResponse where
  toJSON = genericToJSON optionsDeleteModelResponse

optionsDeleteModelResponse :: Options
optionsDeleteModelResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteModelResponseId", "id")
      , ("deleteModelResponseObject", "object")
      , ("deleteModelResponseDeleted", "deleted")
      ]


-- | 
data Error = Error
  { errorType :: Text -- ^ 
  , errorMessage :: Text -- ^ 
  , errorParam :: Text -- ^ 
  , errorCode :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Error where
  parseJSON = genericParseJSON optionsError
instance ToJSON Error where
  toJSON = genericToJSON optionsError

optionsError :: Options
optionsError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("errorType", "type")
      , ("errorMessage", "message")
      , ("errorParam", "param")
      , ("errorCode", "code")
      ]


-- | 
data ErrorResponse = ErrorResponse
  { errorResponseError :: Error -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ErrorResponse where
  parseJSON = genericParseJSON optionsErrorResponse
instance ToJSON ErrorResponse where
  toJSON = genericToJSON optionsErrorResponse

optionsErrorResponse :: Options
optionsErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("errorResponseError", "error")
      ]


-- | 
data FineTune = FineTune
  { fineTuneId :: Text -- ^ 
  , fineTuneObject :: Text -- ^ 
  , fineTuneCreatedUnderscoreat :: Int -- ^ 
  , fineTuneUpdatedUnderscoreat :: Int -- ^ 
  , fineTuneModel :: Text -- ^ 
  , fineTuneFineUnderscoretunedUnderscoremodel :: Text -- ^ 
  , fineTuneOrganizationUnderscoreid :: Text -- ^ 
  , fineTuneStatus :: Text -- ^ 
  , fineTuneHyperparams :: Object -- ^ 
  , fineTuneTrainingUnderscorefiles :: [OpenAIFile] -- ^ 
  , fineTuneValidationUnderscorefiles :: [OpenAIFile] -- ^ 
  , fineTuneResultUnderscorefiles :: [OpenAIFile] -- ^ 
  , fineTuneEvents :: Maybe [FineTuneEvent] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTune where
  parseJSON = genericParseJSON optionsFineTune
instance ToJSON FineTune where
  toJSON = genericToJSON optionsFineTune

optionsFineTune :: Options
optionsFineTune =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneId", "id")
      , ("fineTuneObject", "object")
      , ("fineTuneCreatedUnderscoreat", "created_at")
      , ("fineTuneUpdatedUnderscoreat", "updated_at")
      , ("fineTuneModel", "model")
      , ("fineTuneFineUnderscoretunedUnderscoremodel", "fine_tuned_model")
      , ("fineTuneOrganizationUnderscoreid", "organization_id")
      , ("fineTuneStatus", "status")
      , ("fineTuneHyperparams", "hyperparams")
      , ("fineTuneTrainingUnderscorefiles", "training_files")
      , ("fineTuneValidationUnderscorefiles", "validation_files")
      , ("fineTuneResultUnderscorefiles", "result_files")
      , ("fineTuneEvents", "events")
      ]


-- | 
data FineTuneEvent = FineTuneEvent
  { fineTuneEventObject :: Text -- ^ 
  , fineTuneEventCreatedUnderscoreat :: Int -- ^ 
  , fineTuneEventLevel :: Text -- ^ 
  , fineTuneEventMessage :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneEvent where
  parseJSON = genericParseJSON optionsFineTuneEvent
instance ToJSON FineTuneEvent where
  toJSON = genericToJSON optionsFineTuneEvent

optionsFineTuneEvent :: Options
optionsFineTuneEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneEventObject", "object")
      , ("fineTuneEventCreatedUnderscoreat", "created_at")
      , ("fineTuneEventLevel", "level")
      , ("fineTuneEventMessage", "message")
      ]


-- | 
data ImagesResponse = ImagesResponse
  { imagesResponseCreated :: Int -- ^ 
  , imagesResponseData :: [ImagesResponseDataInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImagesResponse where
  parseJSON = genericParseJSON optionsImagesResponse
instance ToJSON ImagesResponse where
  toJSON = genericToJSON optionsImagesResponse

optionsImagesResponse :: Options
optionsImagesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imagesResponseCreated", "created")
      , ("imagesResponseData", "data")
      ]


-- | 
data ImagesResponseDataInner = ImagesResponseDataInner
  { imagesResponseDataInnerUrl :: Maybe Text -- ^ 
  , imagesResponseDataInnerB64Underscorejson :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImagesResponseDataInner where
  parseJSON = genericParseJSON optionsImagesResponseDataInner
instance ToJSON ImagesResponseDataInner where
  toJSON = genericToJSON optionsImagesResponseDataInner

optionsImagesResponseDataInner :: Options
optionsImagesResponseDataInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imagesResponseDataInnerUrl", "url")
      , ("imagesResponseDataInnerB64Underscorejson", "b64_json")
      ]


-- | 
data ListFilesResponse = ListFilesResponse
  { listFilesResponseObject :: Text -- ^ 
  , listFilesResponseData :: [OpenAIFile] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListFilesResponse where
  parseJSON = genericParseJSON optionsListFilesResponse
instance ToJSON ListFilesResponse where
  toJSON = genericToJSON optionsListFilesResponse

optionsListFilesResponse :: Options
optionsListFilesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listFilesResponseObject", "object")
      , ("listFilesResponseData", "data")
      ]


-- | 
data ListFineTuneEventsResponse = ListFineTuneEventsResponse
  { listFineTuneEventsResponseObject :: Text -- ^ 
  , listFineTuneEventsResponseData :: [FineTuneEvent] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListFineTuneEventsResponse where
  parseJSON = genericParseJSON optionsListFineTuneEventsResponse
instance ToJSON ListFineTuneEventsResponse where
  toJSON = genericToJSON optionsListFineTuneEventsResponse

optionsListFineTuneEventsResponse :: Options
optionsListFineTuneEventsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listFineTuneEventsResponseObject", "object")
      , ("listFineTuneEventsResponseData", "data")
      ]


-- | 
data ListFineTunesResponse = ListFineTunesResponse
  { listFineTunesResponseObject :: Text -- ^ 
  , listFineTunesResponseData :: [FineTune] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListFineTunesResponse where
  parseJSON = genericParseJSON optionsListFineTunesResponse
instance ToJSON ListFineTunesResponse where
  toJSON = genericToJSON optionsListFineTunesResponse

optionsListFineTunesResponse :: Options
optionsListFineTunesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listFineTunesResponseObject", "object")
      , ("listFineTunesResponseData", "data")
      ]


-- | 
data ListModelsResponse = ListModelsResponse
  { listModelsResponseObject :: Text -- ^ 
  , listModelsResponseData :: [Model] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListModelsResponse where
  parseJSON = genericParseJSON optionsListModelsResponse
instance ToJSON ListModelsResponse where
  toJSON = genericToJSON optionsListModelsResponse

optionsListModelsResponse :: Options
optionsListModelsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listModelsResponseObject", "object")
      , ("listModelsResponseData", "data")
      ]


-- | 
data Model = Model
  { modelId :: Text -- ^ 
  , modelObject :: Text -- ^ 
  , modelCreated :: Int -- ^ 
  , modelOwnedUnderscoreby :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Model where
  parseJSON = genericParseJSON optionsModel
instance ToJSON Model where
  toJSON = genericToJSON optionsModel

optionsModel :: Options
optionsModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modelId", "id")
      , ("modelObject", "object")
      , ("modelCreated", "created")
      , ("modelOwnedUnderscoreby", "owned_by")
      ]


-- | 
data OpenAIFile = OpenAIFile
  { openAIFileId :: Text -- ^ 
  , openAIFileObject :: Text -- ^ 
  , openAIFileBytes :: Int -- ^ 
  , openAIFileCreatedUnderscoreat :: Int -- ^ 
  , openAIFileFilename :: Text -- ^ 
  , openAIFilePurpose :: Text -- ^ 
  , openAIFileStatus :: Maybe Text -- ^ 
  , openAIFileStatusUnderscoredetails :: Maybe Object -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OpenAIFile where
  parseJSON = genericParseJSON optionsOpenAIFile
instance ToJSON OpenAIFile where
  toJSON = genericToJSON optionsOpenAIFile

optionsOpenAIFile :: Options
optionsOpenAIFile =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("openAIFileId", "id")
      , ("openAIFileObject", "object")
      , ("openAIFileBytes", "bytes")
      , ("openAIFileCreatedUnderscoreat", "created_at")
      , ("openAIFileFilename", "filename")
      , ("openAIFilePurpose", "purpose")
      , ("openAIFileStatus", "status")
      , ("openAIFileStatusUnderscoredetails", "status_details")
      ]

