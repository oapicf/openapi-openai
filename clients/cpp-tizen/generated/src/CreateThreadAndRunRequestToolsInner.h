/*
 * CreateThreadAndRunRequest_tools_inner.h
 *
 * 
 */

#ifndef _CreateThreadAndRunRequest_tools_inner_H_
#define _CreateThreadAndRunRequest_tools_inner_H_


#include <string>
#include "AssistantToolsCode.h"
#include "AssistantToolsFunction.h"
#include "AssistantToolsRetrieval.h"
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

class CreateThreadAndRunRequest_tools_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateThreadAndRunRequest_tools_inner();
	CreateThreadAndRunRequest_tools_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateThreadAndRunRequest_tools_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of tool being defined: `code_interpreter`
	 */
	std::string getType();

	/*! \brief Set The type of tool being defined: `code_interpreter`
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

#endif /* _CreateThreadAndRunRequest_tools_inner_H_ */
