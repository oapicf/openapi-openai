/*
 * ChatCompletionRequestMessage.h
 *
 * 
 */

#ifndef _ChatCompletionRequestMessage_H_
#define _ChatCompletionRequestMessage_H_


#include <string>
#include "ChatCompletionRequestMessage_function_call.h"
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

class ChatCompletionRequestMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessage();
	ChatCompletionRequestMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
	 */
	void setRole(std::string  role);
	/*! \brief Get The contents of the message. `content` is required for all messages except assistant messages with function calls.
	 */
	std::string getContent();

	/*! \brief Set The contents of the message. `content` is required for all messages except assistant messages with function calls.
	 */
	void setContent(std::string  content);
	/*! \brief Get The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
	 */
	std::string getName();

	/*! \brief Set The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessage_function_call getFunctionCall();

	/*! \brief Set 
	 */
	void setFunctionCall(ChatCompletionRequestMessage_function_call  function_call);

private:
	std::string role;
	std::string content;
	std::string name;
	ChatCompletionRequestMessage_function_call function_call;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessage_H_ */
