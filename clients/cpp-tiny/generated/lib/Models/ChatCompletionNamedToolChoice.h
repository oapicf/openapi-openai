
/*
 * ChatCompletionNamedToolChoice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionNamedToolChoice_H_
#define TINY_CPP_CLIENT_ChatCompletionNamedToolChoice_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantsNamedToolChoice_function.h"

namespace Tiny {


/*! \brief Specifies a tool the model should use. Use to force the model to call a specific function.
 *
 *  \ingroup Models
 *
 */

class ChatCompletionNamedToolChoice{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionNamedToolChoice();
    ChatCompletionNamedToolChoice(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionNamedToolChoice();


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

#endif /* TINY_CPP_CLIENT_ChatCompletionNamedToolChoice_H_ */
