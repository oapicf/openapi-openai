
/*
 * CreateChatCompletionRequest_function_call.h
 *
 * Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model.  &#x60;none&#x60; means the model will not call a function and instead generates a message.  &#x60;auto&#x60; means the model can pick between generating a message or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionRequest_function_call_H_
#define TINY_CPP_CLIENT_CreateChatCompletionRequest_function_call_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionFunctionCallOption.h"

namespace Tiny {


/*! \brief Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_function_call{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionRequest_function_call();
    CreateChatCompletionRequest_function_call(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionRequest_function_call();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the function to call.
	 */
	std::string getName();

	/*! \brief Set The name of the function to call.
	 */
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionRequest_function_call_H_ */
