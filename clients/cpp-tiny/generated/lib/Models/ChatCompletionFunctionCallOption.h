
/*
 * ChatCompletionFunctionCallOption.h
 *
 * Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionFunctionCallOption_H_
#define TINY_CPP_CLIENT_ChatCompletionFunctionCallOption_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionFunctionCallOption{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionFunctionCallOption();
    ChatCompletionFunctionCallOption(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionFunctionCallOption();


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

#endif /* TINY_CPP_CLIENT_ChatCompletionFunctionCallOption_H_ */
