/*
 * RunStepDetailsToolCallsCodeOutputImageObject_image.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsCodeOutputImageObject_image_H_
#define _RunStepDetailsToolCallsCodeOutputImageObject_image_H_


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

class RunStepDetailsToolCallsCodeOutputImageObject_image : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsCodeOutputImageObject_image();
	RunStepDetailsToolCallsCodeOutputImageObject_image(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsCodeOutputImageObject_image();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The [file](/docs/api-reference/files) ID of the image.
	 */
	std::string getFileId();

	/*! \brief Set The [file](/docs/api-reference/files) ID of the image.
	 */
	void setFileId(std::string  file_id);

private:
	std::string file_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsCodeOutputImageObject_image_H_ */
