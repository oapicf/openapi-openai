/*
 * FunctionObject.h
 *
 * 
 */

#ifndef _FunctionObject_H_
#define _FunctionObject_H_


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

class FunctionObject : public Object {
public:
	/*! \brief Constructor.
	 */
	FunctionObject();
	FunctionObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FunctionObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A description of what the function does, used by the model to choose when and how to call the function.
	 */
	std::string getDescription();

	/*! \brief Set A description of what the function does, used by the model to choose when and how to call the function.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	 */
	std::string getName();

	/*! \brief Set The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
	 */
	void setName(std::string  name);
	/*! \brief Get The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
	 */
	std::map<std::string, std::string> getParameters();

	/*! \brief Set The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
	 */
	void setParameters(std::map <std::string, std::string> parameters);
	/*! \brief Get Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
	 */
	bool getStrict();

	/*! \brief Set Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
	 */
	void setStrict(bool  strict);

private:
	std::string description;
	std::string name;
	std::map <std::string, std::string>parameters;
	bool strict;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FunctionObject_H_ */
