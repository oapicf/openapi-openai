
/*
 * ChatCompletionMessageToolCall.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionMessageToolCall_H_
#define TINY_CPP_CLIENT_ChatCompletionMessageToolCall_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionMessageToolCall_function.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionMessageToolCall{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionMessageToolCall();
    ChatCompletionMessageToolCall(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionMessageToolCall();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the tool call.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of the tool. Currently, only `function` is supported.
	 */
	std::string getType();

	/*! \brief Set The type of the tool. Currently, only `function` is supported.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ChatCompletionMessageToolCall_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(ChatCompletionMessageToolCall_function  function);


    private:
    std::string id{};
    std::string type{};
    ChatCompletionMessageToolCall_function function;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionMessageToolCall_H_ */
