/*
 * ChatCompletionFunctions.h
 *
 * 
 */

#ifndef _ChatCompletionFunctions_H_
#define _ChatCompletionFunctions_H_


#include <string>
#include "AnyType.h"
#include <map>
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

class ChatCompletionFunctions : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionFunctions();
	ChatCompletionFunctions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionFunctions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	 */
	std::string getName();

	/*! \brief Set The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	 */
	void setName(std::string  name);
	/*! \brief Get The description of what the function does.
	 */
	std::string getDescription();

	/*! \brief Set The description of what the function does.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
	 */
	std::map<std::string, std::string> getParameters();

	/*! \brief Set The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
	 */
	void setParameters(std::map <std::string, std::string> parameters);

private:
	std::string name;
	std::string description;
	std::map <std::string, std::string>parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionFunctions_H_ */
