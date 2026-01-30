/*
 * AssistantToolsFileSearchTypeOnly.h
 *
 * 
 */

#ifndef _AssistantToolsFileSearchTypeOnly_H_
#define _AssistantToolsFileSearchTypeOnly_H_


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

class AssistantToolsFileSearchTypeOnly : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantToolsFileSearchTypeOnly();
	AssistantToolsFileSearchTypeOnly(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantToolsFileSearchTypeOnly();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of tool being defined: `file_search`
	 */
	std::string getType();

	/*! \brief Set The type of tool being defined: `file_search`
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantToolsFileSearchTypeOnly_H_ */
