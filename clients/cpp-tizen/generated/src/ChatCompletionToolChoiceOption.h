/*
 * ChatCompletionToolChoiceOption.h
 *
 * Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 */

#ifndef _ChatCompletionToolChoiceOption_H_
#define _ChatCompletionToolChoiceOption_H_


#include <string>
#include "ChatCompletionNamedToolChoice.h"
#include "ChatCompletionNamedToolChoice_function.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionToolChoiceOption : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionToolChoiceOption();
	ChatCompletionToolChoiceOption(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionToolChoiceOption();

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

#endif /* _ChatCompletionToolChoiceOption_H_ */
