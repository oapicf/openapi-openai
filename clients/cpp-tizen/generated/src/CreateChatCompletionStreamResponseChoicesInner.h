/*
 * CreateChatCompletionStreamResponse_choices_inner.h
 *
 * 
 */

#ifndef _CreateChatCompletionStreamResponse_choices_inner_H_
#define _CreateChatCompletionStreamResponse_choices_inner_H_


#include <string>
#include "ChatCompletionStreamResponseDelta.h"
#include "CreateChatCompletionResponse_choices_inner_logprobs.h"
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

class CreateChatCompletionStreamResponse_choices_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionStreamResponse_choices_inner();
	CreateChatCompletionStreamResponse_choices_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionStreamResponse_choices_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ChatCompletionStreamResponseDelta getDelta();

	/*! \brief Set 
	 */
	void setDelta(ChatCompletionStreamResponseDelta  delta);
	/*! \brief Get 
	 */
	CreateChatCompletionResponse_choices_inner_logprobs getLogprobs();

	/*! \brief Set 
	 */
	void setLogprobs(CreateChatCompletionResponse_choices_inner_logprobs  logprobs);
	/*! \brief Get The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
	 */
	std::string getFinishReason();

	/*! \brief Set The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
	 */
	void setFinishReason(std::string  finish_reason);
	/*! \brief Get The index of the choice in the list of choices.
	 */
	int getIndex();

	/*! \brief Set The index of the choice in the list of choices.
	 */
	void setIndex(int  index);

private:
	ChatCompletionStreamResponseDelta delta;
	CreateChatCompletionResponse_choices_inner_logprobs logprobs;
	std::string finish_reason;
	int index;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionStreamResponse_choices_inner_H_ */
