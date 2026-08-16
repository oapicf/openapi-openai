
/*
 * AssistantObject_tools_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantObject_tools_inner_H_
#define TINY_CPP_CLIENT_AssistantObject_tools_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantToolsCode.h"
#include "AssistantToolsFileSearch.h"
#include "AssistantToolsFileSearch_file_search.h"
#include "AssistantToolsFunction.h"
#include "FunctionObject.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantObject_tools_inner{
public:

    /*! \brief Constructor.
	 */
    AssistantObject_tools_inner();
    AssistantObject_tools_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantObject_tools_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    AssistantToolsFileSearch_file_search file_search;
    FunctionObject function;
};
}

#endif /* TINY_CPP_CLIENT_AssistantObject_tools_inner_H_ */
