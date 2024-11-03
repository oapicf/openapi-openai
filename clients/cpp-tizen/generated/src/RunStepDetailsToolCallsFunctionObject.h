/*
 * RunStepDetailsToolCallsFunctionObject.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsFunctionObject_H_
#define _RunStepDetailsToolCallsFunctionObject_H_


#include <string>
#include "RunStepDetailsToolCallsFunctionObject_function.h"
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

class RunStepDetailsToolCallsFunctionObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsFunctionObject();
	RunStepDetailsToolCallsFunctionObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsFunctionObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the tool call object.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call object.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call. This is always going to be `function` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `function` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFunctionObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunStepDetailsToolCallsFunctionObject_function  function);

private:
	std::string id;
	std::string type;
	RunStepDetailsToolCallsFunctionObject_function function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsFunctionObject_H_ */
