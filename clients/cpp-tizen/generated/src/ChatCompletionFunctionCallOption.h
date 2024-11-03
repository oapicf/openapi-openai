/*
 * ChatCompletionFunctionCallOption.h
 *
 * Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
 */

#ifndef _ChatCompletionFunctionCallOption_H_
#define _ChatCompletionFunctionCallOption_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionFunctionCallOption : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionFunctionCallOption();
	ChatCompletionFunctionCallOption(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionFunctionCallOption();

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

#endif /* _ChatCompletionFunctionCallOption_H_ */
