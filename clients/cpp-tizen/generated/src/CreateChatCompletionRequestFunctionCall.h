/*
 * CreateChatCompletionRequest_function_call.h
 *
 * Controls how the model responds to function calls. \&quot;none\&quot; means the model does not call a function, and responds to the end-user. \&quot;auto\&quot; means the model can pick between an end-user or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;:\\ \&quot;my_function\&quot;}&#x60; forces the model to call that function. \&quot;none\&quot; is the default when no functions are present. \&quot;auto\&quot; is the default if functions are present.
 */

#ifndef _CreateChatCompletionRequest_function_call_H_
#define _CreateChatCompletionRequest_function_call_H_


#include <string>
#include "CreateChatCompletionRequest_function_call_oneOf.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Controls how the model responds to function calls. \"none\" means the model does not call a function, and responds to the end-user. \"auto\" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{\"name\":\\ \"my_function\"}` forces the model to call that function. \"none\" is the default when no functions are present. \"auto\" is the default if functions are present.
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_function_call : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionRequest_function_call();
	CreateChatCompletionRequest_function_call(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionRequest_function_call();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the function to call.
	 */
	std::string getName();

	/*! \brief Set The name of the function to call.
	 */
	void setName(std::string  name);

private:
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionRequest_function_call_H_ */
