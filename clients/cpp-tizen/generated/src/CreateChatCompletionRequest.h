/*
 * CreateChatCompletionRequest.h
 *
 * 
 */

#ifndef _CreateChatCompletionRequest_H_
#define _CreateChatCompletionRequest_H_


#include <string>
#include "ChatCompletionFunctions.h"
#include "ChatCompletionRequestMessage.h"
#include "CreateChatCompletionRequest_function_call.h"
#include "CreateChatCompletionRequest_model.h"
#include "CreateChatCompletionRequest_stop.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionRequest();
	CreateChatCompletionRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateChatCompletionRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateChatCompletionRequest_model  model);
	/*! \brief Get A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
	 */
	std::list<ChatCompletionRequestMessage> getMessages();

	/*! \brief Set A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
	 */
	void setMessages(std::list <ChatCompletionRequestMessage> messages);
	/*! \brief Get A list of functions the model may generate JSON inputs for.
	 */
	std::list<ChatCompletionFunctions> getFunctions();

	/*! \brief Set A list of functions the model may generate JSON inputs for.
	 */
	void setFunctions(std::list <ChatCompletionFunctions> functions);
	/*! \brief Get 
	 */
	CreateChatCompletionRequest_function_call getFunctionCall();

	/*! \brief Set 
	 */
	void setFunctionCall(CreateChatCompletionRequest_function_call  function_call);
	/*! \brief Get What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
	 */
	long long getTemperature();

	/*! \brief Set What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
	 */
	void setTemperature(long long  temperature);
	/*! \brief Get An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
	 */
	long long getTopP();

	/*! \brief Set An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
	 */
	void setTopP(long long  top_p);
	/*! \brief Get How many chat completion choices to generate for each input message.
	 */
	int getN();

	/*! \brief Set How many chat completion choices to generate for each input message.
	 */
	void setN(int  n);
	/*! \brief Get If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
	 */
	bool getStream();

	/*! \brief Set If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
	 */
	void setStream(bool  stream);
	/*! \brief Get 
	 */
	CreateChatCompletionRequest_stop getStop();

	/*! \brief Set 
	 */
	void setStop(CreateChatCompletionRequest_stop  stop);
	/*! \brief Get The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
	 */
	int getMaxTokens();

	/*! \brief Set The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
	 */
	void setMaxTokens(int  max_tokens);
	/*! \brief Get Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
	 */
	long long getPresencePenalty();

	/*! \brief Set Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
	 */
	void setPresencePenalty(long long  presence_penalty);
	/*! \brief Get Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
	 */
	long long getFrequencyPenalty();

	/*! \brief Set Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
	 */
	void setFrequencyPenalty(long long  frequency_penalty);
	/*! \brief Get Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
	 */
	std::string getLogitBias();

	/*! \brief Set Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
	 */
	void setLogitBias(std::string  logit_bias);
	/*! \brief Get A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	std::string getUser();

	/*! \brief Set A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	void setUser(std::string  user);

private:
	CreateChatCompletionRequest_model model;
	std::list <ChatCompletionRequestMessage>messages;
	std::list <ChatCompletionFunctions>functions;
	CreateChatCompletionRequest_function_call function_call;
	long long temperature;
	long long top_p;
	int n;
	bool stream;
	CreateChatCompletionRequest_stop stop;
	int max_tokens;
	long long presence_penalty;
	long long frequency_penalty;
	std::string logit_bias;
	std::string user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionRequest_H_ */
