/*
 * AssistantsApiToolChoiceOption.h
 *
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
 */

#ifndef _AssistantsApiToolChoiceOption_H_
#define _AssistantsApiToolChoiceOption_H_


#include <string>
#include "AssistantsApiNamedToolChoice.h"
#include "ChatCompletionNamedToolChoice_function.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 *
 *  \ingroup Models
 *
 */

class AssistantsApiToolChoiceOption : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantsApiToolChoiceOption();
	AssistantsApiToolChoiceOption(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantsApiToolChoiceOption();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the tool. If type is `function`, the function name must be set
	 */
	std::string getType();

	/*! \brief Set The type of the tool. If type is `function`, the function name must be set
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

#endif /* _AssistantsApiToolChoiceOption_H_ */
