/*
 * ChatCompletionNamedToolChoice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */

#ifndef _ChatCompletionNamedToolChoice_H_
#define _ChatCompletionNamedToolChoice_H_


#include <string>
#include "ChatCompletionNamedToolChoice_function.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specifies a tool the model should use. Use to force the model to call a specific function.
 *
 *  \ingroup Models
 *
 */

class ChatCompletionNamedToolChoice : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionNamedToolChoice();
	ChatCompletionNamedToolChoice(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionNamedToolChoice();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the tool. Currently, only `function` is supported.
	 */
	std::string getType();

	/*! \brief Set The type of the tool. Currently, only `function` is supported.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ChatCompletionNamedToolChoice_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(ChatCompletionNamedToolChoice_function  function);

private:
	std::string type;
	ChatCompletionNamedToolChoice_function function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionNamedToolChoice_H_ */
