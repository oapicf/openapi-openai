
/*
 * RunStepDetailsToolCallsFileSearchResultObject.h
 *
 * A result instance of the file search.
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchResultObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchResultObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsFileSearchResultObject_content_inner.h"
#include <list>

namespace Tiny {


/*! \brief A result instance of the file search.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchResultObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsFileSearchResultObject();
    RunStepDetailsToolCallsFileSearchResultObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsFileSearchResultObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	long getScore();

	/*! \brief Set The score of the result. All values must be a floating point number between 0 and 1.
	 */
	void setScore(long  score);
	/*! \brief Get The content of the result that was found. The content is only included if requested via the include query parameter.
	 */
	std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> getContent();

	/*! \brief Set The content of the result that was found. The content is only included if requested via the include query parameter.
	 */
	void setContent(std::list <RunStepDetailsToolCallsFileSearchResultObject_content_inner> content);


    private:
    std::string file_id{};
    std::string file_name{};
    long score{};
    std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> content;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchResultObject_H_ */
