/*
 * RunStepDetailsToolCallsFileSearchObject.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsFileSearchObject_H_
#define _RunStepDetailsToolCallsFileSearchObject_H_


#include <string>
#include "RunStepDetailsToolCallsFileSearchObject_file_search.h"
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

class RunStepDetailsToolCallsFileSearchObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsFileSearchObject();
	RunStepDetailsToolCallsFileSearchObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsFileSearchObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the tool call object.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call object.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call. This is always going to be `file_search` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `file_search` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFileSearchObject_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(RunStepDetailsToolCallsFileSearchObject_file_search  file_search);

private:
	std::string id;
	std::string type;
	RunStepDetailsToolCallsFileSearchObject_file_search file_search;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsFileSearchObject_H_ */
