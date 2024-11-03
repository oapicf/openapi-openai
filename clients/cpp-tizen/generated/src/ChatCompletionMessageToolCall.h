/*
 * ChatCompletionMessageToolCall.h
 *
 * 
 */

#ifndef _ChatCompletionMessageToolCall_H_
#define _ChatCompletionMessageToolCall_H_


#include <string>
#include "ChatCompletionMessageToolCall_function.h"
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

class ChatCompletionMessageToolCall : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionMessageToolCall();
	ChatCompletionMessageToolCall(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionMessageToolCall();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string id;
	std::string type;
	ChatCompletionMessageToolCall_function function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionMessageToolCall_H_ */
