/*
 * RunStepDetailsMessageCreationObject.h
 *
 * Details of the message creation by the run step.
 */

#ifndef _RunStepDetailsMessageCreationObject_H_
#define _RunStepDetailsMessageCreationObject_H_


#include <string>
#include "RunStepDetailsMessageCreationObject_message_creation.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details of the message creation by the run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsMessageCreationObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsMessageCreationObject();
	RunStepDetailsMessageCreationObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsMessageCreationObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `message_creation`.
	 */
	std::string getType();

	/*! \brief Set Always `message_creation`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsMessageCreationObject_message_creation getMessageCreation();

	/*! \brief Set 
	 */
	void setMessageCreation(RunStepDetailsMessageCreationObject_message_creation  message_creation);

private:
	std::string type;
	RunStepDetailsMessageCreationObject_message_creation message_creation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsMessageCreationObject_H_ */
