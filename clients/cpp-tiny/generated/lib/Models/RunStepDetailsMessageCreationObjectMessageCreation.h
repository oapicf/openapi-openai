
/*
 * RunStepDetailsMessageCreationObject_message_creation.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsMessageCreationObject_message_creation_H_
#define TINY_CPP_CLIENT_RunStepDetailsMessageCreationObject_message_creation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsMessageCreationObject_message_creation{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsMessageCreationObject_message_creation();
    RunStepDetailsMessageCreationObject_message_creation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsMessageCreationObject_message_creation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the message that was created by this run step.
	 */
	std::string getMessageId();

	/*! \brief Set The ID of the message that was created by this run step.
	 */
	void setMessageId(std::string  message_id);


    private:
    std::string message_id{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsMessageCreationObject_message_creation_H_ */
