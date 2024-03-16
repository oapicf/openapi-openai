/*
 * CreateChatCompletionRequest_function_call_oneOf.h
 *
 * 
 */

#ifndef _CreateChatCompletionRequest_function_call_oneOf_H_
#define _CreateChatCompletionRequest_function_call_oneOf_H_


#include <string>
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

class CreateChatCompletionRequest_function_call_oneOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionRequest_function_call_oneOf();
	CreateChatCompletionRequest_function_call_oneOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionRequest_function_call_oneOf();

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

#endif /* _CreateChatCompletionRequest_function_call_oneOf_H_ */
