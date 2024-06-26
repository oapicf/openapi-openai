/*
 * ChatCompletionMessageToolCallChunk_function.h
 *
 * 
 */

#ifndef _ChatCompletionMessageToolCallChunk_function_H_
#define _ChatCompletionMessageToolCallChunk_function_H_


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

class ChatCompletionMessageToolCallChunk_function : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionMessageToolCallChunk_function();
	ChatCompletionMessageToolCallChunk_function(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionMessageToolCallChunk_function();

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
	/*! \brief Get The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
	 */
	std::string getArguments();

	/*! \brief Set The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
	 */
	void setArguments(std::string  arguments);

private:
	std::string name;
	std::string arguments;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionMessageToolCallChunk_function_H_ */
