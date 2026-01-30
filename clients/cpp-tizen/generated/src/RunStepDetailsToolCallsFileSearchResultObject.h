/*
 * RunStepDetailsToolCallsFileSearchResultObject.h
 *
 * A result instance of the file search.
 */

#ifndef _RunStepDetailsToolCallsFileSearchResultObject_H_
#define _RunStepDetailsToolCallsFileSearchResultObject_H_


#include <string>
#include "RunStepDetailsToolCallsFileSearchResultObject_content_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A result instance of the file search.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchResultObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsFileSearchResultObject();
	RunStepDetailsToolCallsFileSearchResultObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsFileSearchResultObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the file that result was found in.
	 */
	std::string getFileId();

	/*! \brief Set The ID of the file that result was found in.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get The name of the file that result was found in.
	 */
	std::string getFileName();

	/*! \brief Set The name of the file that result was found in.
	 */
	void setFileName(std::string  file_name);
	/*! \brief Get The score of the result. All values must be a floating point number between 0 and 1.
	 */
	long long getScore();

	/*! \brief Set The score of the result. All values must be a floating point number between 0 and 1.
	 */
	void setScore(long long  score);
	/*! \brief Get The content of the result that was found. The content is only included if requested via the include query parameter.
	 */
	std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> getContent();

	/*! \brief Set The content of the result that was found. The content is only included if requested via the include query parameter.
	 */
	void setContent(std::list <RunStepDetailsToolCallsFileSearchResultObject_content_inner> content);

private:
	std::string file_id;
	std::string file_name;
	long long score;
	std::list <RunStepDetailsToolCallsFileSearchResultObject_content_inner>content;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsFileSearchResultObject_H_ */
