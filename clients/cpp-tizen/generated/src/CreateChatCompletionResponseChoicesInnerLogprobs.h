/*
 * CreateChatCompletionResponse_choices_inner_logprobs.h
 *
 * Log probability information for the choice.
 */

#ifndef _CreateChatCompletionResponse_choices_inner_logprobs_H_
#define _CreateChatCompletionResponse_choices_inner_logprobs_H_


#include <string>
#include "ChatCompletionTokenLogprob.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Log probability information for the choice.
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionResponse_choices_inner_logprobs : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionResponse_choices_inner_logprobs();
	CreateChatCompletionResponse_choices_inner_logprobs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionResponse_choices_inner_logprobs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of message content tokens with log probability information.
	 */
	std::list<ChatCompletionTokenLogprob> getContent();

	/*! \brief Set A list of message content tokens with log probability information.
	 */
	void setContent(std::list <ChatCompletionTokenLogprob> content);
	/*! \brief Get A list of message refusal tokens with log probability information.
	 */
	std::list<ChatCompletionTokenLogprob> getRefusal();

	/*! \brief Set A list of message refusal tokens with log probability information.
	 */
	void setRefusal(std::list <ChatCompletionTokenLogprob> refusal);

private:
	std::list <ChatCompletionTokenLogprob>content;
	std::list <ChatCompletionTokenLogprob>refusal;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionResponse_choices_inner_logprobs_H_ */
