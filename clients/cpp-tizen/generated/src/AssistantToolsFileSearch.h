/*
 * AssistantToolsFileSearch.h
 *
 * 
 */

#ifndef _AssistantToolsFileSearch_H_
#define _AssistantToolsFileSearch_H_


#include <string>
#include "AssistantToolsFileSearch_file_search.h"
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

class AssistantToolsFileSearch : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantToolsFileSearch();
	AssistantToolsFileSearch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantToolsFileSearch();

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
	/*! \brief Get 
	 */
	AssistantToolsFileSearch_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(AssistantToolsFileSearch_file_search  file_search);

private:
	std::string type;
	AssistantToolsFileSearch_file_search file_search;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantToolsFileSearch_H_ */
