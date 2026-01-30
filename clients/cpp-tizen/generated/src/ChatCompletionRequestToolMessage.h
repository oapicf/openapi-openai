/*
 * ChatCompletionRequestToolMessage.h
 *
 * 
 */

#ifndef _ChatCompletionRequestToolMessage_H_
#define _ChatCompletionRequestToolMessage_H_


#include <string>
#include "ChatCompletionRequestToolMessage_content.h"
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

class ChatCompletionRequestToolMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestToolMessage();
	ChatCompletionRequestToolMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestToolMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The role of the messages author, in this case `tool`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `tool`.
	 */
	void setRole(std::string  role);
	/*! \brief Get 
	 */
	ChatCompletionRequestToolMessage_content getContent();

	/*! \brief Set 
	 */
	void setContent(ChatCompletionRequestToolMessage_content  content);
	/*! \brief Get Tool call that this message is responding to.
	 */
	std::string getToolCallId();

	/*! \brief Set Tool call that this message is responding to.
	 */
	void setToolCallId(std::string  tool_call_id);

private:
	std::string role;
	ChatCompletionRequestToolMessage_content content;
	std::string tool_call_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestToolMessage_H_ */
