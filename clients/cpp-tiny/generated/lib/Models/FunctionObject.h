
/*
 * FunctionObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_FunctionObject_H_
#define TINY_CPP_CLIENT_FunctionObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FunctionObject{
public:

    /*! \brief Constructor.
	 */
    FunctionObject();
    FunctionObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FunctionObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Map<std::string, std::string> getParameters();

	/*! \brief Set The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
	 */
	void setParameters(Map <std::string, std::string> parameters);
	/*! \brief Get Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
	 */
	bool isStrict();

	/*! \brief Set Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
	 */
	void setStrict(bool  strict);


    private:
    std::string description{};
    std::string name{};
    Map<std::string, std::string> parameters;
    bool strict{};
};
}

#endif /* TINY_CPP_CLIENT_FunctionObject_H_ */
