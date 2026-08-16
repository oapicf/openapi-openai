
/*
 * AssistantToolsCode.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantToolsCode_H_
#define TINY_CPP_CLIENT_AssistantToolsCode_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantToolsCode{
public:

    /*! \brief Constructor.
	 */
    AssistantToolsCode();
    AssistantToolsCode(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantToolsCode();


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


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_AssistantToolsCode_H_ */
