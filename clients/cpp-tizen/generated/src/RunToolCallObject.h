/*
 * RunToolCallObject.h
 *
 * Tool call objects
 */

#ifndef _RunToolCallObject_H_
#define _RunToolCallObject_H_


#include <string>
#include "RunToolCallObject_function.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Tool call objects
 *
 *  \ingroup Models
 *
 */

class RunToolCallObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunToolCallObject();
	RunToolCallObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunToolCallObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call the output is required for. For now, this is always `function`.
	 */
	std::string getType();

	/*! \brief Set The type of tool call the output is required for. For now, this is always `function`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunToolCallObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunToolCallObject_function  function);

private:
	std::string id;
	std::string type;
	RunToolCallObject_function function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunToolCallObject_H_ */
