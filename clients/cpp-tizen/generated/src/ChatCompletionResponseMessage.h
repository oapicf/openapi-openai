/*
 * ChatCompletionResponseMessage.h
 *
 * 
 */

#ifndef _ChatCompletionResponseMessage_H_
#define _ChatCompletionResponseMessage_H_


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

class ChatCompletionResponseMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionResponseMessage();
	ChatCompletionResponseMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionResponseMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The role of the author of this message.
	 */
	std::string getRole();

	/*! \brief Set The role of the author of this message.
	 */
	void setRole(std::string  role);
	/*! \brief Get The contents of the message.
	 */
	std::string getContent();

	/*! \brief Set The contents of the message.
	 */
	void setContent(std::string  content);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessage_function_call getFunctionCall();

	/*! \brief Set 
	 */
	void setFunctionCall(ChatCompletionRequestMessage_function_call  function_call);

private:
	std::string role;
	std::string content;
	ChatCompletionRequestMessage_function_call function_call;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionResponseMessage_H_ */
