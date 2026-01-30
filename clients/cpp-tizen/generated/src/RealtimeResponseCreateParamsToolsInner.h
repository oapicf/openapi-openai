/*
 * RealtimeResponseCreateParams_tools_inner.h
 *
 * 
 */

#ifndef _RealtimeResponseCreateParams_tools_inner_H_
#define _RealtimeResponseCreateParams_tools_inner_H_


#include <string>
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

class RealtimeResponseCreateParams_tools_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponseCreateParams_tools_inner();
	RealtimeResponseCreateParams_tools_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponseCreateParams_tools_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the tool, i.e. `function`.
	 */
	std::string getType();

	/*! \brief Set The type of the tool, i.e. `function`.
	 */
	void setType(std::string  type);
	/*! \brief Get The name of the function.
	 */
	std::string getName();

	/*! \brief Set The name of the function.
	 */
	void setName(std::string  name);
	/*! \brief Get The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
	 */
	std::string getDescription();

	/*! \brief Set The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Parameters of the function in JSON Schema.
	 */
	std::string getParameters();

	/*! \brief Set Parameters of the function in JSON Schema.
	 */
	void setParameters(std::string  parameters);

private:
	std::string type;
	std::string name;
	std::string description;
	std::string parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponseCreateParams_tools_inner_H_ */
