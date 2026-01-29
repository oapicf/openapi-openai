/*
 * ChatCompletionNamedToolChoice_function.h
 *
 * 
 */

#ifndef _ChatCompletionNamedToolChoice_function_H_
#define _ChatCompletionNamedToolChoice_function_H_


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

class ChatCompletionNamedToolChoice_function : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionNamedToolChoice_function();
	ChatCompletionNamedToolChoice_function(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionNamedToolChoice_function();

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

#endif /* _ChatCompletionNamedToolChoice_function_H_ */
