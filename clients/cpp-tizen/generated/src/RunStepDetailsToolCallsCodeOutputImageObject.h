/*
 * RunStepDetailsToolCallsCodeOutputImageObject.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsCodeOutputImageObject_H_
#define _RunStepDetailsToolCallsCodeOutputImageObject_H_


#include <string>
#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"
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

class RunStepDetailsToolCallsCodeOutputImageObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsCodeOutputImageObject();
	RunStepDetailsToolCallsCodeOutputImageObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsCodeOutputImageObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `image`.
	 */
	std::string getType();

	/*! \brief Set Always `image`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsCodeOutputImageObject_image getImage();

	/*! \brief Set 
	 */
	void setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image);

private:
	std::string type;
	RunStepDetailsToolCallsCodeOutputImageObject_image image;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsCodeOutputImageObject_H_ */
