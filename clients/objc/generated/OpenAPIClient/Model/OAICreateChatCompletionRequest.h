#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIChatCompletionFunctions.h"
#import "OAIChatCompletionRequestMessage.h"
#import "OAICreateChatCompletionRequestFunctionCall.h"
#import "OAICreateChatCompletionRequestModel.h"
#import "OAICreateChatCompletionRequestStop.h"
@protocol OAIChatCompletionFunctions;
@class OAIChatCompletionFunctions;
@protocol OAIChatCompletionRequestMessage;
@class OAIChatCompletionRequestMessage;
@protocol OAICreateChatCompletionRequestFunctionCall;
@class OAICreateChatCompletionRequestFunctionCall;
@protocol OAICreateChatCompletionRequestModel;
@class OAICreateChatCompletionRequestModel;
@protocol OAICreateChatCompletionRequestStop;
@class OAICreateChatCompletionRequestStop;



@protocol OAICreateChatCompletionRequest
@end

@interface OAICreateChatCompletionRequest : OAIObject


@property(nonatomic) OAICreateChatCompletionRequestModel* model;
/* A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb). 
 */
@property(nonatomic) NSArray<OAIChatCompletionRequestMessage>* messages;
/* A list of functions the model may generate JSON inputs for. [optional]
 */
@property(nonatomic) NSArray<OAIChatCompletionFunctions>* functions;

@property(nonatomic) OAICreateChatCompletionRequestFunctionCall* functionCall;
/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  [optional]
 */
@property(nonatomic) NSNumber* temperature;
/* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  [optional]
 */
@property(nonatomic) NSNumber* topP;
/* How many chat completion choices to generate for each input message. [optional]
 */
@property(nonatomic) NSNumber* n;
/* If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb).  [optional]
 */
@property(nonatomic) NSNumber* stream;

@property(nonatomic) OAICreateChatCompletionRequestStop* stop;
/* The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.  [optional]
 */
@property(nonatomic) NSNumber* maxTokens;
/* Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  [optional]
 */
@property(nonatomic) NSNumber* presencePenalty;
/* Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  [optional]
 */
@property(nonatomic) NSNumber* frequencyPenalty;
/* Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  [optional]
 */
@property(nonatomic) NSObject* logitBias;
/* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  [optional]
 */
@property(nonatomic) NSString* user;

@end
