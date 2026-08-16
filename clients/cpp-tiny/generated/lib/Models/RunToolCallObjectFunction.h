
/*
 * RunToolCallObject_function.h
 *
 * The function definition.
 */

#ifndef TINY_CPP_CLIENT_RunToolCallObject_function_H_
#define TINY_CPP_CLIENT_RunToolCallObject_function_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The function definition.
 *
 *  \ingroup Models
 *
 */

class RunToolCallObject_function{
public:

    /*! \brief Constructor.
	 */
    RunToolCallObject_function();
    RunToolCallObject_function(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunToolCallObject_function();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the function.
	 */
	std::string getName();

	/*! \brief Set The name of the function.
	 */
	void setName(std::string  name);
	/*! \brief Get The arguments that the model expects you to pass to the function.
	 */
	std::string getArguments();

	/*! \brief Set The arguments that the model expects you to pass to the function.
	 */
	void setArguments(std::string  arguments);


    private:
    std::string name{};
    std::string arguments{};
};
}

#endif /* TINY_CPP_CLIENT_RunToolCallObject_function_H_ */
