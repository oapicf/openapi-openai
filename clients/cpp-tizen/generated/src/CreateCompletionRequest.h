/*
 * CreateCompletionRequest.h
 *
 * 
 */

#ifndef _CreateCompletionRequest_H_
#define _CreateCompletionRequest_H_


#include <string>
#include "CreateCompletionRequest_model.h"
#include "CreateCompletionRequest_prompt.h"
#include "CreateCompletionRequest_stop.h"
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

class CreateCompletionRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateCompletionRequest();
	CreateCompletionRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateCompletionRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateCompletionRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateCompletionRequest_model  model);
	/*! \brief Get 
	 */
	CreateCompletionRequest_prompt getPrompt();

	/*! \brief Set 
	 */
	void setPrompt(CreateCompletionRequest_prompt  prompt);
	/*! \brief Get The suffix that comes after a completion of inserted text.
	 */
	std::string getSuffix();

	/*! \brief Set The suffix that comes after a completion of inserted text.
	 */
	void setSuffix(std::string  suffix);
	/*! \brief Get The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
	 */
	int getMaxTokens();

	/*! \brief Set The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
	 */
	void setMaxTokens(int  max_tokens);
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
	/*! \brief Get How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
	 */
	int getN();

	/*! \brief Set How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
	 */
	void setN(int  n);
	/*! \brief Get Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
	 */
	bool getStream();

	/*! \brief Set Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
	 */
	void setStream(bool  stream);
	/*! \brief Get Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
	 */
	int getLogprobs();

	/*! \brief Set Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
	 */
	void setLogprobs(int  logprobs);
	/*! \brief Get Echo back the prompt in addition to the completion 
	 */
	bool getEcho();

	/*! \brief Set Echo back the prompt in addition to the completion 
	 */
	void setEcho(bool  echo);
	/*! \brief Get 
	 */
	CreateCompletionRequest_stop getStop();

	/*! \brief Set 
	 */
	void setStop(CreateCompletionRequest_stop  stop);
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
	/*! \brief Get Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
	 */
	int getBestOf();

	/*! \brief Set Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
	 */
	void setBestOf(int  best_of);
	/*! \brief Get Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
	 */
	std::string getLogitBias();

	/*! \brief Set Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
	 */
	void setLogitBias(std::string  logit_bias);
	/*! \brief Get A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	std::string getUser();

	/*! \brief Set A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	void setUser(std::string  user);

private:
	CreateCompletionRequest_model model;
	CreateCompletionRequest_prompt prompt;
	std::string suffix;
	int max_tokens;
	long long temperature;
	long long top_p;
	int n;
	bool stream;
	int logprobs;
	bool echo;
	CreateCompletionRequest_stop stop;
	long long presence_penalty;
	long long frequency_penalty;
	int best_of;
	std::string logit_bias;
	std::string user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateCompletionRequest_H_ */
