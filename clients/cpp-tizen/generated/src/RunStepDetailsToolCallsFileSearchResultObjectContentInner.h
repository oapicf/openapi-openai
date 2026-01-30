/*
 * RunStepDetailsToolCallsFileSearchResultObject_content_inner.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsFileSearchResultObject_content_inner_H_
#define _RunStepDetailsToolCallsFileSearchResultObject_content_inner_H_


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

class RunStepDetailsToolCallsFileSearchResultObject_content_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsFileSearchResultObject_content_inner();
	RunStepDetailsToolCallsFileSearchResultObject_content_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsFileSearchResultObject_content_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the content.
	 */
	std::string getType();

	/*! \brief Set The type of the content.
	 */
	void setType(std::string  type);
	/*! \brief Get The text content of the file.
	 */
	std::string getText();

	/*! \brief Set The text content of the file.
	 */
	void setText(std::string  text);

private:
	std::string type;
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsFileSearchResultObject_content_inner_H_ */
