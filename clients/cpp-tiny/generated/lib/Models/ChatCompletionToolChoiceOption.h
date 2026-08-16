
/*
 * ChatCompletionToolChoiceOption.h
 *
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tool and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools. Specifying a particular tool via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  &#x60;none&#x60; is the default when no tools are present. &#x60;auto&#x60; is the default if tools are present. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionToolChoiceOption_H_
#define TINY_CPP_CLIENT_ChatCompletionToolChoiceOption_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantsNamedToolChoice_function.h"
#include "ChatCompletionNamedToolChoice.h"

namespace Tiny {


/*! \brief Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionToolChoiceOption{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionToolChoiceOption();
    ChatCompletionToolChoiceOption(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionToolChoiceOption();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the tool. Currently, only `function` is supported.
	 */
	std::string getType();

	/*! \brief Set The type of the tool. Currently, only `function` is supported.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	AssistantsNamedToolChoice_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(AssistantsNamedToolChoice_function  function);


    private:
    std::string type{};
    AssistantsNamedToolChoice_function function;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionToolChoiceOption_H_ */
