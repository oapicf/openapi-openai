/*
 * AssistantToolsFunction.h
 *
 * 
 */

#ifndef _AssistantToolsFunction_H_
#define _AssistantToolsFunction_H_


#include <string>
#include "FunctionObject.h"
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

class AssistantToolsFunction : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantToolsFunction();
	AssistantToolsFunction(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantToolsFunction();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of tool being defined: `function`
	 */
	std::string getType();

	/*! \brief Set The type of tool being defined: `function`
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	FunctionObject getFunction();

	/*! \brief Set 
	 */
	void setFunction(FunctionObject  function);

private:
	std::string type;
	FunctionObject function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantToolsFunction_H_ */
