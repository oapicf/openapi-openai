/*
 * ChatCompletionRequestFunctionMessage.h
 *
 * 
 */

#ifndef _ChatCompletionRequestFunctionMessage_H_
#define _ChatCompletionRequestFunctionMessage_H_


#include <string>
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

class ChatCompletionRequestFunctionMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestFunctionMessage();
	ChatCompletionRequestFunctionMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestFunctionMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The role of the messages author, in this case `function`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `function`.
	 */
	void setRole(std::string  role);
	/*! \brief Get The contents of the function message.
	 */
	std::string getContent();

	/*! \brief Set The contents of the function message.
	 */
	void setContent(std::string  content);
	/*! \brief Get The name of the function to call.
	 */
	std::string getName();

	/*! \brief Set The name of the function to call.
	 */
	void setName(std::string  name);

private:
	std::string role;
	std::string content;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestFunctionMessage_H_ */
