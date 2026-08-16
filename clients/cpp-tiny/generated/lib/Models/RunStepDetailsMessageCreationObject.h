
/*
 * RunStepDetailsMessageCreationObject.h
 *
 * Details of the message creation by the run step.
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsMessageCreationObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsMessageCreationObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsMessageCreationObject_message_creation.h"

namespace Tiny {


/*! \brief Details of the message creation by the run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsMessageCreationObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsMessageCreationObject();
    RunStepDetailsMessageCreationObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsMessageCreationObject();


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
	RunStepDetailsMessageCreationObject_message_creation getMessageCreation();

	/*! \brief Set 
	 */
	void setMessageCreation(RunStepDetailsMessageCreationObject_message_creation  message_creation);


    private:
    std::string type{};
    RunStepDetailsMessageCreationObject_message_creation message_creation;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsMessageCreationObject_H_ */
