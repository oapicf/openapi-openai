
/*
 * RunStepDeltaStepDetailsMessageCreationObject.h
 *
 * Details of the message creation by the run step.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsMessageCreationObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsMessageCreationObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsMessageCreationObject_message_creation.h"

namespace Tiny {


/*! \brief Details of the message creation by the run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsMessageCreationObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsMessageCreationObject();
    RunStepDeltaStepDetailsMessageCreationObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsMessageCreationObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `message_creation`.
	 */
	std::string getType();

	/*! \brief Set Always `message_creation`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDeltaStepDetailsMessageCreationObject_message_creation getMessageCreation();

	/*! \brief Set 
	 */
	void setMessageCreation(RunStepDeltaStepDetailsMessageCreationObject_message_creation  message_creation);


    private:
    std::string type{};
    RunStepDeltaStepDetailsMessageCreationObject_message_creation message_creation;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsMessageCreationObject_H_ */
