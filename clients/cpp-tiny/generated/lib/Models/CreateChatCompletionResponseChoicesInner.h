
/*
 * CreateChatCompletionResponse_choices_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionResponse_choices_inner_H_
#define TINY_CPP_CLIENT_CreateChatCompletionResponse_choices_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionResponseMessage.h"
#include "CreateChatCompletionResponse_choices_inner_logprobs.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionResponse_choices_inner{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionResponse_choices_inner();
    CreateChatCompletionResponse_choices_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionResponse_choices_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get 
	 */
	ChatCompletionResponseMessage getMessage();

	/*! \brief Set 
	 */
	void setMessage(ChatCompletionResponseMessage  message);
	/*! \brief Get 
	 */
	CreateChatCompletionResponse_choices_inner_logprobs getLogprobs();

	/*! \brief Set 
	 */
	void setLogprobs(CreateChatCompletionResponse_choices_inner_logprobs  logprobs);


    private:
    std::string finish_reason{};
    int index{};
    ChatCompletionResponseMessage message;
    CreateChatCompletionResponse_choices_inner_logprobs logprobs;
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionResponse_choices_inner_H_ */
