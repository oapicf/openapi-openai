/*
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h
 *
 * 
 */

#ifndef _RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_H_
#define _RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_H_


#include <string>
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"
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

class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject();
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the output in the outputs array.
	 */
	int getIndex();

	/*! \brief Set The index of the output in the outputs array.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `image`.
	 */
	std::string getType();

	/*! \brief Set Always `image`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image getImage();

	/*! \brief Set 
	 */
	void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image  image);

private:
	int index;
	std::string type;
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image image;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_H_ */
