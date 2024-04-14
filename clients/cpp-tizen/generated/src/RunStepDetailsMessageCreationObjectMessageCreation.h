/*
 * RunStepDetailsMessageCreationObject_message_creation.h
 *
 * 
 */

#ifndef _RunStepDetailsMessageCreationObject_message_creation_H_
#define _RunStepDetailsMessageCreationObject_message_creation_H_


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

class RunStepDetailsMessageCreationObject_message_creation : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsMessageCreationObject_message_creation();
	RunStepDetailsMessageCreationObject_message_creation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsMessageCreationObject_message_creation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the message that was created by this run step.
	 */
	std::string getMessageId();

	/*! \brief Set The ID of the message that was created by this run step.
	 */
	void setMessageId(std::string  message_id);

private:
	std::string message_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsMessageCreationObject_message_creation_H_ */
