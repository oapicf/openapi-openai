
/*
 * AssistantsNamedToolChoice_function.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantsNamedToolChoice_function_H_
#define TINY_CPP_CLIENT_AssistantsNamedToolChoice_function_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantsNamedToolChoice_function{
public:

    /*! \brief Constructor.
	 */
    AssistantsNamedToolChoice_function();
    AssistantsNamedToolChoice_function(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantsNamedToolChoice_function();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the function to call.
	 */
	std::string getName();

	/*! \brief Set The name of the function to call.
	 */
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_AssistantsNamedToolChoice_function_H_ */
