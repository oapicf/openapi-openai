/*
 * RunToolCallObject_function.h
 *
 * The function definition.
 */

#ifndef _RunToolCallObject_function_H_
#define _RunToolCallObject_function_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The function definition.
 *
 *  \ingroup Models
 *
 */

class RunToolCallObject_function : public Object {
public:
	/*! \brief Constructor.
	 */
	RunToolCallObject_function();
	RunToolCallObject_function(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunToolCallObject_function();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string name;
	std::string arguments;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunToolCallObject_function_H_ */
