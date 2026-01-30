/*
 * AssistantObject_tools_inner.h
 *
 * 
 */

#ifndef _AssistantObject_tools_inner_H_
#define _AssistantObject_tools_inner_H_


#include <string>
#include "AssistantToolsCode.h"
#include "AssistantToolsFileSearch.h"
#include "AssistantToolsFileSearch_file_search.h"
#include "AssistantToolsFunction.h"
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

class AssistantObject_tools_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantObject_tools_inner();
	AssistantObject_tools_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantObject_tools_inner();

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
	AssistantToolsFileSearch_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(AssistantToolsFileSearch_file_search  file_search);
	/*! \brief Get 
	 */
	FunctionObject getFunction();

	/*! \brief Set 
	 */
	void setFunction(FunctionObject  function);

private:
	std::string type;
	AssistantToolsFileSearch_file_search file_search;
	FunctionObject function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantObject_tools_inner_H_ */
