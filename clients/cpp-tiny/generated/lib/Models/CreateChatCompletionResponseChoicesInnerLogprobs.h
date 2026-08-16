
/*
 * CreateChatCompletionResponse_choices_inner_logprobs.h
 *
 * Log probability information for the choice.
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionResponse_choices_inner_logprobs_H_
#define TINY_CPP_CLIENT_CreateChatCompletionResponse_choices_inner_logprobs_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionTokenLogprob.h"
#include <list>

namespace Tiny {


/*! \brief Log probability information for the choice.
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionResponse_choices_inner_logprobs{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionResponse_choices_inner_logprobs();
    CreateChatCompletionResponse_choices_inner_logprobs(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionResponse_choices_inner_logprobs();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<ChatCompletionTokenLogprob> content;
    std::list<ChatCompletionTokenLogprob> refusal;
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionResponse_choices_inner_logprobs_H_ */
