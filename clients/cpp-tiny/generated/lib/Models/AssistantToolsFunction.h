
/*
 * AssistantToolsFunction.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantToolsFunction_H_
#define TINY_CPP_CLIENT_AssistantToolsFunction_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FunctionObject.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantToolsFunction{
public:

    /*! \brief Constructor.
	 */
    AssistantToolsFunction();
    AssistantToolsFunction(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantToolsFunction();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    FunctionObject function;
};
}

#endif /* TINY_CPP_CLIENT_AssistantToolsFunction_H_ */
